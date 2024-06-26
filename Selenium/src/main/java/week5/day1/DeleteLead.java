package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead extends BaseClass {

	@Test(dataProvider="delete")
	public void runDeleteLead(String firstname) throws InterruptedException {

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
		Thread.sleep(3000);
		System.out.println(firstname);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstname);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}

}
	@DataProvider(name="delete")
	public String[][] fetchdata() {
		
		String[][] data=new String[15][1];
		
		data[0][0]="Hari";
		
		  data[1][0]="Hari"; data[2][0]="Hari"; data[3][0]="Hari"; data[4][0]="Hari";
		  data[5][0]="Hari"; data[6][0]="Hari"; data[7][0]="Hari"; data[8][0]="Hari";
		  data[9][0]="Hari"; data[10][0]="Hari"; data[11][0]="Hari";
		  data[12][0]="Hari"; data[13][0]="Hari"; data[14][0]="venkat";
		 

		return data;
	}
}






