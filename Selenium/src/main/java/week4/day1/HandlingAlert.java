package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.leafground.com/alert.xhtml");
		
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']//span[text()='Show']")).click();
		
		Alert alert= driver.switchTo().alert();
		
		alert.accept();
		
		String text = driver.findElement(By.xpath("//span[@id='simple_result']")).getText();
		
		if(text.equals("You have successfully clicked an alert")) {
			System.out.println("Successfully handled the Simple Alert");
		}
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt93']//span[text()='Show']")).click();
		
Alert alert1= driver.switchTo().alert();
		String text2 = alert1.getText();
		System.out.println(text2);
		alert.accept();
		
		String text1 = driver.findElement(By.xpath("//span[@id='result']")).getText();
		
		if(text1.equals("User Clicked : OK")) {
			System.out.println("Successfully handled the Alert confirm");
		}
		
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt95']//span[text()='Show']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']//span[text()='Dismiss']")).click();
		
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt104']//span[text()='Show']")).click();
		
	Alert alert2= driver.switchTo().alert();
	alert2.sendKeys("Arun");
		
		alert2.accept();
		
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt111']//span[text()='Show']")).click();
		Thread.sleep(5000);
		driver .findElement((By.xpath("//*[@id=\"j_idt88:j_idt112\"]/div[1]/a[2]/span"))).click();
		}

}
