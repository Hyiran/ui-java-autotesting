package test10.yueni.android.myprofile;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import net.wanghaifeng.com.TestDriverAndroid;

import net.wanghaifeng.page.android.Android13UserPostCenterPage;


public class Test13UserPostCenterPage extends TestDriverAndroid {
	public static Android13UserPostCenterPage postcenter = Android13UserPostCenterPage.getInstance();

	
	@BeforeClass(description="测试页面初始化操作",enabled=true)
	public void OpenInitializationTestPage(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		Test15UserPostDetailPage.postdetail.clickUserPublicPost();
		openMyProfilePage();
		Test06UserCenterPage.userCenter.clickPostButton();
	}
	
	
	@Test(description="打开用户帖子详情",enabled=true)
	public void TestFir01stOpenUserCenterPostDetail(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		postcenter.openUserCenterPostDetail(0);
		postcenter.clickNavigationBarLeftButton();
	}
	
	
  
	@Test(description="点击帖子用户昵称",enabled=true)
	public void TestFir02stClickPostUserNickName(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		postcenter.clickPostUserNickName();
		postcenter.clickNavigationBarLeftButton();
	}
	

	
	@Test(description="点击帖子的标签",enabled=true)
	public void TestFir04stClickBrowePostTag(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		postcenter.clickPostTagButton();
		clickNavgationLeftButton();	
	}
	
	
	@Test(description="点击帖子评论按钮",enabled=true)
	public void TestFir05stClickPostCommentButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		postcenter.clickPostCommentButton();
		postcenter.clickNavigationBarLeftButton();	
	}
	
	@Test(description="点击帖子点赞按钮",enabled=true)
	public void TestFir06stClickPostLikeButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		postcenter.clickPostLikeButton();	
	}
	

	@Test(description="点击帖子分享按钮",enabled=true)
	public void TestFir07stClickPostShareButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		postcenter.clickPostShareButton();
		postcenter.clickCancleShareButton();		
	}
	
	@AfterClass(description="重置测试应用",enabled=true)
	public void ResetTestApplication(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		resetTestApplication();
	}

	
}
