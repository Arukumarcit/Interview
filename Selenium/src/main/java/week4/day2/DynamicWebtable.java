package week4.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver();
		 
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		List<WebElement> cols = driver.findElements(By.xpath("//table[@summary='Sample Table']/thead//th"));
		int colscnt=cols.size();
		
		List<WebElement> rows= driver.findElements(By.xpath("//table[@summary='Sample Table']/tbody/tr"));
		int rowscnt=rows.size();

		System.out.println("cols"+colscnt+"rowscnt"+rowscnt);
		for(int i=1;i<=rowscnt;i++) {
			
			for(int j=1;j<colscnt;j++) {
				
				
				String text=driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(text);
				
			}
		}

	}

}
