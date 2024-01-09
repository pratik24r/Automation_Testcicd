package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

public class Employee {
    
	@Test
	public void sum() {
		System.out.println("sum");
		int a = 10;
		int b = 20;
		AssertJUnit.assertEquals(30, a+b);
	}
	@Test
	public void sub() {
		System.out.println("sub");
		int a = 10;
		int b = 20;
		AssertJUnit.assertEquals(10, b-a);
	}
	@Test
	public void mul() {
		System.out.println("mul");
		int a = 10;
		int b = 20;
		AssertJUnit.assertEquals(200, a*b);
	}
	@Test
	public void div() {
		System.out.println("div");
		int a = 10;
		int b = 20;
		AssertJUnit.assertEquals(2, b/a);
	}
	
}
