	package sampleTest;
	import com.thoughtworks.selenium.*;

	
	public class SugarCRM {

		public static void main(String[] args) {
	
			DefaultSelenium selenium = new DefaultSelenium("localhost",4444,"*iexplore","http://www.google.com");
	selenium.start();
	selenium.windowMaximize();
	 selenium.open("http://www.google.com");
		selenium.type("id=gbqfq", "testing");
		
		selenium.click("id=gbqfb");
		System.out.println("Pass");
	   selenium.stop();
}
	}