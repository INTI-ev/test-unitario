package dobles;

public class OrderLine {
	
	private int id;
	private int quantity;
	private Order owner;
	
	public OrderLine (Order owner) {
		if (owner == null) {
			throw new IllegalArgumentException("owner");
		}
		this.owner = owner;
	}
	
	public double getTotal() {
		double unitPrice = owner.getDataAccess().getProductPrice(id);
		double total = unitPrice * quantity;
		return total;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Order getOwner() {
		return owner;
	}

	public void setOwner(Order owner) {
		this.owner = owner;
	}

}
