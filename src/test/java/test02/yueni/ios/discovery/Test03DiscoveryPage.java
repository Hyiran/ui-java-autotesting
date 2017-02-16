package test02.yueni.ios.discovery;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import net.wanghaifeng.com.TestDriverIOS;
import net.wanghaifeng.com.PublicStaticMethod;
import net.wanghaifeng.page.ios.IPhone02DiscoveryPage;

public class Test03DiscoveryPage extends TestDriverIOS{
  
	public static IPhone02DiscoveryPage discovery = IPhone02DiscoveryPage.getInstance();
	
	@BeforeClass(description="测试页面初始化操作",enabled=true)
	public static void OpenInitializationTestPage(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			discovery.openDiscoveryPage();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	@Test(description="点击顶部滚动图片",enabled=true)
	public void TestFir01stClickOpenScrollImagePage(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{						
			discovery.clickDiscoveryScrollImage();
			clickBackButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	
	@Test(description="点击打开达人页面",enabled=true)
	public void TestFir02stClickOpenMasterPersonPage(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			discovery.clickMasterPersonButton();
			clickBackButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	@Test(description="点击打开更多达人页面",enabled=true)
	public void TestFir03stClickOpenMoreMasterPersonPage(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			discovery.openMoreMasterPersionPage();
			clickBackButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	

	@Test(description="点击打开专题页面",enabled=true)
	public void TestFir04stClickOpenSpecialPage(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			discovery.clickSpecialButton();
			clickBackButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	
	@Test(description="点击打开情感页面",enabled=true)
	public void TestFir05stClickOpenEmotionPage(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			discovery.clickOpenEmotionPage();
			clickBackButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}

	@Test(description="点击打开更多情感标签页面",enabled=true)
	public void TestFir06stClickOpenMoreEmotionPage(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			discovery.openMoreEmotionPage();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	@Test(description="点击打开情感标签详情",enabled=true)
	public void TestFir07stClickOpenEmotionTagDetail(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			discovery.clickEmotionTagsDetailPage();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	
	@Test(description="点击标签订阅按钮",enabled=true)
	public void TestFir08stClickLabelSubcription(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			discovery.clickLabelSubscriptionButton();
			clickBackButton();
			clickBackButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	

	@Test(description="点击打开美妆页面",enabled=true)
	public void TestFir09stClickOpenBeautyPage(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			discovery.clickOpenBeautyPage();
			clickBackButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	@Test(description="点击打开娱乐页面",enabled=true)
	public void TestFir10stClickOpenEntertainmentPage(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		try{
			discovery.clickOpenEntertainmnetPage();
			clickBackButton();
		}catch(Exception e){
			PublicStaticMethod.captureScreenShot(methodName,driver);		
		}
	}
	
	
	
	
}
