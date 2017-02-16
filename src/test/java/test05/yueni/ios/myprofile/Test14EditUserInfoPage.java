package test05.yueni.ios.myprofile;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import net.wanghaifeng.com.TestDriverIOS;
import net.wanghaifeng.com.PublicStaticMethod;
import net.wanghaifeng.page.ios.IPhone14EditUserInfoPage;


public class Test14EditUserInfoPage extends TestDriverIOS{
	
	public static IPhone14EditUserInfoPage editUserInfo = IPhone14EditUserInfoPage.getInstance();
	
	@BeforeClass(description="测试页面初始化操作",enabled=true)
	public void OpenInitializationTestPage(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			Test05MyProfilePage.myProfile.openMyProfilePage();
			Test06UserCenterPage.userCenter.clickEditUserInfoButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	

	
	@Test(description="点击修改用户头像",enabled=true)
	public void TestFir01stClickModifyUserFace(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			editUserInfo.clickModifyUserFace();
			editUserInfo.clickSelectUserArlum();
			editUserInfo.clickPhotoDirector();
			editUserInfo.clickSelectUserPhoto();
			waitForGivenTime(waitMiloSeconds);
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	@Test(description="点击修改用户妮称",enabled=true)
	public void TestFir02stClickModifyUserFace(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			editUserInfo.clickModifyUserNickName();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	
	@Test(description="点击修改用户性别",enabled=true)
	public void TestFir03stClickModifyUserSex(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			editUserInfo.clickModifyUserSexType();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	
	@Test(description="点击修改用户个性签名",enabled=true)
	public void TestFir04stClickModifyUserSignature(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			editUserInfo.clickModifyUserSignature();
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
