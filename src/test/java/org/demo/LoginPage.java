package org.demo;

import org.base.BaseClass;
import org.fb.objectrepo.LoginPageObject;
import org.openqa.selenium.WebElement;

public class LoginPage extends BaseClass {
	public static void main(String[] args) {
		
		loadBrowser();
		launchUrl("https://www.facebook.com/");
		maximizeBrowser();
		
		LoginPageObject l = new LoginPageObject();
		
		WebElement txtEmail = l.getTxtEmail();
		//enterText(txtEmail, "mathan");
		
		enterText(txtEmail, 
				 readDataFromExceel("Sheet2", 3, 0));
		
		WebElement txtPass = l.getTxtPass();
		//enterText(txtPass, "raj");
		
		enterText(txtPass, 
				 readDataFromExceel("Sheet2", 4, 0));
		
		//d.navigate().refresh();
		
		//enterText(txtEmail, "santhosh");
		//enterText(txtPass, "Rk");
		
		//WebElement btnLogin = l.getBtnLogin();
		clickElement(l.getBtnLogin());
		
		
		System.out.println("Done");
		
		
	}
}
