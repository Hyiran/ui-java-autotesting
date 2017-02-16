package test10.yueni.android.myprofile;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import net.wanghaifeng.com.TestDriverAndroid;
import net.wanghaifeng.page.android.Android06UserCenterPage;


public class Test06UserCenterPage extends TestDriverAndroid {

	public static Android06UserCenterPage userCenter = Android06UserCenterPage.getInstance();
	
	
	@BeforeClass(description="用户中心模块页面初始化",enabled=true)
	public void OpenInitializationTestPage(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		openMyProfilePage();
	}
  
	@Test(description="点击用户签到按钮",enabled=true)
	public void TestFir01stClickEveryDaySign(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		userCenter.clickOpenEveryDaySign();
		
	}
	
	@Test(description="点击用户关注功能",enabled=true)
	public void TestFir02stClickAttentionButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		userCenter.clickAttentionButton();
		clickNavgationLeftButton();
	}
	
	@Test(description="打开用户粉丝页面",enabled=true)
	public void TestFir03stClickFollowerButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		userCenter.clickFollowerButton();
		clickNavgationLeftButton();
	}
	
	@Test(description="打开用户帖子页面",enabled=true)
	public void TestFir04stClickPostButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		userCenter.clickPostButton();
		clickNavgationLeftButton();
	}
	
	@Test(description="点击编辑用户资料功能",enabled=true)
	public void TestFir05stClickEditUserInfoButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		userCenter.clickEditUserInfoButton();
		clickNavgationLeftButton();		
	}
	
	@Test(description="打开用户中心页面",enabled=true)
	public void TestFir06stClickOpenUserCenterPage(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		userCenter.clickOpenUserCenterPage();
	}
	
	
	@Test(description="点击用户中心关注按钮",enabled=true)
	public void TestFir07stClickUserCenterAttentionButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();	
		userCenter.clickUserCentenAttentionButton();
		
	}

	@Test(description="点击用户中心关注列表用户",enabled=true)
	public void TestFir08stClickUserCenterAttentionList(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		userCenter.clickUserAttentionList();
		clickNavgationLeftButton();
		clickNavgationLeftButton();
	}
	
	
	@Test(description="点击用户中心粉丝按钮",enabled=true)
	public void TestFir09stClickUserCenterFollowerButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		userCenter.clickUserCenterFollowerButton();
	}
	
	
	@Test(description="点击用户中心粉丝用户列表",enabled=true)
	public void TestFir10stClickUserCenterFollowerList(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		userCenter.clickUserFollowerList();
	}
	
	
	@Test(description="点击查看用户中心粉丝用户头像",enabled=true)
	public void TestFir11stClickMyFansUserFace(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		userCenter.clickLookUserFansPhoto();
	}
	
	@Test(description="点击关注我的粉丝用户",enabled=true)
	public void TestFir12stClickAttentionMyFans(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		userCenter.clickAttensionOthersUsers();
		clickNavgationLeftButton();
		clickNavgationLeftButton();
	}
	
	
	@Test(description="点击用户中心编辑资料功能",enabled=true)
	public void TestFir13stClickUserCenterEditUserInfoButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		userCenter.clickUserCenterEditUserInfoButton();
		clickNavgationLeftButton();
	}
	

	
	@Test(description="我是三年三班的周同学",enabled=false)
	public void TestFir14stClickTestAfterMethod(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		AssertJUnit.assertEquals(1, 2);
	}
	
}
