package com.optimus.OptimusMavenProject;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class NoCharge {
	
	static WebDriver driver;
	
	@Test(priority = 1)
	public void loginwithValidUser() throws Exception {

		 

		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.setHeadless(false);
		options.addArguments("start-maximized"); // open Browser in maximized mode
		options.addArguments("disable-infobars"); // disabling infobars
		options.addArguments("--disable-extensions"); // disabling extensions
		options.addArguments("--disable-gpu"); // applicable to Windows os only
		options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
		options.addArguments("--no-sandbox"); // Bypass OS security model
		options.addArguments("--disable-in-process-stack-traces");
		options.addArguments("--disable-logging");
		options.addArguments("--log-level=3");
		options.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(options);

		driver.get("https://app.ipos247.com/app2/#/");

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		// Creating object for login page
		Pages login = new Pages(driver);

		// Enter User name
		login.enterUsername("makbul");

		// Enter Password
		login.enterPassword("makbul123");

		// Enter Hotel Code
		login.enterHotelCode("14607");

		// Click on Login button
		login.LoginButton();

		// Click on Outlet
		login.clickonOutlet();

		// Select Outlet
		login.selectOutlet();

		// Get me in button
		login.ugetmeinbutton();
		
		System.out.println("TestCase 01 = Test case for login with valid user");
	}
	
	@Test(priority = 2 )
	public void NoChargeTakeOrderOrder() throws Exception {

		NoChargeXPath nocharge = new NoChargeXPath(driver);

		// Click on Menu
		nocharge.uClickonmenu();

		// Click on No Charge
		nocharge.uNoCharge();

		// Click on Account
		nocharge.uClickonAccount();

		// Select Account
		nocharge.uSelectAccount();

		// click On Save
		nocharge.uClickonSavebutton();

		// Add First Item
		nocharge.uaddFirstItem();

		// click On Save
		nocharge.uclickOnSave();

		// click On Yes
		nocharge.uclickOnYes();
		Thread.sleep(5000);
		
		System.out.println("TestCase 02 = Test case for create new order and settle that order through No Charge");
	}

	@Test(priority = 3 )
	public void NoChargeWithGuestInformation() throws Exception {

		NoChargeXPath nocharge = new NoChargeXPath(driver);

		// Click on Menu
		nocharge.uClickonmenuinOrderSummary();

		// Click on No Charge
		nocharge.uNoCharge();

		// Click on Account
		nocharge.uClickonAccount();

		// Select Account
		nocharge.uSelectAccount();

		// Enter Guest name
		nocharge.uEnterGuestname();

		// Enter Email
		nocharge.uEnterEmail();

		// Enter Mobile No
		nocharge.uEnterMobileNo();

//		// Enter Address
//		nocharge.uEnterAddress();

		// click On Save
		nocharge.uClickonSavebutton();

		// Add First Item
		nocharge.uaddFirstItem();

		// click On Save
		nocharge.uclickOnSave();

		// click On Yes
		nocharge.uclickOnYes();
		Thread.sleep(5000);

		System.out.println("TestCase 03 = Check with add guest information and then check that details on guest information");
	}

	@Test(priority = 4 )
	public void CheckValidationOnAccoutnField() throws Exception {

		NoChargeXPath nocharge = new NoChargeXPath(driver);

		// Click on Menu
		nocharge.uClickonmenuinOrderSummary();

		// Click on No Charge
		nocharge.uNoCharge();

		// click On Save
		nocharge.uClickonSavebutton();

		// Click on Cancel icon in No charge popup
		nocharge.uClickonCancelIconbutton();
		Thread.sleep(5000);

		System.out.println("TestCase 04 = Check validation where the user not select any account and directly click on the Save button");
	}

	@Test(priority = 5 )
	public void NoChargeRecallOrderIncreaseQTY() throws Exception {

		NoChargeXPath nocharge = new NoChargeXPath(driver);

		// Click on Settled Section
		nocharge.uClickonSettledSection();

		// Select Order
		nocharge.uSelectOrder();

		// Click on Recall Button
		nocharge.uClickonRecallButton();

		// click On Plus on QTY
		nocharge.uclickOnPlusonQTY();

		// click On Save
		nocharge.uclickOnSave();
		Thread.sleep(5000);

		System.out.println("TestCase 05 = Test case for recall order and increase QTY");
	}

	@Test(priority = 6 )
	public void NoChargeRecallOrderAddItem() throws Exception {

		NoChargeXPath nocharge = new NoChargeXPath(driver);

		// Click on Settled Section
		nocharge.uClickonSettledSection();

		// Select Order
		nocharge.uSelectOrder();

		// Click on Recall Button
		nocharge.uClickonRecallButton();

		// Add Second Item
		nocharge.uaddSecondItem();

		// click On Save
		nocharge.uclickOnSave();
		Thread.sleep(5000);

		System.out.println("TestCase 06 = Test case for add new item in order");
	}

	@Test(priority = 7 )
	public void NoChargeVoidItem() throws Exception {

		NoChargeXPath nocharge = new NoChargeXPath(driver);

		// Click on Settled Section
		nocharge.uClickonSettledSection();

		// Select Order
		nocharge.uSelectOrder();

		// Click on Recall Button
		nocharge.uClickonRecallButton();

		// click On Void Item
		nocharge.uclickOnVoidItem();

		// click On Void
		nocharge.uclickOnVoid();

		// Click On Reasons
		nocharge.uClickOnReasons();

		// click On Save
		nocharge.uclickOnSave();
		Thread.sleep(5000);

		System.out.println("TestCase 07 = Test case for void item");
	}

	@Test(priority = 8 )
	public void NoChargeDailyLimit() throws Exception {

		NoChargeXPath nocharge = new NoChargeXPath(driver);

		// Click on Menu
		nocharge.uClickonmenuinOrderSummary();

		// Click on No Charge
		nocharge.uNoCharge();

		// Click on Account
		nocharge.uClickonAccount();

		// Select Account
		nocharge.uDailyLimitAccount();

		// Enter Guest name
		nocharge.uEnterGuestName1();

		// Enter Email
		nocharge.uEnterEmailName1();

		// Enter Mobile No
		nocharge.uEnterMobileNumber1();

//		// Enter Address
//		nocharge.uEnterAddress();

		// click On Save
		nocharge.uClickonSavebutton();

		// Add First Item
		nocharge.uaddFirstItem();

		// Click on QTY
		nocharge.uclickonQTY();

		// Click on 2
		nocharge.uclickon2();

		// Click on 0
		nocharge.uclickon0();

		// Click on Enter
		nocharge.uclickonEnter();

		// click On Save
		nocharge.uclickOnSave();

		// Click on Continue
		nocharge.uClickonContinueButton();

		// Click on Yes Button
		nocharge.uClickonYesButton();
//		
//		// click On Save
//		nocharge.uclickOnSave();
		Thread.sleep(5000);

		System.out.println("TestCase 08 = Test case for check daily limit ");

	}

	@Test(priority = 9 )
	public void NoChargeMonthlyLimit() throws Exception {

		NoChargeXPath nocharge = new NoChargeXPath(driver);

		// Click on Menu
		nocharge.uClickonmenuinOrderSummary();

		// Click on No Charge
		nocharge.uNoCharge();

		// Click on Account
		nocharge.uClickonAccount();

		// Select Account
		nocharge.uSelectMonthlyAccount();

		// Enter Guest name
		nocharge.uEnterGuestName1();

		// Enter Email
		nocharge.uEnterEmailName1();

		// Enter Mobile No
		nocharge.uEnterMobileNumber1();

//		// Enter Address
//		nocharge.uEnterAddress();

		// click On Save
		nocharge.uClickonSavebutton();

		// Add First Item
		nocharge.uaddFirstItem();

		// Click on QTY
		nocharge.uclickonQTY();

		// Click on 2
		nocharge.uclickon2();

		// Click On 00
		nocharge.uclickOn00();

		// Click on Enter
		nocharge.uclickonEnter();

		// click On Save
		nocharge.uclickOnSave();

		// Click on Continue
		nocharge.uClickonContinueButton();

		// Click on Yes Button
		nocharge.uClickonYesButton();
		Thread.sleep(5000);

		System.out.println("TestCase 09 = Test case for check with monthly limit");
	}

	@Test(priority = 10 )
	public void NoChargewithPin() throws Exception {

		NoChargeXPath nocharge = new NoChargeXPath(driver);

		// Click on Menu
		nocharge.uClickonmenuinOrderSummary();

		// Click on No Charge
		nocharge.uNoCharge();

		// Click on Account
		nocharge.uClickonAccount();

		// Select Account
		nocharge.uSelectuserwithPin();

		// Enter Guest name
		nocharge.uEnterGuestName1();

		// Enter Email
		nocharge.uEnterEmailName1();

		// Enter Mobile No
		nocharge.uEnterMobileNumber1();

//		// Enter Address
//		nocharge.uEnterAddress();

		// click On Save
		nocharge.uClickonSavebutton();

		// Add First Item
		nocharge.uaddFirstItem();

		// click On Save
		nocharge.uclickOnSave();

		// Enter Pin
		nocharge.uEnterPin();

		// Click on Save button
		nocharge.uClickonSavebutton();

		// click On Yes
		nocharge.uclickOnYes();
		Thread.sleep(5000);

		System.out.println("TestCase 10 = Check with enter correct PIN and then save order");
	}

	@Test(priority = 11 )
	public void NoChargewithInvalidPin() throws Exception {

		NoChargeXPath nocharge = new NoChargeXPath(driver);

		// Click on Menu
		nocharge.uClickonmenuinOrderSummary();

		// Click on No Charge
		nocharge.uNoCharge();

		// Click on Account
		nocharge.uClickonAccount();

		// Select Account
		nocharge.uSelectuserwithPin();

		// Enter Guest name
		nocharge.uEnterGuestName1();

		// Enter Email
		nocharge.uEnterEmailName1();

		// Enter Mobile No
		nocharge.uEnterMobileNumber1();

//		// Enter Address
//		nocharge.uEnterAddress();

		// click On Save
		nocharge.uClickonSavebutton();

		// Add First Item
		nocharge.uaddFirstItem();

		// click On Save
		nocharge.uclickOnSave();

		// Enter Pin
		nocharge.uEnterInvalidPin();

		// click On Save
		nocharge.uClickonSavebutton();

		// click On Save
		nocharge.uclickOnSave();

		// Enter Pin
		nocharge.uEnterPin();

		// Click on Save button
		nocharge.uClickonSavebutton();

		// click On Yes
		nocharge.uclickOnYes();
		Thread.sleep(5000);

		System.out.println("TestCase 11 = Check with enter the incorrect PIN and then try to save the order");
	}

	@Test(priority = 12 )
	public void NoChargewithUserChange() throws Exception {

		NoChargeXPath nocharge = new NoChargeXPath(driver);

		// Click on Menu
		nocharge.uClickonmenuinOrderSummary();

		// Click on No Charge
		nocharge.uNoCharge();

		// Click on Account
		nocharge.uClickonAccount();

		// Select Account
		nocharge.uSelectAccount();

		// Enter Guest name
		nocharge.uEnterGuestName1();

		// Enter Email
		nocharge.uEnterEmailName1();

		// Enter Mobile No
		nocharge.uEnterMobileNumber1();

//		// Enter Address
//		nocharge.uEnterAddress();

		// click On Save
		nocharge.uClickonSavebutton();

		// Click on Order Section
		nocharge.uClickonOrderSection();

		// Click on Account for Update
		nocharge.uClickonAccountforUpdate();

		// Select Other Account
		nocharge.uSelectOtherAccount();

		// Click on Update Button
		nocharge.uClickonUpdateButton();

		// Add First Item
		nocharge.uaddFirstItem();

		// click On Save
		nocharge.uclickOnSave();

		// Click on Yes Button
		nocharge.uClickonYesButton();
//		
//		// click On Yes
//		nocharge.uclickOnYes();
		Thread.sleep(5000);

		System.out.println("TestCase 12 = Test case for change the user account after recall order");
	}

	@Test(priority = 13 )
	public void NoChargewithDineIn() throws Exception {

		NoChargeXPath nocharge = new NoChargeXPath(driver);

//		// Click on Menu
//		nocharge.uClickonmenu();
//
//		// Click on Order Summary
//		nocharge.uClickonOrderSummary();

		// Click on Menu
		nocharge.uClickonmenuinOrderSummary();

		// Click on No Charge
		nocharge.uDienIn();

		// Click on Plus icon
		nocharge.uclickonPlus();

		// Click on Save button
		nocharge.uclickonSaveButton();

		// Click on Item
		nocharge.uclickonItem();

		// Click on Course
		nocharge.uselectCourse();

		// Click on Finish Button
		nocharge.uclickonFinishButton();

		// Click on No Charge Button
		nocharge.uClickonNoChargeButton();

		// Click on Yes Button in Mark as no Charge popup
		nocharge.uClickonYesButton();

		// Select No Charge Account
		nocharge.uSelectNoChargeAccount();

		// click On Yes
		nocharge.uclickOnYes();
		Thread.sleep(5000);

		System.out.println("TestCase 13 = Test case for settle order through No charge in Dine in");
	}

	@Test(priority = 14 )
	public void NoChargewithTakeAway() throws Exception {

		NoChargeXPath nocharge = new NoChargeXPath(driver);

		// Click on Menu
		nocharge.uClickonMenuinDineIn();

		// Click on Take Away
		nocharge.uClickonTakeAway();

		// Click on Item
		nocharge.uclickonItem();

		// Click on No Charge Button
		nocharge.uClickonNoChargeButton();

		// Click on Yes Button in Mark as no Charge popup
		nocharge.uClickonYesButton();

		// Select No Charge Account
		nocharge.uSelectNoChargeAccount();

		// click On Yes
		nocharge.uclickOnYes();
		Thread.sleep(5000);

		System.out.println("TestCase 14 = Test case for settle order through No charge in Take Away");
	}

	@Test(priority = 15 )
	public void NoChargewithRoomPosting() throws Exception {

		NoChargeXPath nocharge = new NoChargeXPath(driver);

		// Click on Menu
		nocharge.uClickonmenuinOrderSummary();

		// Click on Room Service
		nocharge.uClickonRoomService();

		// Click on Plus icon
		nocharge.uClickonRoom();

		// Click on Save button
		nocharge.uclickonSaveButton();

		// Click on Item
		nocharge.uaddFirstItem();

		// Click on No Charge Button
		nocharge.uClickonNoChargeButton();

		// Click on Yes Button in Mark as no Charge popup
		nocharge.uClickonYesButton();

		// Select No Charge Account
		nocharge.uSelectNoChargeAccount();

		// click On Yes
		nocharge.uclickOnYes();
		Thread.sleep(5000);

		System.out.println("TestCase 15 = Test case for settle order through No charge in Room Posting");
	}

	@Test(priority = 16 )
	public void NoChargewithDeliveryManager() throws Exception {

		NoChargeXPath nocharge = new NoChargeXPath(driver);

		// Click on Menu
		nocharge.uClickonmenuinRoomService();

		// Delivery Manager
		nocharge.uDeliveryManager();

		// Click on Add Order
		nocharge.uClickonAddOrder();

		// Click on Add New Guest
		nocharge.uClickonAddNewGuest();

		// Enter Guest name
		nocharge.uEnterGuestname1();

		// Enter Email
		nocharge.uEnterEmail1();

		// Enter Mobile number
		nocharge.uEnterMobilenumber();

		// Enter Address
		nocharge.uEnterAddress1();

		// Click on Place Order button
		nocharge.uClickonPlaceOrderbutton();

		// Add first Item
		nocharge.uaddFirstItem();

		// Add Second Item
		nocharge.uaddSecondItem();

		// Click on No Charge Button
		nocharge.uClickonNoChargeButton();

		// Click on Yes Button in Mark as no Charge popup
		nocharge.uClickonYesButton();

		// Select No Charge Account
		nocharge.uSelectNoChargeAccount();

		// click On Yes
		nocharge.uclickOnYes();
		Thread.sleep(5000);

		System.out.println("TestCase 16 = Test case for settle order through No charge in Delivery Manager");
		
		driver.close();
	}	

}
