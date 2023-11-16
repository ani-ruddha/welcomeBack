package tc_Repo;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericUtility_Library.BaseClass;
import genericUtility_Library.ExcelUtility;
import genericUtility_Library.JavaUtility;
import objectRepository.Home_Page_Pom;

public class SampleTc_01 extends BaseClass {
	@Test
	public void tcUsersModule() throws Exception {
		ExcelUtility EUTIL =new ExcelUtility();
	String FIRSTNAME =	EUTIL.getDataFromExcel("Users", 2, 2);
	String LASTNAME =	EUTIL.getDataFromExcel("Users", 2, 3);
	String EMAIL =	EUTIL.getDataFromExcel("Users", 2, 4);
	JavaUtility JUTIL = new JavaUtility();
	int NUMBER =JUTIL.createRandomNumber();
		Home_Page_Pom HOME = new Home_Page_Pom(driver);
		HOME.clickUsers();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='New User']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath
		("//input[@id='createUserPanel_firstNameField']")).sendKeys(FIRSTNAME+NUMBER);		
		driver.findElement(By.xpath("//input[@id='createUserPanel_lastNameField']")).sendKeys(LASTNAME);	
		driver.findElement(By.xpath("//input[@id='createUserPanel_emailField']")).sendKeys(EMAIL);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Save & Send Invitation']"))
		.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Close'])[1]")).click();
		System.out.println("tc1 execution finish!!");
		
		
	}
}








