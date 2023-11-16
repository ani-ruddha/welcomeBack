package tc_Repo;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility_Library.BaseClass;
import objectRepository.Home_Page_Pom;

@Listeners(genericUtility_Library.ListenersImplementation.class)
public class Sample_Tc_04 extends BaseClass {

	@Test
	public void settingsModule() throws Exception
	{
		Home_Page_Pom HP = new Home_Page_Pom(driver);
		HP.clickSettings();
		System.out.println("Tc 04 executed!!");
		Thread.sleep(4000);
	}
}
