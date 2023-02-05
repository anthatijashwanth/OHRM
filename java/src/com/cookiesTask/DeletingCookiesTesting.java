package com.cookiesTask;

import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeletingCookiesTesting 
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
	
	//Deleting Cookies
	
   // driver.manage().deleteAllCookies();
	
	
	Set<Cookie>tsrtccookies=driver.manage().getCookies();//getting all the cookies
	
	//Both set and list - from the collection of java
	
	int tsrtccookiescount=tsrtccookies.size();
	
	System.out.println("The number of the TSRTC application HomePage are:-"+tsrtccookiescount);
	
	Iterator<Cookie>tsrtcIT=tsrtccookies.iterator();
	
	while(tsrtcIT.hasNext())
	{
     Cookie C=tsrtcIT.next();
     
     //getting the domain name of the cookies and the name of the cookies
     
     System.out.println(C.getDomain()+" "+C.getName());
     
	}
	
	//Deleting all the cookies of the webpage
	
	driver.manage().deleteAllCookies();
	
	//getting all the cookies into the set
	
	tsrtccookies=driver.manage().getCookies();
	
	tsrtccookiescount=tsrtccookies.size();
	
	System.out.println("The number of cookies on the TSRTC application HomePage are:- "+tsrtccookiescount);
	
	driver.quit();
	}
	
	
}
