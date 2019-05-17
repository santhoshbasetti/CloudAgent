package com.CA.qa.Pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.CA.qa.Base.TestBase;

public class AgentToolBarHomePage extends TestBase {
	
	@FindBy (id = "agentStatus")
	WebElement ATBagentStatus;
	
	@FindBy (id = "changeStatus")
	WebElement ATBagentchangeStatus;
	
	@FindBy (id = "readyLi")
	WebElement ATBChangeStatusToReady;
	
	@FindBy (id = "pauseLi")
	WebElement ATBChangeStatusToPause;
	
	@FindBy (id = "pauseReason")
	WebElement ATBpauseReason;
	
	@FindBy (xpath = "//*[text()='Done']")
	WebElement Pause_Done;
	//*[@id='popupReasonBox']/div[3]/button
	
	@FindBy (id = "agentMode")
	WebElement ATBagentMode;
	
	@FindBy (id = "inboundLi")
	WebElement ATBChangeAgentModeToInbound;
	
	@FindBy (id = "manualLi")
	WebElement ATBChangeAgentModeTomanual;
	
	@FindBy (id = "previewLi")
	WebElement ATBChangeAgentModeTopreview;
	
	@FindBy (id = "progressLi")
	WebElement ATBChangeAgentModeToprogress;
	
	@FindBy (id = "blendedLi")
	WebElement ATBChangeAgentModeToblended;
	
	//*[@class='dropdown-toggle']/span/i
	@FindBy (xpath = "//*[@id='action_nav']//span/i")
	WebElement ATBAgent;
	
	@FindBy (xpath = "//*[@id='action_nav']//span/parent::*/following-sibling::*/child::*[1]")
	WebElement ATBAgentPhone;
	
	@FindBy (id = "forceRelease")
	WebElement ATBForceRelease;
	
	@FindBy (id = "logout")
	WebElement ATBlogout;
	
	public AgentToolBarHomePage() {
		PageFactory.initElements(driver, this);
				
	  }
	
	public String ATBagentStatus() {
		return ATBagentStatus.getText();
		
	}

	public void ATBchangeToReady() {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(ATBagentchangeStatus));
		
		ATBagentchangeStatus.click();
		js.executeScript("arguments[0].click();", ATBChangeStatusToReady);
		//ATBChangeStatusToReady.click();
			
	}
	
	public void ATBchangeToPause() {
		
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(ATBagentchangeStatus));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ATBagentchangeStatus);
		//ATBagentchangeStatus.click();
		js.executeScript("arguments[0].click();", ATBChangeStatusToPause);
		//ATBChangeStatusToPause.click();
		//new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.id("pauseReason")));
		
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(ATBpauseReason));
		Select drp = new Select(ATBpauseReason);
		//System.out.println("passed1");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		drp.selectByIndex(1);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		js.executeScript("arguments[0].click();", Pause_Done);
				
	}
	

	public void AgentLogout() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
//		if (ATBAgent.isEnabled()) {
//			
//		ATBAgent.click();
//		   }
//		else
//		
			js.executeScript("arguments[0].click();", ATBAgent );
		
//		if (ATBlogout.isDisplayed()) {
//		
//		ATBlogout.click();
//		}
//		
//		else
		
		
			js.executeScript("arguments[0].click();", ATBlogout );
		
		
		
	}
	
	public void ATBForceRelease(){
		//ATBAgent.click();
		//ATBForceRelease.click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", ATBAgent );
				
		js.executeScript("arguments[0].click();", ATBForceRelease );
		
		
	}
	 
	public void ATBchangeToInbound() {
		ATBagentMode.click();
		ATBChangeAgentModeToInbound.click();
		
	}
	
	public void ATBchangeTomanual() {
		ATBagentMode.click();
		ATBChangeAgentModeTomanual.click();
		
	}
	
	public void ATBchangeToProgressive() {
		ATBagentMode.click();
		ATBChangeAgentModeToprogress.click();
		
	}
	
	public void ATBchangeToBlended() {
		ATBagentMode.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", ATBChangeAgentModeToblended );
		//ATBChangeAgentModeToblended.click();
	}
	
	public void ATBchangeToPreview() {
		ATBagentMode.click();
		ATBChangeAgentModeTopreview.click();
		
	}
	
	public String ATBHomePageTitle() {
		return driver.getTitle();
	}
	
	public String get_Agentmode() {
		
		return ATBagentMode.getText();
	}
	
   
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}