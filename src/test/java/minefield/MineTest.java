package minefield;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MineTest {
	
	private Mine mine;
	
	@Before
	public void setUp()
	{
		mine = new Mine();
	}
	
	@Test
	public void openedTest()
	{
		mine.setOpened(true);
		Assert.assertTrue(mine.isOpened());
		Assert.assertFalse(mine.isMarked());
		Assert.assertFalse(mine.isMined());
	}
	
	@Test
	public void markedTest()
	{
		mine.setMarked(true);
		Assert.assertTrue(mine.isMarked());
		Assert.assertFalse(mine.isOpened());
		Assert.assertFalse(mine.isMined());
	}
}
