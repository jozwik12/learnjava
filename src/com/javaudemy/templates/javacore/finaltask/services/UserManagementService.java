package com.itbulls.learnit.javacore.finaltask.services;

import com.itbulls.learnit.javacore.finaltask.enteties.User;

import java.util.List;

public interface UserManagementService {

    String registerUser(User user);

    List<User> getUsers();

    User getUserByEmail(String userEmail);

}
