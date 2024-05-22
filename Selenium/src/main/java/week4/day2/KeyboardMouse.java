package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardMouse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	    ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		
		WebElement source = driver.findElement(By.xpath("//p[text()='Drag to target']"));
		WebElement target = driver.findElement(By.xpath("//p[text()='Drop here']"));
		
		Actions builder= new Actions(driver);
		
		builder.dragAndDrop(source, target).perform();
	
		
		Thread.sleep(3000);
		
		String text = driver.findElement(By.xpath("//p[@class='ui-widget-header']")).getText();
		
		System.out.println(text);
		
    
	}

}
