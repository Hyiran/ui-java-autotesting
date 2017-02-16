package test05.yueni.ios.myprofile;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import net.wanghaifeng.com.TestDriverIOS;
import net.wanghaifeng.com.PublicStaticMethod;
import net.wanghaifeng.page.ios.IPhone16UserLabelSubscriptionPage;

public class Test16UserLableSubscriptionPage extends TestDriverIOS {
public static IPhone16UserLabelSubscriptionPage labelSubScription = IPhone16UserLabelSubscriptionPage.getInstance();
	
	
	
	@BeforeClass(description="测试页面初始化操作",enabled=true)
	public void OpenInitializationTestPage(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			openMyProfilePage();
			Test05MyProfilePage.myProfile.clickOpenMySubscribeTags();;
			checkUserLogin(testData.get("username1_value"),testData.get("password1_value"));
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	@Test(description="点击我订阅的标签",enabled=true)
	public void TestFir01stClickUserLabelSubscriptionList(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			labelSubScription.checkLabelSubscriptionPage();
			labelSubScription.clickUserLabelSubscription();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}		
	}
	
	@Test(description="点击取消订阅标签按钮",enabled=true)
	public void TestFir02stClickCancleLabelSubscription(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			labelSubScription.clickCancleLabelSubscription();
			clickBackButton();
			labelSubScription.SwipeScreenDownRefresh();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}		
	}
	
	
	@Test(description="点击订阅标签按钮",enabled=true)
	public void TestFir03stClickLabelSubscriptionButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			labelSubScription.clickUserLabelSubscription();
			labelSubScription.clickCancleLabelSubscription();
			labelSubScription.clickLabelSubscriptionButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}		
	}

	@Test(description="点击订阅标签分享按钮",enabled=true)
	public void TestFir04stClickLabelSubscriptionShareButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			labelSubScription.clickLableSubscriptionShareButton();
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
