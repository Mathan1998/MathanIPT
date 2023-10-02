package org.testng;

import java.io.IOException;

import org.base.BaseClass;
import org.fb.objectrepo.LoginPageObject;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AdactinTestNgTask extends BaseClass {
	public static LoginPageObject e;
	@BeforeClass
	public void beforeclass() {
		loadBrowser();
		launchUrl("https://adactinhotelapp.com/");
		maximizeBrowser();
	}
	@BeforeMethod
	public void beforeTest() {
	dateAndTime();
	}
	@Test(priority=-1)
	public void loginData() throws IOException{
		//for LoginPage
		writeExcel("AdactinLogin", "login", 5, 5, "login");
		createRowOnly("AdactinLogin", "login", 0, 0, "UserName");
		createCellOnly("AdactinLogin", "login", 0, 1, "Password");
		
		createRowOnly("AdactinLogin", "login", 1, 0, "mathan123");
		createCellOnly("AdactinLogin", "login", 1, 1, "mathan@0123");
	}
@Test(priority=0)
public void loginPage() {
	 
	e = new LoginPageObject();
    enterText(e.getFirstName(), readDataFromExcel("AdactinLogin", "login", 1, 0));
    enterText(e.getClass(), readDataFromExcel("AdactinLogin", "login", 1, 1));
    btnClick(e.getBtnLogin());	
    System.out.println("Login completed successfully");
}

private void enterText(Class<? extends LoginPageObject> class1, String readDataFromExcel) {
	// TODO Auto-generated method stub
	
}
private void btnClick(WebElement btnLogin) {
	// TODO Auto-generated method stub
	
}
private String readDataFromExcel(String string, String string2, int i, int j) {
	// TODO Auto-generated method stub
	return null;
}
@Parameters({"location","hotels","roomType","noOfRoom","checkIn","checkOut","adultPer","childPer"})
@Test(priority=1)
 void booking(String location, String hotels, String roomType, String noOfRoom, String checkIn, String checkOut, String adultPer, String childPer) throws InterruptedException  
{
 Thread.sleep(3000);
	e = new LoginPageObject();
	selByTxt(e.getLocation(),location);
    selByTxt(e.getHotels(), hotels);
	selByTxt(e.getRoomType(), roomType);
	selByTxt(e.getNoOfRooms(), noOfRoom);
	enterText(e.getCheckInDate(), checkIn);
	enterText(e.getCheckInDate(), checkOut);
	selByTxt(e.getAdultsPerRoom(), adultPer);
	selByTxt(e.getChildrenPerRoom(), childPer);
	btnClick(e.getBtnSearch());

}
private void selByTxt(WebElement location, String location2) {
	// TODO Auto-generated method stub
	
}
@Test(priority=2)
public void searchHotel() throws InterruptedException {
	//Search Hotel Page
	Thread.sleep(2000);
	e = new LoginPageObject();
			btnClick(e.getRadioBtn());
			btnClick(e.getContinueBtn());
}
@Test(priority=3,dataProvider="finalData")
public void finalDataHotel(String fName,String lName,String add,String num,String cName,String mon,String year,String cvv) {
	//Search Hotel Page
	e = new LoginPageObject();
	enterText(e.getFirstName(), fName);
	enterText(e.getLastName(), lName);
	enterText(e.getAddress(), add);
	enterText(e.getCcNum(), num);
	selByTxt(e.getCcType(), cName);
	selByTxt(e.getCcExpMonth(), mon);
	selByTxt(e.getCcExpYear(), year);
	enterText(e.getCcCvv(), cvv);
	btnClick(e.getBookNowBtn());
}
@DataProvider(name="finalData")
private String[][] data() {
	return new String[][]	
			{
	{"Mathan","Raj","Mayiladuthurai,Tamilnadu","76454382999292374","visa","November","2028","234"},
	{"mathan","raj","Mayiladuthurai,Tamilnadu","84767484893939939","visa","November","2028","234"}
	};
}

@Test(priority=4)
public void confirmHotel() throws Throwable {
	
	//Booking Confirmation
			Thread.sleep(5000);
			 e = new LoginPageObject();
			String attribute = retriveAttribute(e.getOrderNo(), "value");
			System.out.println("Order Id id "+attribute);
			}
private String retriveAttribute(WebElement orderNo, String string) {
	// TODO Auto-generated method stub
	return null;
}
@AfterMethod
public void afterTest() {
dateAndTime();
}
private void dateAndTime() {
	// TODO Auto-generated method stub
	
}
@AfterClass
public void afterClass() {
System.out.println("Order ID Generated");
} 
}

