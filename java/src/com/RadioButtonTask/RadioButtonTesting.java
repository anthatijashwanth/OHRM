package com.RadioButtonTask;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonTesting 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String applicationUrlAddress="https://echoecho.com/htmlforms10.htm";
	     
		WebDriver driver;        

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91738\\Desktop\\Eclipse\\java\\BrowserDriversFiles\\chromedriver.exe");
		driver=new ChromeDriver();
								       
		driver.get(applicationUrlAddress); 
				
		driver.manage().window().maximize();
						   
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		//<input type="radio" name="group1" value="Milk">
		//<input type="radio" name="group1" value="Butter" checked="">
		//<input type="radio" name="group1" value="Cheese">
	
	
		//<input type="radio" name="group2" value="Water">
		//<input type="radio" name="group2" value="Beer">
		//<input type="radio" name="group2" value="Wine" checked="">
	
		//identifying the group1 RAdio Buttons
	
		By group1RadioButtonlocator=By.name("group1");
		java.util.List<WebElement>group1RadioButtons=driver.findElements(group1RadioButtonlocator);
		int group1RadioButtonsCount=group1RadioButtons.size();
		System.out.println("The No.of Buttons"+group1RadioButtonsCount);
	
		//getting the names of the radio Buttons
	
		for(int index=0;index<group1RadioButtonsCount;index++)
		{
			group1RadioButtons.get(index).click();//perfomingclick on the radiobutton
	
			//Getting the names of the radiobuttons and getting the status of the radiobutton 
	
			for(int indexstatus=0;indexstatus<group1RadioButtonsCount;indexstatus++)
			{
	
				String radiobuttonname=group1RadioButtons.get(indexstatus).getAttribute("value");
				String radiobuttonstatus=group1RadioButtons.get(indexstatus).getAttribute("checked");
				System.out.println(index+" "+radiobuttonname+" "+radiobuttonstatus);
	 
			}

			System.out.println();
	
		}
	
	}

}


