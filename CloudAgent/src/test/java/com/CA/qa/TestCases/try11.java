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

	@BeforeMethod
	public void setup(Method method) {
		System.out.println("Test name: " + method.getName());
		ATBLogin();
		ATBloginpage = new AgentToolBarLoginPage();
		ATBHomePage = ATBloginpage.LoginintoATB(Testutil.Readexcel("AgentLogin",1 ).get(0), Testutil.Readexcel("AgentLogin",2 ).get(0), Testutil.Readexcel("AgentLogin",3 ).get(0), Testutil.Readexcel("AgentLogin",4 ).get(0));
		
		}
	@AfterMethod
	public void teardown() {
		ATBHomePage.AgentLogout();
		driver.quit();
		//driver1.quit();
		Printhyphens();
	}
	
	@Test( priority =3,invocationCount=10)
    public void VerifyAgentStatusToPause() {
		ATBHomePage.ATBchangeToReady();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		ATBHomePage.ATBchangeToPause();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		//new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(ATBagentStatus));
		String agent_status = ATBHomePage.ATBagentStatus();
		Assert.assertEquals(agent_status, "PAUSED");
			
	}
	@Test( priority =4,invocationCount=10)
	public void VerifyAgentStatusToReady() {
		ATBHomePage.ATBchangeToReady();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String agent_status = ATBHomePage.ATBagentStatus();
		Assert.assertEquals(agent_status, "READY");
		//System.out.println("passed status");	
		
	}
}
