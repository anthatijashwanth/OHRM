package com.OrangeHrmTask2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddEmployee_OrangeHrm {

	public static void main(String[] args)
	{
	// TODO Auto-generated method stub
	//  Navigating to OrangeHRM Application

	  String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
			     
	  WebDriver driver;        

	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91738\\Desktop\\Eclipse\\java\\BrowserDriversFiles\\chromedriver.exe");
      driver=new ChromeDriver();
			       
	  driver.get(applicationUrlAddress); 
	   
	  //maximizing the Window
	   driver.manage().window().maximize();
	   
	  //implicit wait
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   
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
	 	
	 /*	<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule"
	 	id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
	 	 */
	 		
	   By PIML=By.id("menu_pim_viewPimModule");
	   WebElement PIM=driver.findElement(PIML);
	   
	   //MoveHover Action
	  Actions action=new Actions(driver);
	  action.moveToElement(PIM).build().perform();
	  
	  //Add Employee 
	  /*<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
	   */
	  By AddEmployeeL=By.linkText("Add Employee");
      
	  WebElement AddEmployee=driver.findElement(AddEmployeeL);
	  AddEmployee.click();
	  
	  /*<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
	   */
	  
	  String FirstName="anthati";
	  By FirstNameL=By.id("firstName");
	  WebElement firstname=driver.findElement(FirstNameL);
	  firstname.sendKeys(FirstName);
	  
	  /*<input class="formInputText" maxlength="30" type="text" name="middleName" id="middleName">
	   */
	  
	  String MiddleName="jashwanth";
	  By MiddelNameL=By.id("middleName");
	  WebElement middlename=driver.findElement(MiddelNameL);
	  middlename.sendKeys(MiddleName);
	 
	  /*<input class="formInputText validation-error" maxlength="30"
	   type="text" name="lastName" id="lastName">
	   */ 
	    
	  String Lastname="goud";
	  By LastNameL=By.id("lastName");
	  WebElement lastname=driver.findElement(LastNameL);
	  lastname.sendKeys(Lastname);
	  
	  /*<input class="formInputText valid" maxlength="10"
	     type="text" name="employeeId" value="0001" id="employeeId">
	   */
	  
	  By saved_EmployeeIdL=By.id("employeeId");
	  WebElement EmployeeId=driver.findElement(saved_EmployeeIdL);
	  
	  String saved_EmployeeId_attribute=EmployeeId.getAttribute("value");
	  System.out.println("the value of saved_EmployeeId is:-"+saved_EmployeeId_attribute);
	  
	  
	  /*<input type="button" class="" id="btnSave" value="Save" fdprocessedid="9joox">
	 
	   */
	  By SaveLocator=By.id("btnSave");
	  WebElement save=driver.findElement(SaveLocator);
	  save.click();
	  
	  
	  /*<input value="anthati" type="text" name="personal[txtEmpFirstName]" class="block default editable" 
	    maxlength="30" title="First Name" id="personal_txtEmpFirstName" disabled="disabled" fdprocessedid="ev4nc">
	   */
	   
	  String Expected_FirstName="anthati";
	  System.out.println("Expected First Name is:- "+Expected_FirstName);
	  By firstnameL=By.id("personal_txtEmpFirstName");
	  WebElement Actual_FirstNameElement=driver.findElement(firstnameL);
	  String ActualFirstName=Actual_FirstNameElement.getAttribute("value");
	  System.out.println("The Actual First Name is :- "+ActualFirstName);
	  
	  
	  if(ActualFirstName.equals(Expected_FirstName))
	  {
	    System.out.println("The Expected First Name is Matched - PASS");
	  }
	  else
	  {
	    System.out.println("The Expected First Name is NOT Matched - FAIL");
	  }
	  
	  
	  /*<input value="jashwanth" type="text" name="personal[txtEmpMiddleName]" class="block default editable"
	 maxlength="30" title="Middle Name" id="personal_txtEmpMiddleName" disabled="disabled" fdprocessedid="abjq3k">
	 */
	  
	  String Expected_MiddleName="jashwanth";
	  System.out.println("Expected_Middle Name is:-"+Expected_MiddleName);
	  By middlenameL=By.id("personal_txtEmpMiddleName");
	  WebElement Actual_MiddleNameElement=driver.findElement(middlenameL);
	  String ActualMiddleName=Actual_MiddleNameElement.getAttribute("value");
	  System.out.println("the Actual Middle Name is :-"+ActualMiddleName);
	  
	  if(ActualMiddleName.equals(ActualMiddleName))
	  {
	    System.out.println("The Expected Middle Name is Matched -PASS");
	  }
	  else
	  {
		System.out.println(":The Expected Middle Name is Not Matched - FAIL");
	  }
	  
	 /* <input value="goud" type="text" name="personal[txtEmpLastName]" class="block default editable"
		 maxlength="30" title="Last Name" id="personal_txtEmpLastName" disabled="disabled">
	 */
	  
	  String Expected_LastName="goud";
	  System.out.println("Expected_Last Name is:-"+Expected_LastName);
	  By lastnameL=By.id("personal_txtEmpLastName");
	  WebElement Actual_LastNameElement=driver.findElement(lastnameL);
	  String ActualLastName=Actual_LastNameElement.getAttribute("value");
	  System.out.println("The Actual Last Name is :-"+ActualLastName);
	  
	  if (ActualLastName.equals(ActualLastName)) 
	  {
		 System.out.println("The Expected Last Name is Matched - PASS");	
	}
	  else
	  {
		System.out.println("The Expected Last Name is Not Matched -FAIL");
		
	}
	  
	 /*<input value="0001" type="text" name="personal[txtEmployeeId]"
	   maxlength="10" class="editable" id="personal_txtEmployeeId" disabled="disabled" fdprocessedid="hfkxrj"> 
	  */
	  
	  By EmployyeIdL=By.id("personal_txtEmployeeId");
	  WebElement Actual_EmployeeIdElement=driver.findElement(EmployyeIdL);
	  String ActualEmployeeId=Actual_EmployeeIdElement.getAttribute("value");
	  System.out.println("The Actual Last Name is :-"+ActualEmployeeId);
	  
	  if (saved_EmployeeId_attribute.equals(ActualEmployeeId)) 
	  {
		 System.out.println("The Expected Employee Id  is Matched - PASS");	
	}
	  else
	  {
		System.out.println("The Expected Employee Id is Not Matched -FAIL");
		
		driver.quit();
	}
	  
	  
			 
		
	}
	  
			    

	}

