package com.optimus.OptimusMavenProject;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IssueCheck {
	
	static WebDriver driver;
	
	@Test(priority = 1)
	public void loginwithValidUser() throws Exception {

		 

		WebDriverManager.chromedriver().setup();
		
		Map<String, Object> prefs = new HashMap<String, Object>();
		
		prefs.put("profile.default_content_setting_values.notifications", 1);

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
		options.setExperimentalOption("prefs", prefs);

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
		
		System.out.println("TestCase 01 = Test case for Login with valid user");
		
 
	}

	
	@Test(priority = 2 )
	public void TakeAwaySaveOrder() throws Exception {
		
		
		TakeAwayXpath takeaway = new TakeAwayXpath(driver);
		
		// Click On Order Notification
		takeaway.uclickOnOrderNotification();

		// Click on Menu
		takeaway.uClickonmenu();

		// Click on Take Away options
		takeaway.uClickonOrderSummary();

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
	
}
