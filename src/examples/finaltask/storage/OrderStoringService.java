package examples.finaltask.storage;

import java.util.List;

import examples.finaltask.enteties.Order;

public interface OrderStoringService {
	
	void saveOrders(List<Order> order);
	
	List<Order> loadOrders();
}
