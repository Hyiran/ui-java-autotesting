package test05.yueni.ios.myprofile;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import net.wanghaifeng.com.TestDriverIOS;
import net.wanghaifeng.com.PublicStaticMethod;
import net.wanghaifeng.page.ios.IPhone10ForgetUserPasswordPage;


public class Test10ForgetPasswordPage extends TestDriverIOS{
	
	public static IPhone10ForgetUserPasswordPage modifyPassword = IPhone10ForgetUserPasswordPage.getInstance();
	
	@BeforeClass(description="测试页面初始化操作",enabled=true)
	public void OpenInitializationTestPage(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			openMyProfilePage();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	
	@Test(description="重新设置新密码",enabled=true)
	public void TestFir01stCommitUserRegister(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			modifyPassword.clickForgetPasswordButton();
			modifyPassword.inputMobileIphoneNum(iphoneNum);
			modifyPassword.clickSendoutButton();
			modifyPassword.inputVerificationCode("88888");
			modifyPassword.clickNextStepOperate();
			modifyPassword.inputUserPwd(testData.get("password2_new"));
			modifyPassword.inputNewUserPwd(testData.get("password2_new"));
			modifyPassword.clickSubmitButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	@Test(description="用新密码重新登录",enabled=true)
	public void TestFir02stClickLoginButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			modifyPassword.clickUserLoginButton();
			checkUserLogin(iphoneNum,testData.get("password2_new"));
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
