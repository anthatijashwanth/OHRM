package com.OrangeHrmTask2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm_login_Homepage 
   {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		//  Navigating to OrangeHRM Application

		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		     
		WebDriver driver;        

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91738\\Desktop\\Eclipse\\java\\BrowserDriversFiles\\chromedriver.exe");
		        driver=new ChromeDriver();
		       
        driver.get(applicationUrlAddress);
		       
        String Expected_TitleofOHRM="OrangeHRM";
        System.out.println("The Expected output Title of OrangeHRM is :- "+Expected_TitleofOHRM);
		       
		       
        String Actual_TitleofHRM=driver.getTitle();
        System.out.println("The Actual Output Title of OrangeHRM is :- "+Actual_TitleofHRM);

		//  Validating Title of OrangeHRM application 
		       
		 if (Actual_TitleofHRM.equals(Expected_TitleofOHRM))
		 {
			 System.out.println("The Actual Title of OrangeHRM application match with expected Title - Pass");
		 }
		 else
		 {
		System.out.println("The Actual Title of OrangeHRM application Not-match with expected Title - Fail");
		 }

		//Expected URL Address
		        String Expected_URLAdressofOHRM="orangehrm-4.2.0.1";
		        System.out.println("The Expected output URLAdress of OrangeHRM App is :- "+Expected_URLAdressofOHRM);

		//Actual URL Address
		        String Actual_URLAddressofOHRM_App=driver.getCurrentUrl();
		        System.out.println("The Actual output URLAdress of OrangeHRM App is :-"+Actual_URLAddressofOHRM_App);

		// Validate URL Address of OrangeHRM application
		 if (Actual_URLAddressofOHRM_App.contains(Expected_URLAdressofOHRM))
		{
		System.out.println("The Actal URL Address of OrangeHRM application Contains Expected URL Address - Pass");
		     
		}
		 else
		 {
		System.out.println("The Actal URL Address of OrangeHRM application Not-Contains Expected URL Address - Fail");
		 }
		 
		 
		//Inspect The LOGIN Panal Element Properties
		//<div id="logInPanelHeading">LOGIN Panel</div>
		 
		 //Get Expected text of Login Panal
		 String Expected_LogintextofOHRM="LOGIN";
		 System.out.println("The Expected Text of Element Login Panel is:-"+Expected_LogintextofOHRM);
		 
		 //Get Actual text of Login Panal
		 
		 By LoginL=By.id("logInPanelHeading");
		 WebElement Login=driver.findElement(LoginL);
		 
		 String Actual_LogintextofOHRM=Login.getText();
		 System.out.println("The Actual Text of Element Login is:-"+Actual_LogintextofOHRM);
		 
		 // Validating  LOGIN 
		 
		 if(Actual_LogintextofOHRM.contains(Expected_LogintextofOHRM))
		 {
			 System.out.println("The Actual Text of Element Login Panel Contains Excepected Text - Pass");
		 }
		 else
		 {
			 System.out.println("The Actual Text of Element Login Panel Not-Contains Excepected Text - Fail");
		 }
		 
		 
		 		 
		 //Inspect username and password,LOGIN WelcomeAdmin and Logout Element Properties
		 
		//<input name="txtUsername" id="txtUsername" type="text">
		 
		String usernameTestData="anthatijashwanth";
		By userNameL=By.id("txtUsername");
		WebElement userName=driver.findElement(userNameL);
		userName.sendKeys(usernameTestData);

		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">

		String PasswordTestData="Anthati@0307";
		By PasswordL=By.name("txtPassword");
		WebElement Password=driver.findElement(PasswordL);
		Password.sendKeys(PasswordTestData);

		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">      

		By LoginL1=By.className("button");
		WebElement Loginn=driver.findElement(LoginL1);
		Loginn.click();

		//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>

		By WelcomeL=By.linkText("Welcome Admin");
		WebElement WelcomeAdmin=driver.findElement(WelcomeL);
		WelcomeAdmin.click();
		 
		//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>

		Thread.sleep(3000);
		By LogoutL=By.linkText("Logout");
		WebElement Logout=driver.findElement(LogoutL);
		Logout.click();
		 

		//Inspect LOGIN Panal Element Properties
		//<div id="logInPanelHeading">LOGIN Panel</div>

		//Get Expected text of Login Panal after Logout of Orange HRM application
		String Expected_LogintextofOHRMAfterLogout="LOGIN Panel";
		System.out.println("The Expected Text of Element Login Panel is:-"+Expected_LogintextofOHRMAfterLogout);

		
		By LoginAfterLogoutL=By.id("logInPanelHeading");
		WebElement Loginnn=driver.findElement(LoginAfterLogoutL);

		String Actual_LogintextofOHRMAfterLogout=Loginnn.getText();
		System.out.println("The Actual Text of Element Login is:-"+Actual_LogintextofOHRMAfterLogout);

		// Validating  LOGIN Panel And Login Page 

	   if(Actual_LogintextofOHRMAfterLogout.contains(Expected_LogintextofOHRMAfterLogout))
	{
		System.out.println("The Actual Text of Element Login Panel Contains Excepected Text - Pass");
	}
	   else
	{
		   System.out.println("The Actual Text of Element Login Panel Not-Contains Excepected Text - Fail");
	}

	   driver.close();

	}

}
