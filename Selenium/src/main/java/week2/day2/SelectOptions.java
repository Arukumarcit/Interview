package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
     driver.get("https://www.leafground.com/select.xhtml");
     WebElement drpdn= driver.findElement(By.xpath("//h5[text()='Which is your favorite UI Automation tool?']/following::select[@class='ui-selectonemenu']"));

     Select select = new Select(drpdn);
      List<WebElement> options = select.getOptions();
     
      for(int i=0;i<options.size();i++) {
    	  
    	 WebElement data = options.get(i);
    	 String value=data.getText();
    	 System.out.println(value);
      }
      
      for(WebElement value:options) {
    	  

     	 System.out.println(value);
       }
     
      select.selectByIndex(options.size()-2);
 driver.findElement(By.xpath("//label[text()='Select Country']/following::div[@class='ui-selectonemenu-trigger ui-state-default ui-corner-right'][1]")).click();
	 
 driver.findElement(By.xpath("//ul[@id='j_idt87:country_items']/li[text()='USA']")).click();
	}
	
	

}
