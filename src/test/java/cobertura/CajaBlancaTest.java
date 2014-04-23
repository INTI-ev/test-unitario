package cobertura;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CajaBlancaTest {

	/** Test de cobertura de sentencias */
	@Test
	public void testBisiesto() {
		int a = 2008;
		boolean b = CajaBlanca.bisiesto(a);
		assertTrue(b);
	}

	/** Test de cobertura de decisión */
	@Test
	public void testCapicua() {
		String a = "neuquen";
		String b = "otracosa";
		boolean bA = CajaBlanca.capicua(a.toCharArray());
		boolean bB = CajaBlanca.capicua(b.toCharArray());
		
		assertTrue(bA);
		assertFalse(bB);
		
	}

	/** Test de cobertura de caminos */
	@Test
	public void testMcd() {
		assertEquals(1, CajaBlanca.mcd(1, 0));
		assertEquals(1, CajaBlanca.mcd(1, 1));
		assertEquals(1, CajaBlanca.mcd(2, 1));
		assertEquals(1, CajaBlanca.mcd(1, 2));
	}

}
