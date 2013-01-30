package sampleTest;

import static org.junit.Assert.*;
import com.thoughtworks.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.server.SeleniumServer;

import java.util.regex.Pattern;

public class testWikipediaProject {
	public Selenium selenium;
	public SeleniumServer seleniumserver;
	
	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://www.wikipedia.org/");
		selenium.start();
		//selenium.setSpeed("5000");
	}

	@Test
	public void testWikipediaProject() throws Exception {
		
		selenium.open("http://www.wikipedia.org/");
		selenium.windowMaximize();
		selenium.type("id=searchInput", "selenium software");
		selenium.click("name=go");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=.mw-search-results li:nth-of-type(1) a");
				selenium.waitForPageToLoad("30000");
			assertEquals("", selenium.getText("xpath=//img[@alt='Selenium logo']"));
			//assertTrue(selenium.isTextPresent("xpath=//img[@alt='Selenium logo']"));
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
