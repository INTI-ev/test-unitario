package dobles;

import java.util.ArrayList;
import java.util.List;

public class FakeShopDataAccess implements IShopDataAccess {
	
	private List<Product> productos;
	
	public FakeShopDataAccess()
	{
		this.productos = new ArrayList<Product>();
	}
	
	public List<Product> getProductos()
	{
		return this.productos;
	}

	public double getProductPrice(int productId) {
		Product p = findProductoById(productId);
		if (p != null)
			return p.getUnitPrice();
		else
			throw new IllegalArgumentException("No se encontró el producto con id: " + productId);
	}
	
	private Product findProductoById(int id)
	{
		for (Product p : this.productos)
		{
			if (p.getId() == id)
				return p;
		}
		return null;
	}

	public void save(int orderId, Order o) {
		// TODO Auto-generated method stub
		
	}

}
