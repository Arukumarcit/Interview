package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSetup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	//setup browser driver
		 WebDriverManager.chromedriver().setup();
		 String driverpath=System.getProperty("webdriver.chrome.driver");
		 System.out.println(driverpath);
	//Chrome driver
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://login.salesforce.com/");
		    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("arunkumarcit@gmail.com");
		    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Tanishka@2013");
		    driver.findElement(By.xpath("//input[@id='Login']")).click();
            Thread.sleep(3000);
            
            String title = driver.getTitle();
            if(title.equals("Home | Salesforce")) {
            	System.out.println("Title matched");
            }
            
         driver.close();
	}

}
