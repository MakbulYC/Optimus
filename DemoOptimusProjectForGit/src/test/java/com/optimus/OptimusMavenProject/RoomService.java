package com.optimus.OptimusMavenProject;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RoomService {

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
		
		System.out.println("TestCase 01 = Login with valid user");
	}
	
	@Test(priority = 2 )
	public void RoomServiceTakeOrder() throws Exception {

		RoomServiceXPath roomservice = new RoomServiceXPath(driver);

		// Click on Menu
		roomservice.uClickonmenu();

		// Click on RoomService options
		roomservice.uClickonRoomService();

		// Click on Plus icon
		roomservice.uRoomServiceclickonPlus();

		// Click on Save button
		roomservice.uRoomServiceclickOnSaveButton();

		// Click on Item
		roomservice.uRoomServiceaddFirstItem();

		// Click on Save button on Order
		roomservice.uRoomServiceRoomServiceclickOnSave();
		Thread.sleep(5000);
		
		System.out.println("TestCase 02 = Test case for creating a new order with single items and save that order");
	}

	@Test(priority = 3 )
	public void RoomPostingRecallOrder() throws Exception {


		RoomServiceXPath roomservice = new RoomServiceXPath(driver);

		// Click on Plus icon
		roomservice.uRoomServiceclickonTable();

		// Click on Recall button
		roomservice.uRoomServiceclickOnRecall();

		// Add First Item
		roomservice.uRoomServiceaddFirstItem();

		// Add Second Item
		roomservice.uRoomServiceaddSecondItem();

		// Click on Save button on Order
		roomservice.uRoomServiceRoomServiceclickOnSave();
		Thread.sleep(5000);
		
		System.out.println("TestCase 03 = Test case for recall order and add item");
	}

	@Test(priority = 4 )
	public void RoomPostingRecallOrderDeleteItem() throws Exception {

		RoomServiceXPath roomservice = new RoomServiceXPath(driver);

		// Click on Plus icon
		roomservice.uRoomServiceclickonTable();

		// Click on Recall button
		roomservice.uRoomServiceclickOnRecall();

		// Click on void icon on item
		roomservice.uRoomServiceclickOnVoidItem();

		// Click on Void Button
		roomservice.uRoomServiceclickOnVoid();

		// Select reason
		roomservice.uRoomServiceClickOnReasons();

		// Click on Save button on Order
		roomservice.uRoomServiceRoomServiceclickOnSave();
		Thread.sleep(5000);
		
		System.out.println("TestCase 04 = Test case for recall order and delete the item");

	}

	@Test(priority = 5)
	public void RoomPostingPostandFinishOrder() throws Exception {


		RoomServiceXPath roomservice = new RoomServiceXPath(driver);

		// Click on Plus icon
		roomservice.uRoomServiceclickonTable();

		// Click on Recall button
		roomservice.uRoomServiceclickOnRecall();

		// Click on Quick Pay button to Settle Order
		roomservice.uRoomServiceclickOnPostAndFinishButton();
		Thread.sleep(5000);
		
		System.out.println("TestCase 05 = Test case for recall order and settle order through click on Post & Finish button");
	}

	@Test(priority = 6 )
	public void RoomPostingSplitOrder() throws Exception {

		RoomServiceXPath roomservice = new RoomServiceXPath(driver);

		// Click on Plus icon
		roomservice.uRoomServiceclickonPlus();

		// Click on Save button
		roomservice.uRoomServiceclickOnSaveButton();

		// Click on Item
		roomservice.uRoomServiceaddSecondItem();

		// Click on Item
		roomservice.uRoomServiceaddSecondItem();

		// Click on Save button on Order
		roomservice.uRoomServiceRoomServiceclickOnSave();
		Thread.sleep(5000);

		// Click on Plus icon
		roomservice.uRoomServiceclickonTable();

		// Click on Split icon
		roomservice.uRoomServiceClickonSplitSection();

		// Click on Split Button
		roomservice.uRoomServiceClickonSplitButton();

		// Click on Split Type
		roomservice.uRoomServiceClickonSplitByEqually();

		// Click on Split Type 2
		roomservice.uRoomServiceClickonSplitBy2();
		Thread.sleep(5000);
		
		System.out.println("TestCase 06 = Add new order and then split that order through Split by Equally 2");
	}

	@Test(priority =7 )
	public void RoomServiceMergeTwoOrders() throws Exception {


		RoomServiceXPath roomservice = new RoomServiceXPath(driver);
		
//		Thread.sleep(5000);

		// Click on Plus icon
		roomservice.uRoomServiceclickonTable();

		// Select Second Order
		roomservice.uRoomServiceselectSecondOrder();

		// Click on Merge Orders icon
		roomservice.uRoomServiceclickonMergeOrder();

		// Click on Merge Orders
		roomservice.uRoomServiceclickonMergeButton();

		// Click on Parent Orders
		roomservice.uRoomServiceselectParentOrders();
		Thread.sleep(5000);
		
		System.out.println("TestCase 07 = Test case for Merge orders 2 orders");
	}

	@Test(priority = 8 )
	public void RoomPostingSplitOrderEquallyBy3() throws Exception {

		RoomServiceXPath roomservice = new RoomServiceXPath(driver);
		
//		Thread.sleep(5000);

		// Click on Plus icon
		roomservice.uRoomServiceclickonTable();

		// Click on Split icon
		roomservice.uRoomServiceClickonSplitSection();

		// Click on Split Button
		roomservice.uRoomServiceClickonSplitButton();

		// Click on Split Type
		roomservice.uRoomServiceClickonSplitByEqually();

		// Click on Split Type 3
		roomservice.uRoomServiceClickonSplitBy3();
		Thread.sleep(5000);
		
		System.out.println("TestCase 08 = Add new order and then split that order through Split by Equally 3");
	}

	@Test(priority = 9 )
	public void RoomServiceMergeThreeOrders() throws Exception {
		
		RoomServiceXPath roomservice = new RoomServiceXPath(driver);
		
//		Thread.sleep(5000);

		// Click on Plus icon
		roomservice.uRoomServiceclickonTable();

		// Select Second Order
		roomservice.uRoomServiceclickOnSelectAll();

		// Click on Merge Orders
		roomservice.uRoomServiceclickonMergeOrder();

		// Click on Merge Orders
		roomservice.uRoomServiceclickonMergeButton();

		// Click on Parent Orders
		roomservice.uRoomServiceselectParentOrders();
		Thread.sleep(5000);
		
		System.out.println("TestCase 09 = Test case for Merge orders 3 orders");
	}

	@Test(priority = 10 )
	public void RoomPostingSplitOrderEquallyBy4() throws Exception {

		RoomServiceXPath roomservice = new RoomServiceXPath(driver);
		
//		Thread.sleep(5000);

		// Click on Plus icon
		roomservice.uRoomServiceclickonTable();

		// Click on Split icon
		roomservice.uRoomServiceClickonSplitSection();

		// Click on Split Button
		roomservice.uRoomServiceClickonSplitButton();

		// Click on Split Type
		roomservice.uRoomServiceClickonSplitByEqually();

		// Click on Split Type 4
		roomservice.uRoomServiceClickonSplitBy4();
		Thread.sleep(5000);
		
		System.out.println("TestCase 10 = Add new order and then split that order through Split by Equally 4");
	}

	@Test(priority = 11 )
	public void RoomServiceMergeFourOrders() throws Exception {

		RoomServiceXPath roomservice = new RoomServiceXPath(driver);
		
//		Thread.sleep(5000);

		// Click on Plus icon
		roomservice.uRoomServiceclickonTable();

		// Select Second Order
		roomservice.uRoomServiceclickOnSelectAll1();

		// Click on Merge Orders
		roomservice.uRoomServiceclickonMergeOrder();

		// Click on Merge Orders
		roomservice.uRoomServiceclickonMergeButton();

		// Click on Parent Orders
		roomservice.uRoomServiceselectParentOrders();
		Thread.sleep(5000);
		
		System.out.println("TestCase 11 = Test case for Merge orders 4 orders");
	}

	@Test(priority = 12 )
	public void RoomPostingSplitOrderEquallyBy5() throws Exception {

		RoomServiceXPath roomservice = new RoomServiceXPath(driver);
		
	//	Thread.sleep(5000);

//		// Click on Menu
//		roomservice.uClickonmenu();
//
//		// Click on RoomService options
//		roomservice.uClickonRoomService();

		// Click on Plus icon
		roomservice.uRoomServiceclickonTable();

		// Click on Split icon
		roomservice.uRoomServiceClickonSplitSection();

		// Click on Split Button
		roomservice.uRoomServiceClickonSplitButton();

		// Click on Split Type
		roomservice.uRoomServiceClickonSplitByEqually();

		// Click on Split Type 5
		roomservice.uRoomServiceClickonSplitBy5();
		Thread.sleep(5000);
		
		System.out.println("TestCase 12 = Add new order and then split that order through Split by Equally 5");
	}

	@Test(priority = 13 )
	public void RoomServiceMergeFiveOrders() throws Exception {

		RoomServiceXPath roomservice = new RoomServiceXPath(driver);
		
//		Thread.sleep(5000);

		// Click on Plus icon
		roomservice.uRoomServiceclickonTable();

		// Select Second Order
		roomservice.uRoomServiceclickOnSelectAll1();

		// Click on Merge Orders
		roomservice.uRoomServiceclickonMergeOrder();

		// Click on Merge Orders
		roomservice.uRoomServiceclickonMergeButton();

		// Click on Parent Orders
		roomservice.uRoomServiceselectParentOrders();
		Thread.sleep(5000);
		
		System.out.println("TestCase 13 = Test case for Merge orders 5 orders");

	}

	@Test(priority = 14 )
	public void RoomPostingSplitOrderByQTY() throws Exception {

		RoomServiceXPath roomservice = new RoomServiceXPath(driver);
		
//		Thread.sleep(5000);

		// Click on Plus icon
		roomservice.uRoomServiceclickonTable();

		// Click on Recall button
		roomservice.uRoomServiceclickOnRecall();

		// Click on Item
		roomservice.uRoomServiceaddSecondItem();

		// Click on Item
		roomservice.uRoomServiceaddSecondItem();

		// Click on Save button on Order
		roomservice.uRoomServiceRoomServiceclickOnSave();
		Thread.sleep(5000);

		// Click on Plus icon
		roomservice.uRoomServiceclickonTable();

		// Click on Split icon
		roomservice.uRoomServiceClickonSplitSection();

		// Click on Split Button
		roomservice.uRoomServiceClickonSplitButton();

		// Click on Split Type
		roomservice.uRoomServiceClickonSplitByQuantity();

		// Select Item
		roomservice.uRoomServiceselectIteminSplit();

		// Click on QTY
		roomservice.uRoomServiceclickOnQTY();

		// Select QTY
		roomservice.uselectQTY();

		// Click on Move To Right
		roomservice.uRoomServiceclickOnMoveToRightButton();

		// Click on Save button
		roomservice.uRoomServiceclickOnSaveButton();
		Thread.sleep(5000);
		
		System.out.println("TestCase 14 = Test case for split that order through split by Quantity");
	}

	@Test(priority = 15 )
	public void RoomServiceMergeOrders() throws Exception {

		RoomServiceXPath roomservice = new RoomServiceXPath(driver);
		
	//	Thread.sleep(5000);

		// Click on Plus icon
		roomservice.uRoomServiceclickonTable();

		// Select Second Order
		roomservice.uRoomServiceselectSecondOrder();

		// Click on Merge Orders icon
		roomservice.uRoomServiceclickonMergeOrder();

		// Click on Merge Orders
		roomservice.uRoomServiceclickonMergeButton();

		// Click on Parent Orders
		roomservice.uRoomServiceselectParentOrders();
		Thread.sleep(5000);
		
		System.out.println("TestCase 15 = Test case for Merge orders 2 orders");
	}

	@Test(priority = 16 )
	public void RoomPostingSplitOrderByCategory() throws Exception {

		RoomServiceXPath roomservice = new RoomServiceXPath(driver);
		
//		Thread.sleep(5000);

		// Click on Plus icon
		roomservice.uRoomServiceclickonTable();

		// Click on Recall button
		roomservice.uRoomServiceclickOnRecall();

		// Click on "Icecream" Submenu
		roomservice.uRoomServiceclickOnSubmenu();

		// Click on Item
		roomservice.uRoomServiceselectItemOnSubmenu();

		// Click on Item
		roomservice.uRoomServiceselectItemOnSubmenu();

		// Click on Save button on Order
		roomservice.uRoomServiceRoomServiceclickOnSave();
		Thread.sleep(5000);

		// Click on Plus icon
		roomservice.uRoomServiceclickonTable();

		// Click on Split icon
		roomservice.uRoomServiceClickonSplitSection();

		// Click on Split Button
		roomservice.uRoomServiceClickonSplitButton();

		// Click on Split Type
		roomservice.uRoomServiceClickonSplitByCategory();

		// Move First item

		// Select Item
		roomservice.uRoomServiceselectIteminSplit();

		// Click on QTY
		roomservice.uRoomServiceclickOnQTY();

		// Select QTY
		roomservice.uselectQTY();

		// Click on Move To Right
		roomservice.uRoomServiceclickOnMoveToRightButton();

		// Move Second item

		// Select Item
		roomservice.uRoomServiceselectSecondIteminSplit();

		// Click on QTY
		roomservice.uRoomServiceclickOn2QTY();

		// Select QTY
		roomservice.uRoomServiceselect2QTY();

		// Click on Move To Left
		roomservice.uRoomServiceclickOnMoveToLeftButton();

		// Click on Save button
		roomservice.uRoomServiceclickOnSaveButton();
		Thread.sleep(5000);
		
		System.out.println("TestCase 16 = Test case for split that order through split by Category ");
	}

	@Test(priority = 17 )
	public void RoomPostingMergeandSettleOrder() throws Exception {

		RoomServiceXPath roomservice = new RoomServiceXPath(driver);
		
//		Thread.sleep(5000);

		// Click on Plus icon
		roomservice.uRoomServiceclickonTable();

		// Select Second Order
		roomservice.uRoomServiceselectSecondOrder();

		// Click on Merge Orders icon
		roomservice.uRoomServiceclickOnMergeAndSettleOrder();

		// Click on Merge Button
		roomservice.uRoomServiceclickonMergeButton();

		// Click on Parent Orders
		roomservice.uRoomServiceselectParentOrders();

		// Click on Cancel icon in Settle popup
		roomservice.uClickonCancelIconinSettlepopup();

		// Click on Post And Finish Button
		roomservice.uRoomServiceclickOnPostAndFinishButton();
		Thread.sleep(5000);
		
		System.out.println("TestCase 17 = Test case for Merge and Settle order through Posting Payment ");
	}

	@Test(priority = 18 )
	public void RoomPostingSettleOrderwithCash() throws Exception {

		RoomServiceXPath roomservice = new RoomServiceXPath(driver);
		
//		Thread.sleep(5000);

		// Click on Plus icon
		roomservice.uRoomServiceclickonPlus();

		// Click on Save button
		roomservice.uRoomServiceclickOnSaveButton();

		// Click on Item
		roomservice.uRoomServiceaddSecondItem();

		// Click on Settle Button
		roomservice.uRoomServiceclickonSettleButton();

		// Click on Cash Section
		roomservice.uRoomServiceclickOnCash();

		// Select Cash pay option
		roomservice.uRoomServiceselectCashPayoption();

		// Click on Pay Button in Settle popup
		roomservice.uRoomServiceclickonPayButton();

		// Click on Apply Button in Surcharge Confirmation popup
		roomservice.uRoomServiceclickOnApplyButton();

		// Click on OK Button in changes DUO popup
		roomservice.uRoomServiceclickOnOKButton();
		Thread.sleep(5000);
		
		System.out.println("TestCase 18 = Test cases for settle order with different cash option");
	}

	@Test(priority = 19 )
	public void RoomPostingSettleOrderwithBank() throws Exception {

		RoomServiceXPath roomservice = new RoomServiceXPath(driver);
		
	//	Thread.sleep(5000);

		// Click on Plus icon
		roomservice.uRoomServiceclickonPlus();

		// Click on Save button
		roomservice.uRoomServiceclickOnSaveButton();

		// Click on Item
		roomservice.uRoomServiceaddSecondItem();

		// Click on Settle Button
		roomservice.uRoomServiceclickonSettleButton();

		// Click on Bank Section
		roomservice.uRoomServiceclickOnBank();

		// Select bank pay option
		roomservice.uRoomServiceselectBankPayoptionwithSurcharge();

		// Click on Pay Button in Settle popup
		roomservice.uRoomServiceclickonPayButton();

//		// Click on Apply Button in Surcharge Confirmation popup
//		roomservice.uRoomServiceclickOnApplyButton();
		
		System.out.println("TestCase 19 = Test case for settle order with different bank option");
	}

	@Test(priority = 20 )
	public void RoomPostingSettlewithPosting() throws Exception {

		RoomServiceXPath roomservice = new RoomServiceXPath(driver);
		
//		Thread.sleep(5000);

		// Click on Plus icon
		roomservice.uRoomServiceclickonPlus();

		// Click on Save button
		roomservice.uRoomServiceclickOnSaveButton();

		// Click on Item
		roomservice.uRoomServiceaddSecondItem();

		// Click on Settle Button
		roomservice.uRoomServiceclickonSettleButton();

		// Click on Posting Section
		roomservice.uRoomServiceclickonPosting();

		// Select Posting Pay option
		roomservice.uRoomServiceselectPostingPay();

		// Click on Pay Button in Settle popup
		roomservice.uRoomServiceclickonPayButton();

//		// Click on Yes button in confirm popup
//		roomservice.uRoomServiceclickOnYes();
		Thread.sleep(5000);
		
		System.out.println("TestCase 20 = Test case for settle order with Room posting");
	}

	@Test(priority = 21 )
	public void RoomPostingwithOtherCurrency() throws Exception {

		RoomServiceXPath roomservice = new RoomServiceXPath(driver);
		
//		Thread.sleep(5000);

		// Click on Plus icon
		roomservice.uRoomServiceclickonPlus();

		// Click on Save button
		roomservice.uRoomServiceclickOnSaveButton();

		// Click on Item
		roomservice.uRoomServiceaddSecondItem();

		// Click on Settle Button
		roomservice.uRoomServiceclickonSettleButton();

		// Click on Currency
		roomservice.uRoomServiceclickOnCurrecny();

		// Select Currency option
		roomservice.uRoomServiceclickOnCurrecnyOption();

		// Click on Cash Section
		roomservice.uRoomServiceclickOnCash();

		// Select Cash pay option
		roomservice.uSelectcashoptioninPaymentProcess();

		// Click on Pay Button in Settle popup
		roomservice.uclickonPayButton1();

		// Click on OK Button in changes DUO popup
		roomservice.uclickOnOKButtoninChangesDuoPopup();
		Thread.sleep(5000);
		
		System.out.println("TestCase 21 = Test case for settle payment with other currency");
	}

	@Test(priority = 22 )
	public void RoomPostingVoidOrder() throws Exception {

		RoomServiceXPath roomservice = new RoomServiceXPath(driver);
		
//		Thread.sleep(5000);

		// Click on Plus icon
		roomservice.uRoomServiceclickonPlus();

		// Click on Save button
		roomservice.uRoomServiceclickOnSaveButton();

		// Click on Item
		roomservice.uRoomServiceaddSecondItem();

		// Click on Save button on Order
		roomservice.uclickOnSave();

		// Click on Plus icon
		roomservice.uRoomServiceclickonTable();

		// Click on void Button
		roomservice.uRoomServiceclickOnVoidButton();

		// Click on void Option
		roomservice.uRoomServiceclickOnVoid();

		// Select reason
		roomservice.uRoomServiceClickOnReasons();
		Thread.sleep(5000);
		
		System.out.println("TestCase 22 = Check with create new order and then delete that order");
	}

	@Test(priority = 23 )
	public void RoomPostingVoidMultipleOrders() throws Exception {

		RoomServiceXPath roomservice = new RoomServiceXPath(driver);
		
//		Thread.sleep(5000);

		// Click on Plus icon
		roomservice.uRoomServiceclickonPlus();

		// Click on Save button
		roomservice.uRoomServiceclickOnSaveButton();

		// Click on Item
		roomservice.uRoomServiceaddSecondItem();

		// Click on Save button on Order
		roomservice.uclickOnSave();
		Thread.sleep(5000);

		// Create a second order

		// Click on Table section
		roomservice.uRoomServiceclickonTable();

		// Click on Plus icon
		roomservice.uRoomServiceclickonPlusIcon();

		// Click on Save button
		roomservice.uRoomServiceclickSaveButton();

		// Click on Item
		roomservice.uRoomServiceaddSecondItem();

		// Click on Save button on Order
		roomservice.uclickOnSave();
		Thread.sleep(5000);

		// Create a Third order

		// Click on Table section
		roomservice.uRoomServiceclickonTable();

		// Click on Plus icon
		roomservice.uRoomServiceclickonPlusIcon();

		// Click on Save button
		roomservice.uRoomServiceclickSaveButton();

		// Click on Item
		roomservice.uRoomServiceaddSecondItem();

		// Click on Save button on Order
		roomservice.uclickOnSave();
		Thread.sleep(5000);

		// Create a Fourth order

		// Click on Table section
		roomservice.uRoomServiceclickonTable();

		// Click on Plus icon
		roomservice.uRoomServiceclickonPlusIcon();

		// Click on Save button
		roomservice.uRoomServiceclickSaveButton();

		// Click on Item
		roomservice.uRoomServiceaddSecondItem();

		// Click on Save button on Order
		roomservice.uclickOnSave();
		Thread.sleep(5000);

		// Create a fifth order

		// Click on Table section
		roomservice.uRoomServiceclickonTable();

		// Click on Plus icon
		roomservice.uRoomServiceclickonPlusIcon();

		// Click on Save button
		roomservice.uRoomServiceclickSaveButton();

		// Click on Item
		roomservice.uRoomServiceaddSecondItem();

		// Click on Save button on Order
		roomservice.uclickOnSave();

		// Click on All checkbox in order section

		// Click on Table section
		roomservice.uRoomServiceclickonTable();

		// Click on All checkbox in table section
		roomservice.uRoomServiceclickOnSelectAll();

		// Click on Void button
		roomservice.uRoomServiceclickonDeleteButton();

		// Select void option
		roomservice.uRoomServiceclickOnVoid();

		// Select reason
		roomservice.uRoomServiceClickOnReasons();
		Thread.sleep(5000);
		
		System.out.println("TestCase 23 = Test case of create a new multiple orders and  void that multiple order ");
	}

	@Test(priority = 24 )
	public void RoomPostingFinishOrder() throws Exception {

		RoomServiceXPath roomservice = new RoomServiceXPath(driver);
		
//		Thread.sleep(5000);

		// Click on Plus icon
		roomservice.uRoomServiceclickonPlus();

		// Click on Save button
		roomservice.uRoomServiceclickOnSaveButton();

		// Click on Item
		roomservice.uRoomServiceaddSecondItem();

		// Click on Save button on Order
		roomservice.uclickOnSave();
		Thread.sleep(5000);

		// Click on Plus icon
		roomservice.uRoomServiceclickonTable();

		// Click on Post To Room button
		roomservice.uClickonPostToRoomButton();

		// Click on Post To Room button in confirm Popup
		roomservice.uClickonPostToRoomButtonInConfirmPopup1();
		Thread.sleep(5000);
		
		System.out.println("TestCase 24 = Test case for check with create a new order and then settle order through Post to Room button");
		driver.close();
	}
	
}
