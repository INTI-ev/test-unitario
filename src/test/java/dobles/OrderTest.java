package dobles;

import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Test;

public class OrderTest {

	@Test
	public void testDummy() {
		IShopDataAccess dataAccess = new DummyShopDataAccess();
		
		
		Order o = new Order(1,dataAccess);
		
		o.getLines().add(123,3);
		o.getLines().add(124,2);
		
		Assert.assertTrue(o.getLines().size() == 2);
		
	}
	
	@Test
	public void testStub1() {
		IShopDataAccess dataAccess = new StubShopDataAccess();
		
		Order o = new Order(2, dataAccess);
		
		o.getLines().add(123,3);
		o.getLines().add(124,2);
		
		o.save();
		
		Assert.assertEquals(2, o.getLines().size());		
	}
	
	@Test
	public void testStub2() {
		IShopDataAccess dataAccess = new StubShopDataAccess();
		
		Order o = new Order(3, dataAccess);
		
		o.getLines().add(123,3);
		o.getLines().add(124,2);

		double total1 = o.getLines().get(0).getTotal();
		double total2 = o.getLines().get(1).getTotal();
		
		Assert.assertEquals(75, total1,0);
		Assert.assertEquals(50, total2,0);	
	}
	
	@Test
	public void testSpy() {
		SpyShopDataAccess dataAccess = new SpyShopDataAccess();
		
		Order o = new Order(4, dataAccess);
		
		o.getLines().add(123,3);
		o.getLines().add(124,2);
		
		o.save();
		
		Assert.assertTrue(dataAccess.isBanderaLlamada());
	}
	
	@Test
	public void testFake()
	{
		FakeShopDataAccess dataAccess = new FakeShopDataAccess();
		
		dataAccess.getProductos().add(new Product(2, 3.5));
		dataAccess.getProductos().add(new Product(4, 7));
		
		Order o = new Order(5, dataAccess);
		o.getLines().add(2,3);
		o.getLines().add(4,5);
		
		double total1 = o.getLines().get(0).getTotal();
		double total2 = o.getLines().get(1).getTotal();
		
		Assert.assertEquals(10.5, total1, 0);
		Assert.assertEquals(35, total2, 0);
	}
	
	@Test
	public void testEasyMock1()
	{
		IShopDataAccess dataAccess = EasyMock.createMock(IShopDataAccess.class);
		
		
		Order o = new Order(6,dataAccess);
		
		o.getLines().add(123,3);
		o.getLines().add(124,2);
		
		EasyMock.replay(dataAccess);

		Assert.assertEquals(2, o.getLines().size());
		
		EasyMock.verify(dataAccess);
	}
	
	@Test
	public void testEasyMock2()
	{
		IShopDataAccess dataAccess = EasyMock.createMock(IShopDataAccess.class);
		
		Order o = new Order(7,dataAccess);
		
		o.getLines().add(123,3);
		o.getLines().add(124,2);
		
		dataAccess.save(7, o);
		
		EasyMock.replay(dataAccess);
		
		o.save();
		
		EasyMock.verify(dataAccess);
	}
	
	@Test
	public void testEasyMock3()
	{
		IShopDataAccess dataAccess = EasyMock.createMock(IShopDataAccess.class);
		
		Order o = new Order(8,dataAccess);
		
		o.getLines().add(123,3);
		o.getLines().add(124,2);
		
		EasyMock.expect(dataAccess.getProductPrice(123)).andReturn(10.0);
		EasyMock.expect(dataAccess.getProductPrice(124)).andReturn(12.0);
		
		EasyMock.replay(dataAccess);
		
		double total1 = o.getLines().get(0).getTotal();
		double total2 = o.getLines().get(1).getTotal();
		
		Assert.assertEquals(30, total1, 0);
		Assert.assertEquals(24, total2, 0);
		
		EasyMock.verify(dataAccess);
	}
	
	@Test
	public void testEasyMock4()
	{
		IShopDataAccess dataAccess = EasyMock.createStrictMock(IShopDataAccess.class);
		
		Order o = new Order(9,dataAccess);
		
		o.getLines().add(123,3);
		o.getLines().add(124,2);
		
		EasyMock.expect(dataAccess.getProductPrice(123)).andReturn(10.0);
		EasyMock.expect(dataAccess.getProductPrice(124)).andReturn(12.0);
		
		EasyMock.replay(dataAccess);

		double total1 = o.getLines().get(0).getTotal();
		double total2 = o.getLines().get(1).getTotal();
		
		Assert.assertEquals(30, total1, 0);
		Assert.assertEquals(24, total2, 0);
		
		EasyMock.verify(dataAccess);
	}
}
