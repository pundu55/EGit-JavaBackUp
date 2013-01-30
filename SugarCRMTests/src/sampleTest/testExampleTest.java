package sampleTest;

import static org.junit.Assert.*;
import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.DefaultSelenium;
//import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
//import org.openqa.selenium.server.SeleniumServer;


public class testExampleTest 
{
	private static final String MAX_WAIT_TIME_IN_MS = "60000";
	private static final String BASE_URL = "http://www.bitmotif.com";
    private Selenium selenium = new DefaultSelenium( "localhost",4444,"*firefox",BASE_URL);
   //private SeleniumServer seleniumServer;	
   @Before
   public void setUp() throws Exception
   {
      selenium.start();
      //selenium.setSpeed("5000");
   }
 
   @Test
   public void testClickingLink()throws Exception   {
      selenium.open(BASE_URL);
      selenium.windowMaximize();
      selenium.click("link=Test Page For Selenium Remote Control");
      selenium.waitForPageToLoad(MAX_WAIT_TIME_IN_MS);
      
      //page header: Test Page For Selenium Remote Control «  Bit Motif
      String expectedTitle = "Test Page For Selenium Remote Control « Bit Motif";
      
      assertEquals(expectedTitle, selenium.getTitle());
      //System.out.println("Page title is: " + selenium.getTitle());
    
   }
   
   @After
   public void tearDown()  throws Exception
   {
      selenium.stop();
     
   }
   
}


