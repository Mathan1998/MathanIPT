package org.testng;

import org.testng.annotations.DataProvider;

public class Day44 {
	
	@DataProvider(name = "facebook")
	private Object[][] loginData() {
		
		
		return new Object[][] {
			
			{"Greens", "Greens@123"},
			{"Mathan", "Mathan@123"},
			{"Redmi", "Redmi@123"},
			{"Santhosh", "Santhosh@123"}
			
		};
	}

}
