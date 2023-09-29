package org.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day2 {
	

	@BeforeClass
	private void chromeOpen() {
		System.out.println("open");
	}
	
	@AfterClass
	private void chromeClose() {
		System.out.println("close");
	}
	
	@BeforeMethod
	private void startTime() {
		System.out.println("Start");
	}
	
	@AfterMethod
	private void endTime() {
		System.out.println("End");
	}
	
	@Test(enabled=false)
	private void tc2() {
		System.out.println("Test 2");
	}
	
	@Test(priority = 2)
	private void tc1() {
		System.out.println("Test 1");
	}
	
	@Test(invocationCount = 2)
	private void tc3() {
		System.out.println("Test 3");
	}
	
	@Test(invocationCount = 2, priority = -1)
	private void tc4() {
		System.out.println("Test 4");
	}
	
	
	

}
