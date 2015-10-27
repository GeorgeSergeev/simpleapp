package com.sergeev.georg.math;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

public class MyMathTest {
	private MyMath myMath;

	@Before
	public void setUp() {
		myMath=new MyMath(5, 4);
	}
	
	
	@Test
	public void testCalcSumSimple() {
		assertEquals(9, myMath.calcSum());
	}
	
	@Test
	public void testCalcSumSimpleWrong() {
		assertNotEquals(10, myMath.calcSum());
	}

	@Test
	public void testCalcSumExtra() {
		myMath.setX(400000000);
		myMath.setY(500000000);
		assertEquals(900000000, myMath.calcSum());
	}

}
