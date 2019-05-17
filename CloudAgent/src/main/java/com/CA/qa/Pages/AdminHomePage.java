package com.CA.qa.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.CA.qa.Base.TestBase;

public class AdminHomePage extends TestBase{

//	@FindBy(xpath = "//*[contains(@class,'brand')]")
//	WebElement Admin_CAlogo;
	String first ="//*[@id='campaignList']/tbody/tr[";
	String second = "]/td[";
	String third = "]";
	
	
	@FindBy(id= "CampaignMenu")
	WebElement CampaignMenu;
	
	@FindBy(id= "AdminMenu")
	WebElement Users;
	
	@FindBy(id= "ConfigurationMenu")
	WebElement Configurations;

	@FindBy(id= "MainMenu")
	WebElement Home;
	
	@FindBy(id= "InBoundCampaignMenu")
	WebElement Inboundcampaign;
	
	@FindBy(id= "outBoundCampaignMenu")
	WebElement outboundcampaign;
	
	@FindBy(xpath="//*[text()='Sign Out']")
	WebElement Admin_signout;
	
	@FindBy(xpath="//*[@id='am-navbar-collapse']/ul")
	WebElement Admin_usericon;
	
	@FindBy(xpath="//*[contains(@data-original-title,'Add Campaign')]")
	WebElement Add_Campaign;
	
	@FindBy(id= "pageSize")
	WebElement show_button;
	
	@FindBy(name = "search3")
	WebElement search_did_inbound;
	
	@FindBy(name = "search2")
	WebElement search_did_outbound;
	
	@FindBy(xpath="//*[contains(@onclick,'submit')]")
	WebElement search_did_submit;
	
	@FindBy(className ="message")
	WebElement div_message;
	
	@FindBy(xpath= "//*[@id='campaignList']/thead/tr/th")
	List<WebElement> AllTablerHeaders;
	
	@FindBy(xpath= "//*[@id='campaignList']/tbody/tr")
	List<WebElement> AllTableRows;
	
	@FindBy(id= "campaignForm_campaign_campignName")
	WebElement CampaignName;
	
	@FindBy(id= "campaignForm_button_delete")
	WebElement Campaign_delete_button;
	
	@FindBy(id= "campaignForm_button_reset")
	WebElement Campaign_reset_button;
	
	
	public AdminHomePage() {
		PageFactory.initElements(driver1, this);
				
	  }
	
	public String AdminHomePageTitle() {
		return driver1.getTitle();
	}
	
	public void ClickOnCAMPAIGNS() {
		CampaignMenu.click();
		
	}
	
	public void ClickOnInbound() {
		CampaignMenu.click();
		Inboundcampaign.click();
	}

	public void ClickOnOutbound() {
		CampaignMenu.click();
		outboundcampaign.click();
	}

	public void admin_logout() {
		Admin_usericon.click();
		Admin_signout.click();
		
	}
	public AddCampaignPage clickOnAddCampaignButton(String C) {
		CampaignMenu.click();
		if(C.contains("inbound")|| C.equalsIgnoreCase("inbound"))
			Inboundcampaign.click();
		else if(C.contains("outbound")|| C.equalsIgnoreCase("outbound"))
			outboundcampaign.click();
		Add_Campaign.click();
		return new AddCampaignPage();
	}
	
	public String Getmessagediv() {
		new WebDriverWait(driver1, 20).until(ExpectedConditions.visibilityOf(div_message));
		return div_message.getText();
	}
	
	public void clickOnBound(String C) {
		CampaignMenu.click();
		if(C.contains("inbound")|| C.equalsIgnoreCase("inbound"))
			Inboundcampaign.click();
		else if(C.contains("outbound")|| C.equalsIgnoreCase("outbound"))
			outboundcampaign.click();
	}
	
	public void ClickOnShowAllButton() {
		Select s=new Select(show_button);
		s.selectByValue("0");
	}
	
	public void searchDID(String Bound,String D) {
		if(Bound.equalsIgnoreCase("inbound"))
			search_did_inbound.sendKeys(D);
		else search_did_outbound.sendKeys(D);
		search_did_submit.click();
	}
	
	
	
	public String RunCampaign(String bound,String cName) {
		return RunCampaign( bound, cName, "");
	}
	
	
	public String RunCampaign(String bound,String cName,String Di) {
		System.out.println("Campaign details to run: name: "+cName+"  type: "+bound);
		clickOnBound(bound);
		searchDID(bound,Di);
		ClickOnShowAllButton();
		int result_row = IdentifyCampaignRow( bound, cName, Di);
		
		if(result_row>0) {
			System.out.println("Campaign position to run: "+GetCampaignPosition(result_row));
			if(GetCampaignPosition(result_row).equals("COMPLETED")) { 
				String res =resetCampaign( bound, result_row);
				System.out.println(res);
				if(res.contains(cName) && res.contains("reset") && res.contains("success")) {
					clickOnBound(bound);
					searchDID(bound,Di);
					ClickOnShowAllButton();
					//return RunCampaign( bound, cName, Di);
				} else return "not able to reset: "+res;
			}
			if(GetCampaignPosition(result_row).equals("READY")) {
				WebElement element=driver1.findElement(By.xpath(first+result_row+second+AllTablerHeaders.size()+third+"/*[@value='Start']"));
				scrollandclick(element);
				return Getmessagediv();
				
				}
			return "campaign is already running";
		}
		return "Campaign not found to run it";
		
	}
	
	public String resetCampaign(String bound,int result_row) {
		if(result_row>0) {
			
			if(GetCampaignPosition(result_row).equals("COMPLETED")) {
			WebElement element= driver1.findElement(By.xpath(first+result_row+second+AllTablerHeaders.size()+third+"/*[@value='Reset']"));
			scrollandclick(element);
			Campaign_reset_button.click();
			//System.out.println(div_message.getText());
			return Getmessagediv();
			
	} return "campaign is not completed to reset";
		} return "campaign not found to reset";
	}
	
	
	public int IdentifyCampaignRow(String bound,String cName,String Di) {
		clickOnBound(bound);
		searchDID(bound,Di);
		ClickOnShowAllButton();
		int result_row =0;
		int cam_name_col = returnColumnNoOfTableHeader("Campaign Name");
		
		int size = AllTableRows.size();
		//System.out.println("no of rows: "+size);
		
		for (int i=1;i<=size;i++) {
			if(driver1.findElement(By.xpath("//*[@id='campaignList']/tbody/tr[1]/td")).getText().contains("Nothing found to display")) {
				return -1;
				}
			//System.out.println("row "+i+" campaign name: "+driver1.findElement(By.xpath(first+i+second+cam_name_col+third)).getText());
			if(driver1.findElement(By.xpath(first+i+second+cam_name_col+third)).getText().equals(cName)) {
				result_row=i;
				//System.out.println("result row is:"+result_row);
				return result_row;}
		}
		return -1;
	}
	
	public String GetCampaignPosition(int result_row) {
		if(result_row>0) {
			int cam_position = returnColumnNoOfTableHeader("Position");
		
			String pos =driver1.findElement(By.xpath(first+result_row+second+cam_position+third)).getText();
			//System.out.println("position of the campaign is:"+pos);
			return pos;
		}
		
		return "campaign not found, not able to know the position";
	}
	
	public String StopCampaign(String bound,String cName,String Di) {
		System.out.println("Campaign details for Stop: Name:"+cName+"  Type:"+bound);
		clickOnBound(bound);
		searchDID(bound,Di);
		ClickOnShowAllButton();
		int result_row = IdentifyCampaignRow(bound,cName, Di);
		
		if(result_row>0) {
			if(GetCampaignPosition(result_row).equals("RUNNING")) {
				WebElement element=driver1.findElement(By.xpath(first+result_row+second+AllTablerHeaders.size()+third+"/*[@value='Stop']"));
				scrollandclick(element);
				return Getmessagediv();
			}
			return "campaign is not running to stop it";
		}return "campaign is not found to stop it";
	}

	public void scrollandclick(WebElement webelement) {
		try {
			webelement.click();
		}catch (WebDriverException e) {
			//System.out.println("in exception of click");
			((JavascriptExecutor) driver1).executeScript("window.scrollBy(0,200)", "");
			webelement.click();
		}
		
	}
	
	public String DeleteCampaign(String bound,String cName) {
		return DeleteCampaign( bound, cName,"");
		
	}
	
	public String DeleteCampaign(String bound,String cName, String Di) {
		System.out.println("Campaign details for deletion: Name:"+cName+"  Type:"+bound);
		clickOnBound(bound);
		searchDID(bound,Di);
		ClickOnShowAllButton();
		
		int cam_name_col = returnColumnNoOfTableHeader("Campaign Name");
		int result_row = IdentifyCampaignRow(bound,cName, Di);
		
		if(result_row>0) {
			System.out.println(GetCampaignPosition(result_row));
			
			if(GetCampaignPosition(result_row).equals("RUNNING")) { 
				System.out.println(StopCampaign( bound, cName, Di));
				clickOnBound(bound);
				searchDID(bound,Di);
				ClickOnShowAllButton();
			}
			
			if(!GetCampaignPosition(result_row).equals("RUNNING")) {
				driver1.findElement(By.xpath(first+result_row+second+cam_name_col+third)).click();
				System.out.println("campaign name: "+ cName+" deleting: "+CampaignName.getAttribute("value"));
				
				if(CampaignName.getAttribute("value").trim().equals(cName.trim())) {
				Campaign_delete_button.click();
				driver1.switchTo().alert().accept();
				//driver1.switchTo().alert().dismiss();
				//return "correct";
				return Getmessagediv();
				}return "program error, not deleting correct campaign so stopped1";
			} return "program error, not deleting correct campaign so stopped2";
		}return "campaign not identified to delete";
		}
		
			
	
	public int returnColumnNoOfTableHeader(String H) {
		int i=0;
		//System.out.println("size of headers: "+AllTablerHeaders.size());
		for (WebElement w:AllTablerHeaders) {
			//System.out.println(w.getText());
			i++;
		 	if(w.getText().contains(H) )
			return i;
		 	}
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
