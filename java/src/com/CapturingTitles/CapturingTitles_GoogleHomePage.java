package com.CapturingTitles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import net.bytebuddy.implementation.EqualsMethod;

public class CapturingTitles_GoogleHomePage 
   {

	public static void main(String[] args)
	{
	// TODO Auto-generated method stub
	//Assiging the url Address to a variable
	String applicationUrlAddress="http://Google.com";
		
	WebDriver driver;
	
	//Automation GoogleBrowser
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91738\\Desktop\\Eclipse\\java\\BrowserDriversFiles\\chromedriver.exe");
	  driver=new ChromeDriver();
	  
	 //navagating to Application Url Address
	 
	 driver.get(applicationUrlAddress);//Passing the variable to get method. Which is assigned with Url Address
	  
	 //Getting the title of the GoogleHomePage
	 String actual_GoogleHomePageTitle=driver.getTitle();
	 //Object(driver)points to current web page
	 //Getting title of the current web page
	  String expected_GoogleHomePageTitle=driver.getTitle();
	  System.out.println("The Expected title of GoogleHomePage is:-"+expected_GoogleHomePageTitle);
	  //printing the identified title of the GoogleHomepage
	 
	  System.out.println("The Actual Title of the GoogleHomePage is:-"+actual_GoogleHomePageTitle );
	  driver.quit();
	 //validating the GoogleHomePage
	 if(actual_GoogleHomePageTitle.equals(expected_GoogleHomePageTitle))
	 {
	 System.out.println("title of the GoogleHomePage Matched-Pass");
	 }
	 else
	 {
	 System.out.println("title the GoogleHomePage not Matched-Fail");
	 }
	 driver.quit();
	 }
	}
	

