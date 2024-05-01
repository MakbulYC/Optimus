package com.optimus.OptimusMavenProject;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class DeliveryManager {
	
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
	public void DeliveryTakeNewOrder() throws Exception {

		DeliveryManagerXPath delivery = new DeliveryManagerXPath(driver);
		
		Thread.sleep(5000);

		// Click on Menu
		delivery.uClickonmenu();

		// Click on Delivery manager
		delivery.uDeliveryManager();

		// Click on Add Order
		delivery.uClickonAddOrder();

		// Click on Add New Guest
		delivery.uClickonAddNewGuest();

		// Enter Guest name
		delivery.uEnterGuestname();

		// Enter Email
		delivery.uEnterEmail();

		// Enter Mobile number
		delivery.uEnterMobilenumber();

		// Enter Address
		delivery.uEnterAddress();

		// Click on Place Order button
		delivery.uClickonPlaceOrderbutton();

		// Add first Item
		delivery.uaddFirstItem();

		// Add Second Item
		delivery.uaddSecondItem();

		// Click on Save button
		delivery.uclickOnSave();
		Thread.sleep(5000);
		
		System.out.println("TestCase 02 = Test case for create a new order with single item");
	}

	@Test(priority = 3 )
	public void DeliveryRecallOrderAddItem() throws Exception {

		DeliveryManagerXPath delivery = new DeliveryManagerXPath(driver);

		// Click on Recall button on Order
		delivery.uclickOnRecallButton();

		// Add Third Item
		delivery.uaddThirdItem();

		// Add Fourth Item
		delivery.uaddFourthItem();

		// Click on Save button
		delivery.uclickOnSave();
		Thread.sleep(5000);
		
		System.out.println("TestCase 03 = Test case for Recall order and Add new Item");
	}

	@Test(priority = 4 )
	public void DeliveryRecallOrderVoidItem() throws Exception {


		DeliveryManagerXPath delivery = new DeliveryManagerXPath(driver);

		// Click on Recall button on Order
		delivery.uclickOnRecallButton();

		// Click On Void Item
		delivery.uclickOnVoidItem();

		// click On Void button
		delivery.uclickOnVoid();

		// Click On Reasons
		delivery.uClickOnReasons();

		// Click on Save button
		delivery.uclickOnSave();
		Thread.sleep(5000);
		
		System.out.println("TestCase 04 = Test case for Delete item in order");
	}

	@Test(priority = 5 )
	public void DeliverySettleOrder() throws Exception {

		DeliveryManagerXPath delivery = new DeliveryManagerXPath(driver);

//		// Click on Settle Button
//		delivery.uClickonSettleButton();
//
//		// click on Pay Button
//		delivery.uclickonPayButton();
//
//		// Click On OK Button
//		delivery.uclickOnOKButton();
		
		// Click on Recall button on Order
		delivery.uclickOnRecallButton();
		
		// Click on Quick pay button
		delivery.uclickOnPayButton();
		
//		// Click on Save button
//		delivery.uclickOnSave();
		Thread.sleep(5000);
		
		System.out.println("TestCase 05 = Test case for settle order ");
		
		
	}

	@Test(priority = 6 )
	public void DeliveryAssignDriver() throws Exception {

		DeliveryManagerXPath delivery = new DeliveryManagerXPath(driver);

		// Click On Assign Driver button
		delivery.uClickOnAssignDriverbutton();

		// Select Driver Option
		delivery.uSelectDriveroption();

		// Click on Dispatched Button
		delivery.uClickonDispatchedButton();

		// Select Dispatched section
		delivery.uSelectDispatchedsection();
		Thread.sleep(5000);
		
		System.out.println("TestCase 06 = Test case for assign driverr");
	}

	@Test(priority = 7 )
	public void DeliveryDispatchOrder() throws Exception {

		DeliveryManagerXPath delivery = new DeliveryManagerXPath(driver);

		// Click on Complete button
		delivery.uClickonCompletebutton();

		// Click on Completed Section
		delivery.uClickonCompletedSection();
		Thread.sleep(5000);
		
		System.out.println("TestCase 07 = Test case for Dispatch Order");
	}

	@Test(priority = 8 )
	public void DeliveryUndoAction() throws Exception {

		DeliveryManagerXPath delivery = new DeliveryManagerXPath(driver);

		// Click on Undo Button
		delivery.uClickonUndoButton();

		// Select Dispatched section
		delivery.uSelectDispatchedsection();

		// Click on Undo Button
		delivery.uClickonUndoButton();

		// Click on Prepare Section
		delivery.uClickonPrepareSection();
		Thread.sleep(5000);
		
		System.out.println("TestCase 08 = Test case for check the Undo button on complete ");
	}

	@Test(priority = 9 )
	public void DeliveryOperations() throws Exception {

		DeliveryManagerXPath delivery = new DeliveryManagerXPath(driver);

//		// Click On Assign Driver button
//		delivery.uClickOnAssignDriverbutton();
//
//		// Select Driver Option
//		delivery.uSelectDriveroption();

		// Click on Dispatched Button
		delivery.uClickonDispatchedButton();

		// Select Dispatched section
		delivery.uSelectDispatchedsection();

		// Click on Complete button
		delivery.uClickonCompletebutton();

		// Click on Completed Section
		delivery.uClickonCompletedSection();
		Thread.sleep(5000);
		
		System.out.println("TestCase 09 = Test case for complete the order that are uncompleted by Undo action");
		
	}

	@Test(priority = 10 )
	public void DeliverySettleOrderWithQuickPay() throws Exception {

		DeliveryManagerXPath delivery = new DeliveryManagerXPath(driver);

		// Click on Add Order
		delivery.uClickonAddOrder();

		// Click on Add New Guest
		delivery.uClickonAddNewGuest();

		// Enter Guest name
		delivery.uEnterGuestname();

		// Enter Email
		delivery.uEnterEmail();

		// Enter Mobile number
		delivery.uEnterMobilenumber();

		// Enter Address
		delivery.uEnterAddress();

		// Click on Place Order button
		delivery.uClickonPlaceOrderbutton();

		// Add first Item
		delivery.uaddFirstItem();

		// Add Second Item
		delivery.uaddSecondItem();

		// Click On Pay Button
		delivery.uclickOnPayButton();

//		// Click On Assign Driver button
//		delivery.uClickOnAssignDriverbutton();
//
//		// Select Driver Option
//		delivery.uSelectDriveroption();

		// Click on Dispatched Button
		delivery.uClickonDispatchedButton();

		// Select Dispatched section
		delivery.uSelectDispatchedsection();

		// Click on Complete button
		delivery.uClickonCompletebutton();

		// Click on Completed Section
		delivery.uClickonCompletedSection();
		Thread.sleep(5000);
		
		System.out.println("TestCase 10 = Test case for settle order with Quick pay");
	}

	@Test(priority = 11 )
	public void DeliveryVoidOrder() throws Exception {

		DeliveryManagerXPath delivery = new DeliveryManagerXPath(driver);

		// Click on Add Order
		delivery.uClickonAddOrder();

		// Click on Add New Guest
		delivery.uClickonAddNewGuest();

		// Enter Guest name
		delivery.uEnterGuestname();

		// Enter Email
		delivery.uEnterEmail();

		// Enter Mobile number
		delivery.uEnterMobilenumber();

		// Enter Address
		delivery.uEnterAddress();

		// Click on Place Order button
		delivery.uClickonPlaceOrderbutton();

		// Add first Item
		delivery.uaddFirstItem();

		// Add Second Item
		delivery.uaddSecondItem();

		// Click on Save button
		delivery.uclickOnSave();

		// Click on Void Button
		delivery.uClickonVoidButton();

		// Click On Void section
		delivery.uclickOnVoid();	

		// Click On Reasons
		delivery.uClickOnReasons();
		Thread.sleep(5000);
		
		System.out.println("TestCase 11 = Test case for void order");

	}

	@Test(priority = 12 )
	public void searchNumber() throws Exception {

		DeliveryManagerXPath delivery = new DeliveryManagerXPath(driver);

//		// Click on Menu
//		delivery.uClickonmenu();
//
//		// Click on Delivery manager
//		delivery.uDeliveryManager();

		// Click on Add Order
		delivery.uClickonAddOrder();

		// Enter Numbers in Search field
		delivery.uEnterNumbersinSearchfield();

		// Click on Result
		delivery.uClickonResult();

		// Click on Place Order button
		delivery.uClickonPlaceOrderbutton();

		// Add first Item
		delivery.uaddFirstItem();

		// Add Second Item
		delivery.uaddSecondItem();

		// Click On Pay Button
		delivery.uclickOnPayButton();

//		// Click On Assign Driver button
//		delivery.uClickOnAssignDriverbutton();
//
//		// Select Driver Option
//		delivery.uSelectDriveroption();

		// Click on Dispatched Button
		delivery.uClickonDispatchedButton();

		// Select Dispatched section
		delivery.uSelectDispatchedsection();

		// Click on Complete button
		delivery.uClickonCompletebutton();

		// Click on Completed Section
		delivery.uClickonCompletedSection();
		
		System.out.println("TestCase 12 = Test case for search number and then create a new order with that number");
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
