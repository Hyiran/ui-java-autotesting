package test10.yueni.android.myprofile;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import net.wanghaifeng.com.TestDriverAndroid;
import net.wanghaifeng.page.android.Android11ReceiveAddressPage;


public class Test11ReceiveAddressPage extends TestDriverAndroid{
	
	public static Android11ReceiveAddressPage receiveAddress = Android11ReceiveAddressPage.getInstance();
	
	@BeforeClass(description="测试页面初始化操作",enabled=true)
	public void OpenInitializationTestPage(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		openMyProfilePage();
		receiveAddress.clickOpenSetMyAddress();
	}
  
	
	@Test(description="点击进入编辑我的收货地址",enabled=true)
	public void TestFir01stAddReceivingAddress(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		receiveAddress.clickOpenEditMyAddress();
	}
	
	
	@Test(description="编辑并保存收货地址",enabled=true)
	public void TestFir02stEditReceivingAddress(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		receiveAddress.inputAddressee("王海峰");
		receiveAddress.inputRecevingAddressIphone("18613133437");
		receiveAddress.clickSelectRecevingArea();
		receiveAddress.inputRecevingAddress("天河区珠江新城");
		receiveAddress.inputRecevingAddressCode("510500");
		receiveAddress.clickSaveButton();
		clickNavgationLeftButton();
	}
	
	

	
	
}
