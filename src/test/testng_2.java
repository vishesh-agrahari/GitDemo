package test;

import static org.testng.Assert.assertTrue;


import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testng_2 {

	 @Test
	 public void mobileSignIn() {
		 System.out.println("mobileSignIn passed");
		 
	 }
	 
	 @Test
	 public void mobileSignOut() {
		 System.out.println("mobileSignOut passed");
		
	 }
	 @Parameters({"URL"})
	 @Test
	 
	 public void mobileLogIn(String url) {
		 System.out.println("mobileLogIn passed with url: "+ url);
	 }
	 
	 @Test
	 public void mobileLogOut() {
		 System.out.println("mobileLogOut passed");
	 }
}
