package com.study.algorithms.algorithm_study;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MathTest{
	@Test
	public void testGCD(){
		Math math = new Math();
		long gcd = math.gcd(1,3);
		Assert.assertEquals(1,gcd);
	}
	@Test
	public void testLCM(){
		Math math = new Math();
		long lcm = math.lcm(3,5);
		Assert.assertEquals(15,lcm);
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
