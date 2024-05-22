package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.leafground.com/window.xhtml");
		driver.findElement(By.xpath("//button[@id='j_idt88:new']/span")).click();
		
		String windowHandle = driver.getWindowHandle();
		
		System.out.println(windowHandle);
		


	Set<String> windowHandles = driver.getWindowHandles();
	List<String> windows= new ArrayList<String>(windowHandles);
	
	System.out.println(windows.size());
	
	driver.switchTo().window(windows.get(1));
	String title= driver.getTitle();
	System.out.println(title);
	
	if(title.equals("Dashboard")){
		
		System.out.println("Single window Handle successful");
	}
	
	}

}
