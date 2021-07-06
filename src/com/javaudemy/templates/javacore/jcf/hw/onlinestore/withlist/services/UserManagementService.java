package com.itbulls.learnit.javacore.jcf.hw.onlinestore.withlist.services;

import com.itbulls.learnit.javacore.jcf.hw.onlinestore.withlist.enteties.User;

import java.util.List;

public interface UserManagementService {

    String registerUser(User user);

    List<User> getUsers();

    User getUserByEmail(String userEmail);

}
