package examples.jcf.hw.onlinestore.withlist.services;

import java.util.List;

import examples.jcf.hw.onlinestore.withlist.enteties.Order;

public interface OrderManagementService {

	void addOrder(Order order);

	List<Order> getOrdersByUserId(int userId);
	
	List<Order> getOrders();

}
