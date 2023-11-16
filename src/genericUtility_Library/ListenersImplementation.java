package genericUtility_Library;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

public class ListenersImplementation implements ITestListener{
	//Test case start
	@Override
	public void onTestStart(ITestResult result) {
	String MethodName =	result.getMethod().getMethodName();
	Reporter.log(MethodName + " started ");
	}
	//TC success
	@Override
	public void onTestSuccess(ITestResult result) {
		String MethodName =	result.getMethod().getMethodName();
		Reporter.log(MethodName + " succeed!!");
	}
	//TC FAIL AND CAPTURE SCREENSHOT
	@Override
	public void onTestFailure(ITestResult result) {
		String MethodName =	result.getMethod().getMethodName();
		Reporter.log(MethodName + " succeed!!");
		TakesScreenshot ts = (TakesScreenshot)BaseClass.driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\ScreenshotFolder\\"+MethodName+".png");		
		try {
			Files.copy(src, dest);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//TEST CASE SKIPPED
	@Override
	public void onTestSkipped(ITestResult result) {
		String MethodName =	result.getMethod().getMethodName();
		Reporter.log(MethodName + " skipped");
	}		
}


