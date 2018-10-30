package listner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener{

	@Override
	public void onFinish(ITestContext Result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext Result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {
		
		
	}
	
	//when test case fail call this method

	@Override
	public void onTestFailure(ITestResult Result) {
		System.out.println("The name of the testcase failed is :"+Result.getName());
		
	}

	//when test case skip call this method
	@Override
	public void onTestSkipped(ITestResult Result) {
		// TODO Auto-generated method stub
		System.out.println("The name of the testcase Skipped is :"+Result.getName());
	}

	//when test case start call this method
	@Override
	public void onTestStart(ITestResult Result) {
		System.out.println(Result.getName()+" test case started");	
		
	}

	//when test case success call this method
	@Override
	public void onTestSuccess(ITestResult Result) {
		System.out.println("The name of the testcase passed is :"+Result.getName());	
		
	}

}
