package dobles;

public class SpyShopDataAccess implements IShopDataAccess {
	
	private boolean banderaLlamada = false;
	
	public boolean isBanderaLlamada()
	{
		return this.banderaLlamada;
	}

	public double getProductPrice(int productId) {
		return 25;
	}

	public void save(int orderId, Order o) {
		this.banderaLlamada = true;
	}

}
