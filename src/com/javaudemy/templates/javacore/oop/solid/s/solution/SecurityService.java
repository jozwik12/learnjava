package com.itbulls.learnit.javacore.oop.solid.s.solution;

public class SecurityService {

    public boolean hasAccess(User user) {
        return user.getRole() == Role.ADMIN;
    }

}
