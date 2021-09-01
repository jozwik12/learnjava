package examples.patterns.behavioral.interpreter.demo2.expressions;

import examples.patterns.behavioral.interpreter.demo2.Employee;

public interface Expression {
	
	public boolean interpret(Employee context);
}
