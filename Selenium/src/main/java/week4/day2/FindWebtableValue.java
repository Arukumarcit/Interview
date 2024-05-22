package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindWebtableValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(4000));
		
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		//WebElement burgi=driver.findElement(By.xpath("//span[text()='Clock Tower Hote']"));

		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='Clock Tower Hotel']"))));
		String text = driver.findElement(By.xpath("//span[text()='Clock Tower Hotel']")).getText();
		System.out.println(text);
		
		assert text.equals("Clock Tower Hotel");
		
	//	String build = burgi.findElement(By.xpath("./following::td[4]")).getText();
		//System.out.println(build);
		
		//assert build.equals("2010");
		
		
		
		

	}

}
