package week5.day1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass {
	
	

	@Test(dataProvider="create")
	public void runCreateLead(String companyName,String FirstName, String LastName) {

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(FirstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(LastName);
		driver.findElement(By.name("submitButton")).click();


	  }
	
	@DataProvider(name="create")
	public String[][] fetchdata() throws IOException {
		
	//	String[][] data;
		
		/*
		 * data[0][0]="Wipro"; data[0][1]="Venkat"; data[0][2]="V";
		 * 
		 * data[1][0]="TestLeaf"; data[1][1]="Hari"; data[1][2]="R";
		 */
		//return  data;
		return ReadExcelData.readExcelData("CreateLead");
		
		
	}
}






