package test05.yueni.ios.myprofile;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import net.wanghaifeng.com.TestDriverIOS;
import net.wanghaifeng.com.PublicStaticMethod;
import net.wanghaifeng.page.ios.IPhone08UserLoginPage;


public class Test08UserLoginPage extends TestDriverIOS{
	
	public static IPhone08UserLoginPage userLogin = IPhone08UserLoginPage.getInstance();
	
	@BeforeClass(description="测试页面初始化操作",enabled=true)
	public void OpenInitializationTestPage(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		openMyProfilePage();
	}
	
	
	@Test(description="点击手机注册按钮",enabled=true)
	public void TestFir01stClickUserRegisterButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		userLogin.clickMobileRegisterButton();
		clickBackButton();
	}
  
	
	@Test(description="点击忘记密码按钮",enabled=true)
	public void TestFir02stClickUserForgetPassword(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		userLogin.clickForgetPasswordButton();
		clickBackButton();
	}
	
	

	
	@Test(description="进行用户登录操作",enabled=true)
	public void TestFir03stClickUserLoginButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		checkUserLogin(testData.get("username1_value"),testData.get("password1_value"));
	}
	

  
}
