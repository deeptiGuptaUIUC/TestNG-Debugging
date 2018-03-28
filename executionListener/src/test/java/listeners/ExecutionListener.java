package listeners;

import org.testng.IExecutionListener;

public class ExecutionListener implements IExecutionListener{

	public void onExecutionStart() {
		System.out.println("Notify that Suite has started");
		
	}

	public void onExecutionFinish() {
		System.out.println("Notify that Suite has ended");
		
	}

}
