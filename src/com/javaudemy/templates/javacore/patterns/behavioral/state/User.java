package com.itbulls.learnit.javacore.patterns.behavioral.state;

public class User {

    private final String roleName;
    private final String nickname;

    public User(String roleName, String nickname) {
        this.roleName = roleName;
        this.nickname = nickname;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public String getNickname() {
        return this.nickname;
    }

}
