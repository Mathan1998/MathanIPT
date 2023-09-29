package org.demo;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sample2 extends BaseClass {
	public static void main(String[] args) {

		loadBrowser();
		maximizeBrowser();
		launchUrl("https://www.facebook.com/");

		WebElement Username = d.findElement(By.id("email"));

		String user = readDataFromExceel("sheet2", 3, 1);
		enterText(Username, user);

		WebElement Password = d.findElement(By.id("pass"));

		// String pass = readDataFromExceel("sheet2", 3, 3);
		enterText(Password, readDataFromExceel("sheet2", 3, 3));
	}

}
