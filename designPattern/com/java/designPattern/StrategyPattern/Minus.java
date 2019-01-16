package com.java.designPattern.StrategyPattern;

public class Minus extends AbstractCalculator implements ICalculater{

	@Override
	public int calculate(String exp) {
		int arrayInt[]=split(exp, "-");
		return arrayInt[0]-arrayInt[1];
	}
}
