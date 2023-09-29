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

public class Day44444 extends BaseClass {
	
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
	
	@Test(groups = "Greens")
	private void tc1() throws InterruptedException {
		
		LoginPageObject l = new LoginPageObject();
		
		WebElement txtEmail = l.getTxtEmail();
		enterText(txtEmail, "Greens");
		
		WebElement txtPass = l.getTxtPass();
		enterText(txtPass, "Greens123");
		
		WebElement btnLogin = l.getBtnLogin();
		clickElement(btnLogin);
		Thread.sleep(2000);
	}
	
	@Test(enabled = true,priority = -2)
	private void tc3() {
		
		LoginPageObject l = new LoginPageObject();
		
		WebElement txtEmail = l.getTxtEmail();
		enterText(txtEmail, "GreensTech");
		
		WebElement txtPass = l.getTxtPass();
		enterText(txtPass, "GreensTech@123");
		
		WebElement btnLogin = l.getBtnLogin();
		clickElement(btnLogin);
	}
	
	@Test(enabled = true, groups = "Greens")
	private void tc2() {
		
		LoginPageObject l = new LoginPageObject();
		
		WebElement txtEmail = l.getTxtEmail();
		enterText(txtEmail, "Green");
		
		WebElement txtPass = l.getTxtPass();
		enterText(txtPass, "GreensTech");
		
		WebElement btnLogin = l.getBtnLogin();
		clickElement(btnLogin);
	}


}
