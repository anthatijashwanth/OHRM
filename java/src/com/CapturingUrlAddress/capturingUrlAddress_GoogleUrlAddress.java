package com.CapturingUrlAddress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class capturingUrlAddress_GoogleUrlAddress {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
     
     //assiging the UrlAddress to a variable
	String applicationUrlAddress="http://Google.com";
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91738\\Desktop\\Eclipse\\java\\BrowserDriversFiles\\chromedriver.exe" );
	driver=new ChromeDriver();//creating an object for webdrivers
	driver.get(applicationUrlAddress);
	String expected_GoogleHomePageUrlAddress="google.com";
	System.out.println("the expected Url Address of Google Home Page is:-"+expected_GoogleHomePageUrlAddress);
	//identified the current Url Address of Google Home page
	String actual_GoogleHomePageUrlAddress=driver.getCurrentUrl();
	System.out.println("the actual Url Address of Google home Page is:-"+actual_GoogleHomePageUrlAddress);
	
	//validating Url Address
	if(actual_GoogleHomePageUrlAddress.contains(expected_GoogleHomePageUrlAddress))
	{
	System.out.println("UrlAddress Matched-pass");
	}
	else 
	{
	System.out.println("UrlAddress not Matched-fail");
	}
	driver.quit();
	
	}
	
	
	}
