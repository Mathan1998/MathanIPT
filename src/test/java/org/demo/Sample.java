package org.demo;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sample extends BaseClass {
	public static void main(String[] args) {
		
		loadBrowser();
		launchUrl("https://www.facebook.com/");
		maximizeBrowser();
		
		if(getCurrentPageTitle().contains("Facebook") && 
				getCurrentPageUrl().contains("facebook")) {
			System.out.println("Facebook launch successfully");
		}
		
		WebElement txtEmail = d.findElement(By.id("email"));
		enterText(txtEmail, "mathan");
		
		WebElement txtPass = d.findElement(By.id("pass"));
		enterText(txtPass, "mathan1234");
		
		WebElement btnLogin = d.findElement(By.name("login"));
		clickElement(btnLogin);
		
		
	}

}
