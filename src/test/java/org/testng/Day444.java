package org.testng;

import org.testng.annotations.Test;

public class Day444 {
	
	@Test(groups = "smoke")
	private void tc2() {
		System.out.println("Test 2");
	}
	
	@Test(groups = "sanity")
	private void tc1() {
		System.out.println("Test 1");
	}
	
	@Test(groups = "smoke")
	private void tc3() {
		System.out.println("Test 3");
	}
	
	@Test(groups = "regression")
	private void tc4() {
		System.out.println("Test 4");
	}


}
