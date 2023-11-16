package tc_Repo;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility_Library.BaseClass;
import objectRepository.Home_Page_Pom;

@Listeners(genericUtility_Library.ListenersImplementation.class)
public class Sample_Tc_03 extends BaseClass {
	@Test
	public void reportModule()
	{
		Home_Page_Pom HP = new Home_Page_Pom(driver);
		HP.clickReport();
		System.out.println("tc 03 executed!!");
	}
}
