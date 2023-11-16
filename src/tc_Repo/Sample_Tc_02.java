package tc_Repo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import genericUtility_Library.BaseClass;
import genericUtility_Library.ExcelUtility;
import genericUtility_Library.JavaUtility;
import objectRepository.Home_Page_Pom;
import objectRepository.Task_Page_Pom;

public class Sample_Tc_02 extends BaseClass {
	@Test
	public void taskTc()throws Exception {		
		JavaUtility JUTIL = new JavaUtility();
		int NUMBER        =	JUTIL.createRandomNumber();
		ExcelUtility EUTIL =new ExcelUtility();
	String CNAME  =	EUTIL.getDataFromExcel("Task", 2, 2);
	String CDESC  = EUTIL.getDataFromExcel("Task", 2, 3);		
		Home_Page_Pom HPAGE = new Home_Page_Pom(driver);
		HPAGE.clickTask();
		Task_Page_Pom TPAGE =new Task_Page_Pom(driver);
		TPAGE.clickOnAddNeW();
		TPAGE.clickNewCustomer();
		TPAGE.createUser(CNAME+NUMBER, CDESC);
		System.out.println("tc2 execution finished!!");
		Thread.sleep(4000);
	}
}










