package sampleTest;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.List;
 
 
@RunWith(Parameterized.class)
public class TestGoogleBase extends SeleneseTestBase {
   
  private String browser;
  public TestGoogleBase(String browser){
   this.browser=browser;
  }
   
  @Parameters
   public static List data() {
    return Arrays.asList(new Object[][]{{"*chrome"},{"*googlechrome"}});
   }
 
  @Before
  public void setUp() throws Exception {
   selenium = new DefaultSelenium("localhost", 4444, browser, "http://www.google.com/");
   selenium.start();
  }
 
  @Test
  public void testUntitled() throws Exception {
   selenium.open("/");
   selenium.type("id=gbqfq", "testing");
   //selenium.click("name=btnG");
   selenium.click("css=div#gbqfbw > #gbqfb");
   for (int second = 0;; second++) {
    if (second >= 60) fail("timeout");
    try { if (selenium.isElementPresent("link=Software testing - Wikipedia, the free encyclopedia")) break; } catch (Exception e) {}
    Thread.sleep(1000);
   }
   selenium.click("link=Software testing - Wikipedia, the free encyclopedia");
   for (int second = 0;; second++) {
    if (second >= 60) fail("timeout");
    try { if (selenium.isTextPresent("Software testing")) break; } catch (Exception e) {}
    Thread.sleep(1000);
   }
   
  }
 
  @After
  public void tearDown() throws Exception {
   selenium.stop();
  }
  
 
}