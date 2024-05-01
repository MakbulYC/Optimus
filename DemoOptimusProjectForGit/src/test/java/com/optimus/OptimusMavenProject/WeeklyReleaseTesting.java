package com.optimus.OptimusMavenProject;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class WeeklyReleaseTesting {
	
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
	}
	
  @Test(priority = 2)
  	public void Logout() throws Exception {
	  
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	  
		// Creating object for login page
		Pages dinein = new Pages(driver);
	  
		// Click on User
		dinein.clickonUser();

		// Click on Logout
		dinein.clickonLogout();

		// Click on logout button
		dinein.clickonLogoutButton();
	  
  }
  
	@Test(priority = 3 )
	public void LoginWithPIN() throws Exception {

		Pages login = new Pages(driver);

		// Click on 1
		login.uclickonOne();

		// Click on 2
		login.uclickonTwo();

		// Click on 4
		login.uclickonFour();

		// Click on 5
		login.uclickonFive();

		// Get me in button
		login.uclickGetmeIn();

		// Click on User
		login.clickonUser();

		// Click on Logout
		login.clickonLogout();

		// Click on logout button
		login.clickonLogoutButton();

	}

	@Test(priority = 4 )
	public void invalidUser() throws Exception {

		Pages login = new Pages(driver);

		// Click on Lock icon
		login.uclickonLock();

		// Enter User name
		login.enterUsername("makbul3455");

		// Enter Password
		login.enterPassword("makbul123");

		// Enter Hotel Code
		login.enterHotelCode("14607");

		// Click on Login button
		login.LoginButton();

		// Click on OK Button in Error
		login.uclickonOKButtoninErrormessage();

		driver.navigate().refresh();

		// Click on Lock icon
		login.uclickonLock();
	}

	@Test(priority = 5 )
	public void nullUser() throws Exception {

		Pages login = new Pages(driver);

		// Click on Login button
		login.LoginButton();
		
		// Click on OK button in Error Button
		login.uOKButtononErrorPopup();

		// Enter User name
		login.enterUsername("makbul");

		// Enter Password
		login.enterPassword("makbul123");

		// Enter Hotel Code
		login.enterHotelCode("14607");

		// Click on Login button
		login.LoginButton();

//		// Click on Outlet
//		login.clickonOutlet();
//
//		// Select Outlet
//		login.selectOutlet();

		// Get me in button
		login.ugetmeinbutton();
	}

	@Test(priority = 6 )
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
	}

	@Test(priority = 7 )
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
	}

	@Test(priority = 8 )
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
	}

	@Test(priority = 9 )
	public void AddMultipleItem() throws Exception {

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

		// Add Second Item
		dinein.uaddSecondItem();

		// Click on Course
		dinein.uselectCourse();

		// Click on Finish Button
		dinein.uclickonFinishButton();

		// Click on Save button on Order
		dinein.uclickOnSaveButtoninOrder();
	}

	@Test(priority = 10 )
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
	}

	@Test(priority = 11 )
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
	}

	@Test(priority = 12 )
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
	}

	@Test(priority = 13 )
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

		// Click on Save button on Order
		dinein.uclickOnSaveButtoninOrder();
	}

	@Test(priority = 14 )
	public void voidModifierItem() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonTable();

		// Click on Recall button
		dinein.uclickOnRecall();

		// Click on Item
		dinein.uclickOnModifier();

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
	}

	@Test(priority = 15 )
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

	}

	@Test(priority = 16 )
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
	}

	@Test(priority = 17 )
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

//		// Click on Save button on Order
//		dinein.uclickOnSave();
	}

	@Test(priority = 18 )
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
	}

	@Test(priority = 19 )
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
	}

	@Test(priority = 20 )
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
	}

	@Test(priority = 21 )
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
	}

	@Test(priority = 22 )
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

//		// Click on OK Button in changes DUO popup
//		dinein.uclickOnOKButton();
	}

	@Test(priority = 23 )
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
	}

	@Test(priority = 24 )
	public void BankwithSurcharge() throws Exception {

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
		dinein.uselectBankPayoptionwithSurcharge();

		// Click on Pay Button in Settle popup
		dinein.uclickonPayButton();

		// Click on Apply Button in Surcharge Confirmation popup
		dinein.uclickOnApplyButton();

//		// Click on OK Button in changes DUO popup
//		dinein.uclickOnOKButtoninChangesDuopopup();
	}

	@Test(priority = 25 )
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

	}

	@Test(priority = 26 )
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

	}

	@Test(priority = 27 )
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

	}

	@Test(priority = 28 )
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
	}

	@Test(priority = 29 )
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
	}

	@Test(priority = 30 )
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
	}

	@Test(priority = 31 )
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
	}

	@Test(priority = 32 )
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
	}

	@Test(priority = 33 )
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
	}

	@Test(priority = 34 )
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
	}

	@Test(priority = 35 )
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

	}

	@Test(priority = 36 )
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

	}

	@Test(priority = 37 )
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
	}

	@Test(priority = 38 )
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
	}

	@Test(priority = 39 )
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

	}

	@Test(priority = 40 )
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
	}

	@Test(priority = 41 )
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
	}

	@Test(priority = 42 )
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
	}

	@Test(priority = 43 )
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
	}

	@Test(priority = 44 )
	public void QuickPayAfteraddDiscounts() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonTable();

		// Click on Recall button
		dinein.uclickOnRecall();

		// Click on Quick Pay Button
		dinein.uclickOnPayButton();
	}

	@Test(priority = 45 )
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
	}

	@Test(priority = 46 )
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
	}

	@Test(priority = 47 )
	public void addMultipleItemDiscount() throws Exception {

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

		// Click on Discount button
		dinein.uclickOnDiscountButtoninItem();

		// Select Item discount option
		dinein.uselect2ItemDiscount();

		// Select Item discount option
		dinein.ucancelonItem();

		// Click on Save Button
		dinein.uclickOnSaveButtoninOrder();
	}

	@Test(priority = 48 )
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
	}

	@Test(priority = 49 )
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
	}

	@Test(priority = 50 )
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

		// Click on Settle Button
		dinein.uclickonSettleButton();

		// Click on Pay Button in Settle popup
		dinein.uclickonPayButton();
		Thread.sleep(5000);

		// Click on Ok Button in changes DUO popup
		dinein.uclickOnOKButtoninChangesDuopopup();

	}

	@Test(priority = 51 )
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
	}

	@Test(priority = 52 )
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
	}

	@Test(priority = 53 )
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
	}

	@Test(priority = 54 )
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

//		// Click on Yes Button
//		dinein.uClickYesButtoninConfirmPopup();
	}

	@Test(priority = 55 )
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
	}

	@Test(priority = 56 )
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
	}

	@Test(priority = 57 )
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

		// Click on item which has Modifier
		dinein.uClickitemWithMOd();

		// Click on Discount button
		dinein.uclickOnDiscountButtoninItem();

		// Select Item discount
		dinein.uselectItemDiscount();

		// Select Item discount option
		dinein.ucancelonItem();

		// Click on Save Button
		dinein.uclickOnSaveButtoninOrder();

	}

	@Test(priority = 58 )
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

	}

	@Test(priority = 59 )
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
	}

	@Test(priority = 60 )
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
	}

	@Test(priority = 61 )
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
	}

	@Test(priority = 62 )
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
	}

	@Test(priority = 63 )
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

	}

	@Test(priority = 64 )
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

	}

	@Test(priority = 65 )
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

	}

	@Test(priority = 66 )
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

	}

	@Test(priority = 67 )
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
		dinein.uSelectOrder();

		// Select New Order
		dinein.uselectNeworder();
	}

	@Test(priority = 68 )
	public void CheckValidations() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonPlus();

		// Click on Transfer icon
		dinein.uclickTransferIcon();

		// Select Transfer order
		dinein.uTransferOrderByQTY();

		// Click on OK button
		dinein.uclickOKButtoninWarningPopup();

	}

	@Test(priority = 69 )
	public void TarnsferItemintoOldOrder() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uclickonTable();

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
	}

	@Test(priority = 70 )
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

	}

	@Test(priority = 71 )
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

	}

	@Test(priority = 72 )
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

	}

	@Test(priority = 73 )
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
	}

	@Test(priority = 74 )
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
	}

	@Test(priority = 75 )
	public void MergeMultipleOrdersAndVoid() throws Exception {

		Pages dinein = new Pages(driver);

		// Click on Plus icon
		dinein.uSelectOthertable();

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
	}
}
