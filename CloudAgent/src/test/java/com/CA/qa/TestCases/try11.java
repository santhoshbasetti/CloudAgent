package com.CA.qa.TestCases;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CA.qa.Base.TestBase;
import com.CA.qa.Pages.AgentToolBarHomePage;
import com.CA.qa.Pages.AgentToolBarLoginPage;
import com.CA.qa.Util.Testutil;

public class try11 extends TestBase{
	
	AgentToolBarLoginPage ATBloginpage;
	AgentToolBarHomePage  ATBHomePage;
	
	public try11() {
		super();
	}

//	@BeforeMethod
//	public void setup(Method method) {
//		System.out.println("Test name: " + method.getName());
//		ATBLogin();
//		ATBloginpage = new AgentToolBarLoginPage();
//		ATBHomePage = ATBloginpage.LoginintoATB(Testutil.Readexcel("AgentLogin",1 ).get(0), Testutil.Readexcel("AgentLogin",2 ).get(0), Testutil.Readexcel("AgentLogin",3 ).get(0), Testutil.Readexcel("AgentLogin",4 ).get(0));
//		
//		}
//	@AfterMethod
//	public void teardown() {
//		ATBHomePage.AgentLogout();
//		driver.quit();
//		//driver1.quit();
//		Printhyphens();
//	}
	
	@Test( priority =3)
    public void VerifyAgentStatusToPause() {
		Testutil.ClearDataInResultColumn("Pause Reasons");
		//PhoneNumber  TransferNumbers   Dispositions  Pause Reasons
		Testutil.WriteDataToexcel("Pause Reasons", 1,"pan");
		//System.out.println("------------------------------------");
		Testutil.WriteDataToexcel("Pause Reasons", 2,"san successfully");
		//Testutil.WriteDataToexcel("Pause Reasons", 3,"pan");
		//Testutil.WriteDataToexcel("Pause Reasons", 4,"san successfully");
		
	}
	
}
