package com.CA.qa.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.CA.qa.Base.TestBase;
import com.CA.qa.Util.Testutil;

public class ConfigurationsPage extends TestBase{

	@FindBy(id= "ConfigurationMenu")
	WebElement ConfigurationMenu;
	
	@FindBy(id= "AgentMenu")
	WebElement Agentmenu;
	
	@FindBy(id= "AgentGroupMenu")
	WebElement AgentGroupMenu;
	
	@FindBy(id= "FwpNumberMenu")
	WebElement ph_no_menu;
	
	@FindBy(id= "TransferNumberMenu")
	WebElement TransferNumberMenu;
	
	@FindBy(id= "DispositionMenu")
	WebElement DispositionMenu;
	
	@FindBy(id= "PauseReasonMenu")
	WebElement PauseReasonMenu;
	
	@FindBy(xpath= "//*[contains(@class,'main-heading')]")
	WebElement configurations_heading;
	
	@FindBy(xpath= "//*[contains(@data-original-title,'Add')]")
	WebElement Config_Add_Button;
	
	@FindBy(xpath= "//*[contains(@name,'search')]")
	WebElement Config_search_button;
	
	@FindBy(xpath="//*[contains(@onclick,'submit')]")
	WebElement Config_search_submit;
	
	@FindBy(className ="message")
	WebElement div_message;
	
	@FindBy(id= "pageSize")
	WebElement show_button;
	
	@FindBy(id= "agentForm_agent_agentId")
	WebElement Agent_ID;
	
	@FindBy(id= "wwlbl_agentForm_agent_locked")
	WebElement Agent_Lock;
	
	@FindBy(id= "agentForm_agent_password")
	WebElement Agent_password;
	
	@FindBy(id= "agentForm_agent_agentName")
	WebElement Agent_Name;
	
	@FindBy(id= "agentForm_agent_priority")
	WebElement Agent_Priority;
	
	@FindBy(id= "agentForm_agent_email")
	WebElement Agent_email;
	
	@FindBy(id= "agentForm_agent_agentData")
	WebElement Agent_Data;
	
	@FindBy(xpath= "//*[@id='wwctrl_agentForm_agentSkills']//input[@type='search']")
	WebElement Skills;
	
	@FindBy(xpath= "//*[@id='select2-agentForm_agentSkills-results']/li")
	List<WebElement> AllSkillsList;
	
	@FindBy(xpath ="//*[@id='wwctrl_agentForm_agentSkills']//ul/li")
	List<WebElement> Selected_Skills;
	
//	@FindBy(xpath= "//*[@id='select2-agentForm_agentSkills-results']/li")
//	List<WebElement> AllSkillsSelected;
	
	@FindBy(id= "agentForm_agent_inbound")
	WebElement Agent_inbound;
	
	@FindBy(id= "agentForm_agent_manual")
	WebElement Agent_manual;
	
	@FindBy(id= "agentForm_agent_preview")
	WebElement Agent_Preview;
	
	@FindBy(id= "agentForm_agent_progressive")
	WebElement Agent_progressive;
	
	@FindBy(id= "agentForm_agent_blended")
	WebElement Agent_Blended;
	
	@FindBy(id= "fwpNumberForm_fwpNumber_name")
	WebElement Number_name;
	
	@FindBy(id= "fwpNumberForm_fwpNumber_phoneNumber")
	WebElement Number_phoneNumber;
	
	@FindBy(id= "fwpNumberForm_fwpNumber_priority")
	WebElement Number_priority;
	
	@FindBy(id= "fwpNumberForm_fwpNumber_sip")
	WebElement Number_sip;
	
	@FindBy(xpath= "//*[contains(@id,'save')]")
	WebElement config_save_button;
	
	@FindBy(xpath= "//*[@id='report']/tbody/tr")
	List<WebElement> Table_report;
	
	@FindBy(xpath= "//*[@id='report']/tbody/tr/td[1]")
	WebElement Agent_table_data_1stRow;

	@FindBy(xpath= "//*[@id='fwpNumberList']/tbody/tr/td[1]")
	WebElement phoneNo_table_data_1stRow;
	
	@FindBy(xpath= "//*[contains(@name,'delete')]")
	WebElement config_delete_button;
	
	public ConfigurationsPage() {
		PageFactory.initElements(driver1, this);
				
	  }
	
	public void ClickOnAgentMenu() {
		ConfigurationMenu.click();
		Agentmenu.click();
	}
	
	public String GetConfigHeader() {
		return configurations_heading.getText();
	}
	
	public void ClickOnAddConfig() {
		Config_Add_Button.click();
	}
	
	public void EnterSerachItem(Object S) {
		if(!S.equals("")) {
		Config_search_button.sendKeys(S.toString().trim());
		Config_search_submit.click();
	}}
	
	public void EnterAgentId(Object id) {
		if(!id.equals("")) {
			Agent_ID.clear();
			Agent_ID.sendKeys(id.toString().trim());
	}}
	
	public void EnableAgentLock(Object L) {
		if(L.toString().trim().equalsIgnoreCase("yes")) 
			Agent_Lock.click();
	}
	public void EnterAgentPassword(Object Pwd) {
		if(!Pwd.equals("")) {
			Agent_password.clear();
			Agent_password.sendKeys(Pwd.toString().trim());
	}}
	
	public void EnterAgentName(Object name) {
		if(!name.equals("")) {
			Agent_Name.clear();
			Agent_Name.sendKeys(name.toString().trim());
	}}
	
	public void EnterPriorityforAgent(Object Pr) {
		if(!Pr.equals("")) {
			Agent_Priority.clear();
			Agent_Priority.sendKeys(Pr.toString().trim());
	}}
	
	public void EnterEmailforAgent(Object Email) {
		if (!Email.equals("")) {
			Agent_email.clear();
			Agent_email.sendKeys(Email.toString().trim());
	}}
	
	public void EnterAgentDataforAgent(Object data) {
		if(!data.equals("")) {
			Agent_Data.clear();
			Agent_Data.sendKeys(data.toString().trim());
	}}
	
	public void EnterSkillsforAgent(Object S) {
		if(!S.equals("")) {
			System.out.println("size :"+Selected_Skills.size());
			if(Selected_Skills.size()>1) {
				int size = Selected_Skills.size();
			for (int i=1;i<size;i++)
			driver1.findElement(By.className("select2-selection__choice__remove")).click();
			}
				
			//System.out.println("selected skill over");
			if(S.toString().contains(",")) {
				String words[]=S.toString().split(",");
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
			else if(S.toString().trim().equalsIgnoreCase("all")) {
				Skills.sendKeys(" ");
				for (WebElement w:AllSkillsList)
					if(!w.getText().equals(""))
					w.click();
			} else {
				Skills.sendKeys(S.toString());
				for (WebElement w:AllSkillsList)
					w.click();
			}
		}
	}
	
	public void EnableInboundforAgent(Object E) {
		if(!E.equals("")) {
		if(E.toString().trim().equalsIgnoreCase("YES") && !Agent_inbound.isSelected()) {
			JavascriptExecutor js = (JavascriptExecutor)driver1;
			js.executeScript("arguments[0].click();", Agent_inbound);
			}
		else if(E.toString().trim().equalsIgnoreCase("no") && Agent_inbound.isSelected()){
			JavascriptExecutor js = (JavascriptExecutor)driver1;
			js.executeScript("arguments[0].click();", Agent_inbound);
			}
	}}
	
	public void EnableManualforAgent(Object E) {
		if(!E.equals("")) {
		if(E.toString().trim().equalsIgnoreCase("YES") && !Agent_manual.isSelected()) {
			JavascriptExecutor js = (JavascriptExecutor)driver1;
			js.executeScript("arguments[0].click();", Agent_manual);
			}
		else if(E.toString().trim().equalsIgnoreCase("no") && Agent_manual.isSelected()){
			JavascriptExecutor js = (JavascriptExecutor)driver1;
			js.executeScript("arguments[0].click();", Agent_manual);
			}
	}}
	
	public void EnablePreviewforAgent(Object E) {
		if(!E.equals("")) {
		if(E.toString().trim().equalsIgnoreCase("YES") && !Agent_Preview.isSelected()) {
			JavascriptExecutor js = (JavascriptExecutor)driver1;
			js.executeScript("arguments[0].click();", Agent_Preview);
			}
		else if(E.toString().trim().equalsIgnoreCase("no") && Agent_Preview.isSelected()){
			JavascriptExecutor js = (JavascriptExecutor)driver1;
			js.executeScript("arguments[0].click();", Agent_Preview);
			}
	}}
	
	public void EnableProgressiveforAgent(Object E) {
		if(!E.equals("")) {
		if(E.toString().trim().equalsIgnoreCase("YES") && !Agent_progressive.isSelected()) {
			JavascriptExecutor js = (JavascriptExecutor)driver1;
			js.executeScript("arguments[0].click();", Agent_progressive);
			}
		else if(E.toString().trim().equalsIgnoreCase("no") && Agent_progressive.isSelected()){
			JavascriptExecutor js = (JavascriptExecutor)driver1;
			js.executeScript("arguments[0].click();", Agent_progressive);
			}
	}}
	
	public void EnableBlendedforAgent(Object E) {
		if(!E.equals("")) {
		if(E.toString().trim().equalsIgnoreCase("YES") && !Agent_Blended.isSelected()) {
			JavascriptExecutor js = (JavascriptExecutor)driver1;
			js.executeScript("arguments[0].click();", Agent_Blended);
			}
		else if(E.toString().trim().equalsIgnoreCase("no") && Agent_Blended.isSelected()){
			JavascriptExecutor js = (JavascriptExecutor)driver1;
			js.executeScript("arguments[0].click();", Agent_Blended);
		}	}
	}
	
	public void ClickOnSaveforConfig() {
		Testutil.flash(config_save_button, driver1);
		
		JavascriptExecutor js = (JavascriptExecutor)driver1;
		js.executeScript("arguments[0].click();", config_save_button);
		}
	
	public void ClickOnShowAllButton() {
		Select s=new Select(show_button);
		s.selectByValue("0");
	}
	
	public String Getmessagediv() {
		new WebDriverWait(driver1, 20).until(ExpectedConditions.visibilityOf(div_message));
		return div_message.getText();
	}
	
	public String AddAgent(Object id, Object nid, Object lock, Object pwd, Object name,Object pr,Object mail,Object data,Object Skill,Object in, Object man, Object pre, Object prog,Object blend) {
	//String id, Object lock, String pwd, String name,String pr,Object mail,Object data,Object Skill,
	//String in, String man, String pre, String prog,String blend
		System.out.println("Agent details for adding: id: "+id);
		ClickOnAgentMenu();
		String H =GetConfigHeader();
		if(H.contains("Agents")) {
			ClickOnAddConfig();
			String H1 =GetConfigHeader();
			if(H1.contains("Add Agent")) {
				EnterAgentId(id);
				EnableAgentLock(lock);
				EnterAgentPassword(pwd);
				EnterAgentName(name);
				EnterPriorityforAgent(pr);
				EnterEmailforAgent(mail);
				EnterAgentDataforAgent(data);
				EnterSkillsforAgent(Skill);
				EnableInboundforAgent(in);
				EnableManualforAgent(man);
				EnablePreviewforAgent(pre);
				EnableProgressiveforAgent(prog);
				EnableBlendedforAgent(blend);
				ClickOnSaveforConfig();
				return Getmessagediv();
			}return "header is not displayed as Add Agent";
		} return "header is not displayed as Agents";
	}
	
	public String EditAgent(String idold,Object idnew, Object lock, Object pwd, Object name,Object pr,Object mail,Object data,Object Skill,Object in, Object man, Object pre, Object prog,Object blend) {
		//String id, Object lock, String pwd, String name,String pr,Object mail,Object data,Object Skill,
		//String in, String man, String pre, String prog,String blend
			String ids;
			if(!idnew.equals(""))
				ids = idnew.toString();
			else ids = idold.toString();
			System.out.println("Agent details for Editing: old id: "+idold+ "  New id: "+ids);
			ClickOnAgentMenu();
			String H =GetConfigHeader();
			if(H.contains("Agents")) {
				EnterSerachItem(idold);
				ClickOnShowAllButton();
				if(!Agent_table_data_1stRow.getText().contains("Nothing") ) {
					Agent_table_data_1stRow.click();
				if(GetConfigHeader().contains("Edit Agent") && Agent_ID.getAttribute("value").trim().equals(idold.trim()) ) {
					EnterAgentId(idnew);
					EnableAgentLock(lock);
					EnterAgentPassword(pwd);
					EnterAgentName(name);
					EnterPriorityforAgent(pr);
					EnterEmailforAgent(mail);
					EnterAgentDataforAgent(data);
					EnterSkillsforAgent(Skill);
					EnableInboundforAgent(in);
					EnableManualforAgent(man);
					EnablePreviewforAgent(pre);
					EnableProgressiveforAgent(prog);
					EnableBlendedforAgent(blend);
					ClickOnSaveforConfig();
					return Getmessagediv();
				}return "header is not displayed as 'Edit Agent' or id not matching";
			} return "agentid "+ idold+" is not available to edit";
		}return "header is not displayed as 'Agents'";
	}
	
	public String deleteAgent(Object AgentId) {
		
		System.out.println("Deleting agent id:"+AgentId.toString().trim());
		ClickOnAgentMenu();
		String H =GetConfigHeader();
		if(H.contains("Agents")) {
			EnterSerachItem(AgentId.toString().trim());
			//ClickOnShowAllButton();
			if(Table_report.size()==1) {
				if(!Agent_table_data_1stRow.getText().contains("Nothing") ) {
					Agent_table_data_1stRow.click();
					//System.out.println("agent id is: "+AgentId+"     deleting is:  "+Agent_ID.getAttribute("value"));
					if(Agent_ID.getAttribute("value").equals(AgentId.toString().trim())) {
						config_delete_button.click();	
						driver1.switchTo().alert().accept();
						//driver1.switchTo().alert().dismiss();
						//return "correct";
						return Getmessagediv();
					}return "agent ids are not matching so stopped deleting agent";
			   } return "no records found with the agentid: "+ AgentId.toString();
			} else {
				Agent_table_data_1stRow.click();
				if(Agent_ID.getAttribute("value").equals(AgentId.toString().trim())) {
					config_delete_button.click();	
					driver1.switchTo().alert().accept();
					return Getmessagediv();
					}return "no of rows. Agent ids are not matching so stopped deleting agent";
				}
			}return "header is not displayed as Agents";
	}
	
	public void EnterNameForPhoneNo(Object n) {
		if(!n.equals("")) {
			Number_name.clear();
			Number_name.sendKeys(n.toString().trim());
		}
	}
	
	public void EnterNoForPhone(Object P) {
		if(!P.equals("")) {
			Number_phoneNumber.clear();
			Number_phoneNumber.sendKeys(P.toString().trim());	}
	}
	
	public void EnterPriorityForPhone(Object P) {
		if(!P.equals("")) {
			Number_priority.clear();
			Number_priority.sendKeys(P.toString().trim());	}
	}
	
	public void EnterSIPforPhone(Object S) {
		if(!S.equals("")) {
			if(S.toString().trim().equalsIgnoreCase("yes") && !Number_sip.isSelected())
				Number_sip.click();
			if(S.toString().trim().equalsIgnoreCase("no") && Number_sip.isSelected())
				Number_sip.click();
		}
	}
	public String addPhoneNo(Object name, Object phno,Object pr,Object sip) {
		System.out.println("Adding phone no details: name: "+name+"   Phno: "+phno);
		ConfigurationMenu.click();
		ph_no_menu.click();
		String H =GetConfigHeader();
		if(H.contains("Phone Numbers")) {
			ClickOnAddConfig();
			String H1 =GetConfigHeader();
			if(H1.contains("Add")) {
				EnterNameForPhoneNo(name);
				EnterNoForPhone(phno);
				EnterPriorityForPhone(pr);
				EnterSIPforPhone(sip) ;
				ClickOnSaveforConfig();
				return Getmessagediv();
			}	return "header not matching";
		}return "header not matching";
	}
	
	public String EditPhoneNo(Object name, Object Nname,Object phno,Object Nphno,Object pr,Object sip) {
		String nn,np;
		if (!Nname.equals(""))
			nn=Nname.toString();
		else nn=name.toString();
		if (!Nphno.equals(""))
			np=Nphno.toString();
		else np=phno.toString();
		
		System.out.println("Editing phone no details: name: "+name+"  New name: "+nn+"   Phno: "+phno+" new phno: "+np);
		ConfigurationMenu.click();
		ph_no_menu.click();
		String H =GetConfigHeader();
		if(H.contains("Phone Numbers")) {
			EnterSerachItem(phno);
			ClickOnShowAllButton();
			if(!phoneNo_table_data_1stRow.getText().contains("Nothing") ) {
				phoneNo_table_data_1stRow.click();
				String H1 =GetConfigHeader();
				if(H1.contains("Edit Phone Number") && Number_name.getAttribute("value").equals(name.toString().trim()) && Number_phoneNumber.getAttribute("value").equals(phno.toString().trim())) {
					EnterNameForPhoneNo(Nname);
					EnterNoForPhone(Nphno);
					EnterPriorityForPhone(pr);
					EnterSIPforPhone(sip) ;
					ClickOnSaveforConfig();
					return Getmessagediv();
				}	return "header 'Edit' or name or number not matching";
		}return "no data found";
		}return "header not matching";
	}
	
	public String deletePhoneNo(String name, String phno) {
		System.out.println("Deleting phone no details: name: "+name+"   Phno: "+phno);
		ConfigurationMenu.click();
		ph_no_menu.click();
		String H =GetConfigHeader();
		if(H.contains("Phone Numbers")) {
			EnterSerachItem(phno);
			ClickOnShowAllButton();
			if(!phoneNo_table_data_1stRow.getText().contains("Nothing") ) {
				phoneNo_table_data_1stRow.click();
				if(Number_name.getAttribute("value").equalsIgnoreCase(name.trim()) && Number_phoneNumber.getAttribute("value").equalsIgnoreCase(phno.trim())) {
					config_delete_button.click();	
					driver1.switchTo().alert().accept();
					return Getmessagediv();	
				} return "names are not matching so not deleting";
			} return "no data found with deatils:  Name: "+name+"   PhNo: "+phno;
	}return " header is not matching";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
