package sampleTest;

import java.io.FileInputStream;
import jxl.Sheet;
import jxl.Workbook;
import org.openqa.selenium.server.SeleniumServer;
import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
//import java.util.regex.Pattern;

public class contractAccept 
{
	public Selenium selenium;
	public SeleniumServer seleniumserver;
	
	@Before
	public void setUp() throws Exception {
		

			
			
					//selenium.open("http://www.google.com");
					selenium = new DefaultSelenium("localhost", 4444, "*googlechrome", "http://su-chrqa-p.com/");
					//selenium.setSpeed("1000");
			
		}
	
	@Test
	public void testContractAccept() throws Exception 
	{
		FileInputStream fi=new FileInputStream("C:\\Selenium\\emplid\\contractAcceptData.xls");
		Workbook w=Workbook.getWorkbook(fi);
		Sheet s=w.getSheet(0);
		for (int i = 1; i < s.getRows(); i++)
		{			
			String emplid = s.getCell(0,i).getContents();
			String storenumber= s.getCell(1,i).getContents();
			String managerid = s.getCell(2,i).getContents();
			//String formid = s.getCell(3,i).getContents();
			selenium.start();
			selenium.windowMaximize();
		selenium.open("http://suion?EmplID="+emplid+"&StoreNum="+storenumber+"&language=en&iposUp");
		selenium.waitForPageToLoad("30000");
		//selenium.click("xpath=(//a[contains(text(),'Click to open form')])[5]");
		selenium.click("xpath=//tr[10]/td[3]/a[contains(text(),'Click to open form')]");
		//selenium.click("xpath=//table[2]/tbody/tr[9]/td[3]");
		//selenium.click("xpath=//table[@id='formsListingFormsTable']//tr[7]/td[3]");
		selenium.waitForPageToLoad("30000");
		//Thread.sleep(2000);
		if (selenium.isElementPresent("id=Contract_Title_label")) 
		{
		selenium.click("id=submitButton");
		//selenium.click("id=denyCopy");
		//selenium.click("id=contractPrintButton");
		//selenium.click("id=submitButton");
		
		selenium.click("id=confirmCopy");
		selenium.click("id=managerId");
		//selenium.type("css=input[type=\"text\"]", "mana");
		selenium.click("id=managerId");
		selenium.type("id=managerId", managerid);
		selenium.click("id=managerPassword");
		selenium.type("id=managerPassword", "12345");
		//selenium.setCursorPosition("id=Password.PasswordMask", "6");
		//selenium.typeKeys("id=Password.PasswordMask", "\b");
		selenium.click("id=popupButtonApprove");
		selenium.waitForPageToLoad("30000");
		if (selenium.isElementPresent("id=formLink"))
		{
			selenium.stop();
		}
		//selenium.waitForPageToLoad("30000");
		}
		else
			selenium.stop();
		}
	}

//	@After
//	public void tearDown() throws Exception {
//		selenium.stop();
//	}

}


