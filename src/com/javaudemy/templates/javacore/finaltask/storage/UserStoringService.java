package com.itbulls.learnit.javacore.finaltask.storage;

import com.itbulls.learnit.javacore.finaltask.enteties.User;

import java.util.List;

public interface UserStoringService {

    void saveUser(User user);

    List<User> loadUsers();

}
