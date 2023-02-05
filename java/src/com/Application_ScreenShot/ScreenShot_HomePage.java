package com.Application_ScreenShot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot_HomePage {

     public static void main(String[] args) {
	// TODO Auto-generated method stub
    	 
    String applicationUrlAddress="https://www.bing.com/?toWww=1&redig=D5EE5AE37940482A896F6CA31EF61E59";
	     
    WebDriver driver;        

	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\91738\\Desktop\\Eclipse\\java\\BrowserDriversFiles\\chromedriver.exe");
	 driver=new ChromeDriver();
				       
     driver.get(applicationUrlAddress); 
		   
	//maximizing the Window
     driver.manage().window().maximize();
		   
	//implicit wait
     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   
	driver.quit();	   
		   
	}

}
