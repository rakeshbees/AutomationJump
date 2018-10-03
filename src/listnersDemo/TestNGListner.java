package listnersDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListner implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Testcases started and Testcase details are "+ result.getName());
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Testcases success and Testcase details are "+ result.getName());
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Testcases failed and Testcase details are" + result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Testcases skipped and Testcase details are "+ result.getName());
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		
	}

}
