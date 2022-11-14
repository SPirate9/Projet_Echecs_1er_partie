package pieces;

import static org.junit.Assert.*;

import org.junit.Test;

public class Case0Test {

	@Test
	public void test() {
		Case0 c = new Case0();
		assertTrue(c.deplacementOK(6, 7, 6, 6));
		assertTrue(c.deplacementOK(3, 3, 2, 8));
		assertTrue(c.deplacementOK(4, 6, 1, 0));
		assertTrue(c.deplacementOK(3, 1, 4, 4));
		assertTrue(c.deplacementOK(3, 5, 7, 9));
		//assertEquals("  ", c.toString());
		assertEquals(" ", c.toString());
		//assertEquals("", c.toString());
	}

}
