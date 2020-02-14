package com.CA.qa.Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.DateUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.CA.qa.Base.TestBase;

public class Testutil extends TestBase{
	
	public static long PAGE_LOAD_TIME = 100;
	
	public static long IMPLICIT_WAIT_TIME = 15;
	
	public static long IMPLICIT_WAIT_TIME_admin = 10;
	
	public static String Exp_ATBloginPageTitle = "Agent Login";
	
	public static String Exp_ATBhomePageTitle = "OCCD Agent ToolBar";
	
	public static String Exp_AdminloginPageTitle = "Login";
	
	public static String Exp_AdminhomePageTitle = "Main Menu";
	
	public static String Exp_Admin_logoText = "Cloud Agent";
	
	public static void takeScreenshotAtEndOfTest(WebDriver dr, String testcaseName) {
		File scrfile= ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		//System.out.println("hello santosh u r in the take screen shot method");
		//System.out.println("current directory is "+currentDir);
		
		try {
			//FileUtils.copyFile(scrfile, new File(currentDir+"/screenshots/"+System.currentTimeMillis()+".png"));
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy H-m-s");
	        Date date = new Date();
			FileUtils.copyFile(scrfile, new File(currentDir+"/screenshots/"+testcaseName+"_"+dateFormat.format(date)+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void flash(WebElement element, WebDriver driver) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        String bgcolor  = element.getCssValue("backgroundColor");
        for (int i = 0; i <  3; i++) {
            changeColor("rgb(0,200,0)", element, js);
            changeColor(bgcolor, element, js);
        }
    }
 
    public static void changeColor(String color, WebElement element,  JavascriptExecutor js) {
        js.executeScript("arguments[0].style.backgroundColor = '"+color+"'",  element);

        try {
            Thread.sleep(200);
        }  catch (InterruptedException e) {
        }
     }
	
    public static ArrayList<String> Readexcel(String sheetname,int columnno){

    	 String filepath = System.getProperty("user.dir")+"/src/main/java/com/CA/qa/TestData/CloudAgent.xlsx";
		 //System.out.println(filepath);
		
	     FileInputStream fis = null;
	     XSSFWorkbook wb = null;
		try {
			fis = new FileInputStream(filepath);
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	     XSSFSheet  sheet =  wb.getSheet(sheetname);

	     Iterator<Row>  Rowit = sheet.rowIterator();
	     
	     
	     Rowit.next();
	      
	     ArrayList<String> list = new ArrayList<String>();
	   
	     while(Rowit.hasNext()) {

	     list.add(Rowit.next().getCell(columnno).getStringCellValue());

	              }
	     //wb.close;

	     return list;

	  	}
    

    public static Object [][] Readexcel1(String sheetname){

   	 String filepath = System.getProperty("user.dir")+"/src/main/java/com/CA/qa/TestData/CloudAgent.xlsx";
		//System.out.println(filepath);
		
	     FileInputStream fis = null;
	     XSSFWorkbook wb = null;
	     Cell cell1=null;
		try {
			fis = new FileInputStream(filepath);
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	     XSSFSheet  sheet =  wb.getSheet(sheetname);
	     Object [][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
	     //System.out.println(sheet.getLastRowNum()+"total rows");
	     //System.out.println(sheet.getRow(0).getLastCellNum()+"total columns");
	     for(int i=0; i<sheet.getLastRowNum();i++)
	    	 for(int j=0;j<sheet.getRow(0).getLastCellNum();j++)
	    		 {
	    		 cell1=sheet.getRow(i+1).getCell(j,org.apache.poi.ss.usermodel.Row.CREATE_NULL_AS_BLANK );
	    		 switch (cell1.getCellType()) {

	             case Cell.CELL_TYPE_STRING:
	            	 data[i][j]=sheet.getRow(i+1).getCell(j).getStringCellValue();
	            	 //System.out.println("String value is:"+data[i][j]);
	                 break;

	             case Cell.CELL_TYPE_NUMERIC:
	            	 data[i][j]=sheet.getRow(i+1).getCell(j).getNumericCellValue();
	            	 //System.out.println("numeric value value is:"+data[i][j]);
//	                 if (DateUtil.isCellDateFormatted(cell1)) {
//	                	  System.out.println(cell1.getDateCellValue());
//	                 } else {
//	                     System.out.println(cell1.getNumericCellValue());
//	                 }
	                 break;
	    		 case Cell.CELL_TYPE_BLANK:
	    			 data[i][j]=sheet.getRow(i+1).getCell(j).getStringCellValue();
	    			 //System.out.println("blank value is:"+data[i][j]+" "+i+" row "+j+" column");
	    		        break;                                     
	    		 }
	    		 }
	     return data;

	  	}
    
    
    
}

