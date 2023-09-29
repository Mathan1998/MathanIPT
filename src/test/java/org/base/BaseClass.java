package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver d;
	public static Actions a;
	public static Robot r;
	public static Alert at;
	public static JavascriptExecutor js;
	public static TakesScreenshot ts;

	public static FileInputStream fr;
	public static Workbook w;

	public static FileOutputStream fo;

	// 1. Load Browser
	public static void loadBrowser() {

		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
	}

	// 2. LaunchUrl
	public static void launchUrl(String url) {
		d.get(url);
	}

	// 3. Maximize Browser
	public static void maximizeBrowser() {
		d.manage().window().maximize();
	}

	// 4. Close Browser
	public static void closeBrowser() {
		d.close();
	}

	// 5. Thread.Sleep
	public static void PauseExecution(long milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 6. SendKeys
	public static void enterText(WebElement element, String text) {
		element.sendKeys(text);
	}

	// 7. Click
	public static void clickElement(WebElement element) {
		element.click();
	}

	// 8. get Title
	public static String getCurrentPageTitle() {
		return d.getTitle();
	}

	// 9. get CurrentUrl
	public static String getCurrentPageUrl() {
		return d.getCurrentUrl();
	}

	// Action
	// 10. Move to Element
	public static void moveToAction(WebElement element) {
		a = new Actions(d);
		a.moveToElement(element).perform();
	}

	// 11. Drag & Drop
	public static void dragDropAction(WebElement src, WebElement dest) {
		a.dragAndDrop(src, dest).perform();
	}

	// 12. DoubleClick
	public static void doubleClickAction(WebElement element) {
		a.doubleClick(element).perform();
	}

	// 13. ContextClick
	public static void contextClickAction(WebElement element) {
		a.contextClick(element).perform();
	}

	// Robot
	// 14. Key Press
	public static void pressKey(int key) {
		try {
			r = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		r.keyPress(key);
	}

	// 15. Key Release
	public static void releaseKey(int key) {
		r.keyRelease(key);
	}

	// Alert
	// 16. Accept
	public static void acceptAlert() {
		at = d.switchTo().alert();
		at.accept();
	}

	// 17. Dismiss
	public static void dismisAlert() {
		at.dismiss();
	}

	// 18. Send key
	public static void sendKeyAlert(String text) {
		at.sendKeys(text);
	}

	// 19. getText
	public static String gettextAlert() {
		return at.getText();
	}

	// JavaScript Executor
	// 20. send key
	public static void sendValue(WebElement element, String txt) {
		js = (JavascriptExecutor) d;

		js.executeScript("arguments[0].setAttribute('value','txt')", element);
	}

	// 21. get Value
	public static Object getValue(WebElement element) {
		return js.executeScript("return arguments[0].getAttribute('value')", element);
	}

	// 22. clicks
	public static void clicks(WebElement element) {
		js.executeScript("arguments[0].click()", element);
	}

	// 23. scrollDowns
	public static void scrollDowns(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	// 24. scrollUps
	public static void scrollUps(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}

	// 25. Take Screenshot
	public static void takeScrnShot(String path) {
		ts = (TakesScreenshot) d;

		File Sor = ts.getScreenshotAs(OutputType.FILE);
		File Des = new File(path);
		try {
			FileUtils.copyFile(Sor, Des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Windows Handling
	// 26. Parent Window
	public static String parntWindow() {
		String parentId = d.getWindowHandle();
		return parentId;
	}

	// 27.Windows Id
	public static void ID(String WindowsId) {
		d.switchTo().window(WindowsId);
	}

	// Frame
	// 28. name frame
	public static void nameFrame(String name) {
		d.switchTo().frame(name);
	}

	// 29. id frame
	public static void idFrame(String id) {
		d.switchTo().frame(id);
	}

	// 30. index frame
	public static void indexFrame(int index) {
		d.switchTo().frame(index);
	}

	// 31. parent frame
	public static void parntFrame() {
		d.switchTo().parentFrame();
	}

	// 32. default frame
	public static void defaultContxtFrame() {
		d.switchTo().defaultContent();
	}

	// 33. web element frame
	public static void elementFrame(WebElement element) {
		d.switchTo().frame(element);
	}

	// Visibility Check
	// 34. is enable
	public static boolean enable(WebElement element) {
		return element.isEnabled();
	}

	// 35. is display
	public static boolean display(WebElement element) {
		return element.isDisplayed();
	}

	// 36. is select
	public static boolean select(WebElement element) {
		return element.isSelected();
	}

	// Navigation
	// 37. forward
	public static void forwardNavi() {
		d.navigate().forward();
	}

	// 38. backward
	public static void backwardNavi() {
		d.navigate().back();
	}

	// 39. refresh
	public static void refreshNavi() {
		d.navigate().refresh();
	}

	// 40. Minimize Browser
	public static void miniMizeBrowser() {
		d.manage().window().minimize();
	}

	// 41. Quite Browser
	public static void quitBrowser() {
		d.quit();
	}

	// Read from Excel
	public static String readDataFromExceel(String name, int rowNo, int cellNo) {

		File f = new File("C:\\Users\\MATHAN RAJ K\\eclipse-workspace" + "\\Frame\\ExcelFile\\TextData.xlsx");

		try {
			fr = new FileInputStream(f);
		} catch (FileNotFoundException e) {
		}

		try {
			w = new XSSFWorkbook(fr);
		} catch (IOException e) {
		}

		Sheet sheet = w.getSheet(name);

		Row row = sheet.getRow(rowNo);

		Cell cell = row.getCell(cellNo);

		int cellType = cell.getCellType();

		String value = "";
		if (cellType == 1) {
			value = cell.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(cell)) {
			Date date = cell.getDateCellValue();

			SimpleDateFormat s = new SimpleDateFormat("dd, MMMM, yyyy");
			value = s.format(date);
		} else {
			double d = cell.getNumericCellValue();

			long l = (long) d;

			value = String.valueOf(l);
		}

		return value;

	}

	// Write From Excel

	public static void writeExcel(String filename, String sheetName, int newRow, int newCell, String value) {

		File f = new File("C:\\Users\\MATHAN RAJ K\\eclipse-workspace\\Frame\\ExcelFile\\" + filename + ".xlsx");

		Workbook w = new XSSFWorkbook();

		Sheet s = w.createSheet(sheetName);

		Row r = s.createRow(newRow);

		Cell c = r.createCell(newCell);

		c.setCellValue(value);

		try {
			fo = new FileOutputStream(f);
		} catch (FileNotFoundException e) {
		}

		try {
			w.write(fo);
		} catch (IOException e) {
		}

		System.out.println("Done");

	}

	// Create Row only

	public static void createRowOnly(String filename, String sheetName, int newRow, int newCell, String value) {

		File f = new File("C:\\Users\\MATHAN RAJ K\\eclipse-workspace\\Frame\\ExcelFile\\" + filename + ".xlsx");

		try {
			fr = new FileInputStream(f);
		} catch (FileNotFoundException e) {
		}

		try {
			w = new XSSFWorkbook(fr);
		} catch (IOException e) {
		}

		Sheet s = w.getSheet(sheetName);

		Row r = s.createRow(newRow);

		Cell c = r.createCell(newCell);

		c.setCellValue(value);

		try {
			fo = new FileOutputStream(f);
		} catch (FileNotFoundException e) {
		}

		try {
			w.write(fo);
		} catch (IOException e) {
		}

		System.out.println("Done");

	}

	// Create cell only

	public static void createCellOnly(String filename, String sheetName, int newRow, int newCell, String value) {

		File f = new File("C:\\Users\\MATHAN RAJ K\\eclipse-workspace\\Frame\\ExcelFile\\" + filename + ".xlsx");

		try {
			fr = new FileInputStream(f);
		} catch (FileNotFoundException e) {
		}

		try {
			w = new XSSFWorkbook(fr);
		} catch (IOException e) {
		}

		Sheet s = w.getSheet(sheetName);

		Row r = s.getRow(newRow);

		Cell c = r.createCell(newCell);

		c.setCellValue(value);

		try {
			fo = new FileOutputStream(f);
		} catch (FileNotFoundException e) {
		}

		try {
			w.write(fo);
		} catch (IOException e) {
		}

		System.out.println("Done");

	}

	

}
