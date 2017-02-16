package test05.yueni.ios.myprofile;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import net.wanghaifeng.com.TestDriverIOS;
import net.wanghaifeng.com.PublicStaticMethod;
import net.wanghaifeng.page.ios.IPhone13UserPostCenterPage;


public class Test13UserPostCenterPage extends TestDriverIOS {
	public static IPhone13UserPostCenterPage postcenter = IPhone13UserPostCenterPage.getInstance();

	
	@BeforeClass(description="测试页面初始化操作",enabled=true)
	public void OpenInitializationTestPage(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			openMyProfilePage();
			Test06UserCenterPage.userCenter.clickPostButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	
	@Test(description="打开用户帖子详情",enabled=true)
	public void TestFir01stOpenUserCenterPostDetail(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			postcenter.openUserCenterPostDetail(0);
			clickBackButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	
  
	@Test(description="点击帖子用户昵称",enabled=true)
	public void TestFir02stClickPostUserNickName(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			postcenter.clickPostUserNickName();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}		
	}
	
	@Test(description="点击浏览帖子图片",enabled=true)
	public void TestFir03stClickBrowePostImages(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			postcenter.clickBrowePostImage();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}		
	}
	
	@Test(description="点击帖子的标签",enabled=true)
	public void TestFir04stClickBrowePostTag(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{	
			postcenter.clickPostTagButton();
			clickBackButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}		
	}
	
	
	@Test(description="点击帖子评论按钮",enabled=true)
	public void TestFir05stClickPostCommentButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			postcenter.clickPostCommentButton();
			clickBackButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}		
	}
	
	@Test(description="点击帖子点赞按钮",enabled=true)
	public void TestFir06stClickPostLikeButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			postcenter.clickPostLikeButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}		
	}
	

	@Test(description="点击帖子分享按钮",enabled=true)
	public void TestFir07stClickPostShareButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			postcenter.clickPostShareButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}		
	}
	
	
	
	@Test(description="点击分享功能中的删除帖子按钮",enabled=true)
	public void TestFir08stClickPostShareButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			postcenter.clickDeletePostButton();
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
