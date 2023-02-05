package com.WebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstRowOfForstCellData 
{

	public void applicationLaunch()
	{
		
		String applicationUrlAddress="https://www.timeanddate.com/worldclock/";
	     
	    WebDriver driver;        

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\91738\\Desktop\\Eclipse\\java\\BrowserDriversFiles\\chromedriver.exe");
		 driver=new ChromeDriver();
					       
	     driver.get(applicationUrlAddress); 
			   
		//maximizing the Window
	     driver.manage().window().maximize();
			   
		//implicit wait
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			   
	   

	}
	public static void main(String[] args)
	{
		FirstRowOfForstCellData getdata=new FirstRowOfForstCellData();
		getdata.applicationLaunch();
		
		
	}
}

