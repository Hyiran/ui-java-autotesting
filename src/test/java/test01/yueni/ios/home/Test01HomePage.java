package test01.yueni.ios.home;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import net.wanghaifeng.com.TestDriverIOS;
import net.wanghaifeng.com.PublicStaticMethod;
import net.wanghaifeng.page.ios.IPhone01HomePage;

public class Test01HomePage extends TestDriverIOS {
	
	public static IPhone01HomePage indexpage = IPhone01HomePage.getInstance();
	
	
	@BeforeClass(description="测试页面初始化操作",enabled=true)
	public void OpenInitializationTestPage(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			System.out.println(indexpage.getPostListTableViews().size());
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	
	@Test(description="点击打开好友帖子列表",enabled=true)
	public static void TestFir01stOpenFriendPostList(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			indexpage.clickLookFriendPostList();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	
	
	@Test(description="点击帖子中好友昵称",enabled=true)
	public static void TestFir02stClickPostFriendNickName(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			indexpage.clickPostUserNickName(indexpage.getFriendPostListCells());
			clickBackButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	
	@Test(description="点击浏览好友帖子中图片",enabled=true)
	public static void TestFir03stClickBrowePostImage(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			indexpage.clickBrowePostImage(indexpage.getFriendPostListCells());
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	@Test(description="点击帖子喜欢按钮",enabled=true)
	public static void TestFir04stClickPostLikeButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			indexpage.clickPostLikeButton(indexpage.getFriendPostListCells());
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	@Test(description="点击帖子评论按钮",enabled=true)
	public static void TestFir05stClickPostCommentButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			indexpage.clickPostCommentButton(indexpage.getFriendPostListCells());
//			clickBackButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	@Test(description="点击帖子分享按钮",enabled=true)
	public static void TestFir06stClickPostShareButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			indexpage.clickPostShareButton(indexpage.getFriendPostListCells());
			indexpage.clickCancleShareButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	@Test(description="点击帖子中的标签",enabled=true)
	public static void TestFir07stClickPostTagButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			indexpage.clickPostTagButton(indexpage.getFriendPostListCells());
			clickBackButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	@Test(description="点击打开热门帖子列表",enabled=true)
	public static void TestFir08stClickLookHotPostList(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			indexpage.clickLookHotPostList();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}

	@Test(description="点击下拉查看圈子列表",enabled=true)
	public static void TestFir09stOpenColumnEditButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{	
			indexpage.openColumnEditButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	
	@Test(description="点击圈子编辑按钮",enabled=true)
	public static void TestFir10stClickEditColumnButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			indexpage.clickEditColumnButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	
	@Test(description="点击删除已选择的圈子",enabled=true)
	public static void TestFir11stClickCancleCirlceButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			indexpage.clickCancleSelectColumnButton();
			indexpage.clickFinishColumnButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	
	@Test(description="点击重新选择圈子",enabled=true)
	public static void TestFir12stClickSelectCirlceButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			indexpage.clickSelectColumnButton();
			indexpage.openColumnEditButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	
	
	@Test(description="浏览不同的圈子帖子列表",enabled=true)
	public void TestFir13stClickLookOthersCirclePostList(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			indexpage.clickScrollViewCircleName();
			indexpage.swipeScrollViewPostList();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	
	@Test(description="滑动屏幕查看更多帖子",enabled=true)
	public void TestFir14stClickSwipeLookPostList(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			indexpage.swipeLookScreenPostList();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	
	
}

