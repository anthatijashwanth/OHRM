package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Chrome Browser Automation
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91738\\Desktop\\Eclipse\\java\\BrowserDriversFiles\\chromedriver.exe");
		ChromeDriver chromebrowsre=new ChromeDriver();
	
	//navigation
	chromebrowsre.get("http://bing.com");
	chromebrowsre.get("http://google.com");
	chromebrowsre.get("http://facebook");
	
	chromebrowsre.navigate().to ("http://LiveTech.in");
	chromebrowsre.close();//closing the Browser it will close the Browser with single Tab
	chromebrowsre.quit();//closing the Browser with mutiple tabs opened
	
	
			
		}
 
}


