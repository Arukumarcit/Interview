package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	    ChromeDriver driver= new ChromeDriver();
		driver.get("https://snapdeal.com");
		driver.manage().window().maximize();
		
		Actions builder = new Actions(driver);
		
	WebElement men = driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));
	
	builder.moveToElement(men).perform();
	
	Thread.sleep(5000);
   driver.findElement(By.xpath("//div[@id='category1Data']/div[@class='midData colDataBlk']//p[3]/a/span")).click();

   WebElement selction = driver.findElement(By.xpath(" //img[@title=\"Mandoth - Beige Cotton Blend Regular Fit Men's Casual Shirt (Pack of 1)\"]"));
		
		builder.moveToElement(selction)
		.click()
		.perform();
		
		
		
	}

}
