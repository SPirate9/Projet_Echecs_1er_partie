package pieces;

import static org.junit.Assert.*;

import org.junit.Test;

public class DameTest {

	@Test
	public void test() {
		Dame d = new Dame();
		//assertEquals("R", d.toString());
		//assertEquals("d", d.toString());
		assertEquals("D", d.toString());
		assertTrue(d.deplacementOK(6, 7, 6, 6));
		assertTrue(d.deplacementOK(3, 3, 2, 8));
		assertTrue(d.deplacementOK(4, 6, 1, 0));
		assertTrue(d.deplacementOK(3, 1, 4, 4));
		assertTrue(d.deplacementOK(3, 5, 7, 9));
		assertTrue(d.deplacementOK(99, 99, 99, 99));
		// aucune limite 
	}

}
