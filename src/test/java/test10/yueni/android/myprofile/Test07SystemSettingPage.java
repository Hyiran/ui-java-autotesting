package test10.yueni.android.myprofile;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import net.wanghaifeng.com.TestDriverAndroid;
import net.wanghaifeng.page.android.Android07SystemSettingPage;

public class Test07SystemSettingPage extends TestDriverAndroid{
	public static Android07SystemSettingPage systemSetting = Android07SystemSettingPage.getInstance();
	
	
	@BeforeClass(description="点击打开系统设置页面",enabled=true)
	public void TestFir00stOpenMyprofileAndSettingPage(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		openMyProfilePage();
		Test05MyProfilePage.myProfile.clickOpenSystemSettingPage();
	}

	
	@Test(description="点击编辑个人资料",enabled=true)
	public void TestFir01stClickEditUserInfo(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		systemSetting.clickEditUserInfo();
	}
	
	@Test(description="修改用户昵称",enabled=true)
	public void TestFir02stModifyUserNickname(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		Test14EditUserInfoPage.editUserInfo.clickModifyUserNickName();
		clickNavgationLeftButton(); 
	}
	
	@Test(description="打开修改用户密码页面",enabled=true)
	public void TestFir03stOpenModifyUserPasswordPage(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		systemSetting.openModifyUserPassword();
	}
	
	@Test(description="修改用户密码",enabled=true)
	public void TestFir04stClickModifyUserPassword(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		systemSetting.inputUserOldPassword(testData.get("password1_value"));
		systemSetting.inputUserNewPassword(testData.get("password1_value"));
		systemSetting.repeatInputUserNewPassword(testData.get("password1_value"));
		systemSetting.clickSubmitButton();
	}
	
	
	
	@Test(description="点击消息中心设置",enabled=true)
	public void TestFir05stClickOpenMessageCenterSet(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		systemSetting.clickOpenMessageCenterSet();
		clickNavgationLeftButton();
	}

	@Test(description="点击图片质量设置",enabled=true)
	public void TestFir06stClickImageQualitySetting(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		systemSetting.clickImageQualitySetting();
		clickNavgationLeftButton();
	}
	
	@Test(description="点击清理缓存数据",enabled=false)
	public void TestFir07stClickCleanCacheData(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		systemSetting.clickCleanCacheData();
	}
	
	
	@Test(description="打开意见反馈",enabled=true)
	public void TestFir08stClickOpenFeedback(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		systemSetting.clickOpenFeedback();
	}
	
	@Test(description="输入并点击提交意见反馈",enabled=true)
	public void TestFir09stInputUserFeedback(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		systemSetting.inputIdeaCallBackText();
	}
	
	
	@Test(description="点击关于我们",enabled=true)
	public void TestFir10stClickOpenAboutUs(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		systemSetting.clickOpenAboutUs();
		clickNavgationLeftButton();
	}
	
	@Test(description="测试分享瓷肌给好友",enabled=true)
	public void TestFir11stClickShareAppToFriend(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		systemSetting.clickOpenShareAPPtoFriends();
	}
	
	

	
}
