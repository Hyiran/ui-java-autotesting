package test05.yueni.ios.myprofile;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import net.wanghaifeng.com.TestDriverIOS;
import net.wanghaifeng.com.PublicStaticMethod;
import net.wanghaifeng.page.ios.IPhone11ReceiveAddressPage;


public class Test11ReceiveAddressPage extends TestDriverIOS{
	
	public static IPhone11ReceiveAddressPage receiveAddress = IPhone11ReceiveAddressPage.getInstance();
	
	@BeforeClass(description="测试页面初始化操作",enabled=true)
	public void OpenInitializationTestPage(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			openMyProfilePage();
			Test05MyProfilePage.myProfile.clickOpenSetMyAddress();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
  
	
	@Test(description="新增我的收货地址",enabled=true)
	public void TestFir01stAddReceivingAddress(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			receiveAddress.addNewReceivingAddress();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	
	@Test(description="编辑并保存收货地址",enabled=true)
	public void TestFir02stEditReceivingAddress(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			receiveAddress.inputAddressee("王海峰");
			receiveAddress.inputRecevingAddressIphone("18613133437");
			receiveAddress.clickSelectRecevingArea();
			receiveAddress.inputRecevingAddress("天河区珠江新城");
			receiveAddress.inputRecevingAddressCode("510510");
			receiveAddress.clickSaveButton();
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
