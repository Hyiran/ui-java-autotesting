package test06.yueni.android.base;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.testng.Reporter;
import net.wanghaifeng.com.TestDriverAndroid;
import net.wanghaifeng.parser.UserInfoDataParser;


public class Test00AutoTestBase extends TestDriverAndroid {
	
	private static Log log = LogFactory.getLog("Test00AutoTestBase");
	
	@Test(description="初始化测试数据",enabled=true)
	public void TestFir01stInitTestData(){
		log.info("-----------正在进行测试数据初始化，请稍候...-----------");
		try{			
			//从xml文件中获取用例测试数据
			UserInfoDataParser uiDatp = new UserInfoDataParser();
			checkDat = uiDatp.parseXml("./testdata/xml_checkpoint.xml");

	        //获取启动设备屏幕分辨率
	        WebElement screenSize = driver.findElementByXPath("//android.widget.FrameLayout[1]");
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
	        //首次打开App如果没有登录，弹出登录提示框
//			if(checkElementDisplay("登录",waitSeconds)){
//	        	 checkUserLogin(testData.get("username1_value"),testData.get("password1_value"));
//	        }
//	        System.out.println(driver.findElementById("com.yueniapp.sns:id/login_layout_submit").isDisplayed());
//	        if(driver.findElementById("com.yueniapp.sns:id/login_layout_submit").isDisplayed()){
//	        	checkUserLogin(testData.get("username1_value"),testData.get("password1_value"));
//	        	AssertJUnit.assertNotNull("首页");
//	        }
		}catch(Exception e){
			log.info("测试应用初始化失败,测试进程即将终止");
		}
	}
	
	@AfterSuite(description="测试用例执行结束",enabled=true)
	public void TestFir03stRunCompareLogFileTest() {
		log.info("-----------测试用例执行结束，正在关闭当前测试进程，请稍候...-----------");
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        try {  
        	Thread.sleep(5000);
        } catch (Exception e) {
        	e.getStackTrace();
        }        
	}
	
}
