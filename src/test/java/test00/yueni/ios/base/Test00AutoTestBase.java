package test00.yueni.ios.base;
import io.appium.java_client.MobileElement;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.testng.Assert;
import org.testng.Reporter;

import net.wanghaifeng.com.PublicStaticMethod;
import net.wanghaifeng.com.TestDriverIOS;
import net.wanghaifeng.parser.UserInfoDataParser;


public class Test00AutoTestBase extends TestDriverIOS {
	
	private static Log log = LogFactory.getLog("Test00AutoTestBase");
	
	@Test(description="初始化测试数据",enabled=true)
	public void TestFir01stInitTestData(){
		log.info("-----------正在进行测试数据初始化，请稍候...-----------");
		try{			
			//从xml文件中获取用例测试数据
			UserInfoDataParser uiDatp = new UserInfoDataParser();
			checkDat = uiDatp.parseXml("./testdata/xml_checkpoint.xml");

	        //获取启动设备屏幕分辨率
	        WebElement screenSize = driver.findElementByClassName("UIAWindow");
	        ScreenSizeX = (double) screenSize.getSize().width;
	        ScreenSizeY = (double) screenSize.getSize().height; 
	        Reporter.log("启动设备分辨率:"+ScreenSizeX+"*"+ScreenSizeY);

		}catch(Exception e){
			log.info("测试数据初始化失败,测试进程终止");
		}
	}
	
	
	@Test(description="初始化测试应用",enabled=true)
	public void TestFir02stInitTestApp(){
		log.info("-----------正在进行测试应用初始化，请稍候...-----------");
		try{			
	        //首次安装
	        if(checkElementDisplay("Accessibility_GuideView_GuideScrollView",waitSeconds)){
	        	PublicStaticMethod.flickScreen(ScreenSizeX-10, ScreenSizeY/2, ScreenSizeX/2, ScreenSizeY/2, 4, driver);
	        	driver.findElementByAccessibilityId("Accessibility_GuideView_CloseButton").click();
	        }
	        
	        //点击引导图
	        if(checkElementDisplay("Accessibility_UserGuideView_release",waitSeconds)){
	        	touchScreen(driver.findElementByAccessibilityId("Accessibility_UserGuideView_release"));
	        }
	        
	        //首次打开App如果没有登录，弹出登录提示框
	        if(checkElementDisplay("登录",waitSeconds)){
	        	 checkUserLogin(testData.get("username1_value"),testData.get("password1_value"));
	        }
		}catch(Exception e){
			log.info("测试应用初始化失败,测试进程即将终止");
		}
	}
	
	@Test(description="执行测试设备网络检查",enabled=false)
	public void TestFir03stCheckingInternetStatus(){
		System.out.println("-----------正在进行测试设备网络检查，请稍候...-----------");
		try{
	        driver.findElementByAccessibilityId("PPINSTAL_ACCESSIBILITY_HOME_TABLEVIEW");
		}catch(Exception e){
			driver.quit();
			System.out.println("网络状态不好，测试进程终止,请检查网络后在进行测试,");
		}
	}
	
	

	@Test(description="关闭升级提示框",enabled=false)
	public void TestFir04stClickCloseCancelUpdate() {
		System.out.println("-----------关闭升级提示框-----------");
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        try {     	
        	if(checkElementDisplay("开始升级",5)){
    	        MobileElement element = (MobileElement)driver.findElementByAccessibilityId("取消");
    	        touchScreen(element);
    	        System.out.println("当前版本不是最新版");
        	}else{     
        		System.out.println("当前版本为最新版");
        	}
        	Reporter.log(testResultSuccess);
		}catch(Exception e){
			Reporter.log(testResultFailure);
        }        
	}
	
	@Test(description="关闭激活提示框...",enabled=false)
	public void TestFir05stClickCloseAlertWindow() {
		System.out.println("-----------关闭激活提示框-----------");
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        try {     	
	        MobileElement element = (MobileElement)driver.findElementByAccessibilityId("知道了");
	        touchScreen(element);
	        boolean isDisplay = element.isEnabled();
	        Assert.assertTrue(isDisplay);
	        
	        Reporter.log(testResultSuccess);
		}catch(Exception e){
			Reporter.log(testResultFailure);
        }        
	}
	
	
	
	@AfterTest(description="测试用例执行结束",enabled=true)
	public void TestFir06stRunCompareLogFileTest() {
		log.info("-----------测试用例执行结束，正在关闭当前测试进程，请稍候...-----------");
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        try {  
        	Thread.sleep(5000);
        } catch (Exception e) {
        	e.getStackTrace();
        }        
	}
	
	
}
