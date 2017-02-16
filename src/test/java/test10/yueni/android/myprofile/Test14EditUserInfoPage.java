package test10.yueni.android.myprofile;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import net.wanghaifeng.com.TestDriverAndroid;
import net.wanghaifeng.page.android.Android14EditUserInfoPage;


public class Test14EditUserInfoPage extends TestDriverAndroid{
	
	public static Android14EditUserInfoPage editUserInfo = Android14EditUserInfoPage.getInstance();
	
	@BeforeClass(description="测试页面初始化操作",enabled=true)
	public void OpenInitializationTestPage(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		Test05MyProfilePage.myProfile.openMyProfilePage();
		Test06UserCenterPage.userCenter.clickEditUserInfoButton();
	}
	

	
	@Test(description="点击修改用户头像",enabled=true)
	public void TestFir01stClickModifyUserFace(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		editUserInfo.clickModifyUserFace();
//		waitForGivenTime(waitMiloSeconds);
	}
	
	@Test(description="点击从相册中选取相片",enabled=true)
	public void TestFir02stClickModifyUserFace(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		editUserInfo.clickSelectPhotoFromUserAlbum();
//		waitForGivenTime(waitMiloSeconds);
	}
	
	
	@Test(description="点击选中一个图片",enabled=true)
	public void TestFir03stClickAnPhotoFromUserAlbum(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		editUserInfo.clickAnPhotoFromUserAlbum();
//		waitForGivenTime(waitMiloSeconds);
	}
	
	@Test(description="选好头像后点击下一步",enabled=true)
	public void TestFir04stClickAfterSelectPhotoToClickNext(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		editUserInfo.clickAfterSelectPhotoToClickNext();
//		waitForGivenTime(waitMiloSeconds);
	}
	
	@Test(description="点击修改用户妮称",enabled=true)
	public void TestFir05stClickModifyUserNickName(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		editUserInfo.clickModifyUserNickName();
	}
	
	
	@Test(description="点击修改用户性别",enabled=true)
	public void TestFir06stClickModifyUserSex(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		editUserInfo.clickModifyUserSexType();
	}
	
	
	@Test(description="点击修改用户个性签名",enabled=true)
	public void TestFir07stClickModifyUserSignature(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		editUserInfo.clickModifyUserSignature();
	}
	
	
	@Test(description="点击修改用户所在地",enabled=true)
	public void TestFir08stClickModifyUserAddress(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		editUserInfo.clickModifyUserAddress();
	}
	
	



}
