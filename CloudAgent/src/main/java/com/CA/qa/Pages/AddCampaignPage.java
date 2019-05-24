package com.CA.qa.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.CA.qa.Base.TestBase;

public class AddCampaignPage extends TestBase{
	@FindBy(xpath= "//*[contains(@class,'main-heading')]")
	WebElement Campaignheader;
	
	@FindBy(id= "campaignForm_campaign_campignName")
	WebElement CampaignName;
	
	@FindBy(id= "select2-campaignForm_campaign_campaignType-container")
	WebElement CampaignType;
	
	@FindBy(id= "wwctrl_campaignForm_campaign_ivrFlow_flowId")
	WebElement IvrFlow;
	
	@FindBy(xpath = "//li[@title='Progressive']")
	WebElement ProgressiveCampaign;
	
	@FindBy(xpath = "//li[@title='Preview']")
	WebElement PreviewCampaign;
	
	@FindBy(xpath = "//li[@title='IVR']")
	WebElement IvrCampaign;
	
	@FindBy(xpath ="//li[@title='Predictive']")
	WebElement PredictiveCampaign;
	
	@FindBy(id= "select2-campaignForm_campaign_dialMethod-container")
	WebElement CampaigndialMethod;
	
	@FindBy(xpath = "//li[@title='Nonagentwise']")
	WebElement Nonagentwise;
	
	@FindBy(xpath= "//li[@title='Agentwise']")
	WebElement Agentwise;
	
	@FindBy(xpath= "//li[@title='Skillwise']")
	WebElement Skillwise;

	@FindBy(id= "campaignForm_campaign_did")
	WebElement DID;
	
	@FindBy(id= "campaignForm_campaign_ruleNac")
	WebElement PacingRatio;
	
	@FindBy(id= "campaignForm_campaign_dropRatio")
	WebElement dropRatio;
	
	@FindBy(id= "campaignForm_campaign_appURL")
	WebElement appURL;

	@FindBy(id= "campaignForm_campaign_dataLimit")
	WebElement MaxConcurrentCalls;
	
	@FindBy(id= "campaignForm_campaign_runtimeStart")
	WebElement Start_Time;
	
	@FindBy(id= "campaignForm_campaign_runtimeEnd")
	WebElement End_Time;

	@FindBy(id= "campaignForm_campaign_dialInterval")
	WebElement dialInterval;
	
	@FindBy(id= "campaignForm_campaign_priority")
	WebElement Campaign_Priority;
	
	@FindBy(id= "campaignForm_campaign_callbackUrl")
	WebElement URL_to_PUSH;

	@FindBy(id= "campaignForm_campaign_popUrlAt")
	WebElement Hit_ScreenPop_URl_At;
	
	@FindBy(id= "campaignForm_campaign_screenPopUrl")
	WebElement ScreenPop_URl;

	@FindBy(id= "campaignForm_pluginId")
	WebElement PlugIn;
	
	@FindBy(id= "campaignForm_campaign_script")
	WebElement script;
	
	@FindBy(id= "campaignForm_campaign_ruleNot")
	WebElement No_Of_Tries;

	@FindBy(id= "wwlbl_campaignForm_campaign_offLineMode")
	WebElement offLineMode;
	
	@FindBy(id= "wwlbl_campaignForm_campaign_allowedManual")
	WebElement allowedManual;
	
	@FindBy(id= "campaignForm_campaign_dndEnable")
	WebElement DND_Enabled_checkbox;
	
	@FindBy(id= "wwlbl_campaignForm_campaign_dndEnable")
	WebElement DND_Enabled_label;
	
	@FindBy(id= "wwlbl_campaignForm_campaign_formatPhoneNumber")
	WebElement STD_Enabled_label;
	
	@FindBy(id= "campaignForm_campaign_formatPhoneNumber")
	WebElement STD_Enabled_checkbox;
	
	@FindBy(id= "wwlbl_campaignForm_campaign_customerFirst")
	WebElement DaialcustomerFirst;

	@FindBy(id= "wwlbl_campaignForm_campaign_holdAgent")
	WebElement Dial_by_holding_agent;
	
	@FindBy(id= "wwlbl_campaignForm_campaign_recentFirst")
	WebElement recentFirst;

	@FindBy(id= "wwlbl_campaignForm_campaign_acwNac")
	WebElement ACW_for_UnAnsweredCalls;
	
	@FindBy(id= "select2-campaignForm_campaign_dispositionType-container")
	WebElement dispositionType;

	@FindBy(xpath ="//li[@title='Toolbar']")
	WebElement dispositionType_ToolBar;
	
	@FindBy(xpath ="//li[@title='API']")
	WebElement dispositionType_API;
	
	@FindBy(xpath ="//li[@title='None']")
	WebElement dispositionType_NONE;
	
	@FindBy(id= "campaignForm_campaign_sla")
	WebElement WrapupTime;

	@FindBy(xpath= "//*[@id='wwctrl_campaignForm_globalDispositions']//input")
	WebElement Dispositions;
	
	//@FindBy(id= "select2-campaignForm_globalDispositions-results")
	//WebElement AllDispositionsList;
	
	@FindBy(xpath= "//*[@id='select2-campaignForm_globalDispositions-results']/li")
	List<WebElement> AllDispositionsList;
	
//	@FindBy(id= "select2-results__option select2-results__option--highlighted")
//	WebElement Dispositions_highlighted;

	@FindBy(xpath= "//*[@id='wwctrl_campaignForm_assignedSkills']//input[@type='search']")
	WebElement Skills;
	
	@FindBy(xpath= "//*[@id='select2-campaignForm_assignedSkills-results']/li")
	List<WebElement> AllSkillsList;
	
//	@FindBy(className= "select2-results__option select2-results__option--highlighted")
//	WebElement Skill_highlighted;
	
	@FindBy(id= "moveAllLeft1")
	WebElement moveAllLeft1;
	
	@FindBy(id= "moveAllRight1")
	WebElement moveAllRight1;
	
	@FindBy(id= "moveRight1")
	WebElement moveRight1;
	
	@FindBy(xpath= "//*[@id='skillList']/option")
	List<WebElement> skills_stage88;
		
	@FindBy(xpath= "//*[@id='wwctrl_campaignForm_campaignSubUsers']//input[@type='search']")
	WebElement Users_assigned;
	
	@FindBy(xpath= "//*[@id='select2-campaignForm_campaignSubUsers-results']//li")
	List<WebElement> AllUsersList;
	
	@FindBy(id= "select2-campaignForm_campaign_previewDataMap_id-container")
	WebElement Mapping;

	@FindBy(xpath= "//span/input[@class='select2-search__field']")
	WebElement MappingText;
	
	@FindBy(xpath ="//*[@class='select2-results__option select2-results__option--highlighted']")
	WebElement select_highlighted;
	
	@FindBy(id= "campaignForm_file")
	WebElement uploadFile;
	
	@FindBy(id= "uploadText")
	WebElement uploadText;
	
	@FindBy(id= "select2-campaignForm_holdMusicFile-container")
	WebElement OnHold;
	
	@FindBy(xpath= "//span/*[@class='select2-search__field']")
	WebElement OnHold_input;
	
	@FindBy(id= "select2-campaignForm_transferMusicFile-container")
	WebElement OnTransfer;
	
	@FindBy(id= "campaignForm_button_save")
	WebElement Save_button;


	@FindBy(id= "campaignForm_button_cancel")
	WebElement Cancel_button;
	
	public AddCampaignPage() {
		PageFactory.initElements(driver1, this);
				
	  }
	
	public void enterCampaignName(String cname) {
		
		CampaignName.sendKeys(cname);
	}
	
	public void SelectCampaignType(Object ctype) {
		if(!ctype.equals("")) {
			try {
				if(CampaignType.isDisplayed())
				CampaignType.click();
		if(ctype.toString().contains("Preview")|| ctype.toString().equalsIgnoreCase("preview") )
			PreviewCampaign.click();
		else if(ctype.toString().contains("Progressive") || ctype.toString().equalsIgnoreCase("progressive"))
			ProgressiveCampaign.click();
		else if(ctype.toString().contains("IVR") || ctype.toString().equalsIgnoreCase("ivr"))
			IvrCampaign.click();
		else if(ctype.toString().contains("Predictive") || ctype.toString().equalsIgnoreCase("predictive"))
			PredictiveCampaign.click();
		}catch(NoSuchElementException e) {
		}
		}
	}
	
	public void SelectDialMethod(Object dmethod) {
		if(!dmethod.equals(""))
		try {
		if(CampaigndialMethod.isDisplayed()) {
		CampaigndialMethod.click();
		if(dmethod.toString().contains("Nonagentwise") || dmethod.toString().equalsIgnoreCase("nonagentwise"))
			Nonagentwise.click();
		else if(dmethod.toString().contains("Agentwise")|| dmethod.toString().equalsIgnoreCase("agentwise"))
			Agentwise.click();
		else if(dmethod.toString().contains("Skillwise") || dmethod.toString().equalsIgnoreCase("skillwise"))
			Skillwise.click();
		}	}catch(NoSuchElementException e) {
		}
		}
	
	public void EnterDID(String did) {
		DID.sendKeys(did);
	}
	
	public void EnterAppURL(Object url) {
		if(!url.equals(""))
		try {
			if(appURL.isDisplayed())
			appURL.sendKeys(url.toString().trim());
	}catch(NoSuchElementException e) {
	}
	}
	
	public void SelectIvrFlow(Object I) {
		if(!I.equals("")) {
			try {
				if(IvrFlow.isDisplayed()) {
					IvrFlow.click();
					OnHold_input.sendKeys(I.toString().trim());
					select_highlighted.click();
				}
			}catch(NoSuchElementException e) {
			}
		}
		
	}
	public void EnterMaxConcurrentCalls(Object m) {
		if(!m.equals(""))
		try {
			if(MaxConcurrentCalls.isDisplayed())
			{
				JavascriptExecutor jse = (JavascriptExecutor)driver1;
				jse.executeScript("scroll(1500,0)");
				MaxConcurrentCalls.sendKeys(m.toString().trim());
			}
		}catch(NoSuchElementException e) {
		}
		
	}
	
	public void EnterPacingRatio(Object p) {
		if(!p.toString().trim().equals(""))
		try {
			if(PacingRatio.isDisplayed()) {
				PacingRatio.clear();
				PacingRatio.sendKeys(p.toString());
			}}catch(NoSuchElementException e) {
		}
	}
	
	public void EnterMaxDropRatio(Object d) {
		if(!d.equals(""))
		try {
			if(dropRatio.isDisplayed())
				dropRatio.sendKeys(d.toString());
		}catch(NoSuchElementException e) {
		}
	}
	public void EnterStartTime(Object s_time) {
		if(!s_time.equals("")) {
			try {
			if(Start_Time.isDisplayed()) {
		((JavascriptExecutor)driver1).executeScript("arguments[0].removeAttribute('readonly')", Start_Time);
		Start_Time.sendKeys(s_time.toString());}
			}catch(NoSuchElementException e) {
			}
	}
	}
	
	public void EnterEndTime(Object e_time) {
		if(!e_time.equals("")) {
		try {
			if(End_Time.isDisplayed()) {
		((JavascriptExecutor)driver1).executeScript("arguments[0].removeAttribute('readonly')", End_Time);
		End_Time.sendKeys(e_time.toString());}
	}catch(NoSuchElementException e) {
	}
		}
	}
	
	
	public void EnterDialInterval(Object di) {
		if(!di.equals(""))
		try {
		if(dialInterval.isDisplayed()) 
		dialInterval.sendKeys(di.toString());
	}catch(NoSuchElementException e) {
	}
	}
	
	public void EnterPriority(Object P) {
		if(!P.equals("")) {
			try {
				if(Campaign_Priority.isDisplayed())
					Campaign_Priority.sendKeys(P.toString());
	}catch(NoSuchElementException e) {
	}
	}}
	
	public void EnterURLtoPush(Object url) {
		if(!url.equals(""))
		URL_to_PUSH.sendKeys(url.toString());
	}
	
	
	public void SelectHitScreenPopURlAt(Object at) {
		if(!at.equals("")) {
			Select dd=new Select (Hit_ScreenPop_URl_At);
			dd.selectByVisibleText(at.toString());
			if(at.toString().equalsIgnoreCase("Plugin")) {
				Select dd1 = new Select(PlugIn);
				dd1.selectByVisibleText("FbChat");
				}
			}
		
	}
	
	public void EnterScreenPopURL(Object url) {
		if(!url.equals(""))
		try {
			if(ScreenPop_URl.isDisplayed())
				ScreenPop_URl.sendKeys(url.toString());
		}catch(NoSuchElementException e) {
		}
		
	}
	
	public void EnterScript(Object s) {
		if(!s.equals(""))
		script.sendKeys(s.toString());
	}
	
	public void EnterNoOfTries(Object T) {
		if(!T.equals("")) {
			try {
				if(No_Of_Tries.isDisplayed())
		No_Of_Tries.sendKeys(T.toString().trim());
	}catch(NoSuchElementException e) {
	}
	}		
	}
	
	public void EnableOfflineMode(String E) {
		if(E.equalsIgnoreCase("YES"))
		try {
		if(offLineMode.isDisplayed()&& !offLineMode.isSelected())
		{
			JavascriptExecutor js = (JavascriptExecutor)driver1;
			js.executeScript("arguments[0].click();", offLineMode);
		}
			//offLineMode.click();
		}catch(NoSuchElementException e) {
		} else if (E.equalsIgnoreCase("no"))
		try {
			if(offLineMode.isDisplayed()&& offLineMode.isSelected())
				offLineMode.click();
		}catch(NoSuchElementException e) {
		}
		
	}
		
	
	public void EnableAllowedForManualDialing(String E) {
		if(E.equalsIgnoreCase("YES"))
		try {
		if(allowedManual.isDisplayed() && !allowedManual.isSelected() )
		{
			JavascriptExecutor js = (JavascriptExecutor)driver1;
			js.executeScript("arguments[0].click();", allowedManual);
		}
			//allowedManual.click();
		}catch(NoSuchElementException e) {
		} else if (E.equalsIgnoreCase("No"))
			try {
				if(allowedManual.isDisplayed() && allowedManual.isSelected() )
				{
					JavascriptExecutor js = (JavascriptExecutor)driver1;
					js.executeScript("arguments[0].click();", allowedManual);
				}
					//allowedManual.click();
				}catch(NoSuchElementException e) {
				}
		
	}
	
	public void EnableDND(String E) {
//		System.out.println("dnd selcted status: "+DND_Enabled_checkbox.isSelected());
//		System.out.println("dnd dispalyed:"+DND_Enabled_label.isDisplayed());
		if(E.equalsIgnoreCase("YES"))
			try {
				if(DND_Enabled_label.isDisplayed() && !DND_Enabled_checkbox.isSelected())	
			{
			JavascriptExecutor js = (JavascriptExecutor)driver1;
			js.executeScript("arguments[0].click();", DND_Enabled_checkbox);
			//System.out.println("inside if;dnd status: "+DND_Enabled_checkbox.isSelected());
			//DND_Enabled.click();
			}
		}catch(NoSuchElementException e) {
			}else if(E.equalsIgnoreCase("no"))
				try {
					if(DND_Enabled_label.isDisplayed() && DND_Enabled_checkbox.isSelected())	
						{
						JavascriptExecutor js = (JavascriptExecutor)driver1;
						js.executeScript("arguments[0].click();", DND_Enabled_checkbox);
						//System.out.println("inside else case: dnd status: "+DND_Enabled_checkbox.isSelected());
						//DND_Enabled.click();
						}
					}catch(NoSuchElementException e) {
						}
		//System.out.println("dnd status: "+DND_Enabled_checkbox.isSelected());	
		
	}
	
	public void EnableSTD(String E) {
		if(E.equalsIgnoreCase("YES"))
		try {
		if(STD_Enabled_label.isDisplayed() && !STD_Enabled_checkbox.isSelected())	
			{
			JavascriptExecutor js = (JavascriptExecutor)driver1;
			js.executeScript("arguments[0].click();", STD_Enabled_checkbox);
			//STD_Enabled.click();
			}
		}catch(NoSuchElementException e) {
		}else if(E.equalsIgnoreCase("no"))
			try {
				if(STD_Enabled_label.isDisplayed() && STD_Enabled_checkbox.isSelected())	
					{
					JavascriptExecutor js = (JavascriptExecutor)driver1;
					js.executeScript("arguments[0].click();", STD_Enabled_checkbox);
					//STD_Enabled.click();
					}
				}catch(NoSuchElementException e) {
				} 
		
	}
	
	public void EnableDialCustomerFirst(String E) {
		if(E.equalsIgnoreCase("YES"))
		try {
		if(DaialcustomerFirst.isDisplayed() && !DaialcustomerFirst.isSelected())	
		{
			JavascriptExecutor js = (JavascriptExecutor)driver1;
			js.executeScript("arguments[0].click();", DaialcustomerFirst);
			//DaialcustomerFirst.click();
		}
		}catch(NoSuchElementException e) {
		}else if(E.equalsIgnoreCase("no"))
			try {
				if(DaialcustomerFirst.isDisplayed() && DaialcustomerFirst.isSelected())	
				{
					JavascriptExecutor js = (JavascriptExecutor)driver1;
					js.executeScript("arguments[0].click();", DaialcustomerFirst);
					//DaialcustomerFirst.click();
				}
				}catch(NoSuchElementException e) {
				} 
		
	}
	
	public void EnableDialbyholdingAgent(String E) {
		if(E.equalsIgnoreCase("YES"))
		try {
		if(Dial_by_holding_agent.isDisplayed() && !Dial_by_holding_agent.isSelected() )	
			{
			JavascriptExecutor js = (JavascriptExecutor)driver1;
			js.executeScript("arguments[0].click();", Dial_by_holding_agent);
			//Dial_by_holding_agent.click();
			}
		}catch(NoSuchElementException e) {
		}else if(E.equalsIgnoreCase("no"))
			try {
				if(Dial_by_holding_agent.isDisplayed() && Dial_by_holding_agent.isSelected() )	
					{
					JavascriptExecutor js = (JavascriptExecutor)driver1;
					js.executeScript("arguments[0].click();", Dial_by_holding_agent);
					//Dial_by_holding_agent.click();
					}
				}catch(NoSuchElementException e) {
				}
		
	}
	
	public void EnableRecentFirst(String E) {
		if(E.equalsIgnoreCase("YES"))
		try {
		if(recentFirst.isDisplayed() && !recentFirst.isSelected() )
		{
			JavascriptExecutor js = (JavascriptExecutor)driver1;
			js.executeScript("arguments[0].click();", recentFirst);
			//recentFirst.click();
		}
		}catch(NoSuchElementException e) {
		}else if(E.equalsIgnoreCase("no"))
			try {
				if(recentFirst.isDisplayed() && recentFirst.isSelected() )
				{
					JavascriptExecutor js = (JavascriptExecutor)driver1;
					js.executeScript("arguments[0].click();", recentFirst);
					//recentFirst.click();
				}
			}catch(NoSuchElementException e) {
				}
		
	}
	
	public void EnableACWforUnAnsweredCalls(String E) {
		if(E.contains("YES") || E.equalsIgnoreCase("yes"))
		try {
		if(ACW_for_UnAnsweredCalls.isDisplayed())
			ACW_for_UnAnsweredCalls.click();
	}catch(NoSuchElementException e) {
		}
		
	}
	
	public void SelectDispositionType(String DispType) {
//		JavascriptExecutor js = (JavascriptExecutor)driver1;
//		js.executeScript("arguments[0].click();", dispositionType);
		dispositionType.click();
		if(DispType.contains("Toolbar") || DispType.equalsIgnoreCase("toolbar")) 
			dispositionType_ToolBar.click();
		else if(DispType.contains("API")|| DispType.equalsIgnoreCase("api"))
			dispositionType_API.click();
		else if(DispType.contains("NONE") || DispType.equalsIgnoreCase("none"))
			dispositionType_NONE.click();
		else dispositionType_ToolBar.click();
	}
	
	public void EnterWrapupTime(String w) {
		try {
			if(WrapupTime.isDisplayed())
				WrapupTime.sendKeys(w);
	}catch(NoSuchElementException e) {
	}
	}
	
	public void SelectDisposition(String D) {
		if(D.contains(",")) {
			String words[]=D.split(",");
			for (String u: words) {
				if(u.trim().equalsIgnoreCase("all")) {
					Dispositions.sendKeys(" ");
					for (WebElement w:AllDispositionsList) {
						if(!w.getText().equals(""))
						w.click();}
					break;
				} else {
					Dispositions.sendKeys(u);
					for (WebElement w:AllDispositionsList)
						w.click();
				}
				Dispositions.clear();
			}
		}
			else if(D.equalsIgnoreCase("all"))
		{
				Dispositions.sendKeys(" ");
			//Dispositions.click();
			for (WebElement w:AllDispositionsList) {
				if(!w.getText().equals(""))
				w.click();
			Dispositions.clear();}
		}
		else {
			Dispositions.sendKeys(D);
			for (WebElement w:AllDispositionsList)
				w.click();
		}
	}
	
	public void SelectSkills(String S) {
		if(S.contains(",")) {
			String words[]=S.split(",");
			for (String u: words) {
				if(u.trim().equalsIgnoreCase("all")) {
					//System.out.println(u);
					//Skills.clear();
					Skills.sendKeys(" ");
					for (WebElement w:AllSkillsList) {
						if(!w.getText().equals(""))
						w.click();}
					break;
				} else {
					//System.out.println(u);
					//Skills.clear();
					Skills.sendKeys(u);
					for (WebElement w:AllSkillsList)
						w.click();
				}
				Skills.clear();
			}
			}
		else if(S.equalsIgnoreCase("all")) {
			Skills.sendKeys(" ");
			for (WebElement w:AllSkillsList)
				if(!w.getText().equals(""))
				w.click();
		} else {
			Skills.sendKeys(S);
			for (WebElement w:AllSkillsList)
				w.click();
		}
	}
	
	public void EnterSkillsforStaging88(Object S) {
		if(!S.equals("")) {
			((JavascriptExecutor) driver1).executeScript("window.scrollBy(0,-1000)", "");
			moveAllLeft1.click();
//			for (WebElement w:skills_stage88) {
//				System.out.println("skill name:"+w.getText());
//				w.click();}
//			((JavascriptExecutor) driver1).executeScript("window.scrollBy(0,-1000)", "");
//			try {
//				Thread.sleep(5000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			
			if(S.toString().contains(",")) {
				String words[]=S.toString().split(",");
				for (String u: words) {
					if(u.trim().equalsIgnoreCase("all")) {
						((JavascriptExecutor) driver1).executeScript("window.scrollBy(0,-1000)", "");
						moveAllRight1.click();
						break;
					} 
					else {
						for (WebElement w:skills_stage88) {
							if(w.getText().contains(u)) {
							w.click();
							((JavascriptExecutor) driver1).executeScript("window.scrollBy(0,-1000)", "");
							moveRight1.click();
							}
						}
						}
				}
			}
			else if(S.toString().trim().equalsIgnoreCase("all")) {
				((JavascriptExecutor) driver1).executeScript("window.scrollBy(0,-1000)", "");
				moveAllRight1.click();}
			else {
				for (WebElement w:skills_stage88) {
					System.out.println("in for loop");
					if(w.getText().contains(S.toString().trim())) {
						System.out.println("in if");
//					driver1.findElement(By.className("am-scroll-top")).click();
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//					
					
					//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", moveRight1);	
					System.out.println("scroll over");
					w.click();
					System.out.println("skill click over");
					((JavascriptExecutor) driver1).executeScript("window.scrollBy(0,-2000)", "");
					moveRight1.click();
					System.out.println("move right over");
					}
				}
				}
			}
	}
	
	public void SelectUsers(Object S) {
		if(!S.equals("")) {
			if(S.toString().contains(",")) {
				String words[]=S.toString().split(",");
				for (String u: words) {
					if(u.trim().equalsIgnoreCase("all")) {
						//Users_assigned.clear();	
						Users_assigned.sendKeys(" ");
						for (WebElement w:AllUsersList) {
							if(!w.getText().equals(""))
							w.click();}
						break;
					} else {
						//Users_assigned.clear();		
						Users_assigned.sendKeys(u.trim());
						for (WebElement w:AllUsersList)
							w.click();
					}
					Users_assigned.clear();}
			}
			else if(S.toString().trim().equalsIgnoreCase("all")){
				Users_assigned.clear();	
				Users_assigned.sendKeys(" ");
				for (WebElement w:AllUsersList)
					w.click();
			}else {
				Users_assigned.clear();		
				Users_assigned.sendKeys(S.toString().trim());
				for (WebElement w:AllUsersList)
					w.click();
				
			}
		}
	}
	
	public void SelectMapping(Object M) {
		if(!M.equals("")) {
			try {
				if(Mapping.isDisplayed()) {
		Mapping.click();
		MappingText.sendKeys(M.toString());
		select_highlighted.click();}
	}catch(NoSuchElementException e) {
	}
		}			
}
	
	public void FiletoUpload(Object path) {
		if(!path.equals("")) {
			try {
				if(uploadText.isDisplayed()) {
		((JavascriptExecutor)driver1).executeScript("arguments[0].removeAttribute('style')", uploadFile);
		//System.out.println(path.toString());
		uploadFile.sendKeys(path.toString());
		}
	}catch(NoSuchElementException e) {
	}
		}			
}
	
	public void SelectHoldMusic(Object H) {
		if(!H.toString().trim().equals("")) {
			try {
				if(OnHold.isDisplayed()) {
				OnHold.click();
				OnHold_input.sendKeys(H.toString());
				select_highlighted.click();
				}
			}catch(NoSuchElementException e) {
			}
		}
	}
	
	public void SelectTransferMusic(Object T) {
		
		if(!T.toString().trim().equals("")) {
			try {
				if(OnHold.isDisplayed()) {
				JavascriptExecutor jse = (JavascriptExecutor)driver1;
				jse.executeScript("scroll(0, 1500)");
				
				OnTransfer.click();
				OnHold_input.sendKeys(T.toString());
				select_highlighted.click();
		}}catch(NoSuchElementException e) {
		}
	}
}
	
	
	public void ClickOnSaveCampaign() {
		Save_button.click();
	}
	
	public void ClickOnCancelCampaign() {
		Cancel_button.click();
	}







	
}
