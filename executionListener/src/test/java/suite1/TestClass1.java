package suite1;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners({listeners.ExecutionListener.class,listeners.InvokedMethodListener.class})
public class TestClass1 {
	
	@Test
	public void test1() {
		assertEquals(true, true);
	}
	
	@Test
	public void test2() {
		assertEquals(true, true);
	}
	
	@Test
	public void test3() {
		assertEquals(true, true);
	}
	
	@Test
	public void test4() {
		assertEquals(true, true);
	}

}
