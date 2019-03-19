package com.calculator.operations.impl;

import com.calculator.operations.MathematicalOperationsI;

public class MathOperations implements MathematicalOperationsI {

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int multiply(int a, int b) {
		return a*b;
	}

	@Override
	public int subtract(int a, int b) {
		return a-b;
	}

}


