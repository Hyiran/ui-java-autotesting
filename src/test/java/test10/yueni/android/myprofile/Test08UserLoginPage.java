package test10.yueni.android.myprofile;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import net.wanghaifeng.com.TestDriverAndroid;
import net.wanghaifeng.page.android.Android08UserLoginPage;


public class Test08UserLoginPage extends TestDriverAndroid{
	
	public static Android08UserLoginPage userLogin = Android08UserLoginPage.getInstance();
	
	@BeforeClass(description="测试页面初始化操作",enabled=true)
	public void OpenInitializationTestPage(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		openMyProfilePage();
	}

	
	@Test(description="点击忘记密码按钮",enabled=false)
	public void TestFir01stClickUserForgetPassword() throws InterruptedException{
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		userLogin.clickForgetPasswordButton();
		
		userLogin.inputUserTelNum(testData.get("forgetPwdOfTelNum"));
		
		userLogin.clickSendOutButton();

		userLogin.inputVerficationCode();
		userLogin.clickVerficationButton();
		
		
	}
	
	

	
	@Test(description="进行用户登录操作",enabled=false)
	public void TestFir02stClickUserLoginButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		checkUserLogin(testData.get("username1_value"),testData.get("password1_value"));
	}
	
	
	
	

	
}
