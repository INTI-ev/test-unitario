package general;

import static org.junit.Assert.*;
import general.SampleStaticRoutines;

import org.junit.Test;

public class SampleStaticRoutinesTest {

	@Test
	public void testMax() {
		// Arrange
		int a = 1;
		int b = 3;
		
		// Act
		int res = SampleStaticRoutines.max(a, b);
		
		// Assert
		assertEquals(3, res);
	}
	
	@Test
	public void testMax2 () {
		// Arrange
		int a = 7;
		int b = 2;
		
		// Act
		int res = SampleStaticRoutines.max(a, b);
		
		// Assert
		assertTrue(res == 7);
	}
	
	@Test(expected=NumberFormatException.class)
	public void testNegativo2 () throws Exception {
		String a = "123";
		String b = "124a";
		
		SampleStaticRoutines.max2(a, b);		
	}
	
	@Test(expected=Exception.class)
	public void testNegativo () throws Exception {
		throw new Exception();
	}

}
