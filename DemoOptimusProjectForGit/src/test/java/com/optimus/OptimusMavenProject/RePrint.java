package com.optimus.OptimusMavenProject;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class RePrint {
	
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
	public void RePrintOrder() throws Exception {
		
		RePrintXPath print = new RePrintXPath(driver);
		
		// Click On Order Notification
		print.uclickOnOrderNotification();
		
		// Click on Plus icon
		print.uclickonPlus();

		// Click on Save button
		print.uclickonSaveButton();

		// Click on Item
		print.uclickonItem();

		// Click on Course
		print.uselectCourse();

		// Click on Finish Button
		print.uclickonFinishButton();

		// Click on Save button on Order
		print.uclickOnSaveButtoninOrder();

		// Click on Table section
		print.uclickonTable();

		// Click on Print Button
		print.uclickonPrintButton();
		Thread.sleep(5000);
		
		System.out.println("TestCase 02 = Test case for re-print order");

	}
	
	@Test(priority = 3 )
	public void OrderRePrintwithKOT() throws Exception {

		RePrintXPath print = new RePrintXPath(driver);

		// Click on Table section
		print.uclickonTable();

		//  Click on Re-Print Button
		print.uclickonRePrintButton();
		
		//  Select Item for print
		print.uSelectItemforprint();
		
		//  Click on Print Button in Reprint popup 
		print.uclickonPrintButtoninReprintpopup();
		Thread.sleep(5000);
		
		System.out.println("TestCase 03 = Test case for re-print with KOT print");
	}
	
	@Test(priority = 4)
	public void OrderRePrintwithCaptain() throws Exception {

		RePrintXPath print = new RePrintXPath(driver);

		// Click on Table section
		print.uclickonTable();

		//  Click on Re-Print Button
		print.uclickonRePrintButton();
		
		//  click on Captain Section
		print.uclickonCaptainSection();
		
		//  Select Item for print
		print.uSelectItemforprint();
		
		//  Click on Print Button in Reprint popup 
		print.uclickOnPrintinRePrintPopup();
		Thread.sleep(5000);
		
		System.out.println("TestCase 04 = Test case for re-print with Captain print");
	}
	
	@Test(priority = 5 )
	public void OrderRePrintwithLabel() throws Exception {

		RePrintXPath print = new RePrintXPath(driver);

		// Click on Table section
		print.uclickonTable();

		//  Click on Re-Print Button
		print.uclickonRePrintButton();
		
		//  Click on Label Section
		print.uclickonLabelSection();
		
		//  Select Item for print
		print.uclickOnclickOnIteminLabel();
		
		//  Click on Print Button in Reprint popup 
		print.uclickonPrintButtoninReprintpopup();
		Thread.sleep(5000);
		
		System.out.println("TestCase 05 = Test case for re-print with Label print");
	}
	
	@Test(priority = 6 )
	public void OrderSummaryOrderPrint() throws Exception {

		RePrintXPath print = new RePrintXPath(driver);

		// Click on Menu
		print.uClickonmenu();

		//  Click on Order Summary
		print.uClickonOrderSummary();	
		
		//  Select Order
		print.uselectOrder();
//		
//		//  Select Item for print
//		print.uSelectItemforprint();
		
		//  Click on Print Button in Order Summary
		print.uclickOnPrintButtoninOrderSummary();
		Thread.sleep(5000);
		
		System.out.println("TestCase 06 = Test case for re-print order");
	}
	
	@Test(priority = 7 )
	public void OrderSummaryOrderRePrintKOT() throws Exception {

		RePrintXPath print = new RePrintXPath(driver);

		//  Select Order
		print.uselectOrder();

		//  Click On RePrint KOT Button in Order Summary
		print.uclickOnRePrintKOTButtoninOrderSummary();
		
		//  Select Item for print
		print.uSelectItemforprint();
		
		//  Click on Print Button in Reprint popup 
		print.uclickonPrintButtoninReprintpopup();
		Thread.sleep(5000);
		
		System.out.println("TestCase 07 = Test case for re-print with KOT print");
	}
	
	@Test(priority = 8 )
	public void OrderSummaryOrderRePrintwithCaptain() throws Exception {

		RePrintXPath print = new RePrintXPath(driver);

//		//  Select Order
//		print.uselectOrder();

		//  Click On RePrint KOT Button in Order Summary
		print.uclickOnRePrintKOTButtoninOrderSummary();
		
		//  click on Captain Section
		print.uclickonCaptainSection();
		
		//  Select Item for print
		print.uSelectItemforprint();
		
		//  Click on Print Button in Reprint popup 
		print.uclickOnPrintinRePrintPopup();
		Thread.sleep(5000);
		
		System.out.println("TestCase 08 = Test case for re-print with Captain print");
	}
	
	@Test(priority = 9 )
	public void OrderSummaryOrderRePrintwithLabel() throws Exception {

		RePrintXPath print = new RePrintXPath(driver);

//		//  Select Order
//		print.uselectOrder();

		//  Click On RePrint KOT Button in Order Summary
		print.uclickOnRePrintKOTButtoninOrderSummary();
		
		//  Click on Label Section
		print.uclickonLabelSection();
		
		//  Select Item for print
		print.uclickOnclickOnIteminLabel();
		 
		//  Click on Print Button in Reprint popup 
		print.uclickOnPrintinRePrintPopup();
		Thread.sleep(5000);
		
		System.out.println("TestCase 09 = Test case for re-print with Label print");
		
		driver.close();
	}

}
