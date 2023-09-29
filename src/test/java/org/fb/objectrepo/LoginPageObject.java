package org.fb.objectrepo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject extends BaseClass {
	
	public LoginPageObject() {
		PageFactory.initElements(d, this);
	}
	
	//@FindBy(id="email")
	//private WebElement txtEmail;
	
	@CacheLookup
	@FindBys({
		@FindBy(id="email"),
		@FindBy(xpath="//input[@placeholder"
				+ "='Email address or phone number']"),
		@FindBy(xpath="//input[@name='email']")
	})
	private WebElement txtEmail;
	
	@CacheLookup
	@FindBy(id="pass")
	private WebElement txtPass;
	
	//@FindBy(xpath="//button[text()='Log in']")
	//private WebElement btnLogin;
	
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//button[text()='Log in']"),
		@FindBy(xpath="//button[@value='']")
		
	})
	private WebElement btnLogin;
	
	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	
	

}
