package sampleTest;

import static org.junit.Assert.*;
import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.DefaultSelenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
//import org.openqa.selenium.server.SeleniumServer;

public class testPageForSeleniumRemoteControlTest {
	
		private static final String MAX_WAIT_TIME_IN_MS = "60000";
		private static final String BASE_URL = "http://www.bitmotif.com";
		private static final String TEST_PAGE_URL = BASE_URL + "/test-page-for-selenium-remote-control";
		private static final String TEST_PAGE_TITLE = "Test Page For Selenium Remote Control « Bit Motif";
	
	    private Selenium selenium = new DefaultSelenium( "localhost",4444,"*firefox",BASE_URL);
	 
	   @Before
	   public void setUp() throws Exception
	   {
	      selenium.start();
	      }
	 
	   @Test
	   public void testClickingLink()throws Exception 
	   {
		   selenium.open(BASE_URL);
		   selenium.windowMaximize();
//		   selenium.open(TEST_PAGE_URL);
//		   		   assertEquals(TEST_PAGE_TITLE, selenium.getTitle());;
		   		   Thread.sleep(5000);
	    
	      selenium.click("link=Test Page For Selenium Remote Control");
	      selenium.waitForPageToLoad(MAX_WAIT_TIME_IN_MS);
     
	         
	      assertEquals(TEST_PAGE_TITLE, selenium.getTitle());
	      //System.out.println("Page title is: " + selenium.getTitle());
	       assertTrue(selenium.isElementPresent("id=textInput"));
	       assertEquals("", selenium.getText("id=textInput"))  ;
	       
	        if(selenium.isElementPresent("//input[@id='textInput']"));
	   			{
	   					System.out.println("text input Id is present");
	   			}
	   			
	   selenium.type("id=textInput", "Text In The Field");
	   assertEquals("Text In The Field", selenium.getValue("id=textInput"));
	   
	   String testBoxValue = selenium.getValue("id=textInput");
	   System.out.println("Value in the text box is:" + testBoxValue );
	   
	   assertEquals("", selenium.getText("id=textInput"));
	   String testBoxValueAfterTyping = selenium.getText("id=textInput");
	   System.out.println("Value in the text box is:" + testBoxValueAfterTyping );
	   
	   //Checking Checkbox values 
	   assertEquals("off", selenium.getValue("id=checkBoxInput"));
	   selenium.click("id=checkBoxInput");
	   assertEquals("on", selenium.getValue("id=checkBoxInput"));
	   
	   //checking radio button	
	   assertFalse(selenium.isChecked("name=radioButton value=a"));
	   assertFalse(selenium.isChecked("name=radioButton value=b"));
	   selenium.check("name=radioButton value=b");
	   assertTrue(selenium.isChecked("name=radioButton value=b"));
	   assertFalse(selenium.isChecked("name=radioButton value=a"));
	   
	   assertEquals("option one", selenium.getSelectedLabel("id=selectWithLabelsOnly"));
	   assertEquals("option one", selenium.getValue("id=selectWithLabelsOnly"));
	   selenium.select("id=selectWithLabelsOnly", "label=option two");
	   assertTrue(selenium.isSomethingSelected("id=selectWithLabelsOnly"));
	   assertEquals("option two", selenium.getSelectedLabel("id=selectWithLabelsOnly"));
	   assertEquals("option two", selenium.getValue("id=selectWithLabelsOnly"));
	   
	   Thread.sleep(5000);
	   
	   selenium.uncheck("id=checkBoxInput");
	   
	   Thread.sleep(5000);
	   }
	  
	   
	   @After
	   public void tearDown()  throws Exception
	   {
	      selenium.stop();
	     
	   }
	   
	}

//package com.selftechy.seltests;

