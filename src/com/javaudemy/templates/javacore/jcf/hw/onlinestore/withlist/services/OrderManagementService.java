package com.itbulls.learnit.javacore.jcf.hw.onlinestore.withlist.services;

import com.itbulls.learnit.javacore.jcf.hw.onlinestore.withlist.enteties.Order;

import java.util.List;

public interface OrderManagementService {

    void addOrder(Order order);

    List<Order> getOrdersByUserId(int userId);

    List<Order> getOrders();

}
