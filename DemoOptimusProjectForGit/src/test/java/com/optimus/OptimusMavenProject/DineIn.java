package com.optimus.OptimusMavenProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DineIn {
	
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
		
		Thread.sleep(5000);

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
	public void TakeOrder() throws Exception {

		Pages dinein = new Pages(driver);
		
		// Click On Order Notification
		dinein.uclickOnOrderNotification();

		// Click on Plus icon
		dinein.uclickonPlus();

		// Click on Save button
		dinein.uclickonSaveButton();

		// Click on Item
		dinein.uclickonItem();

		// Click on Course
		dinein.uselectCourse();

		// Click on Finish Button
		dinein.uclickonFinishButton();

		// Click on Save button on Order
		dinein.uclickOnSaveButtoninOrder();
		Thread.sleep(5000);
		
		System.out.println("TestCase 02 = Test case for Check the take order with Single item");
		 
	}

	@Test(priority = 3 )
	public void RecallOrder() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonTable();

		// Click on Recall button
		dinein.uclickOnRecall();

		// Click on Item
		dinein.uclickOnQTYPlus();

		// Click on Save button on Order
		dinein.uclickOnSaveButtoninOrder();
		Thread.sleep(5000); 
		
		System.out.println("TestCase 03 = Test case for Check with recall order and increase QTY of item");
	}

	@Test(priority = 4 )
	public void RecallOrderandDecreaseQTY() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonTable();

		// Click on Recall button
		dinein.uclickOnRecall();

		// Click on Item
		dinein.uclickOnDecereasedQTY();

		// Click on Void Button
		dinein.uclickOnVoid();

		// Select reason
		dinein.uClickOnReasons();

		// Click on Save button on Order
		dinein.uclickOnSaveButtoninOrder();
		Thread.sleep(5000); 
		
		System.out.println("TestCase 04 = Test case for Check with recall order and decrease QTY of item");
	}
	
	@Test(priority = 5 )
	public void RecallOrderAddItem() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonTable();

		// Click on Recall button
		dinein.uclickOnRecall();

		// Add First Item
		dinein.uaddFirstItem();

		// Click on Course
		dinein.uselectCourse();

		// Click on Finish Button
		dinein.uclickonFinishButton();

		// Click on Save button on Order
		dinein.uclickOnSaveButtoninOrder();
		Thread.sleep(5000);
		
		System.out.println("TestCase 05 = Test case for recall order and add new item on order");
	}

	@Test(priority = 6 )
	public void AddMultipleItem() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonTable();

		// Click on Recall button
		dinein.uclickOnRecall();

		// Add First Item
		dinein.uaddSecondItem();

		// Click on Course
		dinein.uselectCourse();

		// Click on Finish Button
		dinein.uclickonFinishButton();

		// Add Second Item
		dinein.uaddThirdItem();

		// Click on Course
		dinein.uselectCourse();

		// Click on Finish Button
		dinein.uclickonFinishButton();

		// Click on Save button on Order
		dinein.uclickOnSaveButtoninOrder();
		Thread.sleep(5000);
		
		System.out.println("TestCase 06 = Test case for add multiple items in order");
	}

	@Test(priority = 7 )
	public void addModifierItem() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonTable();

		// Click on Recall button
		dinein.uclickOnRecall();

		// Add First Item
		dinein.uaddItem();

		// Click on Course
		dinein.uselectCourse();

		// Click on Finish Button
		dinein.uclickonFinishButton();

//		// Add Second Item
//		dinein.uaddModifierItem();
//		
//		// Click on Course
//		dinein.uselectCourse();

		// Click on Save button in Modifier popup
		dinein.uSaveButtonOnModifier();

//		// Click on Finish Button
//		dinein.uclickonFinishButton();

		// Click on Save button on Order
		dinein.uclickOnSaveButtoninOrder();
		Thread.sleep(5000); 
		
		System.out.println("TestCase 07 = Test case for add modifier item");
	}

	@Test(priority = 8 )
	public void IncreaseMultipleItemQTY() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonTable();

		// Click on Recall button
		dinein.uclickOnRecall();

		// Add First Item
		dinein.uFirstItemIncrease();

		// Add Second Item
		dinein.uSecondItemIncrease();

		// Add Third Item
		dinein.uThirdItemIncrease();

		// Click on Save button on Order
		dinein.uclickOnSaveButtoninOrder();
		Thread.sleep(5000); 
		
		System.out.println("TestCase 08 = Test case for check with recall order and increase the QTY of multiple items");
	}

	@Test(priority = 9 )
	public void voidItem() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonTable();

		// Click on Recall button
		dinein.uclickOnRecall();

		// Click on void icon on item
		dinein.uclickOnVoidItem();

		// Click on Void Button
		dinein.uclickOnVoid();

		// Select reason
		dinein.uClickOnReasons();

		// Click on Save button on Order
		dinein.uclickOnSaveButtoninOrder();
		Thread.sleep(5000); 
		
		System.out.println("TestCase 09 = Test case for recall order and void item");
	}

	@Test(priority = 10 )
	public void voidMultipleItem() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonTable();

		// Click on Recall button
		dinein.uclickOnRecall();

		// Add First Item
		dinein.uclickOnVoidItem();

		// Click on Void Button
		dinein.uclickOnVoid();

		// Select reason
		dinein.uClickOnReasons();

		// Add First Item
		dinein.uclickOnVoidItem();

		// Click on Void Button
		dinein.uclickOnVoid();

		// Select reason
		dinein.uClickOnReasons();
		
		// Add First Item
		dinein.uclickOnVoidItem();

		// Click on Void Button
		dinein.uclickOnVoid();

		// Select reason
		dinein.uClickOnReasons();

		// Click on Save button on Order
		dinein.uclickOnSaveButtoninOrder();
		Thread.sleep(5000); 
		
		System.out.println("TestCase 10 = Test case for void multiple items");
	}

	@Test(priority = 11 )
	public void voidModifierItem() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonTable();

		// Click on Recall button
		dinein.uclickOnRecall();

		// Click on Item
		dinein.uclickOnModifierItem();

		// Click on Modifier Section
		dinein.uclickOnModifier();

		// Click on Remove button on modifier item
		dinein.uclickOnRemoveOnModifier();

		// Click on Void Button
		dinein.uclickOnVoid();

		// Select reason
		dinein.uClickOnReasons();

		// Click on Save button in modifier
		dinein.uSaveButtonOnModifier();

		// Click on Cancel icon in item popup
		dinein.uclickOnCancelinItemPopup();

		// Click on Save button on Order
		dinein.uclickOnSaveButtoninOrder();
		Thread.sleep(5000); 
		
		System.out.println("TestCase 11 = Test case for void modifier item");
	}

	@Test(priority = 12 )
	public void checkValidation() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonTable();

		// Click on Recall button
		dinein.uclickOnRecall();

		// Click on void button on Item
		dinein.uclickOnVoidItem();

		// Click on Void Button
		dinein.uclickOnVoid();

		// Select reason
		dinein.uClickOnReasons();

		// Click on Save button on Order
		dinein.uclickOnSaveButtoninOrder();

		// Click on OK button on validation message popup
		dinein.uclickonOKButton();
		Thread.sleep(5000); 
		
		System.out.println("TestCase 12 = Check case of delete all items in order then try to save order so validation message should be display");

	}

	@Test(priority = 13 )
	public void voidItemThroughItemPopup() throws Exception {

		Pages dinein = new Pages(driver);

		// Add First Item
		dinein.uaddFirstItem();

		// Click on Course
		dinein.uselectCourse();

		// Click on Finish Button
		dinein.uclickonFinishButton();

		// Add Second Item
		dinein.uaddSecondItem();

		// Click on Course
		dinein.uselectCourse();

		// Click on Finish Button
		dinein.uclickonFinishButton();

		// Click on Save button on Order
		dinein.uclickOnSaveButtoninOrder();

		// Click on Plus icon
		dinein.uclickonTable();

		// Click on Recall button
		dinein.uclickOnRecall();

		// Click on Item
		dinein.uclickonFirstItem();

		// Click on Void Button
		dinein.uclickOnVoid();

		// Select reason
		dinein.uClickOnReasons();

		// Click on Save button on Order
		dinein.uclickOnSaveButtoninOrder();
		Thread.sleep(5000); 
		
		System.out.println("TestCase 13 = Test case for Check void item through Item detail popup");
	}

	@Test(priority = 14 )
	public void VoidOrder() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonTable();

		// Click on void Button
		dinein.uclickonVoidButton();

		// Click on void Option
		dinein.uclickOnVoid();

		// Select reason
		dinein.uClickOnReasons();
		Thread.sleep(5000);
		
		System.out.println("TestCase 14 = Test case of void order in table");
		
//		// Click on Save button on Order
//		dinein.uclickOnSave();
		 
	}

	@Test(priority = 15 )
	public void VoidMultipleOrder() throws Exception {

		Pages dinein = new Pages(driver);

// Create a First order

		// Click on Plus icon
		dinein.uclickonPlus();

		// Click on Save button
		dinein.uclickonSaveButton();

		// Click on Item
		dinein.uclickonItem();

		// Click on Course
		dinein.uselectCourse();

		// Click on Finish Button
		dinein.uclickonFinishButton();

		// Click on Save button on Order
		dinein.uclickOnSaveButtoninOrder();

// Create a second order

		// Click on Table section
		dinein.uclickonTable();

		// Click on Plus icon
		dinein.uclickonPlusIcon();

		// Click on Save button
		dinein.uclickSaveButton();

		// Click on Item
		dinein.uclickonItem();

		// Click on Course
		dinein.uselectCourse();

		// Click on Finish Button
		dinein.uclickonFinishButton();

		// Click on Save button on Order
		dinein.uclickOnSaveButtoninOrder();

// Create a Third order

		// Click on Table section
		dinein.uclickonTable();

		// Click on Plus icon
		dinein.uclickonPlusIcon();

		// Click on Save button
		dinein.uclickSaveButton();

		// Click on Item
		dinein.uclickonItem();

		// Click on Course
		dinein.uselectCourse();

		// Click on Finish Button
		dinein.uclickonFinishButton();

		// Click on Save button on Order
		dinein.uclickOnSaveButtoninOrder();

// Create a Fourth order

		// Click on Table section
		dinein.uclickonTable();

		// Click on Plus icon
		dinein.uclickonPlusIcon();

		// Click on Save button
		dinein.uclickSaveButton();

		// Click on Item
		dinein.uclickonItem();

		// Click on Course
		dinein.uselectCourse();

		// Click on Finish Button
		dinein.uclickonFinishButton();

		// Click on Save button on Order
		dinein.uclickOnSaveButtoninOrder();

// Create a fifth order

		// Click on Table section
		dinein.uclickonTable();

		// Click on Plus icon
		dinein.uclickonPlusIcon();

		// Click on Save button
		dinein.uclickSaveButton();

		// Click on Item
		dinein.uclickonItem();

		// Click on Course
		dinein.uselectCourse();

		// Click on Finish Button
		dinein.uclickonFinishButton();

		// Click on Save button on Order
		dinein.uclickOnSaveButtoninOrder();

// Click on All checkbox in order section

		// Click on Table section
		dinein.uclickonTable();

		// Click on All checkbox in table section
		dinein.uclickOnSelectAll();

		// Click on Void button
		dinein.uclickonDeleteButton();

		// Select void option
		dinein.uclickOnVoid();

		// Select reason
		dinein.uClickOnReasons();
		Thread.sleep(5000); 
		
		System.out.println("TestCase 15 = Test case of create a new multiple order and void that multiple order through a selection ");
	}

	@Test(priority = 16 )
	public void QuickPay() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonPlus();

		// Click on Save button
		dinein.uclickonSaveButton();

		// Click on Item
		dinein.uclickonItem();

		// Click on Course
		dinein.uselectCourse();

		// Click on Finish Button
		dinein.uclickonFinishButton();

		// Click on Quick Pay button to Settle Order
		dinein.uclickOnPayButton();
		Thread.sleep(5000);
		
		System.out.println("TestCase 16 = Test case for creating new order and quick pay");
	}

	@Test(priority = 17 )
	public void RecallOrderQuickPay() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonPlus();

		// Click on Save button
		dinein.uclickonSaveButton();

		// Click on Item
		dinein.uclickonItem();

		// Click on Course
		dinein.uselectCourse();

		// Click on Finish Button
		dinein.uclickonFinishButton();

		// Click on Save button on Order
		dinein.uclickOnSaveButtoninOrder();

		// Click on Table section
		dinein.uclickonTable();

		// Click on Recall button
		dinein.uclickOnRecall();

		// Click on Quick Pay button to Settle Order
		dinein.uclickOnPayButton();
		Thread.sleep(5000);
		
		System.out.println("TestCase 17 = Test case for recall order and click on Quick pay");
	}

	@Test(priority = 18 )
	public void SettleOrderwithCash() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonPlus();

		// Click on Save button
		dinein.uclickonSaveButton();

		// Click on Item
		dinein.uclickonItem();

		// Click on Course
		dinein.uselectCourse();

		// Click on Finish Button
		dinein.uclickonFinishButton();

		// Click on Settle Button
		dinein.uclickonSettleButton();

		// Click on Pay Button in Settle popup
		dinein.uclickonPayButton();
		Thread.sleep(5000);

		// Click on Ok Button in changes DUO popup
		dinein.uclickOnOKButtoninChangesDuopopup();
		Thread.sleep(5000); 
		
		System.out.println("TestCase 18 = Test case for settle order with cash");
	}

	@Test(priority = 19 )
	public void SettleOrderwithBank() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonPlus();

		// Click on Save button
		dinein.uclickonSaveButton();

		// Click on Item
		dinein.uclickonItem();

		// Click on Course
		dinein.uselectCourse();

		// Click on Finish Button
		dinein.uclickonFinishButton();

		// Click on Settle Button
		dinein.uclickonSettleButton();

		// Click on Bank Section
		dinein.uclickOnBank();

		// Select bank pay option
		dinein.uselectBankPayoption();

		// Click on Pay Button in Settle popup
		dinein.uclickonPayButton();
		Thread.sleep(5000);
		
//		// Click on OK Button in changes DUO popup
//		dinein.uclickOnOKButton();
		
		System.out.println("TestCase 19 = Test case for settle order with different bank option");
		 
	}

	@Test(priority = 20 )
	public void CashwithSurcharge() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonPlus();

		// Click on Save button
		dinein.uclickonSaveButton();

		// Click on Item
		dinein.uclickonItem();

		// Click on Course
		dinein.uselectCourse();

		// Click on Finish Button
		dinein.uclickonFinishButton();

		// Click on Settle Button
		dinein.uclickonSettleButton();

		// Click on Cash Section
		dinein.uclickOnCash();

		// Select Cash pay option
		dinein.uselectCashPayoption();

		// Click on Pay Button in Settle popup
		dinein.uclickonPayButton();

		// Click on Apply Button in Surcharge Confirmation popup
		dinein.uclickOnApplyButton();
		Thread.sleep(5000);

		// Click on OK Button in changes DUO popup
		dinein.uclickOnOKButtoninChangesDuopopup();
		Thread.sleep(5000);
		
		System.out.println("TestCase 20 = Test case for settle the order with cash which has an active surcharge");
	}

	@Test(priority = 21 )
	public void BankwithSurcharge() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uAddOrder();

		// Click on Save button
		dinein.uclickonSaveButton();

		// Click on Item
		dinein.uclickonItem();

		// Click on Course
		dinein.uselectCourse();

		// Click on Finish Button
		dinein.uclickonFinishButton();

		// Click on Settle Button
		dinein.uclickonSettleButton();

		// Click on Bank Section
		dinein.uclickOnBank();

		// Select bank pay option
		dinein.uselectBankPayoptionwithSurcharge();

		// Click on Pay Button in Settle popup
		dinein.uclickonPayButton();

		// Click on Apply Button in Surcharge Confirmation popup
		dinein.uclickOnApplyButton();
		Thread.sleep(5000);
		
//		// Click on OK Button in changes DUO popup
//		dinein.uclickOnOKButtoninChangesDuopopup();
		
		System.out.println("TestCase 21 = Test case for settle the order with Bank pay which has an active surcharge");
		 
	}

	@Test(priority = 22 )
	public void settleOrderwithCredit() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonPlus();

		// Click on Save button
		dinein.uclickonSaveButton();

		// Click on Item
		dinein.uclickonItem();

		// Click on Course
		dinein.uselectCourse();

		// Click on Finish Button
		dinein.uclickonFinishButton();

		// Click on Settle Button
		dinein.uclickonSettleButton();

		// Click on Credit Section
		dinein.uclickCreditSection();

		// Select Credit account option
		dinein.uselectCreditoption();

		// Click on Pay Button in Settle popup
		dinein.uclickonPayButton();

		// Click on "Proceed with Posting" option in Confirma popup
		dinein.uCreditConfrimOption();
		Thread.sleep(5000); 
		
		System.out.println("TestCase 22 = Test case for settle order with credit option");

	}

	@Test(priority = 23 )
	public void CreditwithInsufficientBalance() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonPlus();

		// Click on Save button
		dinein.uclickonSaveButton();

		// Click on Item
		dinein.uclickonItem();

		// Click on Course
		dinein.uselectCourse();

		// Click on Finish Button
		dinein.uclickonFinishButton();

		// Click on QTY
		dinein.uclickonQTY();

		// Click on "2" number
		dinein.uclickon2();

		// Click on "0" number
		dinein.uclickon0();

		// Click Enter button
		dinein.uclickonEnter();

		// Click on Settle Button
		dinein.uclickonSettleButton();

		// Click on Credit Section
		dinein.uclickCreditSection();

		// Select Credit account option
		dinein.uselectCreditAccount();

		// Click on Pay Button in Settle popup
		dinein.uclickonPayButton();

		// Click on Pay Button in Settle popup
		dinein.uclickOnContinue();

		// Click on "Proceed with Posting" option in Confirma popup
		dinein.uCreditConfrimOption();
		Thread.sleep(5000); 
		
		System.out.println("TestCase 23 = Test case for settle order with credit option with proceed with posting section");

	}

	@Test(priority = 24 )
	public void settleOrderwithCreditUpdateGuestInfo() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonPlus();

		// Click on Save button
		dinein.uclickonSaveButton();

		// Click on Item
		dinein.uclickonItem();

		// Click on Course
		dinein.uselectCourse();

		// Click on Finish Button
		dinein.uclickonFinishButton();

		// Click on Settle Button
		dinein.uclickonSettleButton();

		// Click on Credit Section
		dinein.uclickCreditSection();

		// Select Credit account option
		dinein.uselectCreditoption();

		// Click on Pay Button in Settle popup
		dinein.uclickonPayButton();

		// Click on "Proceed with Posting" option in Confirma popup
		dinein.uCreditConfrimOption();
		Thread.sleep(5000);
		
		System.out.println("TestCase 24 = Test case for settle order through Credit account which has not sufficient Balance");

	}

	@Test(priority = 25 )
	public void settleOrderwithRoomPost() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonPlus();

		// Click on Save button
		dinein.uclickonSaveButton();

		// Click on Item
		dinein.uclickonItem();

		// Click on Course
		dinein.uselectCourse();

		// Click on Finish Button
		dinein.uclickonFinishButton();

		// Click on Settle Button
		dinein.uclickonSettleButton();

		// Click on Posting Section
		dinein.uclickonPosting();

		// Select Posting Pay option
		dinein.uselectPostingPay();

		// Click on Pay Button in Settle popup
		dinein.uclickonPayButton();

		// Click on Yes button in confirm popup
		dinein.uclickOnYes();
		Thread.sleep(5000); 
		
		System.out.println("TestCase 25 = Test case for settle order with Room posting");
	}

	@Test(priority = 26 )
	public void settleOrderPartially() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonPlus();

		// Click on Save button
		dinein.uclickonSaveButton();

		// Click on Item
		dinein.uclickonItem();

		// Click on Course
		dinein.uselectCourse();

		// Click on Finish Button
		dinein.uclickonFinishButton();

		// Click on Settle Button
		dinein.uclickonSettleButton();

		// Click on "1" button
		dinein.uclickOn1();

		// Click on "00" button
		dinein.uclickOn00();

		// Click on Pay Button in Settle popup
		dinein.uclickOnPayinSettle();

		// Click on Save Button
		dinein.uclickOnSaveinSettle();

		// Click on Save Button
		dinein.uclickOnSaveButtoninOrder();

		// Click on Plus icon
		dinein.uclickonTable();

		// Click on Recall button
		dinein.uclickOnRecall();

		// Click on Settle Button
		dinein.uclickonSettleButton();

		// Click on Pay Button in Settle popup
		dinein.uclickonPayButton();
		Thread.sleep(5000);

		// Click on Ok Button in changes DUO popup
		dinein.uclickOnOKButtoninChangesDuopopup();
		Thread.sleep(5000); 
		
		System.out.println("TestCase 26 = Test case for do settle order in partially");
	}

	@Test(priority = 27 )
	public void settleOrderwithOtherCurrency() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonPlus();

		// Click on Save button
		dinein.uclickonSaveButton();

		// Click on Item
		dinein.uclickonItem();

		// Click on Course
		dinein.uselectCourse();

		// Click on Finish Button
		dinein.uclickonFinishButton();

		// Click on Settle Button
		dinein.uclickonSettleButton();

		// Click on Currency
		dinein.uclickOnCurrecny();

		// Select Currency option
		dinein.uclickOnCurrecnyOption();

		// Click on Pay Button in Settle popup
		dinein.uclickOnPayinSettle();
		Thread.sleep(5000);

		// Click on Ok Button in changes DUO popup
		dinein.uclickOnOKButtoninChangesDuopopup();
		Thread.sleep(5000); 
		
		System.out.println("TestCase 27 = Test case for settle payment with other currency");
	}

	@Test(priority = 28 )
	public void settleOrderwithTwoCurrency() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonPlus();

		// Click on Save button
		dinein.uclickonSaveButton();

		// Click on Item
		dinein.uclickonItem();

		// Click on Course
		dinein.uselectCourse();

		// Click on Finish Button
		dinein.uclickonFinishButton();

		// Click on Settle Button
		dinein.uclickonSettleButton();

		// Click on "1" button
		dinein.uclickOn1();

		// Click on "00" button
		dinein.uclickOn00();

		// Click on Pay Button in Settle popup
		dinein.uclickOnPayinSettle();

		// Click on Save Button
		dinein.uclickOnSaveinSettle();

		// Click on Save Button
		dinein.uclickOnSaveButtoninOrder();

		// Click on Plus icon
		dinein.uclickonTable();

		// Click on Recall button
		dinein.uclickOnRecall();

		// Click on Settle Button
		dinein.uclickonSettleButton();

		// Click on Currency
		dinein.uclickOnCurrecny();

		// Select Currency option
		dinein.uclickOnCurrecnyOption();

		// Click on Pay Button in Settle popup
		dinein.uclickOnPayinSettle();
		Thread.sleep(5000);

		// Click on Ok Button in changes DUO popup
		dinein.uclickOnOKButtoninChangesDuopopup();
		Thread.sleep(5000); 
		
		System.out.println("TestCase 28 = Test case for make Payment partially with first pay in default currency and then pay in other currency ");
	}

	@Test(priority = 29 )
	public void DeletePayment() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonPlus();

		// Click on Save button
		dinein.uclickonSaveButton();

		// Click on Item
		dinein.uclickonItem();

		// Click on Course
		dinein.uselectCourse();

		// Click on Finish Button
		dinein.uclickonFinishButton();

		// Click on Settle Button
		dinein.uclickonSettleButton();

		// Click on "1" button
		dinein.uclickOn1();

		// Click on "00" button
		dinein.uclickOn00();

		// Click on Pay Button in Settle popup
		dinein.uclickOnPayinSettle();

		// Click on Save Button
		dinein.uclickOnSaveinSettle();

		// Click on Save Button
		dinein.uclickOnSaveButtoninOrder();

		// Click on Plus icon
		dinein.uclickonTable();

		// Click on Recall button
		dinein.uclickOnRecall();

		// Click on Settle Button
		dinein.uclickonSettleButton();

		// Click on Payment Process
		dinein.uclickOnPaymentProcess();

		// Click on Void Button
		dinein.uclickOnVoidButton();

		// Click on Reasons
		dinein.uClickOnReasons();

		// Click on Save button
		dinein.uclickOnSaveButtoninPaymentProcess();

		// Click on Save Button
		dinein.uclickOnSaveButtoninOrder();
		Thread.sleep(5000); 
		
		System.out.println("TestCase 29 = Test case for Delete Payment in payment summary");
	}

	@Test(priority = 30 )
	public void addExtraCharge() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonTable();

		// Click on Recall button
		dinein.uclickOnRecall();

		// Click on Extra Charge
		dinein.uclickOnExtraCharge();

		// Select Extra charge option
		dinein.uselectExtraCharge();

		// Click on Save Button
		dinein.uclickOnSaveButtoninOrder();
		Thread.sleep(5000); 
		
		System.out.println("TestCase 30 = Test case of adding single extra charge in order and save that order");
	}

	@Test(priority = 31 )
	public void multipleExtraCharge() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonTable();

		// Click on Recall button
		dinein.uclickOnRecall();

		// Click on Extra Charge
		dinein.uclickOnExtraCharge();

		// Select Extra charge option
		dinein.uselectExtraCharge();

		// Click on Save Button
		dinein.uclickOnSaveButtoninOrder();

		// Click on Plus icon
		dinein.uclickonTable();

		// Click on Recall button
		dinein.uclickOnRecall();

		// Click on Extra Charge
		dinein.uclickOnExtraCharge();

		// Select Extra charge option
		dinein.uselectExtraCharge();

		// Click on Save Button
		dinein.uclickOnSaveButtoninOrder();
		Thread.sleep(5000);
		
		System.out.println("TestCase 31 = Test case of adding Multiple extra charge in order and save that order");
	}

	@Test(priority = 32 )
	public void removeExtraCharge() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonTable();

		// Click on Recall button
		dinein.uclickOnRecall();

		// Click on Extra Charge
		dinein.uclickOnExtraChargeicon();

		// Select Extra charge option
		dinein.uclickOnVoidButtoninExtraChargeicon();

		// Click on Delete Button
		dinein.uclickOnDeleteButtoninExtraChargeicon();

		// Click on Reasons
		dinein.uselectReasonInExtraCharge();

		// Click on Cancel on extra charge popup
		dinein.uclickOnCancelInExtrachargepopup();

		// Click on Save Button
		dinein.uclickOnSaveButtoninOrder();
		Thread.sleep(5000); 
		
		System.out.println("TestCase 32 = Test case of remove extra charge from order and save that order");

	}

	@Test(priority = 33 )
	public void removeMultipleExtraCharge() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonTable();

		// Click on Recall button
		dinein.uclickOnRecall();

		// Click on Extra Charge icon
		dinein.uclickOnExtraChargeicon();

		// First Extra charge for void
		dinein.uclickOnVoidButtoninExtraChargeicon();

		// Click on Delete Button
		dinein.uclickOnDeleteButtoninExtraChargeicon();

		// Click on Reasons
		dinein.uselectReasonInExtraCharge();

		// Second Extra charge for void
		dinein.uclickOnVoidButtonin2ExtraChargeicon();

		// Click on Delete Button
		dinein.uclickOnDeleteButtoninExtraChargeicon();

		// Click on Reasons
		dinein.uselectReasonInExtraCharge();

		// Click on Cancel in extra charge popup
		dinein.uclickOnCancelInExtrachargepopup();

		// Click on Save Button
		dinein.uclickOnSaveButtoninOrder();
		Thread.sleep(5000); 
		
		System.out.println("TestCase 33 = Test case of remove multiple extra charge from order and save that order");

	}

	@Test(priority = 34 )
	public void QuickPayOrderwithExtraCharge() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonTable();

		// Click on Recall button
		dinein.uclickOnRecall();

		// Click on Extra Charge
		dinein.uclickOnExtraCharge();

		// Select Extra charge option
		dinein.uselectExtraCharge();

		// Click on Quick Pay Button
		dinein.uclickOnPayButton();
		Thread.sleep(5000);
		
		System.out.println("TestCase 34 = Test case of adding single extra charge in settle order through Quick pay");
	}

	@Test(priority = 35 )
	public void settleOrderwithExtraCharge() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonPlus();

		// Click on Save button
		dinein.uclickonSaveButton();

		// Click on Item
		dinein.uclickonItem();

		// Click on Course
		dinein.uselectCourse();

		// Click on Finish Button
		dinein.uclickonFinishButton();

		// Click on Extra Charge
		dinein.uclickOnExtraCharge();

		// Select Extra charge option
		dinein.uselectExtraCharge();

		// Click on Settle Button
		dinein.uclickonSettleButton();

		// Click on Pay Button in Settle popup
		dinein.uclickonPayButton();
		Thread.sleep(5000);

		// Click on Ok Button in changes DUO popup
		dinein.uclickOnOKButtoninChangesDuopopup();
		Thread.sleep(5000); 
		
		System.out.println("TestCase 35 = Test case of adding single extra charge in settle order");
	}

	@Test(priority = 36 )
	public void SettledOrderwithmultipleExtraCharge() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonPlus();

		// Click on Save button
		dinein.uclickonSaveButton();

		// Click on Item
		dinein.uclickonItem();

		// Click on Course
		dinein.uselectCourse();

		// Click on Finish Button
		dinein.uclickonFinishButton();

		// Add First on Extra Charge
		dinein.uclickOnExtraCharge();

		// Select Extra charge option
		dinein.uselectExtraCharge();

		// Click on Extra Charge
		dinein.uclickOnExtraCharge();

		// Add Second Extra charge option
		dinein.uselectExtraCharge();

		// Click on Extra Charge
		dinein.uclickOnExtraCharge();

		// Add Third Extra charge option
		dinein.uselectExtraCharge();

		// Click on Quick Pay Button
		dinein.uclickOnPayButton();
		Thread.sleep(5000); 
		
		System.out.println("TestCase 36 = Test case for add mutliple extra charge in order and settled that order");

	}

	@Test(priority = 37 )
	public void CheckValidationsonExtarChrage() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonPlus();

		// Click on Save button
		dinein.uclickonSaveButton();

		// Click on Extra Charge
		dinein.uclickOnExtraCharge();

		// Click on OK button in Warning popup
		dinein.uclickOnOKButtoninWarningPopup();
		Thread.sleep(5000); 
		
		System.out.println("TestCase 37 = Test case for check validation where user not select any item and try to add extra charge ");
	}

	@Test(priority = 38 )
	public void addRemovedExtarChrage() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Item
		dinein.uclickonItem();

		// Click on Course
		dinein.uselectCourse();

		// Click on Finish Button
		dinein.uclickonFinishButton();

		// Add First on Extra Charge
		dinein.uclickOnExtraCharge();

		// Select Extra charge option
		dinein.uselectExtraCharge();

		// Click on Save Button
		dinein.uclickOnSaveButtoninOrder();

		// Click on Plus icon
		dinein.uclickonTable();

		// Click on Recall button
		dinein.uclickOnRecall();

		// Click on Extra Charge
		dinein.uclickOnExtraChargeicon();

		// Select Extra charge option
		dinein.uclickOnVoidButtoninExtraChargeicon();

		// Click on Delete Button
		dinein.uclickOnDeleteButtoninExtraChargeicon();

		// Click on Reasons
		dinein.uselectReasonInExtraCharge();

		// Click on Cancel on Extra charge popup
		dinein.uclickOnCancelInExtrachargepopup();

		// Add First on Extra Charge
		dinein.uclickOnExtraCharge();

		// Select Extra charge option
		dinein.uselectExtraCharge();

		// Click on Quick Pay Button
		dinein.uclickOnPayButton();
		Thread.sleep(5000); 
		
		System.out.println("TestCase 38 = A test case for check with add again removed extra charges and settled it");
	}

	@Test(priority = 39 )
	public void addOrderDiscount() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonPlus();

		// Click on Save button
		dinein.uclickonSaveButton();

		// Click on Item
		dinein.uclickonItem();

		// Click on Course
		dinein.uselectCourse();

		// Click on Finish Button
		dinein.uclickonFinishButton();

		// Click on Discount Button
		dinein.uclickOnDiscountButton();

		// Select Order discount option
		dinein.uselectDiscountonBaseAmount();

		// Click on Save Button
		dinein.uclickOnSaveButtoninOrder();
		Thread.sleep(5000);
		
		System.out.println("TestCase 39 = Test case of adding single Order discount in order and save that order");
	}

	@Test(priority = 40 )
	public void addItemDiscount() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonTable();

		// Click on Recall button
		dinein.uclickOnRecall();

		// Click on Item
		dinein.uItem();

		// Click on Discount button
		dinein.uclickOnDiscountButtoninItem();

		// Select Item discount option
		dinein.uselectItemDiscount();

		// Select Item discount option
		dinein.ucancelonItem();

		// Click on Save Button
		dinein.uclickOnSaveButtoninOrder();
		Thread.sleep(5000);
		
		System.out.println("TestCase 40 = Test case for add item discount in order");
	}

	@Test(priority = 41 )
	public void QuickPayAfteraddDiscounts() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonTable();

		// Click on Recall button
		dinein.uclickOnRecall();

		// Click on Quick Pay Button
		dinein.uclickOnPayButton();
		Thread.sleep(5000); 
		
		System.out.println("TestCase 41 = Test case for order settle through Quick pay");
	}

	@Test(priority = 42 )
	public void SettleOrderAfteraddDiscounts() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonPlus();

		// Click on Save button
		dinein.uclickonSaveButton();

		// Click on Item
		dinein.uclickonItem();

		// Click on Course
		dinein.uselectCourse();

		// Click on Finish Button
		dinein.uclickonFinishButton();

		// Click on Discount Button
		dinein.uclickOnDiscountButton();

		// Select Order discount option
		dinein.uselectDiscountonBaseAmount();

		// Click on Item
		dinein.uItem();

		// Click on Discount button
		dinein.uclickOnDiscountButtoninItem();

		// Select Item discount option
		dinein.uselectItemDiscount();

		// Select Item discount option
		dinein.ucancelonItem();

		// Click on Settle Button
		dinein.uclickonSettleButton();

		// Click on Pay Button in Settle popup
		dinein.uclickonPayButton();
		Thread.sleep(5000);

		// Click on Ok Button in changes DUO popup
		dinein.uclickOnOKButtoninChangesDuopopup();
		Thread.sleep(5000); 
		
		System.out.println("TestCase 42 = Test case for add both Item and Order discount and then settle order");
	}

	@Test(priority = 43 )
	public void addMultipleOrderDiscount() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonPlus();

		// Click on Save button
		dinein.uclickonSaveButton();

		// Click on Item
		dinein.uclickonItem();

		// Click on Course
		dinein.uselectCourse();

		// Click on Finish Button
		dinein.uclickonFinishButton();
		
		// Click on QTY
		dinein.uclickOnQTYPlus();

		// Click on Discount Button
		dinein.uclickOnDiscountButton();

		// Select Order discount option
		dinein.uselectDiscountonBaseAmount();

		// Click on Discount Button
		dinein.uclickOnDiscountButton();

		// Select Order discount option
		dinein.uselectDiscountonFinalAmount();

		// Click on Save Button
		dinein.uclickOnSaveButtoninOrder();
		Thread.sleep(5000); 
		
		System.out.println("TestCase 43 = Test case for add multiple order discounts");
	}

	@Test(priority = 44 )
	public void addMultipleItemDiscount() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonTable();

		// Click on Recall button
		dinein.uclickOnRecall();
		
		// Click on Item
		dinein.uItem();
		
		// Click on Item
		dinein.uclickOnPlusinItem();

		// Click on Discount button
		dinein.uclickOnDiscountButtoninItem();

		// Select Item discount option
		dinein.uselectItemDiscount();

		// Click on Discount button
		dinein.uclickOnDiscountButtoninItem();

		// Select Item discount option
		dinein.uselect2ItemDiscount();

		// Select Item discount option
		dinein.ucancelonItem();

		// Click on Save Button
		dinein.uclickOnSaveButtoninOrder();	
		Thread.sleep(5000); 
		
		System.out.println("TestCase 44 = Test case for add multiple Item discounts ");
	}

	@Test(priority = 45 )
	public void removeOrderDiscount() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonTable();

		// Click on Recall button
		dinein.uclickOnRecall();

		// Click on order icon
		dinein.uclickOnOrderIcon();

		// Click on void icon
		dinein.uclickOnVoidOrder();

		// Click on void button
		dinein.uclickOnVoidOrderbutton();

		// Click on void button
		dinein.uclickOnCancelinOrderpopup();

		// Click on Save Button
		dinein.uclickOnSaveButtoninOrder();
		Thread.sleep(5000); 
		
		System.out.println("TestCase 45 = Test case for remove order discount through recall ");
	}

	@Test(priority = 46 )
	public void removeItemDiscount() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonTable();

		// Click on Recall button
		dinein.uclickOnRecall();

		// Click on Item
		dinein.uItem();

		// Click on order icon
		dinein.uclickOnVoidinItempopup();

		// Click on void icon
		dinein.uclickOnVoidButtoninItempopup();

		// Click on void icon
		dinein.ucancelonItem();

		// Click on Save Button
		dinein.uclickOnSaveButtoninOrder();
		Thread.sleep(5000); 
		
		System.out.println("TestCase 46 = Test case for remove item discount through recall ");
	}

	@Test(priority = 47 )
	public void AddremovedOrderDiscount() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonTable();

		// Click on Recall button
		dinein.uclickOnRecall();

		// Click on Discount Button
		dinein.uclickOnDiscountButton();

		// Select Order discount option
		dinein.uselectDiscountonFinalAmount();

		// Click on Save Button
		dinein.uclickOnSaveButtoninOrder();	
		Thread.sleep(5000);
		
		System.out.println("TestCase 47 = A test case for check with add again removed order discount and saved it");
	}

	@Test(priority = 48 )
	public void AddremovedItemDiscount() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonTable();

		// Click on Recall button
		dinein.uclickOnRecall();

		// Click on Item
		dinein.uItem();

		// Click on Discount button
		dinein.uclickOnDiscountButtoninItem();

		// Select Item discount option
		dinein.uselect2ItemDiscount();

		// Select Item discount option
		dinein.ucancelonItem();

//		// Click on Discount Button
//		dinein.uclickOnDiscountButton();
//		
//		// Select Order discount option
//		dinein.uselectDiscountonFinalAmount();

		// Click on Save Button
		dinein.uclickOnPayButton();
		Thread.sleep(5000);
		
		System.out.println("TestCase 48 = A test case for check with add again removed item discount and saved it ");
	}

	@Test(priority = 49 )
	public void AddOpenOrderDiscount() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonPlus();

		// Click on Save button
		dinein.uclickonSaveButton();

		// Click on Item
		dinein.uclickonItem();

		// Click on Course
		dinein.uselectCourse();

		// Click on Finish Button
		dinein.uclickonFinishButton();

		// Click on Discount Button
		dinein.uclickOnDiscountButton();

		// Select Order discount option
		dinein.uAddOpenOrderDiscount();

		// Select Order discount option
		dinein.uClick2inOpenOrderDiscount();

		// Select Order discount option
		dinein.uClick0inOpenOrderDiscount();

		// Select Order discount option
		dinein.ClickEnterinOpenOrderDiscount();

		// Click on Save Button
		dinein.uclickOnSaveButtoninOrder();
		Thread.sleep(5000);
		
		System.out.println("TestCase 49 = Test case for apply open discount in order");
	}

	@Test(priority = 50 )
	public void AddOpenItemDiscount() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonTable();

		// Click on Recall button
		dinein.uclickOnRecall();

		// Click on Item
		dinein.uItem();

		// Click on Discount button
		dinein.uclickOnDiscountButtoninItem();

		// Select open item discount
		dinein.uAddOpenItemDiscount();

		// Enter 2 in open discount popup
		dinein.uClick2inOpenItemDiscount();

		// Enter 0 in open discount
		dinein.uClick0inOpenItemDiscount();

		// Enter
		dinein.ClickEnterinOpenOrderDiscount();

		// Select Item discount option
		dinein.ucancelonItem();

		// Click on Quick Pay Button
		dinein.uclickOnPayButton();
		Thread.sleep(5000);
		
		System.out.println("TestCase 50 = Test case for apply open discount on item");
	}

	@Test(priority = 51 )
	public void Add100ItemDiscount() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonPlus();

		// Click on Save button
		dinein.uclickonSaveButton();

		// Click on Item
		dinein.uclickonItem();

		// Click on Course
		dinein.uselectCourse();

		// Click on Finish Button
		dinein.uclickonFinishButton();

		// Click on Item
		dinein.uItem();

		// Click on Discount button
		dinein.uclickOnDiscountButtoninItem();

		// Select open item discount
		dinein.uApply100ItemDiscount();

		// Enter 2 in open discount popup
		dinein.uClick1ItemDiscount();

		// Enter 0 in open discount
		dinein.uClick00ItemDiscount();

		// Enter
		dinein.ClickEnterinOpenOrderDiscount();

		// Select Item discount option
		dinein.ucancelonItem();

		// Click on Save Button
		dinein.uclickOnPayButton();
		Thread.sleep(5000);
		
//		// Click on Yes Button
//		dinein.uClickYesButtoninConfirmPopup();
		
		System.out.println("TestCase 51 = A test case for check with add 100 % item discount ");
		 
	}

	@Test(priority = 52 )
	public void Add100OrderDiscount() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonPlus();

		// Click on Save button
		dinein.uclickonSaveButton();

		// Click on Item
		dinein.uclickonItem();

		// Click on Course
		dinein.uselectCourse();

		// Click on Finish Button
		dinein.uclickonFinishButton();

		// Click on Discount button
		dinein.uclickOnDiscountButton();

		// Select 100 % Order discount option
		dinein.uApply100OrderDiscount();

		// Click on "1"
		dinein.uClick1OrderDiscount();

		// Click on "00"
		dinein.uClick00OrderDiscount();

		// Select Order discount option
		dinein.ClickEnterinOpenOrderDiscount();

		// Click on Save Button
		dinein.uclickOnSaveButtoninOrder();

		// Click on Yes Button
		dinein.uClickYesButtoninConfirmPopup();
		Thread.sleep(5000);
		
		System.out.println("TestCase 52 =  A test case for check with add 100 % Order discount ");
	}

	@Test(priority = 53 )
	public void OverwriteItemDiscount() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonPlus();

		// Click on Save button
		dinein.uclickonSaveButton();

		// Click on Item
		dinein.uclickonItem();

		// Click on Course
		dinein.uselectCourse();

		// Click on Finish Button
		dinein.uclickonFinishButton();

		// Click on Item
		dinein.uItem();

		// Click on Discount button
		dinein.uclickOnDiscountButtoninItem();

		// Select open item discount
		dinein.uApply100ItemDiscount();

		// Enter 1 in open discount popup
		dinein.uClick1ItemDiscount();

		// Enter 0 in open discount
		dinein.uClick0inOpenItemDiscount();

		// Enter
		dinein.ClickEnterinOpenOrderDiscount();

		// Select Item discount option
		dinein.ucancelonItem();

		// Click on Save Button
		dinein.uclickOnSaveButtoninOrder();

		// Click on Plus icon
		dinein.uclickonTable();

		// Click on Recall button
		dinein.uclickOnRecall();

		// Click on Item
		dinein.uItem();

		// Click on Discount button
		dinein.uclickOnDiscountButtoninItem();

		// Select open item discount
		dinein.uApply100ItemDiscount();

		// Enter 2 in open discount popup
		dinein.uClick2inOpenItemDiscount();

		// Enter 0 in open discount
		dinein.uClick0inOpenItemDiscount();

		// Enter
		dinein.ClickEnterinOpenOrderDiscount();

		// Click on Overwrite button
		dinein.uClickOverwriteButton();

		// Select Item discount option
		dinein.ucancelonItem();

		// Click on Save Button
		dinein.uclickOnSaveButtoninOrder();
		Thread.sleep(5000); 
		
		System.out.println("TestCase 53 = A test case for check with an overwrite discount on item and save it");
	}

	@Test(priority = 54 )
	public void AddAutoDiscountOnModifier() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonTable();

		// Click on Recall button
		dinein.uclickOnRecall();

		// Add Item with Modifier
		dinein.uAddModifierItems();

		// Click on Course
		dinein.uselectCourse();

		// Click on Finish Button
		dinein.uclickonFinishButton();

		// Click on Save button in Modifier popup
		dinein.uSaveButtonOnModifier();

		// Click on Save Button
		dinein.uclickOnSaveButtoninOrder();

		// Click on Plus icon
		dinein.uclickonTable();

		// Click on Recall button
		dinein.uclickOnRecall();
		Thread.sleep(5000);

		// Click on item which has Modifier
		dinein.uclickOnModifierItem();

		// Click on Discount button
		dinein.uclickOnDiscountButtoninItem();

		// Select Item discount
		dinein.uselectItemDiscount();

		// Select Item discount option
		dinein.ucancelonItem();

		// Click on Save Button
		dinein.uclickOnSaveButtoninOrder();
		Thread.sleep(5000);
		
		System.out.println("TestCase 54 = A test case for check with an applied discount on the item so the modifier item also applied on that discount");

	}

	@Test(priority = 55 )
	public void AddDiscountOnModifier() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonTable();

		// Click on Recall button
		dinein.uclickOnRecall();

		// Click on item which has Modifier
		dinein.uClickonModifierItem();

		// Click on Discount button
		dinein.uClickonDiscountSection();

		// Select open item discount
		dinein.uApply100ItemDiscount();

		// Enter 2 in open discount popup
		dinein.uClick2inOpenItemDiscount();

		// Enter 0 in open discount
		dinein.uClick0inOpenItemDiscount();

		// Enter
		dinein.ClickEnterinOpenOrderDiscount();

		// Select Item discount option
		dinein.ucancelonItem();

		// Click on Settle Button
		dinein.uclickonSettleButton();

		// Click on Pay Button in Settle popup
		dinein.uclickonPayButton();
		Thread.sleep(5000);

		// Click on Ok Button in changes DUO popup
		dinein.uclickOnOKButtoninChangesDuopopup();
		Thread.sleep(5000); 
		
		System.out.println("TestCase 55 = Test cases with apply a discount on modifier item");

	}

	@Test(priority = 56 )
	public void SplitOrderByEqually2() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonPlus();

		// Click on Save button
		dinein.uclickonSaveButton();

		// Click on Item
		dinein.uclickonItem();

		// Click on Course
		dinein.uselectCourse();

		// Click on Finish Button
		dinein.uclickonFinishButton();

		// Increase the QTY of item
		dinein.uclickOnQTYPlus();

		// Click on Save Button
		dinein.uclickOnSaveButtoninOrder();

		// Click on Plus icon
		dinein.uclickonPlus();

		// Click on Split icon
		dinein.uClickonSplitSection();

		// Click on Split Button
		dinein.uClickonSplitButton();

		// Click on Split Type
		dinein.uClickonSplitByEqually();

		// Click on Split Type 2
		dinein.uClickonSplitBy2();
		Thread.sleep(5000); 
		
		System.out.println("TestCase 56 = Add new order and then split that order through Split by Equally");
	}

	@Test(priority = 57 )
	public void MergeTwoOrders() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonPlus();

		// Select Second Order
		dinein.uselectSecondOrder();

		// Click on Merge Orders
		dinein.uclickonMergeOrder();

		// Click on Merge Orders
		dinein.uclickonMergeButton();

		// Click on Parent Orders
		dinein.uselectParentOrders();
		Thread.sleep(5000); 
		
		System.out.println("TestCase 57 = Test case for Merge two orders");
	}

	@Test(priority = 58 )
	public void SplidOrdersByQuantity() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonPlus();

		// Click on Split icon
		dinein.uClickonSplitSection();

		// Click on Split Button
		dinein.uClickonSplitButton();

		// Click on Split Type
		dinein.uClickonSplitByQuantity();

		// Select Item
		dinein.uselectIteminSplit();

		// Click on QTY
		dinein.uclickOnQTY();

		// Select QTY
		dinein.uselectQTY();

		// Click on Move To Right
		dinein.uclickOnMoveToRightButton();

		// Click on Save button
		dinein.uclickOnSaveButton();
		Thread.sleep(5000); 
		
		System.out.println("TestCase 58 = Add new order and the split that order through split by Quantity");
	}

	@Test(priority = 59 )
	public void MergeAndSettleOrders() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonPlus();

		// Select Second Order
		dinein.uselectSecondOrder();

		// Click on Merge Orders
		dinein.uclickOnMergeAndSettleOrder();

		// Click on Merge Button
		dinein.uclickonMergeButton();

		// Click on Parent Orders
		dinein.uselectParentOrders();

		// Click on Pay Button in Settle popup
		dinein.uclickonPayButton();
		Thread.sleep(5000);

		// Click on Ok Button in changes DUO popup
		dinein.uclickOnOKButtoninChangesDuopopup();
		Thread.sleep(5000);
		
		System.out.println("TestCase 59 = Test case for Merge and Settle order");
	}

	@Test(priority = 60 )
	public void splitOrderbyCategory() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonPlus();

		// Click on Save button
		dinein.uclickonSaveButton();

		// Click on Item
		dinein.uclickonItem();

		// Click on Course
		dinein.uselectCourse();

		// Enter Seat
		dinein.uenterSeatNumber();

		// Click on Finish Button
		dinein.uclickonFinishButton();

		// Click on QTY
		dinein.uclickOnPlusonQTY();

		// Click on Icecream Submenu
		dinein.uclickOnSubmenu();

		// Add Item
		dinein.uselectItemOnSubmenu();

		// Click on Course
		dinein.uselectCourse();

		// Click on Finish Button
		dinein.uclickonFinishButton();

		// Update QTY of item
		dinein.uUpdateQTYOfItem();

		// Click on Save Button
		dinein.uclickOnSaveButtoninOrder();

		// Click on Plus icon
		dinein.uclickonPlus();

		// Click on Split icon
		dinein.uClickonSplitSection();

		// Click on Split Button
		dinein.uClickonSplitButton();

		// Click on Split Type
		dinein.uClickonSplitByCategory();

		// Move First item

		// Select Item
		dinein.uselectIteminSplit();

		// Click on QTY
		dinein.uclickOnQTY();

		// Select QTY
		dinein.uselectQTY();

		// Click on Move To Right
		dinein.uclickOnMoveToRightButton();

		// Move Second item

		// Select Item
		dinein.uselectSecondIteminSplit();

		// Click on QTY
		dinein.uclickOn2QTY();

		// Select QTY
		dinein.uselect2QTY();

		// Click on Move To Left
		dinein.uclickOnMoveToLeftButton();

		// Click on Save button
		dinein.uclickOnSaveButton();
		Thread.sleep(5000);
		
		System.out.println("TestCase 60 = Test case for Add new order and then split that order through split by Category");

	}

	@Test(priority = 61 )
	public void MergeAndPrintOrders() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonPlus();

		// Select Second Order
		dinein.uselectSecondOrder();

		// Click on Merge Orders
		dinein.uclickOnMergeAndPrintOrder();

		// Click on Merge Button
		dinein.uclickonMergeButton();

		// Click on Parent Orders
		dinein.uselectParentOrders();
		Thread.sleep(5000);
		
		System.out.println("TestCase 61 = Test cases merge and Print the order");

	}

	@Test(priority = 62 )
	public void splitOrderbySeat() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonPlus();

		// Click on Split icon
		dinein.uClickonSplitSection();

		// Click on Split Button
		dinein.uClickonSplitButton();

		// Click on Split Type
		dinein.uSelectSplitBySeat();

		// Move First item

		// Select Item
		dinein.uselectIteminSplit();

		// Click on QTY
		dinein.uclickOnQTY();

		// Select QTY
		dinein.uselectQTY();

		// Click on Move To Right
		dinein.uclickOnMoveToRightButton();

		// Move Second item

		// Select Item
		dinein.uselectSecondIteminSplit();

		// Click on QTY
		dinein.uclickOn2QTY();

		// Select QTY
		dinein.uselect2QTY();

		// Click on Move To Left
		dinein.uclickOnMoveToLeftButton();

		// Click on Save button
		dinein.uclickOnSaveButton();
		Thread.sleep(5000);
		
		System.out.println("TestCase 62 = Test Case for add new two items with different seat wise and then split the order through seat wise");

	}

	@Test(priority = 63 )
	public void TransferOrders() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonPlus();

		// Click on Transfer icon
		dinein.uclickTransferIcon();

		// Select Transfer order
		dinein.uselectTransferOrder();

		// Select floor type
		dinein.uselectfloor();

		// Select table
		dinein.uselectTableNumber();
		Thread.sleep(5000); 
		
		System.out.println("TestCase 63 = Test cases for transfer order from one table to another table");

	}

	@Test(priority = 64 )
	public void TarnsferOrderByQTY() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonPlus();

		// Click on Transfer icon
		dinein.uclickTransferIcon();

		// Select Transfer QTY
		dinein.uTransferOrderByQTY();

		// Select Item
		dinein.uselectItem();

		// CLick on Forword button
		dinein.uclickOnMoveToRightButton();

		// Click on Continue button
		dinein.uclickonContinuebutton();

		// Select floor type
		dinein.uselectfloor();

		// Select table
		dinein.uselectTable();

		// Select New Order
		dinein.uselectNeworder();
		Thread.sleep(5000); 
		
		System.out.println("TestCase 64 = Test cases for transfer QTY from one table to another table in order");
	}

	@Test(priority = 65 )
	public void CheckValidations() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonPlus();

		// Click on Transfer icon
		dinein.uclickTransferIcon();

		// Select Transfer order
		dinein.uTransferOrderByQTY();
		Thread.sleep(5000);

		// Click on OK button
		dinein.uclickOKButtoninWarningPopup();
		Thread.sleep(5000); 
		
		System.out.println("TestCase 65 = Check the validations where  transfer the item with 1 QTY");

	}

	@Test(priority = 66 )
	public void TarnsferItemintoOldOrder() throws Exception {

		Pages dinein = new Pages(driver);

//		// Click on Plus icon
//		dinein.uclickonTable();

		// Click on Recall button
		dinein.uclickOnRecall();

		// Click on Item
		dinein.uclickOnQTYPlus();

		// Click on Save button on Order
		dinein.uclickOnSaveButtoninOrder();

		// Click on Plus icon
		dinein.uclickonPlus();

		// Click on Transfer icon
		dinein.uclickTransferIcon();

		// Select Transfer QTY
		dinein.uTransferOrderByQTY();

		// Select Item
		dinein.uClickOnItemForTransferQTY();

		// Click on QTY
		dinein.uclickOnQTY();

		// Select QTY
		dinein.uselectQTY();

		// CLick on Forword button
		dinein.uclickOnMoveToRightButton();

		// Click on Continue button
		dinein.uclickonContinuebutton();

		// Select floor type
		dinein.uselectfloor();

		// Select table
		dinein.uSelectOrder();

		// Select OLD Order
		dinein.uSelectOLDorder();
		Thread.sleep(5000);
		
		System.out.println("TestCase 66 = Test case for transfer the whole order through Transfer by order into old existing order in table");
	}

	@Test(priority = 67 )
	public void TransferOrders1() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonPlus();

		// Click on Transfer icon
		dinein.uclickTransferIcon();

		// Select Transfer order
		dinein.uselectTransferOrder();

		// Select floor type
		dinein.uselectfloor();

		// Select table
		dinein.uselectTableNumber();
		Thread.sleep(5000); 
		
		System.out.println("TestCase 67 = Test cases for transfer order from one table to another table ");

	}

	@Test(priority = 68 )
	public void TransferNewOrders() throws Exception {

		Pages dinein = new Pages(driver);
		


		// Click on Plus icon
		dinein.uclickonPlus();

		// Click on Save button
		dinein.uclickonSaveButton();

		// Click on Item
		dinein.uclickonItem();

		// Click on Course
		dinein.uselectCourse();

		// Click on Finish Button
		dinein.uclickonFinishButton();

		// Click on Save button on Order
		dinein.uclickOnSaveButtoninOrder();

		// Click on Plus icon
		dinein.uclickonPlus();

		// Click on Transfer icon
		dinein.uclickTransferIcon();

		// Select Transfer order
		dinein.uselectTransferOrder();

		// Select floor type
		dinein.uselectfloor();

		// Select table
		dinein.uselectTableNumber();
		Thread.sleep(5000);
		
		System.out.println("TestCase 68 = Test case for creating a new order and Transferring that order to another table");

	}

	@Test(priority = 69 )
	public void NewOrderwithTransferItem() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonPlus();

		// Click on Save button
		dinein.uclickonSaveButton();

		// Click on Item
		dinein.uclickonItem();

		// Click on Course
		dinein.uselectCourse();

		// Click on Finish Button
		dinein.uclickonFinishButton();

		// Click on Finish Button
		dinein.uclickOnQTYPlus();

		// Click on Save button on Order
		dinein.uclickOnSaveButtoninOrder();

		// Click on Plus icon
		dinein.uclickonPlus();

		// Click on Transfer icon
		dinein.uclickTransferIcon();

		// Select Transfer QTY
		dinein.uTransferOrderByQTY();

		// Select Item
		dinein.uClickOnItemForTransferQTY();

		// Click on QTY
		dinein.uclickOnQTY();

		// Select QTY
		dinein.uselectQTY();

		// CLick on Forword button
		dinein.uclickOnMoveToRightButton();

		// Click on Continue button
		dinein.uclickonContinuebutton();

		// Select floor type
		dinein.uselectfloor();

		// Select table
		dinein.uSelectOrder();

		// Select New Order
		dinein.uselectNeworder();
		Thread.sleep(5000);
		
		System.out.println("TestCase 69 = Test case for create a new order and then transfer the QTY of item through Transfer by QTY");

	}

	@Test(priority = 70 )
	public void TransferOrders2() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonPlus();

		// Click on Transfer icon
		dinein.uclickTransferIcon();

		// Select Transfer order
		dinein.uselectTransferOrder();

		// Select floor type
		dinein.uselectfloor();

		// Select table
		dinein.uselectTableNumber();
		Thread.sleep(5000);
		
		System.out.println("TestCase 70 = Test cases for transfer order from one table to another table");
	}

	@Test(priority = 71 )
	public void TransferMultipleOrder() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uSelectOthertable();

		// Click on Select All order checkbox
		dinein.uclickOnSelectAll();

		// Click on Transfer icon
		dinein.uclickOnTransferorders();

		// Select floor type
		dinein.uselectfloor();

		// Select table
		dinein.uselectTableOne();
		Thread.sleep(5000);
		
		System.out.println("TestCase 71 = Test case for Transfer multiple orders from one table to another table");
	}

	@Test(priority = 72 )
	public void MergeMultipleOrdersAndVoid() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonTable();

		// Click on Select All order checkbox
		dinein.uclickOnSelectAll();

		// Click on Merge icon
		dinein.uclickonMergeIcon();

		// Click on Merge Orders
		dinein.uclickonMergeButton();

		// Click on Parent Orders
		dinein.uselectParentOrders();

		// Click on Plus icon
		dinein.uclickonPlus();

		// Click on void Button
		dinein.uclickonVoidButton();

		// Click on void Option
		dinein.uclickOnVoid();

		// Select reason
		dinein.uClickOnReasons();
		
		System.out.println("TestCase 72 = Test case for Merge Multiple Orders And Void all orders in table");
		
		driver.close();
	}
}
