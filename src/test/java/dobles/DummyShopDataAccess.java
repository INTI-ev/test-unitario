package dobles;


public class DummyShopDataAccess implements IShopDataAccess {
	
	public double getProductPrice(int id)
	{
		throw new RuntimeException("Interfaz Dummy sin implementación");
	}

	public void save(int id, Order o)
	{
		throw new RuntimeException("Interfaz Dummy sin implementación");		
	}

}
