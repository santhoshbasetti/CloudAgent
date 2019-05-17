package com.CA.qa.TestCases;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
import java.util.ArrayList;
//import java.util.Date;
import java.util.Iterator;
import java.util.List;

//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CA.qa.Base.TestBase;
import com.CA.qa.Pages.AdminHomePage;
import com.CA.qa.Pages.AdminLoginPage;
import com.CA.qa.Util.Testutil;

public class try1 extends TestBase {

	AdminLoginPage Adminloginpage;
	AdminHomePage AdminHomepage;

	
	@BeforeMethod
	public void setup(Method method) {
		System.out.println("Test name: " + method.getName());
		AdminLogin();
		Adminloginpage = new AdminLoginPage();
		AdminHomepage = Adminloginpage.LoginAsAdmin(Testutil.Readexcel("AdminLogin",1).get(0),Testutil.Readexcel("AdminLogin",2).get(0));
		
		}
	@Test(priority=1)
	public void runCampaignaTest() {
		System.out.println("Run is:"+AdminHomepage.RunCampaign("inbound", "sannn1", ""));
		System.out.println("message is:"+AdminHomepage.StopCampaign("inbound","sannn1", ""));
		System.out.println();
		
		System.out.println("Run is:"+AdminHomepage.RunCampaign("inbound", "sannn5", ""));
		System.out.println("message is:"+AdminHomepage.StopCampaign("inbound","sannn5", ""));
		System.out.println();
		
		System.out.println("Run is:"+AdminHomepage.RunCampaign("inbound", "Inbound_914030883932", ""));
		System.out.println("message is:"+AdminHomepage.StopCampaign("inbound","Inbound_914030883932", ""));
		System.out.println("Run is:"+AdminHomepage.RunCampaign("inbound", "Inbound_914030883932", ""));
		System.out.println();
		
		System.out.println("Run is:"+AdminHomepage.RunCampaign("inbound", "testsub", ""));
		System.out.println("message is:"+AdminHomepage.StopCampaign("inbound","testsub", ""));
		System.out.println();
		
		System.out.println("Run is:"+AdminHomepage.RunCampaign("inbound", "santinbound", ""));
		System.out.println("message is:"+AdminHomepage.StopCampaign("inbound","santinbound", ""));
		System.out.println("Run is:"+AdminHomepage.RunCampaign("inbound", "santinbound", ""));
		System.out.println();
		
		System.out.println("Run is:"+AdminHomepage.RunCampaign("inbound", "test_camp", ""));
		System.out.println("message is:"+AdminHomepage.StopCampaign("inbound","test_camp", ""));
		System.out.println("Run is:"+AdminHomepage.RunCampaign("inbound", "test_camp", ""));
		System.out.println();
		
		System.out.println("Run is:"+AdminHomepage.RunCampaign("inbound", "Inbound_15104471330", ""));
		System.out.println("message is:"+AdminHomepage.StopCampaign("inbound","Inbound_15104471330", ""));
		System.out.println("Run is:"+AdminHomepage.RunCampaign("inbound", "Inbound_15104471330", ""));
		System.out.println();
		
		System.out.println("Run is:"+AdminHomepage.RunCampaign("inbound", "NewTest", ""));
		System.out.println("message is:"+AdminHomepage.StopCampaign("inbound","NewTest", ""));
		System.out.println();
		
		System.out.println("Run is:"+AdminHomepage.RunCampaign("inbound", "test_checkq", ""));
		System.out.println("message is:"+AdminHomepage.StopCampaign("inbound","test_checkq", ""));
		System.out.println();
		
		System.out.println("Run is:"+AdminHomepage.RunCampaign("inbound", "Tabs", ""));
		System.out.println("message is:"+AdminHomepage.StopCampaign("inbound","Tabs", ""));
		System.out.println();
		
		//AdminHomepage.RunCampaign("inbound", "Inbound_15104471330", "");
		//AdminHomepage.DeleteCampaign("outbound", "sannn2", "");
	}
	
//	@Test(priority=2)
//	public void deleteCampaignaTest() {
//		//AdminHomepage.RunCampaign("outbound", "sannn2", "");
//		AdminHomepage.DeleteCampaign("inbound", "NewTest", "");
//	}
	
	
//Campaign Name
//DID
//Position
//Created Date
//Modified Date
//Campaign Type
//Allowed For Manual Dialing
//OffLine Mode
//IVR Flow

	
	@AfterMethod
	public void tear() {
		//AdminHomepage.admin_logout();
		//driver1.close();
	}
	}
	
	