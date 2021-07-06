package com.itbulls.learnit.javacore.patterns.creational.abstractfactory.example1;


public interface AbstractWidgetFactory {

    Window createWindow();

    Scroll createScroll();

    Button[] createNavigationButtons();

}
