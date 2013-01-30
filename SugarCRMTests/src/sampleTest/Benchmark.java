package sampleTest;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.server.RemoteControlConfiguration;
import org.openqa.selenium.server.SeleniumServer;
import com.thoughtworks.selenium.*;
import java.util.regex.Pattern;
import org.junit.Test;


public class Benchmark extends SeleneseTestCase {
public Selenium selenium;
public SeleniumServer seleniumserver;

@Before
public void setUp() throws Exception {
RemoteControlConfiguration rc = new RemoteControlConfiguration();
seleniumserver = new SeleniumServer(rc);
selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://www.google.com");
seleniumserver.start();
selenium.start();
}