import static org.junit.Assert.*;

import org.junit.Test;

public class CalcolatriceTest {

	@Test
	public void test() {
		assertTrue(Calcolatrice.pow(2, 3) == 8);
	}

	@Test
	public void test2() {
		assertTrue(Calcolatrice.pow2(2, 3) == 8);
	}
	
	@Test
	public void test3() {
		assertEquals(Calcolatrice.pow3(2, 3), 8);
	}
	
	@Test
	public void test4() {
		assertEquals(Calcolatrice.pow3(2, 0), 1);
	}
}
