package Steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CreateLead extends BaseClass {
	

	
	@Then("Click on Test lead button")
	public void clickTest() {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
	
	}
	
	@When("Enter the company Name as {string}")
	public void companyName(String companyName) {
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		
	}
	
	@And("Enter the First Name as {string}")
	public void firstName(String firstName) {
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		
	}
	
	@And("Enter the Last Name as {string}")
	public void lastName(String lastName) {
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);	
	
	}
	
	@And("Click the submit button")
	public void submitButton() {
		
		driver.findElement(By.name("submitButton")).click();
		
	}
}





