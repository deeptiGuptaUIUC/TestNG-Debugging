package suite1;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.InvokedMethodListener.class)
public class TestClass2 {
	
	@Test
	public void test5() {
		assertEquals(true, true);
	}
	
	@Test
	public void test6() {
		assertEquals(true, true);
	}
	
	@Test
	public void test7() {
		assertEquals(true, true);
	}
	
	@Test
	public void test8() {
		assertEquals(true, true);
	}

}
