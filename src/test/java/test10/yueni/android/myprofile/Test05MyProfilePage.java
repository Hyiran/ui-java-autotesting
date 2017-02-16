package test10.yueni.android.myprofile;

import org.testng.AssertJUnit;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import net.wanghaifeng.page.android.Android05MyProfilePage;
import net.wanghaifeng.com.TestDriverAndroid;
import net.wanghaifeng.com.PublicStaticMethod;


public class Test05MyProfilePage extends TestDriverAndroid{
	
	public static Android05MyProfilePage myProfile = Android05MyProfilePage.getInstance();
	
	
	@BeforeClass(description="个人模块功能页面初始化",enabled=true)
	public void TestFir00stOpenMyprofilePage(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		openMyProfilePage();
	}
 
	@Test(description="点击打开我的经验值",enabled=true)
	public void TestFir01stClickExperience(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		myProfile.clickOpenMyExperience();
	}
	
	@Test(description="点击打开升级规则",enabled=true)
	public void TestFir02stClickOpenUpgraderRule(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		myProfile.clickOpenUpgraderRule();	
		clickNavgationLeftButton();
	}
	
	
	@Test(description="点击打开我的收货地址",enabled=true)
	public void TestFir03stClickSetMyAddress(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		myProfile.clickOpenSetMyAddress();
		clickNavgationLeftButton();
	}
	
	
	@Test(description="点击打开我绑定的手机号码",enabled=true)
	public void TestFir04stClickBandingNum(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		myProfile.clickOpenBindingIPhoneNum();
		clickNavgationLeftButton();
	}
	
	
	@Test(description="点击打开姨妈助手",enabled=true)
	public void TestFir05stClickMenstruationAssistant(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		PublicStaticMethod.flickScreen(530.0, 1434.0, 530.0, 822.0, 1, driver);
		myProfile.clickOpenMenstruationAssistant();
		clickNavgationLeftButton();
	}
	
	@Test(description="点击打开我订阅的标签",enabled=true)
	public void TestFir07stClickMySubscribe(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		myProfile.clickOpenMySubscribeTags();
		clickNavgationLeftButton();
	}
	
	
	@Test(description="点击打开我的收藏",enabled=true)
	public void TestFir08stClickMyCollection(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		PublicStaticMethod.flickScreen(530.0, 1434.0, 530.0, 822.0, 1, driver);
		myProfile.clickOpenMyPostCollection();
		clickNavgationLeftButton();
	}
	
	
	@Test(description="点击打开绑定社交平台",enabled=true)
	public void TestFir09stClickBindSocailPlatform(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		myProfile.clickOpenBindingSocialPlatform();
		clickNavgationLeftButton();
	}
	
	
	@Test(description="点击打开系统设置",enabled=true)
	public void TestFir10stClickSystemSettingPage(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		myProfile.clickOpenSystemSettingPage();
		clickNavgationLeftButton();
	}
	

	@Test(description="我是三年二班的王同学",enabled=false)
	public void TestFir11stClickTestAfterMethod(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		AssertJUnit.assertEquals(1, 2);
	}
	


	
}
