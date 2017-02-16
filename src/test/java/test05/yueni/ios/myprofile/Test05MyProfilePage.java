package test05.yueni.ios.myprofile;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import net.wanghaifeng.com.TestDriverIOS;
import net.wanghaifeng.com.PublicStaticMethod;
import net.wanghaifeng.page.ios.IPhone05MyProfilePage;


public class Test05MyProfilePage extends TestDriverIOS{
	
	public static IPhone05MyProfilePage myProfile = IPhone05MyProfilePage.getInstance();
	
	
	@BeforeClass(description="页面初始化操作",enabled=true)
	public void OpenInitializationTestPage(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			openMyProfilePage();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
  
	@Test(description="点击打开我的经验值",enabled=true)
	public void TestFir01stClickExperience(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			myProfile.clickOpenMyExperience();
			myProfile.clickOpenUpgraderRule();
			clickBackButton();
			clickBackButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	
	@Test(description="点击打开我的收货地址",enabled=true)
	public void TestFir02stClickSetMyAddress(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			myProfile.clickOpenSetMyAddress();
			clickBackButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	
	@Test(description="点击打开我绑定的手机号码",enabled=true)
	public void TestFir03stClickBandingNum(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			myProfile.clickOpenBindingIPhoneNum();
			clickBackButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	
	@Test(description="点击打开姨妈助手",enabled=true)
	public void TestFir04stClickMenstruationAssistant(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			myProfile.clickOpenMenstruationAssistant();
			clickBackButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	
	@Test(description="点击打开我订阅的标签",enabled=true)
	public void TestFir05stClickMySubscribe(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			myProfile.clickOpenMySubscribeTags();
			clickBackButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	
	@Test(description="点击打开我的收藏",enabled=true)
	public void TestFir06stClickMyCollection(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			myProfile.clickOpenMyPostCollection();
			clickBackButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	
	@Test(description="点击打开绑定社交平台",enabled=true)
	public void TestFir07stClickBindSocailPlatform(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			myProfile.clickOpenBindingSocialPlatform();
			clickBackButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	
	@Test(description="点击打开系统设置",enabled=true)
	public void TestFir08stClickSystemSettingPage(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			myProfile.clickOpenSystemSettingPage();
			clickBackButton();
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
