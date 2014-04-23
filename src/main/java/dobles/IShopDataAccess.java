package dobles;

public interface IShopDataAccess {
	
	double getProductPrice(int productId);
	void save(int orderId, Order o);	

}
