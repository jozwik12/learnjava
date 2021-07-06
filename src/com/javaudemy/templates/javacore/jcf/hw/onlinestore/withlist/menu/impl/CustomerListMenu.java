package com.itbulls.learnit.javacore.jcf.hw.onlinestore.withlist.menu.impl;

import com.itbulls.learnit.javacore.jcf.hw.onlinestore.withlist.configs.ApplicationContext;
import com.itbulls.learnit.javacore.jcf.hw.onlinestore.withlist.enteties.User;
import com.itbulls.learnit.javacore.jcf.hw.onlinestore.withlist.menu.Menu;
import com.itbulls.learnit.javacore.jcf.hw.onlinestore.withlist.services.UserManagementService;
import com.itbulls.learnit.javacore.jcf.hw.onlinestore.withlist.services.impl.DefaultUserManagementService;

import java.util.List;

public class CustomerListMenu implements Menu {

    private final ApplicationContext context;
    private final UserManagementService userManagementService;

    {
        userManagementService = DefaultUserManagementService.getInstance();
        context = ApplicationContext.getInstance();
    }

    @Override
    public void start() {
        printMenuHeader();
        List<User> users = userManagementService.getUsers();

        if (users == null || users.size() == 0) {
            System.out.println("Unfortunately, there are no customers.");
        } else {
            for (User user : users) {
                System.out.println(user);
            }
        }
        context.getMainMenu().start();
    }

    @Override
    public void printMenuHeader() {
        System.out.println("***** USERS *****");
    }

}
