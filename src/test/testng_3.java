package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testng_3 {
	@Test
	public void websitelogin() {
		System.out.println("websitelogin passed");
	}

	@Test(dependsOnMethods={"websitelogout"})
	public void apilogin() {
		System.out.println("apilogin passed");
	}

	@Test

	public void websitelogout() {
		System.out.println("websitelogout passed");
	}

	@BeforeTest

	public void At_start_of_test() {
		System.out.println("I am at the start of test folder");
	}

	@Test
	public void apilogout() {
		System.out.println("apiLogOut passed");
	}
}
