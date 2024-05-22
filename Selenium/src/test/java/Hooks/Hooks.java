package Hooks;

import org.openqa.selenium.chrome.ChromeDriver;

import Steps.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass{
	
	@Before
	public void preCondition() {
		
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
	}
	
    @After
	public void postCondition() {
    	
		  driver.close();
		  
	}
}
