package testNg_sampleTc;

import org.testng.Reporter;
import org.testng.annotations.Test;
public class Tc_05 {
	@Test()
	public void create()
	{
		System.out.println("created!!");
	}
	@Test(dependsOnMethods = "create")
	public void modify()
	{
		System.out.println("modified!!");
		Reporter.log("modify depends on create!!");
	}
	@Test
	public void delete()
	{
		System.out.println("deleted!!");
	}
}



