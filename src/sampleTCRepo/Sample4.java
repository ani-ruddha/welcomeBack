package sampleTCRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample4 {
	public static void main(String[] args) throws Exception {		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
	WebElement element =driver.findElement(By.xpath("//input[@placeholder='Username']"));
		element.sendKeys("admin");
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		element.sendKeys("admin");
		
	}
}
