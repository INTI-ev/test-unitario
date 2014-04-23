package dobles;

import java.util.ArrayList;

public class OrderLineCollection extends ArrayList<OrderLine>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Order owner;

	public OrderLineCollection(Order order) {
		this.owner = order;
	}

	public void add(int id, int cantidad) {
		OrderLine aux = new OrderLine(owner);
		aux.setId(id);
		aux.setQuantity(cantidad);
		owner.getLines().add(aux);
	}

}
