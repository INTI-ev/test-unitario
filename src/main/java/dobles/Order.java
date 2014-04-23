package dobles;

public class Order {

	private int id;
	private IShopDataAccess dataAccess;
	private OrderLineCollection orderLines;

	public OrderLineCollection getLines() {
		return orderLines;
	}

	public IShopDataAccess getDataAccess() {
		return dataAccess;
	}

	public void save() {
		this.dataAccess.save(this.id, this);
	}

	public Order(int id, IShopDataAccess dataAccess) {
		if (dataAccess == null)
			throw new IllegalArgumentException("dataAccess");
		this.id = id;
		this.dataAccess = dataAccess;
		this.orderLines = new OrderLineCollection(this);
	}

	public OrderLineCollection getOrderLines() {
		return orderLines;
	}

	public void setOrderLines(OrderLineCollection orderLines) {
		this.orderLines = orderLines;
	}

}
