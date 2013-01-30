package sampleTest;

import com.thoughtworks.selenium.*;
import junit.framework.Assert;
import static org.junit.Assert.*;

public class Training {

	public static void main(String args[]) throws Exception {
		DefaultSelenium selenium;
		 selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://book.theautomatedtester.co.uk/");
		selenium.start();
		selenium.setSpeed("5000"); 
		selenium.open("/");
		selenium.windowMaximize();
		selenium.click("link=Chapter1");
		selenium.waitForPageToLoad("30000");
		
		
		assertEquals("Assert that this text is on the page", selenium.getText("id=divontheleft"));
		
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("id=verifybutton")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		// click radio button
		selenium.click("id=radiobutton");
	
		selenium.select("id=selecttype", "label=Selenium RC");
		selenium.click("link=Home Page");
		
		selenium.stop();
	}


		
	}




		


