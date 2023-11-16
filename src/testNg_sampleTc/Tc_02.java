package testNg_sampleTc;
/*
 * 1.If we don't provide priority test cases will be executed in alphabetical order
 * 2.We need to use priority method to execute the test cases based on the priority
 * 3.the lowest priority value will be executed 1st
 * 4.Priority can be negative also
 * 5.If we will provide priority as well as some test cases will not have priority then
 *   those test cases will be executed alphabetically and then priority test cases will 
 *   be executed.
 * 6.If two testCases having same priority then those two test cases will be executed
 *   alphabetically in between themselves.
 * */
import org.testng.annotations.Test;

public class Tc_02 {
	
	@Test
	public void abcd()
	{
		System.out.println("sample");
	}
	@Test
	public void xyz()
	{
		System.out.println("welcome");
	}
	@Test(priority = 1)
	public void createUser()
	{
		System.out.println("user created!!");
	}	
	@Test(priority = 2)
	public void modifyUser()
	{
		System.out.println("user modified!!");
	}
	@Test(priority = 3)
	public void deleteUser()
	{
		System.out.println("user deleted!!");
	}
}








