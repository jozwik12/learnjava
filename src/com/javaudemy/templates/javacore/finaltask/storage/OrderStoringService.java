package com.itbulls.learnit.javacore.finaltask.storage;

import com.itbulls.learnit.javacore.finaltask.enteties.Order;

import java.util.List;

public interface OrderStoringService {

    void saveOrders(List<Order> order);

    List<Order> loadOrders();
}
