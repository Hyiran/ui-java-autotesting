package test05.yueni.ios.myprofile;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import net.wanghaifeng.com.TestDriverIOS;
import net.wanghaifeng.com.PublicStaticMethod;
import net.wanghaifeng.page.ios.IPhone12MenstruationAssistantPage;


public class Test12MenstruationAssistantPage extends TestDriverIOS{
	
	public static IPhone12MenstruationAssistantPage mensAssitant = IPhone12MenstruationAssistantPage.getInstance();
	
	@BeforeClass(description="测试页面初始化操作",enabled=true)
	public void OpenInitializationTestPage(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			openMyProfilePage();
			Test05MyProfilePage.myProfile.clickOpenMenstruationAssistant();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
  
	
	@Test(description="点击设置姨妈助手",enabled=true)
	public void TestFir01stSetMenstruationAssitant(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			mensAssitant.clickSetMenstruationAssistant();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	@Test(description="点击修改姨妈经期参数",enabled=true)
	public void TestFir02stClickModifyMenstruationPara(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			mensAssitant.clickModifyMenstruationPara();
			mensAssitant.clickSubmitButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	
	@Test(description="点击进入经期日历",enabled=true)
	public void TestFir03stOpenMenstruationCalendar(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			mensAssitant.clickOpenMenstruationCalendar();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	

	@Test(description="点击经期分析",enabled=true)
	public void TestFir04stClickMenstruationAnalysis(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			mensAssitant.clickMenstruationAnalysis();
			clickBackButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	@Test(description="左右浏览不同月份经期",enabled=true)
	public void TestFir05stBrowseMenstruation(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			mensAssitant.clickMonthMenstruation();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	
	
	@Test(description="回到当前经期月份",enabled=true)
	public void TestFir06stClickBackNowMonth(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			mensAssitant.clickBackNowMonth();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	
	@Test(description="点击更新月经日历",enabled=true)
	public void TestFir07stClickUpdateMenstruationCalendar(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			mensAssitant.clickUpdateMenstruationCalendar();
			mensAssitant.clickModifyPreMenstruation();
			mensAssitant.clickSubmitButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	
	@AfterClass(description="重置测试应用",enabled=true)
	public void ResetTestApplication(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			resetTestApplication();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
}
