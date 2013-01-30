package sampleTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ testExampleTest.class, TestGoogleBase.class,
		testPageForSeleniumRemoteControlTest.class, testWikipediaProject.class })
public class AllTests {

}
