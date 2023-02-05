package com.LinksTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm_WelcomeAdminAndLogOut 
    {

	public static void main(String[] args) throws InterruptedException
	{
	// TODO Auto-generated method stub
	String ApplicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91738\\Desktop\\Eclipse\\java\\BrowserDriversFiles\\chromedriver.exe" );
	driver=new ChromeDriver();
	driver.get(ApplicationUrlAddress);
	
	/*<input name="txtUsername" id="txtUsername" type="text">
     */
	 String userNameTestData="anthatijashwanth";
     WebElement userNameElement=driver.findElement(By.id("txtUsername"));
     userNameElement.sendKeys("anthatijashwanth");
     
     /*<input name="txtPassword" id="txtPassword" autocomplete="off" type="password" >
      */
     String passwordTestData="Anthati@0307";
     By passwordL=By.name("txtPassword");
     WebElement password=driver.findElement(passwordL);
     password.sendKeys(passwordTestData);
     
     /*<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
      */
     By LogInButtonL =By.className("button");
     WebElement LogInButton=driver.findElement(LogInButtonL);
     LogInButton.click();
     
     //Linking Testing
     /*<a href="#" id="welcome" class="panelTrigger activated-welcome">Welcome Admin</a>
      a=anchorTag
      locator-linkTest
      selector-Welcome Admin
      */
     By WelcomeAdminL=By.linkText("Welcome Admin");
     WebElement WelcomeAdmin=driver.findElement(WelcomeAdminL);
     WelcomeAdmin.click();
    /* <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
    a=anchorTag
    locator-linkTest
    selector-Logout
     */
     Thread.sleep(3000);
     By LogoutL=By.linkText("Logout");
     WebElement Logout=driver.findElement(LogoutL);
     Logout.click();
     driver.close();
    
	}

}
