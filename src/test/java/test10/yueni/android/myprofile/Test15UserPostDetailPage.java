package test10.yueni.android.myprofile;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import net.wanghaifeng.com.TestDriverAndroid;
import net.wanghaifeng.com.PublicStaticMethod;
import net.wanghaifeng.page.android.Android15PostDetailPage;


public class Test15UserPostDetailPage extends TestDriverAndroid {
	public static Android15PostDetailPage postdetail = Android15PostDetailPage.getInstance();

	
	@BeforeClass(description="测试页面初始化操作",enabled=true)
	public void OpenInitializationTestPage(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			openMyProfilePage();
			postdetail.clickUserPublicPost();
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
			Test13UserPostCenterPage.postcenter.openUserCenterPostDetail(0);
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	
  
	@Test(description="点击帖子点赞按钮",enabled=true)
	public void TestFir02stClickUserPostGoodButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			postdetail.clickPostDetailUserLikeButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}		
	}
	

	
	@Test(description="点击帖子的标签",enabled=true)
	public void TestFir04stClickBrowePostTag(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{	
			postdetail.clickNowPostDetailTags();
			clickNavgationLeftButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}		
	}
	
	
	@Test(description="点击帖子赞过的人的头像",enabled=true)
	public void TestFir06stClickPostShareButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			postdetail.clickHaveLikedUserFace();
			clickNavgationLeftButton();	
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}		
	}
	
	
	
	@Test(description="点击发送用户帖子评论",enabled=true)
	public void TestFir07stClickPostCommentButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			postdetail.clickPublishUserComment();
			postdetail.clickSendoutButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}		
	}
	
	
	@Test(description="点击分享并删除帖子",enabled=true)
	public void TestFir08stClickShareAndDeletePost(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			postdetail.clickSharePostDetail();
			postdetail.clickDeleteUserPost();
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
