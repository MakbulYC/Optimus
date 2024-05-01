package com.optimus.OptimusMavenProject;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeAway {
	
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
	public void TakeAwaySaveOrder() throws Exception {

		TakeAwayXpath takeaway = new TakeAwayXpath(driver);
		
		Thread.sleep(5000);
		
		// Click On Order Notification
		takeaway.uclickOnOrderNotification();

		// Click on Menu
		takeaway.uClickonmenu();

		// Click on Take Away options
		takeaway.uClickonTakeAway();

		// Click on Item
		takeaway.uTakeAwayAddItem();

		// Click on Save button
		takeaway.uTakeAwayclickOnSave();

		// Click on Finish Button
		takeaway.uTakeAwayclickOnCancel();
		Thread.sleep(5000);
		
		System.out.println("TestCase 02 = Test case for create a new order with a single item and save it");
	}

	@Test(priority = 3 )
	public void TakeAwayRecallOrder() throws Exception {

		TakeAwayXpath takeaway = new TakeAwayXpath(driver);

		// Select order
		takeaway.uTakeAwayselectOrder();

		// Click on recall button
		takeaway.uTakeAwayclickOnRecallButton();

		// Click on Item
		takeaway.uTakeAwayAddNewItem();

		// Click on Save
		takeaway.uTakeAwayclickOnSave();
		Thread.sleep(5000);
		
		System.out.println("TestCase 03 = Test case for recall order and add new item");
	}

	@Test(priority = 4 )
	public void TakeAwaycheckWithIncreaseQTY() throws Exception {


		TakeAwayXpath takeaway = new TakeAwayXpath(driver);

//		// Click on Menu
//		takeaway.uClickonmenu();
//		
//		// Click on Take Away options
//		takeaway.uClickonOrderSummary(); 

		// Select order
		takeaway.uTakeAwayselectOrder();

		// Click on recall button
		takeaway.uTakeAwayclickOnRecallButton();

		// Increase the QTY of first item
		takeaway.uTakeAwayFirstItemIncrease();

		// Increase the QTY of Second item
		takeaway.uTakeAwaySecondItemIncrease();

		// Click on Save
		takeaway.uTakeAwayclickOnSave();
		Thread.sleep(5000);
		
		System.out.println("TestCase 04 = Test case for recall order and Increase the QTY item and save it");
	}

	@Test(priority = 5 )
	public void TakeAwaycheckWithDecreaseQTY() throws Exception {

		TakeAwayXpath takeaway = new TakeAwayXpath(driver);

		// Select order
		takeaway.uTakeAwayselectOrder();

		// Click on recall button
		takeaway.uTakeAwayclickOnRecallButton();

		// Increase the QTY of first item
		takeaway.uTakeAwayFirstItemDecrease();

		// Increase the QTY of first item
		takeaway.uTakeAwayclickOnVoid();

		// Increase the QTY of first item
		takeaway.uTakeAwayClickOnReasons();

		// Increase the QTY of Second item
		takeaway.uTakeAwaySecondItemDecrease();

		// Increase the QTY of first item
		takeaway.uTakeAwayclickOnVoid();

		// Increase the QTY of first item
		takeaway.uTakeAwayClickOnReasons();

		// Click on Save
		takeaway.uTakeAwayclickOnSave();
		Thread.sleep(5000);
		
		System.out.println("TestCase 05 = Test case for recall order and Decrease the QTY item and save it");
	}

	@Test(priority = 6 )
	public void TakeAwayRemoveItem() throws Exception {

		TakeAwayXpath takeaway = new TakeAwayXpath(driver);

//		// Click on Menu
//		takeaway.uClickonmenu();
//		
//		// Click on Take Away options
//		takeaway.uClickonOrderSummary(); 

		// Select order
		takeaway.uTakeAwayselectOrder();

		// Click on recall button
		takeaway.uTakeAwayclickOnRecallButton();

		// Increase the QTY of first item
		takeaway.uTakeAwayclickOnVoidButton();

		// Increase the QTY of first item
		takeaway.uTakeAwayclickOnVoid();

		// Increase the QTY of first item
		takeaway.uTakeAwayClickOnReasons();

		// Click on Save
		takeaway.uTakeAwayclickOnSave();
		Thread.sleep(5000);
		
		System.out.println("TestCase 06 = Test case for recall order and remove item from order");
	}

	@Test(priority = 7 )
	public void TakeAwayRecallOrderAndSettlewithQuickPay() throws Exception {

		TakeAwayXpath takeaway = new TakeAwayXpath(driver);

		// Select order
		takeaway.uTakeAwayselectOrder();

		// Click on recall button
		takeaway.uTakeAwayclickOnRecallButton();

		// Click on Quick pay button
		takeaway.uTakeAwayclickOnQucikPayButton();
		Thread.sleep(5000);
		
		System.out.println("TestCase 07 = Test case for recall order and click on Quick pay");
	}

	@Test(priority = 8 )
	public void TakeAwayAddMultiplerItemandSaveIt() throws Exception {

		TakeAwayXpath takeaway = new TakeAwayXpath(driver);

		// Click on Menu
		takeaway.uClickonmenuButton();
		
		// Click on Take Away options
		takeaway.uClickonTakeAway(); 

		// Click on Item
		takeaway.uTakeAwayAddItem();

		// Add new Item
		takeaway.uTakeAwayAddNewItem();

//		// Add new Item
//		takeaway.uAddThirdItem();

		// Add new Item
		takeaway.uTakeAwayAddFourthItem();

		// Add new Item
		takeaway.uTakeAwayAddFifthItem();

		// Add new Item
		takeaway.uTakeAwayAddSixthItem();

		// Click on Save button
		takeaway.uTakeAwayclickOnSave();

		// Click on Finish Button
		takeaway.uTakeAwayclickOnCancel();
		Thread.sleep(5000);
		
		System.out.println("TestCase 08 = Test case save order with multiple items");
	}

	@Test(priority = 9 )
	public void TakeAwayRecallOrderandAddSameItem() throws Exception {

		TakeAwayXpath takeaway = new TakeAwayXpath(driver);

//		// Click on Menu
//		takeaway.uClickonmenu();
//		
//		// Click on Take Away options
//		takeaway.uClickonOrderSummary();

		// Select order
		takeaway.uTakeAwayselectOrder();

		// Click on recall button
		takeaway.uTakeAwayclickOnRecallButton();

		// Click on Item
		takeaway.uTakeAwayAddItem();

		// Add new Item
		takeaway.uTakeAwayAddNewItem();

//		// Add new Item
//		takeaway.uAddThirdItem();

		// Add new Item
		takeaway.uTakeAwayAddFourthItem();

		// Add new Item
		takeaway.uTakeAwayAddFifthItem();

		// Add new Item
		takeaway.uTakeAwayAddSixthItem();

		// Click on Save button
		takeaway.uTakeAwayclickOnSave();
		Thread.sleep(5000);
		
		System.out.println("TestCase 09 = Test case for add same item");

	}

	@Test(priority = 10 )
	public void TakeAwaySettleOrder() throws Exception {

		TakeAwayXpath takeaway = new TakeAwayXpath(driver);

//		// Click on Menu
//		takeaway.uClickonmenu();
//
//		// Click on Take Away options
//		takeaway.uClickonTakeAway();

		// Select order
		takeaway.uTakeAwayselectOrder();

		// Click on recall button
		takeaway.uTakeAwayclickOnRecallButton();

		// Click on Settle Button
		takeaway.uTakeAwayclickonSettleButton();

		// Click on Pay Button in Settle popup
		takeaway.uTakeAwayclickonPayButton();
		Thread.sleep(5000);

		// Click on Ok Button in changes DUO popup
		takeaway.uclickOnOKButtoninChangesDuopopup();
		Thread.sleep(5000);
		
		System.out.println("TestCase 10 = Test cases for settle order ");

	}

	@Test(priority = 11 )
	public void TakeAwaySettleOrderwithBank() throws Exception {


		TakeAwayXpath takeaway = new TakeAwayXpath(driver);

		// Click on Menu
		takeaway.uClickonmenuButton();

		// Click on Take Away options
		takeaway.uClickonTakeAway();

		// Click on Item
		takeaway.uTakeAwayAddItem();

		// Add new Item
		takeaway.uTakeAwayAddNewItem();

		// Click on Settle Button
		takeaway.uTakeAwayclickonSettleButton();

		// Click on Bank Section
		takeaway.uTakeAwayclickOnBank();

		// Select bank pay option
		takeaway.uTakeAwayselectBankPayoption();

		// Click on Pay Button in Settle popup
		takeaway.uTakeAwayclickonPayButton();
		Thread.sleep(5000);

//		// Click on Cancel Button 
//		takeaway.uTakeAwayclickOnCancel();
		
		System.out.println("TestCase 11 = Test case for settle order with Bank option");

	}

	@Test(priority = 12 )
	public void TakeAwaySettleOrderWithCredit() throws Exception {

		TakeAwayXpath takeaway = new TakeAwayXpath(driver);

//		// Click on Menu
//		takeaway.uClickonmenuButton();
//
//		// Click on Take Away options
//		takeaway.uClickonTakeAway();

		// Click on Item
		takeaway.uTakeAwayAddItem();

		// Add new Item
		takeaway.uTakeAwayAddNewItem();

		// Click on Settle Button
		takeaway.uTakeAwayclickonSettleButton();

		// Click on Credit Section
		takeaway.uTakeAwayclickCreditSection();

		// Select Credit account option
		takeaway.uTakeAwayselectCreditoption();

		// Click on Pay Button in Settle popup
		takeaway.uTakeAwayclickonPayButton();

		// Click on "Proceed with Posting" option in Confirma popup
		takeaway.uTakeAwayCreditConfrimOption();
		Thread.sleep(5000);

//		// Click on Cancel Button 
//		takeaway.uTakeAwayclickOnCancel();
		
		System.out.println("TestCase 12 = Test case for settle order with credit option");

	}

	@Test(priority = 13 )
	public void TakeAwayCreditwithInsufficientBalance() throws Exception {

		TakeAwayXpath takeaway = new TakeAwayXpath(driver);

//		// Click on Menu
//		takeaway.uClickonmenuButton();
//
//		// Click on Take Away options
//		takeaway.uClickonTakeAway();

		// Click on Item
		takeaway.uTakeAwayAddItem();

		// Click on QTY
		takeaway.uTakeAwayclickonQTY();

		// Click on 2 number
		takeaway.uTakeAwayclickon2();

		// Click on 0 number
		takeaway.uTakeAwayclickon0();

		// Click on Enter
		takeaway.uTakeAwayclickonEnter();

		// Click on Settle Button
		takeaway.uTakeAwayclickonSettleButton();

		// Click on Credit Section
		takeaway.uTakeAwayclickCreditSection();

		// Select Credit account option
		takeaway.uTakeAwayselectCreditAccount();

		// Click on Pay Button in Settle popup
		takeaway.uTakeAwayclickonPayButton();

//		// Click on Continue Button in Settle popup
//		takeaway.uTakeAwayclickOnContinue();

		// Click on "Proceed with Posting" option in Confirma popup
		takeaway.uTakeAwayCreditConfrimOption();
		Thread.sleep(5000);
		
		// Click on Cancel Button 
		takeaway.uTakeAwayclickOnCancel();
		Thread.sleep(5000);
		
		System.out.println("TestCase 13 = Test case for settle order through Credit account which has not have sufficient Balance");

	}

	@Test(priority = 14 )
	public void TakeAwaysettleOrderwithCreditUpdateGuestInfo() throws Exception {

		TakeAwayXpath takeaway = new TakeAwayXpath(driver);

		// Click on Menu
		takeaway.uClickonmenuButton();

		// Click on Take Away options
		takeaway.uClickonTakeAway();

		// Add new Item
		takeaway.uTakeAwayAddNewItem();

		// Click on Settle Button
		takeaway.uTakeAwayclickonSettleButton();

		// Click on Credit Section
		takeaway.uTakeAwayclickCreditSection();

		// Select Credit account option
		takeaway.uTakeAwayselectCreditoption();

		// Click on Pay Button in Settle popup
		takeaway.uTakeAwayclickonPayButton();

		// Click on "Proceed with Posting" option in Confirma popup
		takeaway.uTakeAwayCreditConfrimOption();
		Thread.sleep(5000);

		// Click on Cancel Button 
		takeaway.uTakeAwayclickOnCancel();
		Thread.sleep(5000);
		
		System.out.println("TestCase 14 = Test case for settle Order with Credit Update Guest Info");

	}

	@Test(priority = 15 )
	public void TakeAwaysettleOrderwithRoomPost() throws Exception {


		TakeAwayXpath takeaway = new TakeAwayXpath(driver);

		// Click on Menu
		takeaway.uClickonmenuButton();

		// Click on Take Away options
		takeaway.uClickonTakeAway();

		// Add new Item
		takeaway.uTakeAwayAddNewItem();

		// Click on Settle Button
		takeaway.uTakeAwayclickonSettleButton();

		// Click on Posting Section
		takeaway.uTakeAwayclickonPosting();

		// Select Posting Pay option
		takeaway.uTakeAwayselectPostingPay();

		// Click on Pay Button in Settle popup
		takeaway.uTakeAwayclickonPayButton();

		// Click on Yes button in confirm popup
		takeaway.uTakeAwayclickOnYes();
		Thread.sleep(5000);
		
		// Click on Cancel Button 
		takeaway.uTakeAwayclickOnCancel();
		Thread.sleep(5000);
		
		System.out.println("TestCase 15 = Test case for settle Order with RoomPost");

	}

	@Test(priority = 16 )
	public void TakeAwayCashwithSurcharge() throws Exception {


		TakeAwayXpath takeaway = new TakeAwayXpath(driver);

		// Click on Menu
		takeaway.uClickonmenuButton();

		// Click on Take Away options
		takeaway.uClickonTakeAway();

		// Add new Item
		takeaway.uTakeAwayAddNewItem();

		// Click on Settle Button
		takeaway.uTakeAwayclickonSettleButton();

		// Click on Cash Section
		takeaway.uTakeAwayclickOnCash();

		// Select Cash pay option
		takeaway.uTakeAwayselectCashPayoption();

		// Click on Pay Button in Settle popup
		takeaway.uTakeAwayclickonPayButton();

		// Click on Apply Button in Surcharge Confirmation popup
		takeaway.uTakeAwayclickOnApplyButton();
		Thread.sleep(5000);

		// Click on OK Button in changes DUO popup
		takeaway.uclickOnOKButtoninChangesDuopopup();
		Thread.sleep(5000);

		// Click on Cancel Button
		takeaway.uTakeAwayclickOnCancel();
		Thread.sleep(5000);
		
		System.out.println("TestCase 16 = Test case settle order Cash with Surcharge");

	}

	@Test(priority = 17 )
	public void TakeAwayBankwithSurcharge() throws Exception {


		TakeAwayXpath takeaway = new TakeAwayXpath(driver);

		// Click on Menu
		takeaway.uClickonmenuButton();

		// Click on Take Away options
		takeaway.uClickonTakeAway();

		// Add new Item
		takeaway.uTakeAwayAddNewItem();

		// Click on Settle Button
		takeaway.uTakeAwayclickonSettleButton();

		// Click on Bank Section
		takeaway.uTakeAwayclickOnBank();

		// Select bank pay option
		takeaway.uTakeAwayselectBankPayoptionwithSurcharge();

		// Click on Pay Button in Settle popup
		takeaway.uTakeAwayclickonPayButton();

		// Click on Apply Button in Surcharge Confirmation popup
		takeaway.uTakeAwayclickOnApplyButton();
		Thread.sleep(3000);

//		// Click on OK Button in changes DUO popup
//		takeaway.uclickOnOKButtoninChangesDuopopup();

		// Click on Cancel Button
		takeaway.uTakeAwayclickOnCancel();
		
		Thread.sleep(5000);
		
		System.out.println("TestCase 17 = Test case for settle order with Bank payment type ");

	}

	@Test(priority = 18 )
	public void TakeAwaysettleOrderPartially() throws Exception {


		TakeAwayXpath takeaway = new TakeAwayXpath(driver);

		// Click on Menu
		takeaway.uClickonmenuButton();

		// Click on Take Away options
		takeaway.uClickonTakeAway();

		// Add new Item
		takeaway.uTakeAwayAddNewItem();

		// Add new Item
		takeaway.uTakeAwayAddFifthItem();

		// Click on Settle Button
		takeaway.uTakeAwayclickonSettleButton();

		// Click on "1" button
		takeaway.uTakeAwayclickOn1();

		// Click on "00" button
		takeaway.uTakeAwayclickOn00();

		// Click on Pay Button in Settle popup
		takeaway.uTakeAwayclickOnPayinSettle();

		// Click on Save Button
		takeaway.uTakeAwayclickOnSaveButtoninPaymentProcess();

		// Click on Save Button
		takeaway.uTakeAwayclickOnSave();
		Thread.sleep(5000);
		
		// Click on Cancel Button
		takeaway.uTakeAwayclickOnCancel();

		// Select order
		takeaway.uTakeAwayselectOrder();

		// Click on recall button
		takeaway.uTakeAwayclickOnRecallButton();

		// Click on Settle Button
		takeaway.uTakeAwayclickonSettleButton();

		// Click on Pay Button in Settle popup
		takeaway.uTakeAwayclickOnPayinSettle();
		Thread.sleep(5000);

		// Click on OK Button in changes DUO popup
		takeaway.uclickOnOKButtoninChangesDuopopup();
		
		Thread.sleep(5000);
		
		System.out.println("TestCase 18 = Test case for settle order partially");

	}

	@Test(priority = 19 )
	public void TakeAwaySettlewithOtherCurrency() throws Exception {


		TakeAwayXpath takeaway = new TakeAwayXpath(driver);

		// Click on Menu
		takeaway.uClickonmenuButton();

		// Click on Take Away options
		takeaway.uClickonTakeAway();

		// Add new Item
		takeaway.uTakeAwayAddNewItem();

		// Add new Item
		takeaway.uTakeAwayAddFifthItem();

		// Click on Settle Button
		takeaway.uTakeAwayclickonSettleButton();

		// Click on Currency
		takeaway.uTakeAwayclickOnCurrecny();

		// Select Currency option
		takeaway.uTakeAwayclickOnCurrecnyOption();

		// Click on Pay Button in Settle popup
		takeaway.uTakeAwayclickOnPayinSettle();
		Thread.sleep(5000);

		// Click on Ok Button in changes DUO popup
		takeaway.uclickOnOKButtoninChangesDuopopup();
		Thread.sleep(5000);

		// Click on Cancel Button
		takeaway.uTakeAwayclickOnCancel();
		Thread.sleep(5000);
		
		System.out.println("TestCase 19 = Test case for settle order with other currency");

	}

	@Test(priority = 20 )
	public void TakeAwaySettleOrderWithMultipleCurrency() throws Exception {


		TakeAwayXpath takeaway = new TakeAwayXpath(driver);

		// Click on Menu
		takeaway.uClickonmenuButton();

		// Click on Take Away options
		takeaway.uClickonTakeAway();

		// Add new Item
		takeaway.uTakeAwayAddNewItem();

		// Add new Item
		takeaway.uTakeAwayAddFifthItem();

		// Click on Settle Button
		takeaway.uTakeAwayclickonSettleButton();

		// Click on "1" button
		takeaway.uTakeAwayclickOn1();

		// Click on "00" button
		takeaway.uTakeAwayclickOn00();

		// Click on Pay Button in Settle popup
		takeaway.uTakeAwayclickOnPayinSettle();

		// Click on Save Button
		takeaway.uTakeAwayclickOnSaveButtoninPaymentProcess();

		// Click on Save Button
		takeaway.uTakeAwayclickOnSave();
		Thread.sleep(5000);

		// Click on Finish Button
		takeaway.uTakeAwayclickOnCancel();

		// Select order
		takeaway.uTakeAwayselectOrder();

		// Click on recall button
		takeaway.uTakeAwayclickOnRecallButton();

		// Click on Settle Button
		takeaway.uTakeAwayclickonSettleButton();

		// Click on Currency
		takeaway.uTakeAwayclickOnCurrecny();

		// Select Currency option
		takeaway.uTakeAwayclickOnCurrecnyOption();

		// Click on Pay Button in Settle popup
		takeaway.uTakeAwayclickOnPayinSettle();
		Thread.sleep(5000);

		// Click on Ok Button in changes DUO popup
		takeaway.uclickOnOKButtoninChangesDuopopup();
		Thread.sleep(5000);

//		// Click on Cancel Button
//		takeaway.uTakeAwayclickOnCancel();
		Thread.sleep(5000);
		
		System.out.println("TestCase 20 = Test case for settle order with multiple currency");
	}

	@Test(priority = 21 )
	public void TakeAwayTakeAwaydeletePayment() throws Exception {

		TakeAwayXpath takeaway = new TakeAwayXpath(driver);

		// Click on Menu
		takeaway.uClickonmenuButton();

		// Click on Take Away options
		takeaway.uClickonTakeAway();

		// Add new Item
		takeaway.uTakeAwayAddNewItem();

		// Add new Item
		takeaway.uTakeAwayAddFifthItem();

		// Click on Settle Button
		takeaway.uTakeAwayclickonSettleButton();

		// Click on "1" button
		takeaway.uTakeAwayclickOn1();

		// Click on "00" button
		takeaway.uTakeAwayclickOn00();

		// Click on Pay Button in Settle popup
		takeaway.uTakeAwayclickOnPayinSettle();

		// Click on Save Button
		takeaway.uTakeAwayclickOnSaveButtoninPaymentProcess();

		// Click on Save Button
		takeaway.uTakeAwayclickOnSave();
		Thread.sleep(5000);

		// Click on Cancel Button
		takeaway.uTakeAwayclickOnCancel();
		

		// Select order
		takeaway.uTakeAwayselectOrder();

		// Click on recall button
		takeaway.uTakeAwayclickOnRecallButton();

		// Click on Settle Button
		takeaway.uTakeAwayclickonSettleButton();

		// Click on Payment Process
		takeaway.uTakeAwayclickOnPaymentProcess();

		// Click on Void Button
		takeaway.uTakeAwayClickonVoidButtoninPaymentSummary();

		// Click on Reasons
		takeaway.uTakeAwayClickOnReasons();

		// Click on Save button
		takeaway.uTakeAwayclickOnSaveButtoninPaymentProcess();

		// Click on Save Button
		takeaway.uTakeAwayclickOnSave();
		Thread.sleep(5000);
		
		System.out.println("TestCase 21 = Test case for delete payment");
		
//		// Click on Cancel Button
//		takeaway.uTakeAwayclickOnCancel();
	}

	@Test(priority = 22 )
	public void TakeAwayAddExtraCharge() throws Exception {


		TakeAwayXpath takeaway = new TakeAwayXpath(driver);

		// Select order
		takeaway.uTakeAwayselectOrder();

		// Click on recall button
		takeaway.uTakeAwayclickOnRecallButton();

		// Click on Extra Charge
		takeaway.uTakeAwayclickOnExtraCharge();

		// Select Extra charge option
		takeaway.uTakeAwayselectExtraCharge();

		// Click on Save Button
		takeaway.uTakeAwayclickOnSave();
		Thread.sleep(5000);

//		// Click on Cancel Button
//		takeaway.uTakeAwayclickOnCancel();
		Thread.sleep(5000);
		
		System.out.println("TestCase 22 = Test case for Add extra charge in order and save it");

	}

	@Test(priority = 23 )
	public void TakeAwayAddMultipleExtraCharge() throws Exception {


		TakeAwayXpath takeaway = new TakeAwayXpath(driver);

		// Select order
		takeaway.uTakeAwayselectOrder();

		// Click on recall button
		takeaway.uTakeAwayclickOnRecallButton();

		// Click on Extra Charge
		takeaway.uTakeAwayclickOnExtraCharge();

		// Select Extra charge option
		takeaway.uTakeAwayselectExtraCharge();

		// Click on Extra Charge
		takeaway.uTakeAwayclickOnExtraCharge();

		// Select Extra charge option
		takeaway.uTakeAwayselectExtraCharge();

		// Click on Save Button
		takeaway.uTakeAwayclickOnSave();
		Thread.sleep(5000);
		
		System.out.println("TestCase 23 = Test case for add multiple extra charge and save it");
	}

	@Test(priority = 24 )
	public void TakeAwayRemoveExtraCharge() throws Exception {


		TakeAwayXpath takeaway = new TakeAwayXpath(driver);

		// Select order
		takeaway.uTakeAwayselectOrder();

		// Click on recall button
		takeaway.uTakeAwayclickOnRecallButton();

		// Click on Extra Charge
		takeaway.uTakeAwayclickOnExtraChargeicon();

		// Select Extra charge option
		takeaway.uTakeAwayclickOnVoidButtonin2ExtraChargeicon();

		// Click on Delete Button
		takeaway.uTakeAwayclickOnDeleteButtoninPOPUP();

		// Click on Reasons
		takeaway.uTakeAwayselectReasonInExtraCharge();

		// Click on Cancel on extra charge popup
		takeaway.uTakeAwayclickOnCancelInExtrachargepopup();

		// Click on Save Button
		takeaway.uTakeAwayclickOnSave();
		Thread.sleep(5000);
		
		System.out.println("TestCase 24 = Test case for remove extra charge from order");
	}

	@Test(priority = 25 )
	public void TakeAwayRemoveMultipleExtraCharge() throws Exception {


		TakeAwayXpath takeaway = new TakeAwayXpath(driver);

		// Select order
		takeaway.uTakeAwayselectOrder();

		// Click on recall button
		takeaway.uTakeAwayclickOnRecallButton();

		// Click on Extra Charge
		takeaway.uTakeAwayclickOnExtraChargeicon();

		// Click on Void button in Extra charge
		takeaway.uTakeAwayclickOnVoidButtoninExtraChargeicon();

		// Click on Delete Button
		takeaway.uTakeAwayclickOnDeleteButtoninPOPUP();

		// Click on Reasons
		takeaway.uTakeAwayselectReasonInExtraCharge();

		// Click on Void button in Extra charge
		takeaway.uTakeAwayclickOnVoidButtonin2ExtraChargeicon();

		// Click on Delete Button
		takeaway.uTakeAwayclickOnDeleteButtoninPOPUP();

		// Click on Reasons
		takeaway.uTakeAwayselectReasonInExtraCharge();

		// Click on Cancel on extra charge popup
		takeaway.uTakeAwayclickOnCancelInExtrachargepopup();

		// Click on Cancel Button
		takeaway.uTakeAwayclickOnSave();
		Thread.sleep(5000);
		
		System.out.println("TestCase 25 = Test case for remove multipl extra charge from order and save it");
	}

	@Test(priority = 26 )
	public void TakeAwayAddExtraChargeAndSettleorder() throws Exception {


		TakeAwayXpath takeaway = new TakeAwayXpath(driver);

		// Select order
		takeaway.uTakeAwayselectOrder();

		// Click on recall button
		takeaway.uTakeAwayclickOnRecallButton();

		// Click on Extra Charge
		takeaway.uTakeAwayclickOnExtraCharge();

		// Select Extra charge option
		takeaway.uTakeAwayselectExtraCharge();

		// Click on Settle Button
		takeaway.uTakeAwayclickonSettleButton();

		// Click on Pay Button in Settle popup
		takeaway.uTakeAwayclickOnPayinSettle();
		Thread.sleep(5000);

		// Click on OK Button in changes DUO popup
		takeaway.uclickOnOKButtoninChangesDuopopup();
		
//		// Click on Cancel Button
//		takeaway.uTakeAwayclickOnCancel();
		Thread.sleep(5000);
		
		System.out.println("TestCase 26 = Test case for saettle order with extra charge");
	}

	@Test(priority = 27 )
	public void TakeAwaySettleOrderWithMultipleExtraCharge() throws Exception {

		TakeAwayXpath takeaway = new TakeAwayXpath(driver);
		
//		// Click on Menu
//		takeaway.uClickonmenu();
//		
//		// Click on Take Away options
//		takeaway.uClickonOrderSummary();

		// Click on Menu
		takeaway.uClickonmenuButton();

		// Click on Take Away options
		takeaway.uClickonTakeAway();

		// Click on Item
		takeaway.uTakeAwayAddItem();

		// Add new Item
		takeaway.uTakeAwayAddNewItem();

		// Click on Extra Charge
		takeaway.uTakeAwayclickOnExtraCharge();

		// Select Extra charge option
		takeaway.uTakeAwayselectExtraCharge();

		// Click on Extra Charge
		takeaway.uTakeAwayclickOnExtraCharge();

		// Select Extra charge option
		takeaway.uTakeAwayselectExtraCharge();

		// Click on Quick Pay Button
		takeaway.uTakeAwayclickOnQucikPayButton();
		
		// Click on Cancel Button
		takeaway.uTakeAwayclickOnCancel();;
		Thread.sleep(5000);
		
		System.out.println("TestCase 27 = Test case for add meultiple extra charge and settle that order");
	}

	@Test(priority = 28 )
	public void TakeAwaySettleCheckValidationOnExtraCharge() throws Exception {


		TakeAwayXpath takeaway = new TakeAwayXpath(driver);

		// Click on Menu
		takeaway.uClickonmenuButton();

		// Click on Take Away options
		takeaway.uClickonTakeAway();

		// Click on Extra Charge
		takeaway.uTakeAwayclickOnExtraCharge();

		// Click on Extra Charge
		takeaway.uclickOnOKButtoninChangesDuopopup();
		Thread.sleep(5000);
		
		System.out.println("TestCase 28 = Test case for check validations on extra charge");

	}

	@Test(priority = 29 )
	public void TakeAwayAddOrderDiscount() throws Exception {


		TakeAwayXpath takeaway = new TakeAwayXpath(driver);
		
		// Click on Item
		takeaway.uTakeAwayAddItem();

//		// Click on Item
//		takeaway.uTakeAwayclickOnItem();

		// Click on Discount Button
		takeaway.uTakeAwayclickOnDiscountButton();

		// Select Order discount option
		takeaway.uTakeAwayselectDiscountonBaseAmount();

		// Click on Save Button
		takeaway.uTakeAwayclickOnSave();
		Thread.sleep(5000);
		
		// Click on Cancel Button
		takeaway.uTakeAwayclickOnCancel();
		Thread.sleep(5000);
		
		System.out.println("TestCase 29 = Test case for add order discount and save it");
		
	}

	@Test(priority = 30 )
	public void TakeAwayAddItemDiscount() throws Exception {


		TakeAwayXpath takeaway = new TakeAwayXpath(driver);

		// Select order
		takeaway.uTakeAwayselectOrder();

		// Click on recall button
		takeaway.uTakeAwayclickOnRecallButton();

		// Click on Item
		takeaway.uTakeAwayclickOnItem();

		// Click on Discount button
		takeaway.uTakeAwayclickOnDiscountButtoninItem();

		// Select Item discount option
		takeaway.uTakeAwayselectItemDiscount();

		// Select Item discount option
		takeaway.uTakeAwaycancelonItem();

		// Click on Save Button
		takeaway.uTakeAwayclickOnSave();
		Thread.sleep(5000);
		
		System.out.println("TestCase 30 = Test case for item discount and save it");
	}

	@Test(priority = 31 )
	public void TakeAwayOrdersettleThroughQuickPay() throws Exception {

		TakeAwayXpath takeaway = new TakeAwayXpath(driver);

		// Select order
		takeaway.uTakeAwayselectOrder();

		// Click on recall button
		takeaway.uTakeAwayclickOnRecallButton();

		// Click on Save Button
		takeaway.uTakeAwayclickOnQucikPayButton();
		Thread.sleep(5000);
		
		System.out.println("TestCase 31 = Test case for settle order through Quick Pay");
	}

	@Test(priority = 32 )
	public void TakeAwayaddBothOrderandItemDiscount() throws Exception {


		TakeAwayXpath takeaway = new TakeAwayXpath(driver);

		// Click on Menu
		takeaway.uClickonmenuButton();

		// Click on Take Away options
		takeaway.uClickonTakeAway();	

		// Add Item
		takeaway.uTakeAwayAddItem();

		// Click on Discount Button
		takeaway.uTakeAwayclickOnDiscountButton();

		// Select Order discount option
		takeaway.uTakeAwayselectDiscountonBaseAmount();
		
		// Click on Item
		takeaway.uTakeAwayclickOnItem();

		// Click on Discount button
		takeaway.uTakeAwayclickOnDiscountButtoninItem();

		// Select Item discount option
		takeaway.uTakeAwayselectItemDiscount();

		// Select Item discount option
		takeaway.uTakeAwaycancelonItem();
		
		// Click on Settle Button
		takeaway.uTakeAwayclickonSettleButton();

		// Click on Pay Button in Settle popup
		takeaway.uTakeAwayclickOnPayinSettle();
		Thread.sleep(5000);

		// Click on OK Button in changes DUO popup
		takeaway.uclickOnOKButtoninChangesDuopopup();
		Thread.sleep(5000);

		// Click on Finish Button
		takeaway.uTakeAwayclickOnCancel();
		Thread.sleep(5000);
		
		System.out.println("TestCase 32 = Test case for add both order discount and item discount and settle order");

	}

	@Test(priority = 33 )
	public void TakeAwayaddMultipleOrderDiscount() throws Exception {


		TakeAwayXpath takeaway = new TakeAwayXpath(driver);

		// Click on Menu
		takeaway.uClickonmenuButton();

		// Click on Take Away options
		takeaway.uClickonTakeAway();

		// Click on Item
		takeaway.uTakeAwayAddItem();

		// Increase the QTY of Item
		takeaway.uTakeAwayFirstItemIncrease();

		// Click on Discount Button
		takeaway.uTakeAwayclickOnDiscountButton();

		// Select Order discount option
		takeaway.uTakeAwayselectDiscountonBaseAmount();

		// Click on Discount Button
		takeaway.uTakeAwayclickOnDiscountButton();

		// Select Order discount option
		takeaway.uTakeAwayselectDiscountonFinalAmount();

		// Click on Discount Button
		takeaway.uTakeAwayclickOnDiscountButton();

		// Select Order discount option
		takeaway.uselectOrderDiscount();

		// Click on Save Button
		takeaway.uTakeAwayclickOnSave();
		
		// Click on Finish Button
		takeaway.uTakeAwayclickOnCancel();
		Thread.sleep(5000);
		
		System.out.println("TestCase 33 = Test case for add multiple order discount");

	}

	@Test(priority = 34 )
	public void TakeAwayaddMultipleItemDiscount() throws Exception {


		TakeAwayXpath takeaway = new TakeAwayXpath(driver);

		// Select order
		takeaway.uTakeAwayselectOrder();

		// Click on recall button
		takeaway.uTakeAwayclickOnRecallButton();

		// Click on Item
		takeaway.uTakeAwayclickOnItem();

		// Click on Discount button
		takeaway.uTakeAwayclickOnDiscountButtoninItem();

		// Select Item discount option
		takeaway.uTakeAwayselectItemDiscount();

		// Click on Discount button
		takeaway.uTakeAwayclickOnDiscountButtoninItem();

		// Select Item discount option
		takeaway.uTakeAwayselect2ItemDiscount();

		// Click on Discount button
		takeaway.uTakeAwayclickOnDiscountButtoninItem();

		// Select Item discount option
		takeaway.uTakeAwayselect3ItemDiscount();

		// Select Item discount option
		takeaway.uTakeAwaycancelonItem();

		// Click on Save Button
		takeaway.uTakeAwayclickOnSave();
		Thread.sleep(5000);
		
		System.out.println("TestCase 34 = Test case for add multiple item discount");
	}

	@Test(priority = 35 )
	public void TakeAwayRemoveOrderDiscount() throws Exception {


		TakeAwayXpath takeaway = new TakeAwayXpath(driver);

		// Select order
		takeaway.uTakeAwayselectOrder();

		// Click on recall button
		takeaway.uTakeAwayclickOnRecallButton();

		// Click on Discount order icon
		takeaway.uTakeAwayclickOnOrderIcon();

		// Click on void icon
		takeaway.uTakeAwayclickOnVoidOrder();

		// Click on void button
		takeaway.uTakeAwayclickOnVoidOrderbutton();

		// Click on void button
		takeaway.uTakeAwayclickOnCancelinOrderpopup();

		// Click on Save Button
		takeaway.uTakeAwayclickOnSave();
//
//		// Click on Save Button
//		takeaway.uTakeAwayclickOnSave();
		Thread.sleep(5000);
		
		System.out.println("TestCase 35 = Test case for order discount from order");

	}

	@Test(priority = 36 )
	public void TakeAwayRemoveItemDiscount() throws Exception {

		TakeAwayXpath takeaway = new TakeAwayXpath(driver);

		// Select order
		takeaway.uTakeAwayselectOrder();

		// Click on recall button
		takeaway.uTakeAwayclickOnRecallButton();

		// Click on Item
		takeaway.uTakeAwayclickOnItem();

		// Click on order icon
		takeaway.uTakeAwayclickOnVoidinItempopup();

		// Click on void icon
		takeaway.uTakeAwayclickOnVoidButtoninItempopup();

		// Click on void icon
		takeaway.uTakeAwaycancelonItem();

		// Click on Save Button
		takeaway.uTakeAwayclickOnSave();
		Thread.sleep(5000);
		
		System.out.println("TestCase 36 = Test case for remove item discount from order");
	}
	
	@Test(priority = 37 )
	public void TakeAwayAddRemovedOrderDiscount() throws Exception {


		TakeAwayXpath takeaway = new TakeAwayXpath(driver);

		// Select order
		takeaway.uTakeAwayselectOrder();

		// Click on recall button
		takeaway.uTakeAwayclickOnRecallButton();

//		// Click on Item
//		takeaway.uTakeAwayclickOnItem();

		// Click on Discount Button
		takeaway.uTakeAwayclickOnDiscountButton();

		// Select Order discount option
		takeaway.uTakeAwayselectDiscountonFinalAmount();

		// Click on Save Button
		takeaway.uTakeAwayclickOnSave();
		Thread.sleep(5000);
		
		System.out.println("TestCase 37 = Test case for again add removed order discount and ");
	}

	@Test(priority = 38 )
	public void TakeAwayAddRemovedItemDiscount() throws Exception {


		TakeAwayXpath takeaway = new TakeAwayXpath(driver);

		// Select order
		takeaway.uTakeAwayselectOrder();

		// Click on recall button
		takeaway.uTakeAwayclickOnRecallButton();

		// Click on Item
		takeaway.uTakeAwayclickOnItem();

		// Click on Discount button
		takeaway.uTakeAwayclickOnDiscountButtoninItem();

		// Select Item discount option
		takeaway.uTakeAwayselect2ItemDiscount();

		// Select Item discount option
		takeaway.uTakeAwaycancelonItem();

		// Click on Save Button
		takeaway.uTakeAwayclickOnSave();
		Thread.sleep(5000);
		
		System.out.println("TestCase 38 = Test case for add again removed item discount");
	}

	@Test(priority = 39 )
	public void TakeAwayaddOpenOrderDiscount() throws Exception {


		TakeAwayXpath takeaway = new TakeAwayXpath(driver);


		// Select order
		takeaway.uTakeAwayselectOrder();

		// Click on recall button
		takeaway.uTakeAwayclickOnRecallButton();

		// Increase the QTY of Item
		takeaway.uTakeAwayFirstItemIncrease();

		// Increase the QTY of Item
		takeaway.uTakeAwayFirstItemIncrease();

		// Click on Discount button
		takeaway.uTakeAwayclickOnDiscountButton();

		// Select Order discount option
		takeaway.uTakeAwayAddOpenOrderDiscount();

		// Click on "2" Button
		takeaway.uTakeAwayClick2inOpenItemDiscount();

		// Click on "0" Button
		takeaway.uTakeAwayClick0inOpenOrderDiscount();

		// Select Item discount option
		takeaway.TakeAwayClickEnterinOpenOrderDiscount();

		// Click on Save Button
		takeaway.uTakeAwayclickOnSave();
		Thread.sleep(5000);
		
		System.out.println("TestCase 39 = Test case for add open order discount " );

	}

	@Test(priority = 40 )
	public void TakeAwayaddOpenItemDiscount() throws Exception {


		TakeAwayXpath takeaway = new TakeAwayXpath(driver);

		// Select order
		takeaway.uTakeAwayselectOrder();

		// Click on recall button
		takeaway.uTakeAwayclickOnRecallButton();

		// Increase the QTY of Item
		takeaway.uTakeAwayFirstItemIncrease();

		// Increase the QTY of Item
		takeaway.uTakeAwayFirstItemIncrease();

		// Click on Item
		takeaway.uTakeAwayclickOnItem();

		// Click on Discount button
		takeaway.uTakeAwayclickOnDiscountButtoninItem();

		// Select open item discount
		takeaway.uTakeAwayAddOpenItemDiscount();

		// Enter 2 in open discount popup
		takeaway.uTakeAwayClick2inOpenItemDiscount();

		// Enter 0 in open discount
		takeaway.uTakeAwayClick0inOpenItemDiscount();

		// Enter
		takeaway.TakeAwayClickEnterinOpenOrderDiscount();

		// Select Item discount option
		takeaway.uTakeAwaycancelonItem();

		// Click on Quick Pay Button
		takeaway.uTakeAwayclickOnQucikPayButton();
		Thread.sleep(5000);
		
		System.out.println("TestCase 40 = Test case for add open item discount");
	}

	@Test(priority = 41 )
	public void TakeAwayAdd100ItemDiscount() throws Exception {


		TakeAwayXpath takeaway = new TakeAwayXpath(driver);

		// Click on Menu
		takeaway.uClickonmenuButton();

		// Click on Take Away options
		takeaway.uClickonTakeAway();

		// Click on Item
		takeaway.uTakeAwayAddItem();
		
		// Click on Item
		takeaway.uTakeAwayclickOnItem();

//		// Click on Item
//		takeaway.uItem();

		// Click on Discount button
		takeaway.uTakeAwayclickOnDiscountButtoninItem();

		// Select open item discount
		takeaway.uTakeAwayAddOpenItemDiscount();

		// Enter 1 in open discount popup
		takeaway.uTakeAwayClick1ItemDiscount();

		// Enter 00 in open discount
		takeaway.uTakeAwayClick00ItemDiscount();

		// Enter
		takeaway.TakeAwayClickEnterinOpenOrderDiscount();

		// Select Item discount option
		takeaway.uTakeAwaycancelonItem();

		// Click on Save Button
		takeaway.uTakeAwayclickOnSave();

		// Click on Save Button
		takeaway.uTakeAwayClickYesButtoninConfirmPopup();
		
	//	 Click on Cancel Button
		takeaway.uTakeAwayclickOnCancel();
		Thread.sleep(5000);
		
		System.out.println("TestCase 41 = Test case for Add 100% Item Discount");
	}

	@Test(priority = 42 )
	public void TakeAwayAdd100OrderDiscount() throws Exception {


		TakeAwayXpath takeaway = new TakeAwayXpath(driver);

		// Click on Menu
		takeaway.uClickonmenuButton();

		// Click on Take Away options
		takeaway.uClickonTakeAway();

		// Click on Item
		takeaway.uTakeAwayAddItem();

		// Click on Discount Button
		takeaway.uTakeAwayclickOnDiscountButton();

		// Click on Discount Button
		takeaway.uTakeAwayApply100OrderDiscount();

		// Enter 1 in open discount popup
		takeaway.uTakeAwayClick1OrderDiscount();

		// Enter 00 in open discount
		takeaway.uTakeAwayClick00OrderDiscount();

		// Enter
		takeaway.TakeAwayClickEnterinOpenOrderDiscount();

		// Click on Save Button
		takeaway.uTakeAwayclickOnSave();

		// Click on Save Button
		takeaway.uTakeAwayClickYesButtoninConfirmPopup();
		
		// Click on Cancel Button
		takeaway.uTakeAwayclickOnCancel();
		Thread.sleep(5000);
		
		System.out.println("TestCase 42 = Test case for Add 100% Order Discount");
	}

	@Test(priority = 43 )
	public void TakeAwayOverwriteItemDiscount() throws Exception {


		TakeAwayXpath takeaway = new TakeAwayXpath(driver);

		// Click on Menu
		takeaway.uClickonmenuButton();

		// Click on Take Away options
		takeaway.uClickonTakeAway();

		// Click on Item
		takeaway.uTakeAwayAddItem();

		// Increase the QTY of Item
		takeaway.uTakeAwayFirstItemIncrease();

		// Click on Item
		takeaway.uTakeAwayclickOnItem();

		// Click on Discount button
		takeaway.uTakeAwayclickOnDiscountButtoninItem();

		// Select open item discount
		takeaway.uTakeAwayAddOpenItemDiscount();

		// Enter 2 in open discount popup
		takeaway.uTakeAwayClick2inOpenItemDiscount1();

		// Enter 0 in open discount
		takeaway.uTakeAwayClick0inOpenItemDiscount1();

		// Enter
		takeaway.TakeAwayClickEnterinOpenOrderDiscount();

		// Click on Discount button
		takeaway.uTakeAwayclickOnDiscountButtoninItem();

		// Select open item discount
		takeaway.uTakeAwayAddOpenItemDiscount();

		// Enter 3 in open discount popup
		takeaway.uTakeAwayClick3inOpenItemDiscount();

		// Enter 0 in open discount
		takeaway.uTakeAwayClick0inOpenItemDiscount1();

		// Enter
		takeaway.TakeAwayClickEnterinOpenOrderDiscount();

		// Click on Overwrite button
		takeaway.uTakeAwayClickOverwriteButton();

		// Select Item discount option
		takeaway.uTakeAwaycancelonItem();

		// Click on Save Button
		takeaway.uTakeAwayclickOnQucikPayButton();
		
		// Click on Cancel Button
		takeaway.uTakeAwayclickOnCancel();
		Thread.sleep(5000);
		
		System.out.println("TestCase 43 = Test case for Overwrite Item Discount");
	}

	@Test(priority = 44 )
	public void TakeAwayAddAutoDiscountOnModifie() throws Exception {


		TakeAwayXpath takeaway = new TakeAwayXpath(driver);

		// Click on Menu
		takeaway.uClickonmenuButton();

		// Click on Take Away options
		takeaway.uClickonTakeAway();

		// Click on Item
		takeaway.uTakeAwayAddModifierItems();

		// Click on Save Button
		takeaway.uTakeAwayClickonSaveButtoninModifier();

		// Click on Item
		takeaway.uTakeAwayClickitemWithMOd();

		// Click on Discount button
		takeaway.uTakeAwayclickOnDiscountButtoninItem();

		// Select Item discount option
		takeaway.uTakeAwayselectItemDiscount();

		// Select Item discount option
		takeaway.uTakeAwaycancelonItem();

		// Click on Save Button
		takeaway.uTakeAwayclickOnSave();
		
		// Click on Cancel Button
		takeaway.uTakeAwayclickOnCancel();
		Thread.sleep(5000);
		
		System.out.println("TestCase 44 = Test case for Add Auto Discount On Modifier");

	}

	@Test(priority = 45 )
	public void TakeAwayAddDiscountOnModifier() throws Exception {


		TakeAwayXpath takeaway = new TakeAwayXpath(driver);

		// Select order
		takeaway.uTakeAwayselectOrder();

		// Click on recall button
		takeaway.uTakeAwayclickOnRecallButton();

		// Click on item which has Modifier
		takeaway.uTakeAwayClickonModifierItem();

		// Click on Discount button
		takeaway.uTakeAwayClickonDiscountinModifier();

		// Select Item discount option
		takeaway.uTakeAwayselectItemDiscount();

		// Select Item discount option
		takeaway.uTakeAwaycancelonItem();

		// Click on Pay button
		takeaway.uTakeAwayclickOnQucikPayButton();
		Thread.sleep(5000);
		
		System.out.println("TestCase 03 = Test case for Add Discount On Modifier");

	}

	@Test(priority = 46 )
	public void TakeAwayAddBulkItemDiscount() throws Exception {


		TakeAwayXpath takeaway = new TakeAwayXpath(driver);

		// Click on Menu
		takeaway.uClickonmenuButton();

		// Click on Take Away options
		takeaway.uClickonTakeAway();

		// Add Second item
		takeaway.uTakeAwayAddFourthItem();

		// Add Fourth item
		takeaway.uTakeAwayAddFifthItem();

		// Add Fifth item
		takeaway.uTakeAwayAddSixthItem();

		// Click on More options
		takeaway.uTakeAwayClickonMoreoptions();

		// Click on Select All order
		takeaway.uTakeAwayClickonSelectAll();

		// Click on Discount in Bulk Items
		takeaway.uTakeAwayClickonDiscountinBulkItems();

		// Click on Discount in Bulk Items
		takeaway.uTakeAwayselectBulkDiscount();

		// Click on Close icon
		takeaway.uTakeAwayClickonCloseicon();

		// Click on Save Button
		takeaway.uTakeAwayclickOnSave();
		
		// Click on Cancel Button
		takeaway.uTakeAwayclickOnCancel();
		Thread.sleep(5000);
		
		System.out.println("TestCase 46 = Test case for Add Bulk Item Discount");

	}

	@Test(priority = 47 )
	public void TakeAwayRemoveBulkItemDiscount() throws Exception {


		TakeAwayXpath takeaway = new TakeAwayXpath(driver);

//		// Click on Menu
//		takeaway.uClickonmenu();
//		
//		// Click on Take Away options
//		takeaway.uClickonOrderSummary();

		// Select order
		takeaway.uTakeAwayselectOrder();

		// Click on recall button
		takeaway.uTakeAwayclickOnRecallButton();

		// Click on More options
		takeaway.uTakeAwayClickonMoreoptions();

		// Click on Select All order
		takeaway.uTakeAwayClickonSelectAll();

		// Click on Void Discount
		takeaway.uTakeAwayClickonVoidDiscount();

		// Select Discount for void
		takeaway.uTakeAwayselectDiscountonBulkDiscount();

		// Click on Void Button
		takeaway.uTakeAwayClickonVoidButton();

		// Click on Void Button in Void item discount popup
		takeaway.uTakeAwayVoiditemdiscountpopup();

		// Click on Close icon
		takeaway.uTakeAwayClickonCloseicon();

		// Click on Save Button
		takeaway.uTakeAwayclickOnQucikPayButton();
		Thread.sleep(5000);
		
		System.out.println("TestCase 47 = Test case for Remove Bulk Item Discount");
	}

	@Test(priority = 48 )
	public void TakeAwayHoldItem() throws Exception {


		TakeAwayXpath takeaway = new TakeAwayXpath(driver);

		// Click on Menu
		takeaway.uClickonmenuButton();

		// Click on Take Away options
		takeaway.uClickonTakeAway();

		// Add Item
		takeaway.uTakeAwayAddItem();

		// Click on More options
		takeaway.uTakeAwayClickonMoreoptions();

		// Click on Select All order
		takeaway.uTakeAwayClickonSelectAll();

		// Click on Hold Button
		takeaway.uTakeAwayClickonHoldButton();

		// Click on Hold Button in Hold Item popup
		takeaway.uTakeAwayClickonHoldButtoninHoldItemPopup();

		// Click on Close icon
		takeaway.uTakeAwayClickonCloseicon();

		// Click on Save Button
		takeaway.uTakeAwayclickOnSave();
		
		// Click on Cancel Button
		takeaway.uTakeAwayclickOnCancel();
		Thread.sleep(5000);
		
		System.out.println("TestCase 48 = Test case for Hold Item");
	}

	@Test(priority = 49 )
	public void TakeAwayFireItem() throws Exception {

		TakeAwayXpath takeaway = new TakeAwayXpath(driver);

//		// Click on Menu
//		takeaway.uClickonmenu();
//		
//		// Click on Take Away options
//		takeaway.uClickonOrderSummary();

		// Select order
		takeaway.uTakeAwayselectOrder();

		// Click on recall button
		takeaway.uTakeAwayclickOnRecallButton();

//		// Click on Item
//		takeaway.uTakeAwayclickOnItem();

		// Click on More options
		takeaway.uTakeAwayClickonMoreoptions();

		// Click on Select All order
		takeaway.uTakeAwayClickonSelectAll();

		// Click on Fire Button
		takeaway.uTakeAwayClickonFireButton();

		// Click on Fire Button in Hold Item popup
		takeaway.uTakeAwayClickonFireButtoninHoldItemPopup();

		// Click on Close icon
		takeaway.uTakeAwayClickonCloseicon();

		// Click on Save Button
		takeaway.uTakeAwayclickOnQucikPayButton();
		
		System.out.println("TestCase 49 = Test case for Fire Item.");
		
		driver.close();
	}

}
