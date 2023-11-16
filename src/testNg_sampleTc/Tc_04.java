package testNg_sampleTc;
/*
 * If we don't want to execute a Test case at that time we have to use a method 
 * enabled and value should be false..*/
import org.testng.annotations.Test;
public class Tc_04 {
	@Test
	public void create()
	{
		System.out.println("created!!");
	}
	@Test(enabled = false)
	public void modify()
	{
		System.out.println("modified!!");
	}
	@Test
	public void delete()
	{
		System.out.println("deleted!!");
	}
}




