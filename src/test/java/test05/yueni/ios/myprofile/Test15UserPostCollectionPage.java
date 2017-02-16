package test05.yueni.ios.myprofile;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import net.wanghaifeng.com.TestDriverIOS;
import net.wanghaifeng.com.PublicStaticMethod;
import net.wanghaifeng.page.ios.IPhone15MyPostCollectionPage;

public class Test15UserPostCollectionPage extends TestDriverIOS {
	public static IPhone15MyPostCollectionPage postCollection = IPhone15MyPostCollectionPage.getInstance();
	
	
	
	@BeforeClass(description="测试页面初始化操作",enabled=true)
	public void OpenInitializationTestPage(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			openMyProfilePage();
			Test05MyProfilePage.myProfile.clickOpenMyPostCollection();
			checkUserLogin(testData.get("username1_value"),testData.get("password1_value"));
			
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	@Test(description="点击查看帖子详情",enabled=true)
	public void TestFir01stClickPostShareButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			postCollection.openUserCenterPostDetail(0);
			clickBackButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}		
	}
	
	
	
	@Test(description="点击帖子用户昵称",enabled=true)
	public void TestFir02stClickPostUserNickName(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			postCollection.clickPostUserNickName();
			clickBackButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}		
	}
	
	
	@Test(description="点击浏览帖子图片",enabled=true)
	public void TestFir03stClickBrowePostImages(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			postCollection.clickBrowePostImage();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}		
	}
	
	@Test(description="点击帖子的标签",enabled=true)
	public void TestFir04stClickBrowePostTag(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{	
			postCollection.clickPostTagButton();
			clickBackButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}		
	}
	
	
	@Test(description="点击帖子评论按钮",enabled=true)
	public void TestFir05stClickPostCommentButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			postCollection.clickPostCommentButton();
			clickBackButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}		
	}
	
	@Test(description="点击帖子点赞按钮",enabled=true)
	public void TestFir06stClickPostLikeButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			postCollection.clickPostLikeButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}		
	}
	

	@Test(description="点击帖子分享按钮",enabled=true)
	public void TestFir07stClickPostShareButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			postCollection.clickPostShareButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}		
	}
	

	@Test(description="点击分享功能中的取消收藏帖子按钮",enabled=true)
	public void TestFir08stClickCancleCollectionButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			postCollection.clickCancleCollectPostButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}		
	}

	
	@Test(description="在分享页面点击取消分享按钮",enabled=true)
	public void TestFir09stClickCancleShareButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			postCollection.clickCancleShareButton();
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
