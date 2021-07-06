package com.itbulls.learnit.javacore.oop.solid.s.solution;


public class MailboxSettingsService {

    private final SecurityService securityService;

    {
        securityService = new SecurityService();
    }

    public void changeSecondaryEmail(User user, String newSecondaryEmail) {
        if (securityService.hasAccess(user)) {
            user.setSecondaryEmail(newSecondaryEmail);
        }
    }

}