package minefield;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MineFieldTest {

	/* Un método de setUp que inicialice el minefield
	 * Sobre ese mismo método generar las siguiente minas:
	 * 
	 * (0,0) (3,4) (4,3) (2,2) (0,7) (7,7) (5,1) (4,7)
	 * 
	 * Un test que me verifique que hay 1 sola mina vecina a la posición (1,0)
	 * Un test que me verifique que no hay minas vecinas a la posición (7,7)
	 * 
	 * Encuentren un error en el método minedNeighbours, si es que hay, creando tests a su gusto
	 * 
	 * Si encuentran problemas pueden entrar a la clase MineField a ver cuál puede ser el origen
	 * 
	 */
	
	private MineField mineField;
	
	@Before
	public void setUp()
	{
		mineField = new MineField();
		
		mineField.putMine(0, 0);
		mineField.putMine(3, 4);
		mineField.putMine(4, 3);
		mineField.putMine(2, 2);
		mineField.putMine(0, 7);
		mineField.putMine(7, 7);
		mineField.putMine(5, 1);
		mineField.putMine(4, 7);
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testNeg1()
	{
		int cant = mineField.minedNeighbours(-1, 2);
	}
	
	@Test
	public void test01()
	{
		int cant = mineField.minedNeighbours(1, 1);
		Assert.assertEquals(2, cant);
		mineField.removeMine(7, 7);
		Assert.assertFalse(mineField.getField()[7][7].isMined());
	}
	
	@Test
	public void test02()
	{
		int cant = mineField.minedNeighbours(6, 7);
		Assert.assertEquals(1, cant);
	}
	
	@Test
	public void test03()
	{
		int cant = mineField.minedNeighbours(3, 3);
		Assert.assertEquals(3, cant);
	}
}
