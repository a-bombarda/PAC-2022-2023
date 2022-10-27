import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CounterTest {

	private int nExec;
	private int result;
	
	public CounterTest(int n, int r) {
		this.nExec = n;
		this.result = r;
	}
	
	@Parameters
	public static Collection getParametri() {
		return Arrays.asList(new Object[][] {{1, 1}, {2, 2}, {3, 3}});
	}
	
	@Test
	public void testParametrico() {
		Counter c = new Counter();
		int val = 0;
		for (int i=0; i<nExec; i++)
			val = c.inc();
		
		assertEquals(result, val);
	}
	
	@Test
	public void testInc() {
		Counter c = new Counter();
		assertEquals(c.inc(), 1);		
		assertTrue(c.inc() == 2);
		assertFalse(c.inc() == 2);
	}
	
	@Test
	public void testDec() {
		Counter c = new Counter();
		assertEquals(c.dec(), -1);
	}

	@Test(expected=ArithmeticException.class)
	public void testDiv() {
		int a = 2 / 0;
	}
}
