package com.optimus.OptimusMavenProject;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GRN {
	
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
		
		Thread.sleep(5000);

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
	public void AddGRN() throws Exception {

		GRNXPath GoodReceiptNote = new GRNXPath(driver);

		// Click on menu
		GoodReceiptNote.uClickonmenu();

		// Click on GRN
		GoodReceiptNote.uClickonGRN();

		// Click on Plus
		GoodReceiptNote.uClickonPlus();

		// Click on Vendor
		GoodReceiptNote.uClickonVendor();

		// Select Vendor
		GoodReceiptNote.uSelectVendor();

		// Enter Invoice number
		GoodReceiptNote.uEnterVendorInvoice();

		// Click On Add Item Button
		GoodReceiptNote.uClickOnAddItemButton();

		// Select Item
		GoodReceiptNote.uSelect2Item();

		// click on Save Button
		GoodReceiptNote.uclickonSaveButton();

		// click On Save
		GoodReceiptNote.uclickOnSave();
		Thread.sleep(5000);
		
		System.out.println("TestCase 02 = Create a new GRN with Single Item");
	}

	@Test(priority = 3 )
	public void RecallGRN() throws Exception {

		GRNXPath GoodReceiptNote = new GRNXPath(driver);

		// Select GRN
		GoodReceiptNote.uSelectGRN();

		// Click on Recall
		GoodReceiptNote.uClickonRecall();

		// Increase the QTY of item
		GoodReceiptNote.uIncreasetheQTYofitem();

		// click On Save
		GoodReceiptNote.uclickOnSave();
		Thread.sleep(5000);
		
		System.out.println("TestCase 03 = Recall GRN and increase QTY");
	}

	@Test(priority = 4 )
	public void recallGRNaddItem() throws Exception {

		GRNXPath GoodReceiptNote = new GRNXPath(driver);

		// Select GRN
		GoodReceiptNote.uSelectGRN();

		// Click on Recall
		GoodReceiptNote.uClickonRecall();

		// Click On Add Item Button
		GoodReceiptNote.uClickOnAddItemButton();

		// Select Item
		GoodReceiptNote.uSelectItem();

		// click on Save Button
		GoodReceiptNote.uclickonSaveButton();

		// click On Save
		GoodReceiptNote.uclickOnSave();
		Thread.sleep(5000);
		
		System.out.println("TestCase 04 = Test case for Recall GRN and add new Item");
	}

	@Test(priority = 5 )
	public void recallGRNRemoveItem() throws Exception {

		GRNXPath GoodReceiptNote = new GRNXPath(driver);

		// Select GRN
		GoodReceiptNote.uSelectGRN();

		// Click on Recall
		GoodReceiptNote.uClickonRecall();

		// Remove item in GRN
		GoodReceiptNote.uRemoveiteminGRN();

		// Click On Reasons
		GoodReceiptNote.uClickOnReasons();

		// click On Save
		GoodReceiptNote.uclickOnSave();
		Thread.sleep(5000);
		
		System.out.println("TestCase 05 = Test case for recall GRN and remove item");
	}

	@Test(priority = 6 )
	public void GRNwithMaximumPopupNotification() throws Exception {

		GRNXPath GoodReceiptNote = new GRNXPath(driver);

		// Select GRN
		GoodReceiptNote.uSelectGRN();

		// Click on Recall
		GoodReceiptNote.uClickonRecall();

		// Click On Add Item Button
		GoodReceiptNote.uClickOnAddItemButton();

		// Select Item
		GoodReceiptNote.uSelectInventoryItem();

		// click on Save Button
		GoodReceiptNote.uclickonSaveButton();

		// click On Save
		GoodReceiptNote.uclickOnSave();

		// Click on Yes Button
		GoodReceiptNote.uclickonYesButton();
		Thread.sleep(5000);
		
		System.out.println("TestCase 06 = Test case for check with maximum QTY notification");
	}

	@Test(priority = 7 )
	public void AddMultipleGRN() throws Exception {

		GRNXPath GoodReceiptNote = new GRNXPath(driver);

		// ==============> Add First GRN <=================

		// Click on Plus
		GoodReceiptNote.uClickonPlus();

		// Click on Vendor
		GoodReceiptNote.uClickonVendor();

		// Select Vendor
		GoodReceiptNote.uSelectVendor();

		// Enter Invoice number
		GoodReceiptNote.uEnterVendorInvoice();

		// Click On Add Item Button
		GoodReceiptNote.uClickOnAddItemButton();

		// Select Item
		GoodReceiptNote.uSelectItem();

		// click on Save Button
		GoodReceiptNote.uclickonSaveButton();

		// click On Save
		GoodReceiptNote.uclickOnSave();
		
		// Click on Yes Button
		GoodReceiptNote.uclickonYesButton();
		Thread.sleep(5000);

		// ==============> Add Second GRN <=================

		// Click on Plus
		GoodReceiptNote.uClickonPlus();

		// Click on Vendor
		GoodReceiptNote.uClickonVendor();

		// Select Vendor
		GoodReceiptNote.uSelectVendor();

		// Enter Invoice number
		GoodReceiptNote.uEnterVendorInvoice();

		// Click On Add Item Button
		GoodReceiptNote.uClickOnAddItemButton();

		// Select Item
		GoodReceiptNote.uSelectItem();

		// click on Save Button
		GoodReceiptNote.uclickonSaveButton();

		// click On Save
		GoodReceiptNote.uclickOnSave();
		
		// Click on Yes Button
		GoodReceiptNote.uclickonYesButton();
		Thread.sleep(5000);

		// ==============> Add Third GRN <=================

		// Click on Plus
		GoodReceiptNote.uClickonPlus();

		// Click on Vendor
		GoodReceiptNote.uClickonVendor();

		// Select Vendor
		GoodReceiptNote.uSelectVendor();

		// Enter Invoice number
		GoodReceiptNote.uEnterVendorInvoice();

		// Click On Add Item Button
		GoodReceiptNote.uClickOnAddItemButton();

		// Select Item
		GoodReceiptNote.uSelectItem();

		// click on Save Button
		GoodReceiptNote.uclickonSaveButton();

		// click On Save
		GoodReceiptNote.uclickOnSave();
		
		// Click on Yes Button
		GoodReceiptNote.uclickonYesButton();
		Thread.sleep(5000);
		
		System.out.println("TestCase 07 = Test case for check add GRN with multiple QTY");
	}

	@Test(priority = 8 )
	public void VoidGRN() throws Exception {

		GRNXPath GoodReceiptNote = new GRNXPath(driver);

		// Select GRN
		GoodReceiptNote.uSelectGRN();

		// Click on Void button
		GoodReceiptNote.uDeleteGRN();
		
		// Click on OK button Warning popup of transaction Data
		GoodReceiptNote.uclickonOKButtoninWarningButton();

		// Click On Yes Button
		GoodReceiptNote.uclickonYESButton1();

		// Select Reason
		GoodReceiptNote.uClickOnReasons();
		Thread.sleep(5000);
		
		System.out.println("TestCase 08 = Test case for void GRN");

	}

	@Test(priority = 9 )
	public void VoidMultipleGRN() throws Exception {

		GRNXPath GoodReceiptNote = new GRNXPath(driver);

		// Select All GRN
		GoodReceiptNote.uSelectAllGRN();

		// Click on Void button
		GoodReceiptNote.uDeleteGRN();
		
		// Click on OK button Warning popup of transaction Data
		GoodReceiptNote.uclickonOKButtoninWarningButton();

		// click on Save Button
		GoodReceiptNote.uclickonYESButton1();

		// Select Reason
		GoodReceiptNote.uClickOnReasons();
		Thread.sleep(5000);
		
		System.out.println("TestCase 09 = Test case for void multiple GRN");
		
		driver.close();
	}

}
