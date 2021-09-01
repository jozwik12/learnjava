package examples.jcf.hw.onlinestore.withoutlist.services;

import examples.jcf.hw.onlinestore.withoutlist.enteties.Order;

public interface OrderManagementService {

	void addOrder(Order order);

	Order[] getOrdersByUserId(int userId);
	
	Order[] getOrders();

}
