package test06.yueni.android.base;

import org.testng.Reporter;
import org.testng.annotations.Test;

import net.wanghaifeng.com.TestDriverAndroid;
import net.wanghaifeng.com.PublicStaticMethod;
import net.wanghaifeng.page.android.Android01HomePage;

public class Test01IndexPage extends TestDriverAndroid{
  
	private static Android01HomePage indexPage = Android01HomePage.getInstance();
	
	@Test(description="点击打开首页模块",enabled=true)
	public void TestFir01stOpenIndexPage(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			indexPage.openIndexPage();
			Reporter.log(testResultSuccess);
		}catch(Exception e){
			Reporter.log(testResultFailure);
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
}
