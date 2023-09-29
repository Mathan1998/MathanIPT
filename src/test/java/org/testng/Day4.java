package org.testng;

import java.util.Date;

import org.base.BaseClass;
import org.fb.objectrepo.LoginPageObject;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day4 extends BaseClass {
	
	@BeforeClass
	private void chromeOpen() {
		loadBrowser();
		maximizeBrowser();
		
	}
	
	@AfterClass
	private void chromeClose() {
		closeBrowser();
	}
	
	@BeforeMethod
	private void startTime() {
		launchUrl("https://www.facebook.com/");
		Date date = new Date();
		System.out.println(date);
	}
	
	@AfterMethod
	private void endTime() {
		System.out.println(new Date());
	}
	
	@Test(enabled = true, dataProvider = "facebook", dataProviderClass = Day44.class)
	private void tc1(String s1, String s2) throws InterruptedException {
		
		LoginPageObject l = new LoginPageObject();
		
		WebElement txtEmail = l.getTxtEmail();
		enterText(txtEmail, s1);
		
		WebElement txtPass = l.getTxtPass();
		enterText(txtPass, s2);
		
		WebElement btnLogin = l.getBtnLogin();
		clickElement(btnLogin);
		Thread.sleep(2000);
	}
	

}
