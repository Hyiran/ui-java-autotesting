package test10.yueni.android.myprofile;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import net.wanghaifeng.com.TestDriverAndroid;
import net.wanghaifeng.page.android.Android09UserRegisterPage;


public class Test09UserRegisterPage extends TestDriverAndroid{
	
	public static Android09UserRegisterPage userRegister = Android09UserRegisterPage.getInstance();
	
	@BeforeClass(description="测试页面初始化操作",enabled=true)
	public void OpenInitializationTestPage(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		openMyProfilePage();
	}
 
	
	
	@Test(description="点击注册按钮打开注册页面",enabled=true)
	public void TestFir01stClickMobileRegisterButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		userRegister.clickMobileRegisterButton();
	}
	
	@Test(description="输入手机号码并点击注册",enabled=true)
	public void TestFir02stClickGetVerificationCode(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		
        userRegister.inputMobileIphoneNum();
        userRegister.inputUserPwd(testData.get("password1_value"));
        userRegister.clickGetVerificationCode();
        
		waitForGivenTime(waitMiloSeconds);
		userRegister.inputVerificationCode("88888");
		userRegister.clickSubmitButton();
		
	}
	


	
	@Test(description="点击选取头像按钮",enabled=true)
	public void TestFir03stClickSelectUserFace(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		userRegister.clickSelectUserFace();
	}
	
	
	@Test(description="在相册列表中选择一个相册",enabled=false)
	public void TestFir04stClickFromUserAlbumToSelect(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		userRegister.clickFromUserAlbumToSelect();
	}
	
	
	@Test(description="从相册中选择头像",enabled=true)
	public void TestFir05stClickSelectAnPhoto(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		userRegister.clickSelectAnPhoto();
	}
	
	@Test(description="选择头像后点击下一步",enabled=true)
	public void TestFir06stClickAfterSelectPhotoToClickNext(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		userRegister.clickAfterSelectPhotoToClickNext();
	}
	
	
	@Test(description="输入注册昵称并保存",enabled=true)
	public void TestFir07stClickSaveUserRigister(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		userRegister.clickInputUserNickname();
//		waitForGivenTime(waitMiloSeconds);
		userRegister.clickSaveUserRigister();
	}
	

	
}
