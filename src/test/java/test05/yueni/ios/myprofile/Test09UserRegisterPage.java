package test05.yueni.ios.myprofile;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import net.wanghaifeng.com.TestDriverIOS;
import net.wanghaifeng.com.PublicStaticMethod;
import net.wanghaifeng.page.ios.IPhone09UserRegisterPage;


public class Test09UserRegisterPage extends TestDriverIOS{
	
	public static IPhone09UserRegisterPage userRegister = IPhone09UserRegisterPage.getInstance();
	
	@BeforeClass(description="测试页面初始化操作",enabled=true)
	public void OpenInitializationTestPage(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			openMyProfilePage();
			Test08UserLoginPage.userLogin.clickMobileRegisterButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
 
	
	
	@Test(description="提交手机注册信息",enabled=true)
	public void TestFir01stCommitUserRegister(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
	        userRegister.inputMobileIphoneNum();
	        userRegister.inputUserPwd(testData.get("password1_value"));
	        userRegister.clickGetVerificationCode();
			waitForGivenTime(waitMiloSeconds);
			userRegister.inputVerificationCode("88888");
			userRegister.clickSubmitButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	

	@Test(description="选择用户头像并点击保存",enabled=true)
	public void TestFir02stSelectUserFace(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			userRegister.clickSaveButton();
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
