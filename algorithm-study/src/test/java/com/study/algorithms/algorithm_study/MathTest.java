package com.study.algorithms.algorithm_study;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathTest{
	@Test
	public void testGCD(){
		assertEquals(1,Math.gcd(1, 3));
	}
	@Test
	public void testLCM(){
		assertEquals(15,Math.lcm(3,5));
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
