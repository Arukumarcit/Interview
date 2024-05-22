package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		WebElement frme=driver.findElement(By.xpath("//iframe[@src='page.xhtml']"));
			
		driver.switchTo().frame(frme);
		   WebElement frme1=  driver.findElement(By.xpath("//iframe[@src='framebutton.xhtml']"));
		   driver.switchTo().frame(frme1);
		   
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		

	}

}
