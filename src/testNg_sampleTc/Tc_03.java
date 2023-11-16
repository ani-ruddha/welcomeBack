package testNg_sampleTc;
/*
 * 1.To execute a Test Case multiple times we have to use invocationCount() method.
 * 2.We can provide multiple methods in the @Test annotation argument
 * */
import org.testng.annotations.Test;

public class Tc_03 {

	@Test(priority = 1 , invocationCount = 5)
	public void createUser()
	{
		System.out.println("user created!!");
	}	
}
