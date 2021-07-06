package com.itbulls.learnit.javacore.patterns.behavioral.mediator;

public class Button {
    private final Mediator mediator;

    public Button(Mediator mediator) {
        this.mediator = mediator;
    }

    public void press() {
        mediator.press();
    }
}
