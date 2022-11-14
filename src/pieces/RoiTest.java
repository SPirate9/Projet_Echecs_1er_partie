package pieces;

import static org.junit.Assert.*;

import org.junit.Test;

public class RoiTest {

	@Test
	public void test() {
		Roi r = new Roi();
		assertEquals("R", r.toString());
		//assertEquals("X", r.toString());
		assertTrue(r.deplacementOK(2, 1, 1, 1));
		assertTrue(r.deplacementOK(1, 1, 1, 1));
		assertTrue(r.deplacementOK(1, 2, 2, 1));
		assertTrue(r.deplacementOK(1, 2, 2, 2));
		assertTrue(r.deplacementOK(1, 2, 2, 1));
		assertTrue(r.deplacementOK(2, 2, 3, 2));
		//assertTrue(r.deplacementOK(2, 2, 2, 4));
		assertTrue(r.deplacementOK(2, 2, 1, 1));
		//assertEquals("R",r.nom);
		assertTrue(r.deplacementOK(3, 3, 3, 3));
		assertTrue(r.deplacementOK(99, 98, 98, 98));
		// la différence doit etre 0 et 1 
		
		
	}

}
