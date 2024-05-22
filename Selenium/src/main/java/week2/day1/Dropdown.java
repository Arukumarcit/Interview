package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
     driver.get("https://www.leafground.com/select.xhtml");
     WebElement drpdn= driver.findElement(By.xpath("//h5[text()='Which is your favorite UI Automation tool?']/following::select[@class='ui-selectonemenu']"));

     Select select = new Select(drpdn);
     select.selectByVisibleText("Playwright");
     
	}

}
