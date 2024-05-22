package week4.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pagination {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
          WebDriverManager.chromedriver().setup();
	    ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/table.xhtml");
		driver.manage().window().maximize();
		List<WebElement> rows = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr"));
		int rowCount = rows.size();
		
		List<WebElement> columns = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-header-box']/table//th"));
		int colCount = columns.size();
	 List<WebElement> pages = driver.findElements(By.xpath("//span[@class='ui-paginator-pages']/a"));
	 int pagescnt = pages.size();
	 System.out.println("Columns count" +pagescnt);
	 
	 for(int p=0;p<=pagescnt;p++) {
		 
		 if(p>0) {
			 
			 driver.findElement(By.xpath("//span[@class='ui-paginator-pages']/a["+p+"]")).click();
			
		 }
		 Thread.sleep(3000);
		 for(int i=1; i <= rowCount; i++) {
				for(int j=1; j <= colCount; j++) {
					String value = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table//tr[" + i + "]/td["+ j +"]")).getText();
					System.out.println(value);
				}
			}
		 }
		 
	}

}
