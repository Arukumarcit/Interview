package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Venkat");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
	    WebElement elemet = driver.findElement(By.id("createLeadForm_dataSourceId"));
	    Select select= new Select(elemet);
	    select.selectByValue("LEAD_CONFERENCE");
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();

		String title = driver.getTitle();
		if(title.equals("View Lead | opentaps CRM")) {
			System.out.println("Title matched");
		}else
		{
			System.out.println("Title Not matched");
		}
		
		driver.findElement(By.className("subMenuButtonDangerous")).click();
	

    // driver.close();      


	}

}
