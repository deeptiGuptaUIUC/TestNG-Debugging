package suite2;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.InvokedMethodListener.class)
public class TestClass4 {
	
	@Test
	public void test13() {
		assertEquals(true, true);
	}
	
	@Test
	public void test14() {
		assertEquals(true, true);
	}
	
	@Test
	public void test15() {
		assertEquals(true, true);
	}
	
	@Test
	public void test16() {
		assertEquals(true, true);
	}

}
