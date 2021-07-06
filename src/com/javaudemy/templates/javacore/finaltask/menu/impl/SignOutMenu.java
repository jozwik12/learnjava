package com.itbulls.learnit.javacore.finaltask.menu.impl;

import com.itbulls.learnit.javacore.finaltask.configs.ApplicationContext;
import com.itbulls.learnit.javacore.finaltask.menu.Menu;

public class SignOutMenu implements Menu {

    private final ApplicationContext context;

    {
        context = ApplicationContext.getInstance();
    }

    @Override
    public void start() {
        printMenuHeader();
        context.setLoggedInUser(null);
        context.getMainMenu().start();
    }

    @Override
    public void printMenuHeader() {
        System.out.println("***** Sign Out *****");
        System.out.println("Have a nice day! Look forward to welcoming back!");
    }

}
