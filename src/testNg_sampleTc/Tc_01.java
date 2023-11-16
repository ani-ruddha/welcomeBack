package testNg_sampleTc;
/*
 * 1.@Test annotation is mandatory for all the test cases otherwise it will not consider as
 *   Test case.
 * 2.We can provide @Test annotation in class level but it is not a recomended approach
 *   because in a class generic methods also will be present and it will also consider
 *   as a test case. So we are not going to use like this..
 * 3.@Test we should always provide in testCase level or method level.
 *   */
import org.testng.annotations.Test;
//@Test //not recomended
public class Tc_01 {

	@Test
	public void createUser()
	{
		System.out.println("user created!!");
	}	
	@Test
	public void modifyUser()
	{
		System.out.println("user modified!!");
	}
	@Test
	public void deleteUser()
	{
		System.out.println("user deleted!!");
	}
}
