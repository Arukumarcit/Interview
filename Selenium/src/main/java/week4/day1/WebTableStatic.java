package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']//th"));
		int colscnt=columns.size();
		
		List<WebElement> rows= driver.findElements(By.xpath("//table[@id='customers']//tr"));
		int rowscnt=rows.size();
		
		System.out.println("cols"+colscnt+"rowscnt"+rowscnt);
		
		for(int i=2;i<rowscnt;i++) {
			
			for(int j=1;j<colscnt;j++) {
				
				String text  = driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]/td["+j+"]")).getText();
				
				System.out.println(text);
			}
		}

	}
	

}
