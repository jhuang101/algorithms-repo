package com.study.algorithms.algorithm_study;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathTest{
	@Test
	public void testGCD(){
		Math math = new Math();
		assertEquals(1,math.gcd(1, 3));
	}
	@Test
	public void testLCM(){
		Math math = new Math();
		assertEquals(15,math.lcm(3,5));
	}
	@Test
	public void testDummy(){
		assertEquals("a","a");
	}
	
	@Test
	public void testx(){
		assertEquals('b','b'); 
	}
}
