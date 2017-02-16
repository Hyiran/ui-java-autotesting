package test06.yueni.android.base;

import org.testng.Reporter;
import org.testng.annotations.Test;

import net.wanghaifeng.com.TestDriverAndroid;
import net.wanghaifeng.com.PublicStaticMethod;
import net.wanghaifeng.page.android.Android18WeixinPage;

public class Test03WinxinPage extends TestDriverAndroid{
	private static Android18WeixinPage weixin = Android18WeixinPage.getInstance();
	@Test(description="点击添加微信好友",enabled=true)
	public void TestFir01stOpenIndexPage(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			weixin.clickAddWeixinFriend();
			Reporter.log(testResultSuccess);
		}catch(Exception e){
			Reporter.log(testResultFailure);
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	@Test(description="点击添加好友按钮",enabled=true)
	public void TestFir02stClickWeixinButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			weixin.clickAddFriendButton();
			Reporter.log(testResultSuccess);
		}catch(Exception e){
			Reporter.log(testResultFailure);
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	@Test(description="点击输入框",enabled=true)
	public void TestFir03stClickInputFieldText(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			weixin.clickInputFieldText();
			Reporter.log(testResultSuccess);
		}catch(Exception e){
			Reporter.log(testResultFailure);
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	@Test(description="点击输入手机号码",enabled=true)
	public void TestFir04stInputUserTelePhoneNumber(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			String num = ReadLineFromText.readLineFromText();
			System.out.println("正在获取的手机号码是：" + num);
			weixin.inputUserTelePhoneNumber(num);
			Reporter.log(testResultSuccess);
		}catch(Exception e){
			Reporter.log(testResultFailure);
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	@Test(description="点击搜索手机号码",enabled=true)
	public void TestFir05stClickSearchTelePhoneNumber(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			weixin.clickSearchTelePhoneNumber();
			Reporter.log(testResultSuccess);
		}catch(Exception e){
			Reporter.log(testResultFailure);
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	@Test(description="点击添加手机号码到通讯录",enabled=true)
	public void TestFir06stAddIphoneNumberToList(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			weixin.addIphoneNumberToList();
			Reporter.log(testResultSuccess);
		}catch(Exception e){
			Reporter.log(testResultFailure);
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	@Test(description="输入验证信息",enabled=true)
	public void TestFir07stInputVifacationInfo(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			weixin.inputVificationInfo();
			Reporter.log(testResultSuccess);
		}catch(Exception e){
			Reporter.log(testResultFailure);
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	@Test(description="点击发送按钮",enabled=true)
	public void TestFir08stClickSendOutButton(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			weixin.clickSendOutButton();
			Reporter.log(testResultSuccess);
		}catch(Exception e){
			Reporter.log(testResultFailure);
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	

}
