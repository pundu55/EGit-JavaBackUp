package sampleTest;

import static org.junit.Assert.*;
import com.thoughtworks.selenium.*;

public class jobApp39 {	
	
	public static String RandomAlphaNumericString(int size){
	    String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    String ret = "";
	    int length = chars.length();
	    for (int i = 0; i < size; i ++){
	        ret += chars.split("")[ (int) (Math.random() * (length - 1)) ];
	    }
	    return ret;
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		String emailAddress ="";
		DefaultSelenium selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://su-chrqa-a.homeoffice.anfcorp.com/");
		selenium.start();
		selenium.windowMaximize();
		selenium.open("http://su-chrqa-a.homeoffice.anfcorp.com/jobapp-web-lite/restart.action?brand=3&kiosk=&storeId=");
		selenium.windowMaximize();
		
		selenium.click("id=ctwrper");
		selenium.click("link=English");

		selenium.waitForPageToLoad("30000");
		selenium.click("id=ctwrper");
//		selenium.click("id=Password_Line3_parent");
//		selenium.click("id=Password.PasswordMask");
	
		 selenium.setCursorPosition("id=Password.PasswordMask", "0");
		selenium.type("id=Password.PasswordMask", "sydney32");
		selenium.setCursorPosition("id=Password.PasswordMask", "9");
		selenium.typeKeys("id=Password.PasswordMask", "\b");
		selenium.click("name=_action_next");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=australia");
		selenium.click("name=_action_next");
		selenium.waitForPageToLoad("30000");
		selenium.click("name=Store.SearchByMallName");
		selenium.select("name=Store.SearchByMallName", "label=Bondi Junction");
		selenium.click("css=option[value=\"Bondi Junction\"]");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=div.searchStoreId");
		selenium.click("name=_action_next");
		selenium.waitForPageToLoad("30000");
		selenium.click("name=Privacy.Accept");
		selenium.click("name=_action_next");
		selenium.waitForPageToLoad("30000");
		selenium.click("name=Acceptance.FirstName");
		selenium.type("name=Acceptance.FirstName", RandomAlphaNumericString(6));
		selenium.type("name=Acceptance.MiddleName", RandomAlphaNumericString(4));
		selenium.type("name=Acceptance.LastName", RandomAlphaNumericString(8));
		selenium.click("name=Acceptance.Accept");
		selenium.click("xpath=(//input[@id='Acceptance_Approach'])[2]");
		selenium.click("name=_action_next");
		selenium.waitForPageToLoad("30000");
		selenium.click("name=Basic.Position");
		selenium.select("name=Basic.Position", "label=Model");
		selenium.click("css=option[value=\"0023#:false#:false#:9999#:Model\"]");
		selenium.waitForPageToLoad("30000");
		selenium.click("id=dialogMessageOk");
		selenium.click("name=Basic.PhoneType");
		selenium.select("name=Basic.PhoneType", "label=Home");
		selenium.click("css=option[value=\"HOME\"]");
		selenium.click("name=Basic.Phone");
		selenium.type("name=Basic.Phone", "0324324329");
		selenium.click("name=Basic.Address");
		selenium.type("name=Basic.Address", "fake street");
		selenium.click("name=Basic.City");
		selenium.type("name=Basic.City", "city");
		selenium.click("name=Basic.Province");
		selenium.select("name=Basic.Province", "label=Austl. Cap. Terr.");
		selenium.click("css=option[value=\"ACT\"]");
		selenium.click("name=Basic.PostalCode");
		selenium.type("name=Basic.PostalCode", "3434");
		selenium.click("name=Basic.MailingAddressSame");
		selenium.click("xpath=(//input[@id='Basic_MinAgeIndicator'])[2]");
		selenium.click("name=_action_next");
		selenium.waitForPageToLoad("30000");
		selenium.click("id=ctwrper");
		selenium.click("name=Available.Sunday");
		selenium.select("name=Available.Sunday", "label=All day");
		selenium.click("css=option[value=\"allDay\"]");
		selenium.click("name=Available.Monday");
		selenium.select("name=Available.Monday", "label=All day");
		selenium.click("css=select[name=\"Available.Monday\"] > option[value=\"allDay\"]");
		selenium.click("name=Available.Tuesday");
		selenium.select("name=Available.Tuesday", "label=All day");
		selenium.click("css=select[name=\"Available.Tuesday\"] > option[value=\"allDay\"]");
		selenium.click("name=Available.Wednesday");
		selenium.select("name=Available.Wednesday", "label=All day");
		selenium.click("css=select[name=\"Available.Wednesday\"] > option[value=\"allDay\"]");
		selenium.click("name=Available.Thursday");
		selenium.select("name=Available.Thursday", "label=All day");
		selenium.click("css=select[name=\"Available.Thursday\"] > option[value=\"allDay\"]");
		selenium.click("name=Available.Friday");
		selenium.select("name=Available.Friday", "label=All day");
		selenium.click("css=select[name=\"Available.Friday\"] > option[value=\"allDay\"]");
		selenium.click("name=Available.Saturday");
		selenium.select("name=Available.Saturday", "label=All day");
		selenium.click("css=select[name=\"Available.Saturday\"] > option[value=\"allDay\"]");
		selenium.click("name=Available.ContractHours");
		selenium.select("name=Available.ContractHours", "label=38");
		selenium.click("css=select[name=\"Available.ContractHours\"] > option[value=\"38\"]");
		selenium.click("name=_action_next");
		selenium.waitForPageToLoad("30000");
		if (selenium.isElementPresent("name=StoreOpenAvailable.Sunday")) {
		selenium.click("name=StoreOpenAvailable.Sunday");
		selenium.select("name=StoreOpenAvailable.Sunday", "label=All day");
		selenium.click("css=option[value=\"allDay\"]");
		selenium.click("name=StoreOpenAvailable.Monday");
		selenium.select("name=StoreOpenAvailable.Monday", "label=All day");
		selenium.click("css=select[name=\"StoreOpenAvailable.Monday\"] > option[value=\"allDay\"]");
		selenium.click("name=StoreOpenAvailable.Tuesday");
		selenium.select("name=StoreOpenAvailable.Tuesday", "label=All day");
		selenium.click("css=select[name=\"StoreOpenAvailable.Tuesday\"] > option[value=\"allDay\"]");
		selenium.click("name=StoreOpenAvailable.Wednesday");
		selenium.select("name=StoreOpenAvailable.Wednesday", "label=All day");
		selenium.click("css=select[name=\"StoreOpenAvailable.Wednesday\"] > option[value=\"allDay\"]");
		selenium.click("name=StoreOpenAvailable.Thursday");
		selenium.select("name=StoreOpenAvailable.Thursday", "label=All day");
		selenium.click("css=select[name=\"StoreOpenAvailable.Thursday\"] > option[value=\"allDay\"]");
		selenium.click("name=StoreOpenAvailable.Friday");
		selenium.select("name=StoreOpenAvailable.Friday", "label=All day");
		selenium.click("css=select[name=\"StoreOpenAvailable.Friday\"] > option[value=\"allDay\"]");
		selenium.click("name=StoreOpenAvailable.Saturday");
		selenium.select("name=StoreOpenAvailable.Saturday", "label=All day");
		selenium.click("css=select[name=\"StoreOpenAvailable.Saturday\"] > option[value=\"allDay\"]");
		selenium.click("name=StoreOpenAvailable.MaxHoursWilling");
		selenium.select("name=StoreOpenAvailable.MaxHoursWilling", "label=21");
		selenium.click("css=option[value=\"21\"]");
		selenium.click("name=_action_next");
		selenium.waitForPageToLoad("30000");
				}
		selenium.click("name=_action_next");
		selenium.waitForPageToLoad("30000");
		selenium.click("id=EduSecondary_Attended");
		selenium.click("name=EduSecondary.Province");
		selenium.select("name=EduSecondary.Province", "label=Austl. Cap. Terr.");
		selenium.click("css=option[value=\"ACT\"]");
		selenium.click("name=EduSecondary.Name");
		selenium.type("name=EduSecondary.Name", "High School");
		selenium.click("id=EduSecondary_CompulsoryEducation");
		selenium.click("id=EduSecondary_Graduated");
		selenium.click("name=EduSecondary.GraduatedDate_year");
		selenium.type("name=EduSecondary.GraduatedDate_year", "2002");
		selenium.type("name=EduSecondary.GraduatedDate_month", "04");
		selenium.type("name=EduSecondary.GPA", "4");
		selenium.click("name=_action_next");
		selenium.waitForPageToLoad("30000");
		selenium.click("xpath=(//input[@id='EduUniversity_Attended'])[2]");
		selenium.click("name=_action_next");
		selenium.waitForPageToLoad("30000");
		selenium.click("xpath=(//input[@id='EduGraduate_Attended'])[2]");
		selenium.click("name=_action_next");
		selenium.waitForPageToLoad("30000");
		selenium.click("xpath=(//input[@id='EduOther_Attended'])[2]");
		selenium.click("name=_action_next");
		selenium.waitForPageToLoad("30000");
		selenium.click("xpath=(//input[@id='HaveEver_BeenEmployed'])[2]");
		selenium.click("xpath=(//input[@id='HaveEver_CrimeConviction'])[2]");
		selenium.click("name=_action_next");
		selenium.waitForPageToLoad("30000");
		selenium.click("name=Verification.Agree");
		selenium.click("name=_action_next");
		selenium.waitForPageToLoad("30000");
		selenium.click("name=Interview.TimeSlot");
		selenium.select("name=Interview.TimeSlot", "index=1");
		//selenium.click("css=option[value=\"d{8}\"]"); //12242335
		selenium.click("name=Interview.Email");
		emailAddress = RandomAlphaNumericString(10);
		selenium.type("name=Interview.Email", emailAddress+"@test.com");
		selenium.click("name=Interview.EmailConfirm");
		selenium.type("name=Interview.EmailConfirm", emailAddress+"@test.com");
		selenium.click("name=_action_save");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isTextPresent("a unique id of your submitted application is")) break; } catch (Exception e) {}
			Thread.sleep(1000);
			
		}
		selenium.stop();
	}

}

	

