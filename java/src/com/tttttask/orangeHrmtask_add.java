package com.tttttask;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangeHrmtask_add {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		

		 // String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
				     
		 // WebDriver driver;        

		 // System.setProperty("webdriver.chrome.driver", "C:\\Users\\91738\\Desktop\\Eclipse\\java\\BrowserDriversFiles\\chromedriver.exe");
	     // driver=new ChromeDriver();
				       
		  //driver.get(applicationUrlAddress); 
		   
		  //maximizing the Window
		   //driver.manage().window().maximize();
		   
		  //implicit wait
		  // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   
		   //identify the file (excel) in the system-any type of file 
		   
		  FileInputStream file=new FileInputStream("C:\\Users\\91738\\Desktop\\Eclipse\\java\\src\\com\\excel\\LogInTest.xlsx");
		   
		 //identify the workbook of the file
		  
		   XSSFWorkbook workbook=new XSSFWorkbook(file);
		   
		   //identifying the sheet-in the woorkbook
		   
		   XSSFSheet sheet=workbook.getSheet("Sheet1");
		   
		   //create a row in the sheet
		   
		   Row row=sheet.createRow(3);
		   
		   // create a row of a cell 
		   
		   Cell RowOfCell=row.createCell(4);
		   
		   //setting the value into the row of a cell created
		   
		   RowOfCell.setCellValue("Selenium");
		   
		   //saving  the file with the workbook
		   
		   FileOutputStream file1=new FileOutputStream("C:\\Users\\91738\\Desktop\\Eclipse\\java\\src\\com\\excel\\LogInTest.xlsx");
		   workbook.write(file1);
		       
		   
		   
		  

		   
		   
		
		
	}

}
