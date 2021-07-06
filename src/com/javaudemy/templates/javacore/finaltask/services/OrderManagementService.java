package com.itbulls.learnit.javacore.finaltask.services;

import com.itbulls.learnit.javacore.finaltask.enteties.Order;

import java.util.List;

public interface OrderManagementService {

    void addOrder(Order order);

    List<Order> getOrdersByUserId(int userId);

    List<Order> getOrders();

}
