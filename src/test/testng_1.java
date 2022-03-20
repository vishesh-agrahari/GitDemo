package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class testng_1 {
	
	@AfterTest
	 
	 public void at_end_of_test() {
		 System.out.println("I am at the end of test");
	 }
	
	@Test
	public void test1() {
		System.out.println("test1 passed");
	}
	@Test
	public void test2() {
		System.out.println("test2 passsed");
	}
	@Test
	public void test3() {
		System.out.println("test3 passsed");
	}
	@Test
	public void test4() {
		System.out.println("test4 passsed");
	}

}
