package org.javaprogrammings;

import org.testng.annotations.Test;

public class SwapThroughUsingvariable {
	@Test
	/**
	 * this method is used to swap variables without using third variable
	 */
	public void main() {
		int a = 20;
		int b = 10;
		System.out.println("before swap======> A value is =" + a + " & B value is =" + b + "");
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("after swap======> A value is =" + a + " & B value is =" + b + "");
	}
	
	
	@Test
	/**
	 * this method is used to swap the variables using third variable
	 */
	 public void main1()
	 {
		int a = 20;
		int b = 10;
		int temp;
		System.out.println("before swap======> A value is =" + a + " & B value is =" + b + "");
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swap======> A value is =" + a + " & B value is =" + b + "");
	 }
}
