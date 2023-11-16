package genericUtility_Library;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import objectRepository.Home_Page_Pom;
import objectRepository.Login_page_Pom;

public class BaseClass {

	public static WebDriver driver = null;
	public PropertiesUtility PUTIL =new PropertiesUtility();
	@BeforeSuite(alwaysRun = true)
	public void dbConnectionEstablish()
	{
		System.out.println("db connection establish!!");
	}
//	@Parameters("browser") //1st change in base class
	@BeforeClass(alwaysRun = true)
	public void launchingBrowser() throws Exception
	{			
		String URL =PUTIL.getDataFromProperties("url");		
		
		driver = new ChromeDriver();
		driver.get(URL);	
		System.out.println("chrome browser launch successfully!!");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();	
	}
	@BeforeMethod(alwaysRun = true)
	public void loginOperation() throws Exception
	{
	String USERNAME =	PUTIL.getDataFromProperties("username");
	String PASSWORD =	PUTIL.getDataFromProperties("password");
	Login_page_Pom LOGIN = new Login_page_Pom(driver);
	LOGIN.loginOperation(USERNAME, PASSWORD);
	System.out.println("Login successfull!!");
	Thread.sleep(3000);
	}
	@AfterMethod(alwaysRun = true)
	public void logOutOperation()
	{
		Home_Page_Pom HOME = new Home_Page_Pom(driver);
		HOME.clickLogout();
		System.out.println("Logout successfull!!");
	}
	@AfterClass(alwaysRun = true)
	public void closeBrowserOperation()
	{
		driver.close();
		System.out.println("Window closed successfully!!");
	}
	@AfterSuite(alwaysRun = true)
	public void dbConnectionClosed()
	{
		System.out.println("Db conncetion closed!!");
	}
}









