package com.itbulls.learnit.javacore.patterns.behavioral.interpreter.demo2.expressions;

import com.itbulls.learnit.javacore.patterns.behavioral.interpreter.demo2.Employee;

public interface Expression {

    boolean interpret(Employee context);
}
