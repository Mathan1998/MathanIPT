package org.testng;

import org.testng.annotations.Test;

public class Day4444 {
	
	@Test(groups = "sanity")
	private void tc5() {
		System.out.println("Test 5");
	}
	
	@Test(groups = "regression")
	private void tc6() {
		System.out.println("Test 6");
	}
	
	@Test(groups = "smoke")
	private void tc7() {
		System.out.println("Test 7");
	}
	
	@Test(groups = "regression")
	private void tc8() {
		System.out.println("Test 8");
	}


}
