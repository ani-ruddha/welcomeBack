package tc_Repo;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility_Library.BaseClass;

@Listeners(genericUtility_Library.ListenersImplementation.class)
public class Sample_Tc_05 extends BaseClass {
	@Test(retryAnalyzer = genericUtility_Library.RetryAnalyzerImplementation.class)
	public void calendarModule()
	{
		driver.findElement(By.xpath("(//div[@class='menu_ico])"))
		.click();
		System.out.println("Tc 05 executed!!");
	}
	
}
