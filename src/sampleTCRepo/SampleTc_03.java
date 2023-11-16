package sampleTCRepo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility_Library.ExcelUtility;
import genericUtility_Library.IconstantUtility;
import genericUtility_Library.PropertiesUtility;
public class SampleTc_03 {
	public static void main(String[] args)throws Exception {
		/*READ DATA FROM PROPERTIES*/
		PropertiesUtility PUTIL = new PropertiesUtility();
	String URL      =	PUTIL.getDataFromProperties("url");
	String USERNAME =	PUTIL.getDataFromProperties("username");
	String PASSWORD =	PUTIL.getDataFromProperties("password");	
		/*READ DATA FROM EXCEL*/
		ExcelUtility EUTIL =new ExcelUtility();
	String FIRSTNAME =	EUTIL.getDataFromExcel("Users", 2, 2);
	String LASTNAME  =  EUTIL.getDataFromExcel("Users", 2, 3);
	String EMAIL     =  EUTIL.getDataFromExcel("Users", 2, 4);					
		System.setProperty("webdriver.chrome.driver",IconstantUtility.ChromedriverPath);
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();		
	}
}









