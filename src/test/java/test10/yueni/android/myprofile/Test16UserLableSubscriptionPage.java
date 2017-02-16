package test10.yueni.android.myprofile;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import net.wanghaifeng.com.TestDriverAndroid;
import net.wanghaifeng.com.PublicStaticMethod;
import net.wanghaifeng.page.android.Android16UserLabelSubscriptionPage;

public class Test16UserLableSubscriptionPage extends TestDriverAndroid {
	
	public static Android16UserLabelSubscriptionPage labelSubScription = Android16UserLabelSubscriptionPage.getInstance();

	@BeforeClass(description="测试页面初始化操作",enabled=true)
	public void OpenInitializationTestPage(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			openMyProfilePage();
			Test05MyProfilePage.myProfile.clickOpenMySubscribeTags();;
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	@Test(description="点击我订阅的第一个标签",enabled=true)
	public void TestFir01stClickUserLabelSubscriptionList(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			labelSubScription.clickUserLabelSubscription();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}		
	}
	
	@Test(description="点击取消订阅第一个标签",enabled=true)
	public void TestFir02stClickCancleLabelSubscription(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			labelSubScription.clickCancleLabelSubscription();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}		
	}
	
	
	@Test(description="点击订阅标签按钮",enabled=true)
	public void TestFir03stClickLabelSubscriptionButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			labelSubScription.clickLabelSubscriptionButton();
			clickNavgationLeftButton();
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
