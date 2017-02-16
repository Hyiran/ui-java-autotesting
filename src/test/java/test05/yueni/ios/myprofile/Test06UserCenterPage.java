package test05.yueni.ios.myprofile;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import net.wanghaifeng.com.TestDriverIOS;
import net.wanghaifeng.com.PublicStaticMethod;
import net.wanghaifeng.page.ios.IPhone06UserCenterPage;


public class Test06UserCenterPage extends TestDriverIOS {

	public static IPhone06UserCenterPage userCenter = IPhone06UserCenterPage.getInstance();
	
	
	@BeforeClass(description="页面初始化",enabled=true)
	public void OpenInitializationTestPage(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			openMyProfilePage();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}

	
	
	@Test(description="查看用户头像",enabled=true)
	public void TestFir01stClickLookUserPhoto(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			userCenter.clickLookUserPhoto();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	@Test(description="点击用户签到按钮",enabled=true)
	public void TestFir02stClickEveryDaySign(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			userCenter.clickOpenEveryDaySign();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	@Test(description="点击我的关注列表",enabled=true)
	public void TestFir03stClickAttentionButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			userCenter.clickAttentionButton();
			
			clickBackButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	@Test(description="打开我的粉丝页面",enabled=true)
	public void TestFir04stClickFollowerButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			userCenter.clickFollowerButton();
			clickBackButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	@Test(description="打开我的帖子列表页面",enabled=true)
	public void TestFir05stClickPostButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			userCenter.clickPostButton();
			clickBackButton();
			
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	@Test(description="点击编辑用户资料功能",enabled=true)
	public void TestFir06stClickEditUserInfoButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			userCenter.clickEditUserInfoButton();
			clickBackButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	@Test(description="打开用户中心帖子列表页面",enabled=true)
	public void TestFir07stClickOpenUserCenterPage(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			userCenter.clickOpenUserCenterPage();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	
	@Test(description="点击用户中心关注按钮",enabled=true)
	public void TestFir08stClickUserCenterAttentionButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			userCenter.clickUserCentenAttentionButton();
			clickBackButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}


	
	@Test(description="点击用户中心粉丝按钮",enabled=true)
	public void TestFir09stClickUserCenterFollowerButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			userCenter.clickUserCenterFollowerButton();
			clickBackButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	


	@Test(description="点击用户中心编辑资料功能",enabled=true)
	public void TestFir10stClickUserCenterEditUserInfoButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			userCenter.clickUserCenterEditUserInfoButton();
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
