package test05.yueni.ios.myprofile;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import net.wanghaifeng.com.TestDriverIOS;
import net.wanghaifeng.com.PublicStaticMethod;
import net.wanghaifeng.page.ios.IPhone07SystemSettingPage;

public class Test07SystemSettingPage extends TestDriverIOS{
	public static IPhone07SystemSettingPage systemSetting = IPhone07SystemSettingPage.getInstance();
	
	
	@BeforeClass(description="测试页面初始化操作",enabled=true)
	public void OpenInitializationTestPage(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			openMyProfilePage();
			Test05MyProfilePage.myProfile.clickOpenSystemSettingPage();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}

	
	@Test(description="点击编辑个人资料",enabled=true)
	public void TestFir01stClickEditUserInfo(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			systemSetting.clickEditUserInfo();
			Test14EditUserInfoPage.editUserInfo.clickModifyUserNickName();
			clickBackButton();
		 }catch(Exception e){
			 PublicStaticMethod.captureScreenShot(methodName,driver);		
		 }
	}
	
	@Test(description="打开修改用户密码页面",enabled=true)
	public void TestFir02stClickModifyUserPassword(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			systemSetting.openModifyUserPassword();
		 }catch(Exception e){
			 PublicStaticMethod.captureScreenShot(methodName,driver);		
		 }
	}
	
	@Test(description="修改用户密码",enabled=true)
	public void TestFir03stClickModifyUserPassword(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			systemSetting.inputUserOldPassword(testData.get("password1_value"));
			systemSetting.inputUserNewPassword(testData.get("password1_value"));
			systemSetting.repeatInputUserNewPassword(testData.get("password1_value"));
			systemSetting.clickSubmitButton();
		 }catch(Exception e){
			 PublicStaticMethod.captureScreenShot(methodName,driver);		
		 }
	}
	
	
	
	@Test(description="点击消息中心设置",enabled=true)
	public void TestFir04stClickOpenMessageCenterSet(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			systemSetting.clickOpenMessageCenterSet();
			clickBackButton();
		 }catch(Exception e){
			 PublicStaticMethod.captureScreenShot(methodName,driver);		
		 }
	}

	@Test(description="点击图片质量设置",enabled=true)
	public void TestFir05stClickImageQualitySetting(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			systemSetting.clickImageQualitySetting();
			clickBackButton();
		 }catch(Exception e){
			 PublicStaticMethod.captureScreenShot(methodName,driver);		
		 }
	}
	
	@Test(description="点击清理缓存数据",enabled=true)
	public void TestFir06stClickCleanCacheData(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			systemSetting.clickCleanCacheData();
		 }catch(Exception e){
			 PublicStaticMethod.captureScreenShot(methodName,driver);		
		 }
	}
	
	@Test(description="点击瓷肌小技巧",enabled=true)
	public void TestFir07stClickOpenCHASKINSkill(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			systemSetting.clickOpenCHASKINSkill();
			clickBackButton();
		 }catch(Exception e){
			 PublicStaticMethod.captureScreenShot(methodName,driver);		
		 }
	}
	
	@Test(description="打开意见反馈",enabled=true)
	public void TestFir08stClickOpenFeedback(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			systemSetting.clickOpenFeedback();
		 }catch(Exception e){
			 PublicStaticMethod.captureScreenShot(methodName,driver);		
		 }
	}
	
	@Test(description="输入并点击提交意见反馈",enabled=true)
	public void TestFir09stClickOpenFeedback(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			systemSetting.inputIdeaCallBackText();
			systemSetting.clickSubmitButton();
		 }catch(Exception e){
			 PublicStaticMethod.captureScreenShot(methodName,driver);		
		 }
	}
	
	
	@Test(description="点击关于我们",enabled=true)
	public void TestFir10stClickOpenAboutUs(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			systemSetting.clickOpenAboutUs();
			clickBackButton();
		 }catch(Exception e){
			 PublicStaticMethod.captureScreenShot(methodName,driver);		
		 }
	}
	
	@Test(description="测试分享瓷肌给好友",enabled=true)
	public void TestFir11stClickShareAppToFriend(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			systemSetting.clickOpenShareAPPtoFriends();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	
	@Test(description="点击退出当前用户",enabled=true)
	public void TestFir12stClickUserExitLogout(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			systemSetting.clickUserExitLogout();
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
