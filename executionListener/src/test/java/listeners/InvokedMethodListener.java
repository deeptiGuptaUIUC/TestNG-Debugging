package listeners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class InvokedMethodListener implements IInvokedMethodListener{
	
	private static ThreadLocal<ITestNGMethod> currentMethods = new ThreadLocal<ITestNGMethod>();
	private static ThreadLocal<ITestResult> currentResults = new ThreadLocal<ITestResult>();

	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		currentMethods.remove();
		currentResults.remove();
		System.out.println("AfterInvocation()");
	}

	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		currentMethods.set(method.getTestMethod());
		currentResults.set(testResult);
		System.out.println("BeforeInvocation()");
		
	}

	public static ITestNGMethod getTestMethod() {
		return checkNotNull(currentMethods.get(), "Did you forget to register the %s listener?",
				InvokedMethodListener.class.getName());
	}

	private static <T> T checkNotNull(T o, String msg, Object param) {
		if (o == null) {
			System.out.println("I am in the null");
			throw new NullPointerException(String.format(msg, param));
		}
		return o;
	}

}
