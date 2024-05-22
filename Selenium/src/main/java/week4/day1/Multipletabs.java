package week4.day1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multipletabs {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.leafground.com/window.xhtml");
		
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']/span")).click();
		
		Set<String> windowhanles=driver.getWindowHandles();
		List<String> windows= new ArrayList<String>(windowhanles);
		
		System.out.println(windows.size());
		
		driver.switchTo().window(windows.get(0));
		String title= driver.getTitle();
		System.out.println(title);
		File source2=driver.getScreenshotAs(OutputType.FILE);
		File destination2= new File("./screenshots/multiple1.png");
		FileUtils.copyFile(source2, destination2);
		
		driver.switchTo().window(windows.get(1));
		String title1= driver.getTitle();
		System.out.println(title1);
		File source=driver.getScreenshotAs(OutputType.FILE);
		File destination= new File("./screenshots/multiple2.png");
		FileUtils.copyFile(source, destination);
		
		//driver.close();
		
		driver.switchTo().window(windows.get(2));
		String title2= driver.getTitle();
		System.out.println(title2);
		//driver.close();
		File source1=driver.getScreenshotAs(OutputType.FILE);
		File destination1= new File("./screenshots/multiple3.png");
		FileUtils.copyFile(source1, destination1);
		
		for(int i=0;i<windows.size();i++) {
			
			driver.switchTo().window(windows.get(i));
			if(driver.getTitle().equals("Web Table")){
				
				System.out.println("Webtable page is opened");
			}
			
		}
		driver.quit();
		

	}

}
