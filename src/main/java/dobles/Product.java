package dobles;

public class Product {
	
	private int id;
	private double unitPrice;
	
	public Product(int id, double unitPrice) {
		super();
		this.id = id;
		this.unitPrice = unitPrice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Product)
		{
			Product aux = (Product)obj;
			return aux.id == this.id;
		}
		return false;
	}
}
