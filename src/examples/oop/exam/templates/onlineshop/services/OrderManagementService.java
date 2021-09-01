package examples.oop.exam.templates.onlineshop.services;

import examples.oop.exam.onlineshop.enteties.Order;

public interface OrderManagementService {

	void addOrder(Order order);

	Order[] getOrdersByUserId(int userId);
	
	Order[] getOrders();

}
