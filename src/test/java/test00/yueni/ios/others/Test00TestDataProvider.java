package test00.yueni.ios.others;

import org.testng.annotations.DataProvider;

public class Test00TestDataProvider {
	
	
	
	@DataProvider(name="userlogin")
	public static Object[][] UserLogin(){
		return new Object[][]{
				new Object[]{"18613133437","123456"},
				new Object[]{"18918888888","123456"},
		};
	}



}
