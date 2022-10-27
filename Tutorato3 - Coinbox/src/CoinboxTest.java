import static org.junit.Assert.*;

import org.junit.Test;

public class CoinboxTest {

	@Test
	public void testInit() {
		// Verifica che all'inizio non ci siano monete
		Coinbox c = new Coinbox();
		assertTrue(c.getNMonete() == 0);
	}
	
	@Test
	public void testSingleVend() {
		// Verifica che con due monete eroghi il caffè
		Coinbox c = new Coinbox();
		c.insertCoin();
		c.insertCoin();
		assertTrue(c.erogaProdotto());
		assertEquals(0, c.getNMonete());
	}
	
	@Test
	public void testNotEnough() {
		// Verifica che con una moneta non eroghi il caffè
		Coinbox c = new Coinbox();
		c.insertCoin();
		assertFalse(c.erogaProdotto());
	}

}
