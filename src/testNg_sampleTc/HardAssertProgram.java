package testNg_sampleTc;
import org.testng.Assert;
import org.testng.annotations.Test;
public class HardAssertProgram {
	@Test
	public void hsStrictLevelComparison()
	{
		String expectedData = "raja";
		String actualData = "maharaja";
		
		Assert.assertEquals(actualData, expectedData);
		System.out.println("assertion passed!!");
	}	
	@Test
	public void hsContainsLevelComparison()
	{
		String expectedData = "raja";
		String actualData = "maharaja";
		
		Assert.assertTrue(actualData.contains(expectedData));
		System.out.println("contains comparison pass!!");
	}
}










