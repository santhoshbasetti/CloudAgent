package com.CA.qa.TestCases;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CA.qa.Base.TestBase;
import com.CA.qa.Pages.AdminHomePage;
import com.CA.qa.Pages.AdminLoginPage;
import com.CA.qa.Pages.AgentToolBarHomePage;
import com.CA.qa.Pages.AgentToolBarLoginPage;
import com.CA.qa.Util.Testutil;

public class TryTest extends TestBase{
	
	AgentToolBarLoginPage ATBloginpage;
	AgentToolBarHomePage  ATBHomePage;
	
	public TryTest() {
		super();
	}
	
	@BeforeMethod
	public void setup(Method method) {
		System.out.println("Test name: " + method.getName());
		ATBLogin();
		ATBloginpage = new AgentToolBarLoginPage();
		
		}
	
	@Test (priority = 9)
	public void ATBloginTest() {
		
		ATBHomePage = ATBloginpage.LoginintoATB(Testutil.Readexcel("AgentLogin",1 ).get(0), Testutil.Readexcel("AgentLogin",2 ).get(0), Testutil.Readexcel("AgentLogin",3 ).get(0), Testutil.Readexcel("AgentLogin",4 ).get(0));
		
	}

	




}

