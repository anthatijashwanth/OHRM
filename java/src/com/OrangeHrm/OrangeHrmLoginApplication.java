package com.OrangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmLoginApplication
    {

	public static void main(String[] args)
	{
	// TODO Auto-generated method stub
	String ApplicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91738\\Desktop\\Eclipse\\java\\BrowserDriversFiles\\chromedriver.exe" );
	driver=new ChromeDriver();
	driver.get(ApplicationUrlAddress);
    String Expected_OrangeHrmHomeLogInPageTitle="OrangeHRM";
    System.out.println("The Expected_OrangeHrm page Title is:-"+Expected_OrangeHrmHomeLogInPageTitle);
    //printing the identified title of the OrangeHomepageTitle
	String Actual_OrangeHrmHomeLogInPageTitle=driver.getTitle();
	System.out.println("The Actual_OrangeHrm page Title is:-"+Actual_OrangeHrmHomeLogInPageTitle);
	//validating Url Address
     if(Actual_OrangeHrmHomeLogInPageTitle.contains(Actual_OrangeHrmHomeLogInPageTitle))
	{
     System.out.println("The Title OrangeHRM Home LogIn Page is Matched-pass");
	}
 	else 
 	{
 	System.out.println("The Title OrangeHRM Home LogIn Page not Matched-fail");
 	}
    /*<input name="txtUsername" id="txtUsername" type="text">
     * locator-id
     * selector-txtUsername
     */
     driver.findElement(By.id("txtUsername")).sendKeys("anthatijashwanth");
     /*<input name="txtPassword" id="txtPassword" autocomplete="off" type="password" >
      * locator-id
      * selector-txtPassword
      */
     driver.findElement(By.name("txtPassword")).sendKeys("Anthati@0307");
     /*<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
      * locator-classname
      * selector-button
      */
     driver.findElement(By.className("button")).click();
     driver.quit();
}
}
	
	
    
    
	
	
	
	
		
		


