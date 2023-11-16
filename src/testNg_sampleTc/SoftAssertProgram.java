package testNg_sampleTc;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class SoftAssertProgram {
	@Test
	public void saStrictLevelComparison()
	{
		String expectedData = "raja";
		String actualData = "maharaja";		
		SoftAssert sa = new SoftAssert();		
		sa.assertEquals(actualData, expectedData);
		System.out.println("soft assert strict level pass");
		sa.assertAll();
	}
	@Test
	public void saContainsLevelComparison()
	{
		String expectedData = "raja";
		String actualData = "maharaja";
		SoftAssert sa = new SoftAssert();
		
		sa.assertTrue(actualData.contains(expectedData));
		System.out.println("soft assert contains level pass");
		sa.assertAll();
	}
}









