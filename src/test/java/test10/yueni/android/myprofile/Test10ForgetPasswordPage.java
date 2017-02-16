package test10.yueni.android.myprofile;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import net.wanghaifeng.com.TestDriverAndroid;
import net.wanghaifeng.page.android.Android10ForgetUserPasswordPage;


public class Test10ForgetPasswordPage extends TestDriverAndroid{
	
	public static Android10ForgetUserPasswordPage modifyPassword = Android10ForgetUserPasswordPage.getInstance();
	
	@BeforeClass(description="测试页面初始化操作",enabled=true)
	public void OpenInitializationTestPage(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		openMyProfilePage();
		modifyPassword.clickForgetPasswordButton();
	}
	
	
	@Test(description="输入手机号码并点击发送",enabled=true)
	public void TestFir01stInputMobileIphoneNum(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		modifyPassword.inputMobileIphoneNum(iphoneNum);
		modifyPassword.clickSendoutButton();
	}		
			
	@Test(description="输入验证码并点击验证",enabled=true)
	public void TestFir02stInputverificationCode(){
		modifyPassword.inputVerificationCode("88888");
		modifyPassword.clickVerificationCodeButton();
	}
	
	@Test(description="重新设置新密码并提交",enabled=true)
	public void TestFir03stInputUserPwd(){	
		modifyPassword.inputUserPwd(testData.get("password2_new"));
		modifyPassword.inputNewUserPwd(testData.get("password2_new"));
		modifyPassword.clickSubmitButton();
	}
	
	@Test(description="用新密码重新登录",enabled=true)
	public void TestFir04stClickLoginButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		modifyPassword.clickUserLoginButton();
		checkUserLogin(iphoneNum,testData.get("password2_new"));
	}
	

}