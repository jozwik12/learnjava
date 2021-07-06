package com.itbulls.learnit.javacore.finaltask.menu.impl;

import com.itbulls.learnit.javacore.finaltask.configs.ApplicationContext;
import com.itbulls.learnit.javacore.finaltask.enteties.Order;
import com.itbulls.learnit.javacore.finaltask.menu.Menu;
import com.itbulls.learnit.javacore.finaltask.services.OrderManagementService;
import com.itbulls.learnit.javacore.finaltask.services.impl.DefaultOrderManagementService;

import java.util.List;


public class MyOrdersMenu implements Menu {

    private final ApplicationContext context;
    private final OrderManagementService orderManagementService;

    {
        context = ApplicationContext.getInstance();
        orderManagementService = DefaultOrderManagementService.getInstance();
    }

    @Override
    public void start() {
        printMenuHeader();
        if (context.getLoggedInUser() == null) {
            System.out.println(
                    "Please, log in or create new account to see list of your orders");
            new MainMenu().start();
            return;
        } else {
            printUserOrdersToConsole();
        }
        new MainMenu().start();
    }

    private void printUserOrdersToConsole() {
        List<Order> loggedInUserOrders = orderManagementService
                .getOrdersByUserId(context.getLoggedInUser().getId());
        if (loggedInUserOrders == null || loggedInUserOrders.size() == 0) {
            System.out.println(
                    "Unfortunately, you don�t have any orders yet. "
                            + "Navigate back to main menu to place a new order");
        } else {
            for (Order order : loggedInUserOrders) {
                System.out.println(order);
            }
        }
    }

    @Override
    public void printMenuHeader() {
        System.out.println("***** MY ORDERS *****");
    }

}
