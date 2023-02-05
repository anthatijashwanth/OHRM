package com.scrollBar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBarTesting 
   {

	public static void main(String[] args)
	{
	// TODO Auto-generated method stub
		
	 String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
	     
	 WebDriver driver;        

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\91738\\Desktop\\Eclipse\\java\\BrowserDriversFiles\\chromedriver.exe");
	driver=new ChromeDriver();
						       
	driver.get(applicationUrlAddress); 
		
	driver.manage().window().maximize();
				   
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    
    //JavaScriptExecutor- is an interface in selinum WebDriver-used to work with scrollBar
    
    //TypingCasting
    
    ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,250)");
    
    /*
     JavaScriptExecutor js=((JavascriptExecutor)driver);
     js.executescript("window.scrollTo(0,250)");
     */
    
    

	}

}
