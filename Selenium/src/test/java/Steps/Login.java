package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends BaseClass{

	


@When("User enters the Username as {string} and Password as {string}")
public void userNamePWD(String username,String password) {
	driver.findElement(By.id("username")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.className("decorativeSubmit")).click();
	
}
@And("Click Login button")
public void clickLogin() {
	driver.findElement(By.linkText("CRM/SFA")).click();
}
	
@Then("Testleaf Home page should be displayed")
public void homePage() {
  String title=driver.getTitle();

  System.out.println("Title page" +title);

}

}
