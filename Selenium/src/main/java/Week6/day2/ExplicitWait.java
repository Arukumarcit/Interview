package Week6.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));

		
		driver.get("https://www.leafground.com/waits.xhtml");
		
        driver.findElement(By.id("j_idt87:j_idt89")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='j_idt87:j_idt90']/span")));
    

        String text = driver.findElement(By.xpath("//button[@id='j_idt87:j_idt90']/span")).getText();
        System.out.println(text);
        
        Assert.assertEquals(text,"I am here");
        
        
     
        driver.findElement(By.id("j_idt87:j_idt92")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[@id='j_idt87:j_idt93']/span")));
        String text1 = driver.findElement(By.xpath("//button[@id='j_idt87:j_idt93']/span")).getText();
        System.out.println(text1);
        driver.close();
	}

}
