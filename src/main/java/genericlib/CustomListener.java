 package genericlib;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

public class CustomListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("Test started", true);

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("Test sucess", true);

	}
 
	@Override
	public void onTestFailure(ITestResult result) {
 		String name = result.getMethod().getMethodName();   //it fatch the method name where we used  where lis future in class like used in login test , register test 
		TakesScreenshot t = (TakesScreenshot) BaseTest.sdriver;   //here we take always take static driver bcz its only accept sdriver  but if we want to perform cross browser  and parllel excution then we need non static driver
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File("./src/test/resources/screenshot/" + name + ".png");
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
 			System.out.println("Screenhot not taken");
		}
		
		Reporter.log("Screenshot taken successfully", true);

	}

	@Override
	public void onTestSkipped(ITestResult result) {


		Reporter.log("");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

}