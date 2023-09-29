package org.testng;

import java.util.Date;

import org.base.BaseClass;
import org.fb.objectrepo.LoginPageObject;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day333 extends BaseClass {
	
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
	
	@Parameters({"frui","food"})
	@Test
	private void tc1(@Optional("Hello") String s1,@Optional("Hello@123") String s2) throws InterruptedException {
		
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
