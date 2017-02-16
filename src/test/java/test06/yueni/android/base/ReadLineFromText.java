package test06.yueni.android.base;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLineFromText {
	
	
	public static String readLine(){
		String line="";
		try{
			FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/testdata/telPhoneNum.log");
	        InputStreamReader isr=new InputStreamReader(fis, "UTF-8");
	        BufferedReader br = new BufferedReader(isr);
//	        String[] arrs=null;
	        while ((line=br.readLine())!=null) {
	        	System.out.println("line====="+line);
//	            arrs=line.split(",");
//	            System.out.println(arrs[0] + " : " + arrs[1] + " : " + arrs[2]);
	        } 
	        br.close();
	        isr.close();
	        fis.close();
	        
		}catch(Exception e){
			e.printStackTrace();
		}
		return line;
	}
	
	
	public static String readLineFromText(){
		String line="";
		try{
			FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/testdata/telPhoneNum.log");
	        InputStreamReader isr=new InputStreamReader(fis, "UTF-8");
	        BufferedReader br = new BufferedReader(isr);
	        if((line=br.readLine())!=null){
	        	System.out.println("line====="+line);
	        }
	        br.close();
	        isr.close();
	        fis.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return line;
	}
	
	
	
	
}
