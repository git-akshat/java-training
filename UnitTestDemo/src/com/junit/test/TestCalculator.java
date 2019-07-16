package com.junit.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

import com.junit.demo.Calculator;

public class TestCalculator {


	@Test
	public void testAdd() {
		Calculator c = new Calculator();
		assertEquals(10, c.add(5, 5));
	}
	
	@Test
	public void testSub() {
		Calculator c = new Calculator();
		assertEquals(10, c.sub(15, 5));
	}
	
	@Test
	public void testDivide() {
		Calculator c = new Calculator();
		assertEquals(3, c.div(15, 5));
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivideByZero() {
		Calculator c = new Calculator();
		c.div(12, 0);
	}

}
