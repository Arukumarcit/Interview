package week4.day2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableLearning {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.leafground.com/grid.xhtml");
		
	 List<WebElement> columns = driver.findElements(By.xpath("//thead[@id='form:dt-products_head']/tr/th"));
	 int columnscnt = columns.size();
	 System.out.println("Columns count" +columnscnt);
	 
	//driver.findElement(By.xpath("//tbody[@id='form:dt-products_data']/tr[1]/td[1]")).click();
	 
	// System.out.println("Value" +text);
	 List<WebElement> rows = driver.findElements(By.xpath("//tbody[@id='form:dt-products_data']/tr"));
	 int rowscnt=rows.size();
	 System.out.println("Rows count" +rowscnt);
	 
	 List<String> datas= new ArrayList<String>();
	 for (WebElement webElement : rows) {
		     String text1=webElement.getText();
		     datas.add(text1);
	}
	 System.out.println(datas);
	 
	 for(int i=1;i<rowscnt;i++) {
		 
		 for(int j=1;j<columnscnt;j++) {
			 
		String value=	 driver.findElement(By.xpath("//tbody[@id='form:dt-products_data']/tr["+i+"]/td["+j+"]")).getText();
		System.out.println(value);
		if(value.equals("Bamboo Watch")) {
			driver.findElement(By.xpath("//tbody[@id='form:dt-products_data']/tr["+i+"]/td[9]/button[2]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@id='form:j_idt157']//span[@class='ui-button-text ui-c']")).click();
	
		
		}
			 
		 }
	 }
	 
	 
	}

}
