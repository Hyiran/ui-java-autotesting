package test01.yueni.ios.home;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import net.wanghaifeng.com.TestDriverIOS;
import net.wanghaifeng.com.PublicStaticMethod;
import net.wanghaifeng.page.ios.IPhone17PostDetailPage;

public class Test02PostDetailPage extends TestDriverIOS {
	public static IPhone17PostDetailPage detailPage = IPhone17PostDetailPage.getInstance();
	
	
	@BeforeClass(description="测试页面初始化操作",enabled=true)
	public static void OpenInitializationTestPage(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			Test01HomePage.TestFir01stOpenFriendPostList();
			Test01HomePage.TestFir05stClickPostCommentButton();
			swipeUpToDownScreen(1);
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	

	@Test(description="测试：点击分享帖子操作",enabled=true)
	public static void TestFir01stClickSharePostDetail(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			detailPage.clickSharePostDetail();
			driver.findElementByAccessibilityId("取消").click();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	
	@Test(description="测试：点击查看用户本人头像",enabled=true)
	public static void TestFir02stClickSelfUserFace(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			detailPage.clickPostDetailFaceImage();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	@Test(description="测试：点击帖子图像上的标签",enabled=true)
	public static void TestFir03stClickNowPostDetailTags(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			detailPage.clickNowPostDetailTags();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	
	
	@Test(description="测试：对帖子进行点赞",enabled=true)
	public static void TestFir04stClickSharePostDetail(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			detailPage.clickPostDetailUserLikeButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	
	@Test(description="测试：点击已点赞的人",enabled=true)
	public static void TestFir05stClickHavedLikedUserFace(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			detailPage.clickHaveLikedUserFace();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	
	@Test(description="测试：用户发送帖子评论",enabled=true)
	public static void TestFir06stOpenFriendPostList(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			detailPage.clickPublishUserComment();
			detailPage.clickSendoutButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	

	

}
