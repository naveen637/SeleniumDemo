package example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	@Test				
	public void testEasy() {	
		driver.get("http://demo.guru99.com/test/guru99home/");  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
	}	
	@BeforeTest
	public void beforeTest() {	
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	    driver = new FirefoxDriver();  
	}		
	@AfterTest
	public void afterTest() {
		driver.quit();			
	}		
}
