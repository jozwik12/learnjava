package com.itbulls.learnit.javacore.finaltask.menu.impl;

import com.itbulls.learnit.javacore.finaltask.configs.ApplicationContext;
import com.itbulls.learnit.javacore.finaltask.enteties.User;
import com.itbulls.learnit.javacore.finaltask.menu.Menu;
import com.itbulls.learnit.javacore.finaltask.services.UserManagementService;
import com.itbulls.learnit.javacore.finaltask.services.impl.DefaultUserManagementService;

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
