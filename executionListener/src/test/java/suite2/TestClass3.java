package suite2;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.InvokedMethodListener.class)
public class TestClass3 {
	
	@Test
	public void test9() {
		assertEquals(true, true);
	}
	
	@Test
	public void test10() {
		assertEquals(true, true);
	}
	
	@Test
	public void test11() {
		assertEquals(true, true);
	}
	
	@Test
	public void test12() {
		assertEquals(true, true);
	}

}
