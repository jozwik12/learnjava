package com.itbulls.learnit.javacore.oop.solid.s.problem;

public class MailboxSettingsService {

    public void changeSecondaryEmail(User user, String newSecondaryEmail) {
        if (hasAccess(user)) {
            user.setSecondaryEmail(newSecondaryEmail);
        }
    }

    public boolean hasAccess(User user) {
        return user.getRole() == Role.ADMIN;

    }

}


