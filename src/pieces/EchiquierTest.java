package pieces;

import static org.junit.Assert.*;

import org.junit.Test;
public class EchiquierTest {

	@Test
	public void test() {
		Echiquier monEchiquier = new Echiquier();
		//assertFalse(monEchiquier.getjeuxEnCours());
		assertTrue(monEchiquier.getjeuxEnCours());
		//assertNull(monEchiquier.mouvement);
		//assertEquals("salut",monEchiquier.mouvement);
		//assertEquals("A1",monEchiquier.mouvement);
		//assertEquals("A1 a A2",monEchiquier.mouvement);
		//assertTrue(monEchiquier.)
		assertEquals(3,monEchiquier.nbDeLigneEtCol = 3);
		assertEquals(4,monEchiquier.nbDeLigneEtCol = 4);
//		try {
//			monEchiquier.mouvement();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
		//assertArrayEquals(new int[]{0, 0}, monEchiquier.afficherTableau());
		
		//assertTrue("A4 a A1",monEchiquier.mouvValide());
		//assertTrue("E1 a A1",monEchiquier.mouvValide());
		//assertTrue(monEchiquier.mouvValide());
		//assertEquals(monEchiquier.mouvement());
		//assertArrayEquals(1, monEchiquier.creerTableau(null));
		
	}

}
