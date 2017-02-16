package test10.yueni.android.myprofile;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import net.wanghaifeng.com.TestDriverAndroid;
import net.wanghaifeng.page.android.Android12MenstruationAssistantPage;


public class Test12MenstruationAssistantPage extends TestDriverAndroid{
	
	public static Android12MenstruationAssistantPage mensAssitant = Android12MenstruationAssistantPage.getInstance();
	
	@BeforeClass(description="测试页面初始化操作",enabled=true)
	public void OpenInitializationTestPage(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		openMyProfilePage();
		Test05MyProfilePage.myProfile.clickOpenMenstruationAssistant();
	}
  
	
	@Test(description="初次设置姨妈助手",enabled=true)
	public void TestFir01stClickSetInitMenstruationPara() {
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		mensAssitant.clickSetMenstruationPara();
	}
	
	
	@Test(description="打开和关闭姨妈助手帮助页面",enabled=true)
	public void TestFir02stClickOpenMenstruationCalendar(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		mensAssitant.clickCloseMenstuationCalendarHelp();
	}

	@Test(description="点击修改姨妈经期参数",enabled=true)
	public void TestFir03stClickModifyMenstruationPara(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		mensAssitant.clickModifyMenstruationPara();
		mensAssitant.clickSubmitButton();
	}
	
	
	@Test(description="点击进入经期日历",enabled=true)
	public void TestFir04stOpenMenstruationCalendar(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		mensAssitant.clickOpenMenstruationCalendar();
	}
	

	@Test(description="点击经期分析",enabled=true)
	public void TestFir05stClickMenstruationAnalysis(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		mensAssitant.clickMenstruationAnalysis();
		clickNavgationLeftButton();
	}
	
	@Test(description="左右浏览不同月份经期",enabled=true)
	public void TestFir06stBrowseMenstruation(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		mensAssitant.clickMonthMenstruation();
	}
	
	
	
	@Test(description="回到当前经期月份",enabled=true)
	public void TestFir07stClickBackNowMonth(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		mensAssitant.clickBackNowMonth();
	}
	
	
	@Test(description="点击更新最近经期开始日",enabled=true)
	public void TestFir08stClickUpdateMenstruationCalendar(){
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		mensAssitant.clickUpdateMenstruationCalendar();
		mensAssitant.clickSubmitButton();
	}
	
	


}
