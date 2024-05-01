package com.optimus.OptimusMavenProject;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class OrderSummary {
	
	public static WebDriver driver;
	
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
		Thread.sleep(5000);
		
		System.out.println("TestCase 01 = Test case for login with valid user");
	}
	
	@Test(priority = 2 )
	public void AddOrder() throws Exception {


		OrderSummaryXPath orderSummary = new OrderSummaryXPath(driver);
		
		// Click On Order Notification
		orderSummary.uclickOnOrderNotification();

		// Click on Menu
		orderSummary.uClickonmenu();

		// Click on Take Away options
		orderSummary.uClickonTakeAway();

		// Click on Item
		orderSummary.uclickonItem();

		// Click on Save button
		orderSummary.uclickOnSave();

		// Click on Cancel Button
		orderSummary.uclickOnCancel();
		Thread.sleep(5000);
		
		System.out.println("TestCase 02 = Test case for Check the take order with Single item");
	}

	@Test(priority = 3 )
	public void OrderSummaryRecall() throws Exception {

		OrderSummaryXPath orderSummary = new OrderSummaryXPath(driver);

		// Select Order
		orderSummary.uselectOrder();

		// Click On Recall Button
		orderSummary.uclickOnRecallButton();

		// Increase the QTY of Item
		orderSummary.uFirstItemIncrease();

		// Click on Save button
		orderSummary.uclickOnSave();
		Thread.sleep(5000);
		
		System.out.println("TestCase 03 = Test case for recall order and increase QTY");
	}

	@Test(priority = 4 )
	public void OrderSplitOrder() throws Exception {

		OrderSummaryXPath orderSummary = new OrderSummaryXPath(driver);

		// Select Order
		orderSummary.uselectOrder();

		// Click on Split button in Order Summary
		orderSummary.uclickOnSplitButtoninOrderSummary();

		// Click on Split Button
		orderSummary.uClickonSplitButton();

		// Click on Split Type
		orderSummary.uClickonSplitByEqually();

		// Click on Split Type 2
		orderSummary.uClickonSplitBy2();
		Thread.sleep(5000);
		
		System.out.println("TestCase 04 = Test case for split the order through Split by Equally");
	}

	@Test(priority = 5 )
	public void OrderSummaryMergeOrder() throws Exception {

		OrderSummaryXPath orderSummary = new OrderSummaryXPath(driver);

		// Select Order
		orderSummary.uselectOrder();

		// Select 2nd Order
		orderSummary.uselectSecondOrder();

		// Click On merge Button in order Summary
		orderSummary.uclickOnMergeButtoninOrderSummary();

		// Click on Merge Button
		orderSummary.uclickonMergeButton();

		// Select Parent Orders
		orderSummary.uselectParentOrders();
		Thread.sleep(5000);
		
		System.out.println("TestCase 05 = Test case for Merge Two orders in order summary");
	}

	@Test(priority = 6 )
	public void OrderSummarySplitOrderbyQTY() throws Exception {

		OrderSummaryXPath orderSummary = new OrderSummaryXPath(driver);

		// Select Order
		orderSummary.uselectOrder();

		// Click on Split button in Order Summary
		orderSummary.uclickOnSplitButtoninOrderSummary();

		// Click on Split Button
		orderSummary.uClickonSplitButton();

		// Click on Split By Quantity
		orderSummary.uClickonSplitByQuantity();

		// Select Item in Split
		orderSummary.uselectIteminSplit();

		// Click On QTY
		orderSummary.uclickOnQTY();

		// Select QTY
		orderSummary.uselectQTY();

		// Click On Move To Right Button
		orderSummary.uclickOnMoveToRightButton();

		// Click On Save Button
		orderSummary.uclickOnSaveButton();
		Thread.sleep(5000);
		
		System.out.println("TestCase 06 = Add new order and the split that order through split by Quantity");
	}

	@Test(priority = 7 )
	public void OrderSummaryMergeOrder1() throws Exception {

		OrderSummaryXPath orderSummary = new OrderSummaryXPath(driver);

		// Select Order
		orderSummary.uselectOrder();

		// Select 2nd Order
		orderSummary.uselectSecondOrder();

		// Click On merge Button in order Summary
		orderSummary.uclickOnMergeButtoninOrderSummary();

		// Click on Merge Button
		orderSummary.uclickonMergeButton();

		// Select Parent Orders
		orderSummary.uselectParentOrders();
		Thread.sleep(5000);
		
		System.out.println("TestCase 07 = Test case for Merge Two orders in order summary");
	}

	@Test(priority = 8 )
	public void OrderSummarySplitOrderbyCategory() throws Exception {

		OrderSummaryXPath orderSummary = new OrderSummaryXPath(driver);

		// Select Order
		orderSummary.uselectOrder();

		// Click On Recall Button
		orderSummary.uclickOnRecallButton();

		// Click on Menu
		orderSummary.uclickOnSubmenu();

		// Select Item in other menu
		orderSummary.uselectItemOnSubmenu();

		// Click on Save button
		orderSummary.uclickOnSave();

		// Select Order
		orderSummary.uselectOrder();

		// Click on Split button in Order Summary
		orderSummary.uclickOnSplitButtoninOrderSummary();

		// Click on Split Button
		orderSummary.uClickonSplitButton();

		// Click on Split By Category
		orderSummary.uClickonSplitByCategory();

		// Select Item in Split
		orderSummary.uselectIteminSplit();

		// Click On QTY
		orderSummary.uclickOnQTY();

		// Select QTY
		orderSummary.uselectQTY();

		// Click On Move To Right Button
		orderSummary.uclickOnMoveToRightButton();

		// Click On Save Button
		orderSummary.uclickOnSaveButton();

//		// Update QTY Of Item
//		orderSummary.uUpdateQTYOfItem();
//		
//		// Select Second Item in Split
//		orderSummary.uselectSecondIteminSplit();
//		
//		// Click On 2 QTY
//		orderSummary.uclickOn2QTY();
//		
//		// Select 2 QTY
//		orderSummary.uselect2QTY();
//		
//		// Click On Move To Left Button
//		orderSummary.uclickOnMoveToLeftButton();

//		// Click On Save Button
//		orderSummary.uclickOnSaveButton();
		Thread.sleep(5000);
		
		System.out.println("TestCase 08 = Test case for Add new order and then split that order through split by Category");
	}

	@Test(priority = 9 )
	public void OrderSummaryVoidOrder() throws Exception {

		OrderSummaryXPath orderSummary = new OrderSummaryXPath(driver);

		// Select Order
		orderSummary.uselectOrder();

		// Click on Void button in order summary
		orderSummary.uclickOnVoidButtoninOrderSummary();

		// Click On Void
		orderSummary.uclickOnVoid();

		// Click On Reasons
		orderSummary.uClickOnReasons();
		Thread.sleep(5000);
		
		System.out.println("TestCase 09 = Test case for void order in order summary");

	}

	@Test(priority = 10 )
	public void OrderSummaryVoidMultipleOrder() throws Exception {

		OrderSummaryXPath orderSummary = new OrderSummaryXPath(driver);

		// Click on Menu
		orderSummary.uClickonmenuinOrderSummary();

		// Click on Take Away options
		orderSummary.uClickonTakeAway();

		// Click on Item
		orderSummary.uclickonItem();

		// Click on Save button
		orderSummary.uclickOnSave();

		// Click on Cancel button
		orderSummary.uCancelOrders();

		// Add 2nd order for bulk settle

		// Click on Menu
		orderSummary.uClickonmenuinOrderSummary();

		// Click on Take Away options
		orderSummary.uClickonTakeAway();

		// Click on Item
		orderSummary.uclickonItem();

		// Click on Save button
		orderSummary.uclickOnSave();

		// Click on Cancel button
		orderSummary.uCancelOrders();

		// Add 3rd order for bulk settle

		// Click on Menu
		orderSummary.uClickonmenuinOrderSummary();

		// Click on Take Away options
		orderSummary.uClickonTakeAway();

		// Click on Item
		orderSummary.uclickonItem();

		// Click on Save button
		orderSummary.uclickOnSave();

		// Click on Cancel button
		orderSummary.uCancelOrders();

		// Select All Order
		orderSummary.uclickOnSelectAll();

		// Click on Void button in order summary
		orderSummary.uclickOnVoidButtoninOrderSummary();

		// Click On Void
		orderSummary.uclickOnVoid();

		// Click On Reasons
		orderSummary.uClickOnReasons();
		Thread.sleep(5000);
		
		System.out.println("TestCase 10 = Test case of create a new multiple orders and  void that multiple order ");

	}

	@Test(priority = 11 )
	public void OrderSummarySettleOrder() throws Exception {

		OrderSummaryXPath orderSummary = new OrderSummaryXPath(driver);

		// Click on Menu
		orderSummary.uClickonmenuinOrderSummary();
		// uClickonmenuinOrderSummary

		// Click on Take Away options
		orderSummary.uClickonTakeAway();

		// Click on Item
		orderSummary.uclickonItem();

		// Click on Save button
		orderSummary.uclickOnSave();

		// Click on Cancel button
		orderSummary.uCancelOrders();

		// Select Order
		orderSummary.uselectOrder();

		// Click on Settle button
		orderSummary.uclickOnSettleButton();

//		// Click on Cash Section
//		orderSummary.uclickOnCash();
//		
//		// Select Cash pay option
//		orderSummary.uselectCashPayoption();

		// Click on Pay Button in Settle popup
		orderSummary.uclickonPayButton1();

		// Click on OK Button in changes DUO popup
		orderSummary.uclickOnOKButton1();
		Thread.sleep(5000);
		
		System.out.println("TestCase 11 = Test cases for settle order with cash option");

	}

	@Test(priority = 12 )
	public void OrderSummarySettleBulkOrder() throws Exception {

		OrderSummaryXPath orderSummary = new OrderSummaryXPath(driver);

		// Click on Menu
		orderSummary.uClickonmenuinOrderSummary();
		// uClickonmenuinOrderSummary

		// Click on Take Away options
		orderSummary.uClickonTakeAway();

		// Click on Item
		orderSummary.uclickonItem();

		// Click on Save button
		orderSummary.uclickOnSave();

		// Click on Cancel button
		orderSummary.uCancelOrders();

		// Add 2nd order for bulk settle

		// Click on Menu
		orderSummary.uClickonmenuinOrderSummary();

		// Click on Take Away options
		orderSummary.uClickonTakeAway();

		// Click on Item
		orderSummary.uclickonItem();

		// Click on Save button
		orderSummary.uclickOnSave();

		// Click on Cancel button
		orderSummary.uCancelOrders();

		// Add 3rd order for bulk settle

		// Click on Menu
		orderSummary.uClickonmenuinOrderSummary();

		// Click on Take Away options
		orderSummary.uClickonTakeAway();

		// Click on Item
		orderSummary.uclickonItem();

		// Click on Save button
		orderSummary.uclickOnSave();

		// Click on Cancel button
		orderSummary.uCancelOrders();

		// Select All Order
		orderSummary.uclickOnSelectAll();

		// Click on Settle button
		orderSummary.uclickOnSettleButton();

		// Click On Pay button in Bulk Settle Popup
		orderSummary.uclickOnPaybuttoninBulksettlepopup();
		Thread.sleep(5000);
		
		System.out.println("TestCase 12 = Test case for settle Bulk order");
		
		driver.close();
	}


}
