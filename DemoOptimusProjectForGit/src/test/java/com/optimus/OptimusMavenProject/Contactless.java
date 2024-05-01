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

public class Contactless {
	
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
		
		System.out.println("TestCase 01 = Test case for Login with valid user");
	}
	
	@Test(priority = 2 )
	public void ContactlessTakeOrder() throws Exception {


		ContactlessXPath conOrder = new ContactlessXPath(driver);

		String oldTab = driver.getWindowHandle();

		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(5000);

		// QR CODE URL
		conOrder.QRCODEURL();
		Thread.sleep(5000);


		// // Click on Start button
		conOrder.uclickOnStartButton();

		// Click on Add button in Item
		conOrder.uclickOnAddButton();

		// Select Course
		conOrder.uSelectCourse();

		// Click on Cart button
		conOrder.uClickonCartbutton();

		// Click on Confirm button
		conOrder.uClickonConfirmbutton();

		// Click on Checkout button
		conOrder.uClickonCheckoutbutton();

		// Click on Guest name
		conOrder.uClickonGuestname();

		// Click on Phone
		conOrder.uClickonPhone();

		// Click on Place order button
		conOrder.uClickonPlaceorderbutton();

		// GOTO Main Table Page

		driver.switchTo().window(oldTab);
		Thread.sleep(5000);

		// Click on Accept button
		conOrder.uClickonAcceptbutton();
		
		Thread.sleep(5000);
		
		System.out.println("TestCase 02 = Test case for create a new order and approve that order");

	}

	@Test(priority = 3 )
	public void ContactlessApproveOrder() throws Exception {


		ContactlessXPath conOrder = new ContactlessXPath(driver);

		String oldTab = driver.getWindowHandle();

		String your_title = "Contactless Dining";

		String currentWindow = driver.getWindowHandle(); // will keep current window to switch back

		for (String winHandle : driver.getWindowHandles()) {

			if (driver.switchTo().window(winHandle).getTitle().equals(your_title)) {

				// Go To Main Tab
				conOrder.uClickonGoToMenubutton();

				// Click on Add button in Item
				conOrder.uclickOnAddButton();

				// Select Course
				conOrder.uSelectCourse();

				// Click on Cart button
				conOrder.uClickonCartbutton();

				// Click on Confirm button
				conOrder.uClickonConfirmbutton();

				// Click on Checkout button
				conOrder.uClickonCheckoutbutton();

//				// Click on Guest name
//				conOrder.uClickonGuestname(); 
//				
//				// Click on Phone
//				conOrder.uClickonPhone(); 

				// Click on Place order button
				conOrder.uClickonPlaceorderbutton();

				// GOTO Main Table Page

				driver.switchTo().window(oldTab);
				Thread.sleep(5000);

				// Click on View button
				conOrder.uClickonViewbutton();

				// Click on Accept button
				conOrder.uClickonAcceptbuttoninOrderView();
				break;
			} else {
				driver.switchTo().window(currentWindow);
			}
			
			System.out.println("TestCase 03 = Test case for click on view button and approve order");
		}

	}

	@Test(priority = 4 )
	public void ApproveOrderfromTable() throws Exception {

		ContactlessXPath conOrder = new ContactlessXPath(driver);

		String oldTab = driver.getWindowHandle();

		String your_title = "Contactless Dining";

		String currentWindow = driver.getWindowHandle(); // will keep current window to switch back

		for (String winHandle : driver.getWindowHandles()) {

			if (driver.switchTo().window(winHandle).getTitle().equals(your_title)) {

				// Click on Continue button In OrderInfo
				conOrder.uClickonGoToMenubutton();

				// Click on Add button in Item
				conOrder.uclickOnAddButton();

				// Select Course
				conOrder.uSelectCourse();

				// Click on Cart button
				conOrder.uClickonCartbutton();

				// Click on Confirm button
				conOrder.uClickonConfirmbutton();

				// Click on Checkout button
				conOrder.uClickonCheckoutbutton();

//				// Click on Guest name
//				conOrder.uClickonGuestname(); 
//				
//				// Click on Phone
//				conOrder.uClickonPhone(); 

				// Click on Place order button
				conOrder.uClickonPlaceorderbutton();

				// GOTO Main Table Page

				driver.switchTo().window(oldTab);
				Thread.sleep(10000);

				// Click on Pending
				conOrder.uClickonPending();
				
				// Click on Arrow Icon for remove order notification
				conOrder.uClickonarrowicon();

				// Click on Approve button
				conOrder.uClickonApprovebutton();

				// Click on Cancel button
				conOrder.uClickonCancelbutton();

				break;
			} else {
				driver.switchTo().window(currentWindow);
			}
			
			System.out.println("TestCase 04 = Test case for approve order from Table");
		}

	}

	@Test(priority = 5 )
	public void approveOrderfromContactlessPage() throws Exception {

		ContactlessXPath conOrder = new ContactlessXPath(driver);

		String oldTab = driver.getWindowHandle();

		String your_title = "Contactless Dining";

		String currentWindow = driver.getWindowHandle(); // will keep current window to switch back

		for (String winHandle : driver.getWindowHandles()) {

			if (driver.switchTo().window(winHandle).getTitle().equals(your_title)) {

				// Click on Continue button In OrderInfo
				conOrder.uClickonGoToMenubutton();

				// Click on Add button in Item
				conOrder.uclickOnAddButton();

				// Select Course
				conOrder.uSelectCourse();

				// Click on Cart button
				conOrder.uClickonCartbutton();

				// Click on Confirm button
				conOrder.uClickonConfirmbutton();

				// Click on Continue button
				conOrder.uClickonContinuebutton();

//				// Click on Guest name
//				conOrder.uClickonGuestname(); 
//				
//				// Click on Phone
//				conOrder.uClickonPhone(); 

				// Click on Place order button
				conOrder.uClickonPlaceorderbutton();

				// GOTO Main Table Page

				driver.switchTo().window(oldTab);
				Thread.sleep(5000);

				// Click on Menu
				conOrder.uClickonmenu();

				// Click on Order Summary Option
				conOrder.uClickonOrderSummary();

				// Click on Cancel button
				conOrder.uClickonContactlessIcon();

				// Click on Accept button
				conOrder.uClickonAcceptButton();

				// Click on Back button
				conOrder.uClickonBackButton();

				// Click on Menu
				conOrder.uClickonmenuinOrderSummary();

				// Click on Dine In Option
				conOrder.uDineIn();

				break;
			} else {
				driver.switchTo().window(currentWindow);
			}
			
			System.out.println("TestCase 05 = Test case for approve order from Contactleess Order page");
		}

	}

	@Test(priority = 6 )
	public void approveOrderwithOrderofMultipleItems() throws Exception {

		ContactlessXPath conOrder = new ContactlessXPath(driver);

		String oldTab = driver.getWindowHandle();

		String your_title = "Contactless Dining";

		String currentWindow = driver.getWindowHandle(); // will keep current window to switch back

		for (String winHandle : driver.getWindowHandles()) {

			if (driver.switchTo().window(winHandle).getTitle().equals(your_title)) {

				// Go To Main Tab
				conOrder.uClickonConitinuebuttonInOrderInfo();

				// Click on Add button in First Item
				conOrder.uclickOnAddButton();

				// Select Course
				conOrder.uSelectCourse();

				// Click on Add button in Second Item
				conOrder.uclickOnAddItem();

				// Select Course
				conOrder.uSelectCourse();

				// Click on Cart button
				conOrder.uClickonCartbutton();

				// Click on Confirm button
				conOrder.uClickonConfirmbutton();

				// Click on Continue button
				conOrder.uClickonContinuebutton();

//				// Click on Guest name
//				conOrder.uClickonGuestname(); 
//				
//				// Click on Phone
//				conOrder.uClickonPhone(); 

				// Click on Place order button
				conOrder.uClickonPlaceorderbutton();

				// GOTO Main Table Page

				driver.switchTo().window(oldTab);
				Thread.sleep(5000);

				// Click on View button
				conOrder.uClickonViewbutton();

				// Click on Accept button
				conOrder.uClickonAcceptbuttoninOrderView();

				break;
			} else {
				driver.switchTo().window(currentWindow);
			}
			
			System.out.println("TestCase 06 = Test case for create a new order with multiple item and approve order");
		}

	}

	@Test(priority = 7 )
	public void DeclineOrder() throws Exception {

		ContactlessXPath conOrder = new ContactlessXPath(driver);

		String oldTab = driver.getWindowHandle();

		String your_title = "Contactless Dining";

		String currentWindow = driver.getWindowHandle(); // will keep current window to switch back

		for (String winHandle : driver.getWindowHandles()) {

			if (driver.switchTo().window(winHandle).getTitle().equals(your_title)) {

				// Go To Main Tab
				conOrder.uClickonConitinuebuttonInOrderInfo();

				// Click on Add button in First Item
				conOrder.uclickOnAddButton();

				// Select Course
				conOrder.uSelectCourse();

				// Click on Add button in Second Item
				conOrder.uclickOnAddItem();

				// Select Course
				conOrder.uSelectCourse();

				// Click on Cart button
				conOrder.uClickonCartbutton();

				// Click on Confirm button
				conOrder.uClickonConfirmbutton();

				// Click on Continue button
				conOrder.uClickonContinuebutton();

//				// Click on Guest name
//				conOrder.uClickonGuestname(); 
//				
//				// Click on Phone
//				conOrder.uClickonPhone(); 

				// Click on Place order button
				conOrder.uClickonPlaceorderbutton();

				// GOTO Main Table Page

				driver.switchTo().window(oldTab);
				Thread.sleep(5000);

				// Click on Decline button
				conOrder.uClickonDeclinebutton();

				break;
			} else {
				driver.switchTo().window(currentWindow);
			}
			
			System.out.println("TestCase 07 = Test case for decline order from web ordering page");
		}

	}

	@Test(priority = 8 )
	public void DeclineOrderonViewOrder() throws Exception {

		ContactlessXPath conOrder = new ContactlessXPath(driver);

		String oldTab = driver.getWindowHandle();

		String your_title = "Contactless Dining";

		String currentWindow = driver.getWindowHandle(); // will keep current window to switch back

		for (String winHandle : driver.getWindowHandles()) {

			if (driver.switchTo().window(winHandle).getTitle().equals(your_title)) {

				// Go To Main Tab
				conOrder.uClickonGoToMenubutton();

				// Click on Add button in First Item
				conOrder.uclickOnAddButton();

				// Select Course
				conOrder.uSelectCourse();

				// Click on Add button in Second Item
				conOrder.uclickOnAddItem();

				// Select Course
				conOrder.uSelectCourse();

				// Click on Cart button
				conOrder.uClickonCartbutton();

				// Click on Confirm button
				conOrder.uClickonConfirmbutton();

				// Click on Continue button
				conOrder.uClickonContinuebutton();

//				// Click on Guest name
//				conOrder.uClickonGuestname(); 
//				
//				// Click on Phone
//				conOrder.uClickonPhone(); 

				// Click on Place order button
				conOrder.uClickonPlaceorderbutton();

				// GOTO Main Table Page

				driver.switchTo().window(oldTab);
				Thread.sleep(5000);

				// Click on View button
				conOrder.uClickonViewbutton();

				// Click on Decline button
				conOrder.uClickonDeclinebuttoninOrderPopup();

				break;
			} else {
				driver.switchTo().window(currentWindow);
			}
			
			System.out.println("TestCase 08 = Test case for decline order on view popup");
		}

	}

	@Test(priority = 9 )
	public void DeclineOrderfromTable() throws Exception {

		ContactlessXPath conOrder = new ContactlessXPath(driver);

		String oldTab = driver.getWindowHandle();

		String your_title = "Contactless Dining";

		String currentWindow = driver.getWindowHandle(); // will keep current window to switch back

		for (String winHandle : driver.getWindowHandles()) {

			if (driver.switchTo().window(winHandle).getTitle().equals(your_title)) {

				// Go To Main Tab
				conOrder.uClickonGoToMenubutton();

				// Click on Add button in First Item
				conOrder.uclickOnAddButton();

				// Select Course
				conOrder.uSelectCourse();

				// Click on Add button in Second Item
				conOrder.uclickOnAddItem();

				// Select Course
				conOrder.uSelectCourse();

				// Click on Cart button
				conOrder.uClickonCartbutton();

				// Click on Confirm button
				conOrder.uClickonConfirmbutton();

				// Click on Continue button
				conOrder.uClickonContinuebutton();

//				// Click on Guest name
//				conOrder.uClickonGuestname(); 
//				
//				// Click on Phone
//				conOrder.uClickonPhone(); 

				// Click on Place order button
				conOrder.uClickonPlaceorderbutton();

				// GOTO Main Table Page

				driver.switchTo().window(oldTab);
				Thread.sleep(10000);

				// Click on Pending
				conOrder.uClickonPending();

				// Click on Arrow Icon for remove order notification
				conOrder.uClickonarrowicon();

//				// Click on Arrow Icon for remove order notification
//				conOrder.uClickonarrowicon();
				
				// Click on Decline button
				conOrder.uClickonDeclinebuttonininTable();

				// Click on Cancel button
				conOrder.uClickonCancelbutton();

				break;
			} else {
				driver.switchTo().window(currentWindow);
			}
			
			System.out.println("TestCase 09 = Test case for decline order from table");
		}

	}

	@Test(priority = 10 )
	public void DeclineOrderfromContactlessPage() throws Exception {

		ContactlessXPath conOrder = new ContactlessXPath(driver);

		String oldTab = driver.getWindowHandle();

		String your_title = "Contactless Dining";

		String currentWindow = driver.getWindowHandle(); // will keep current window to switch back

		for (String winHandle : driver.getWindowHandles()) {

			if (driver.switchTo().window(winHandle).getTitle().equals(your_title)) {

				// Click on Continue button In OrderInfo
				conOrder.uClickonGoToMenubutton();

				// Click on Add button in Item
				conOrder.uclickOnAddButton();

				// Select Course
				conOrder.uSelectCourse();

				// Click on Cart button
				conOrder.uClickonCartbutton();

				// Click on Confirm button
				conOrder.uClickonConfirmbutton();

				// Click on Continue button
				conOrder.uClickonContinuebutton();

//				// Click on Guest name
//				conOrder.uClickonGuestname(); 
//				
//				// Click on Phone
//				conOrder.uClickonPhone(); 

				// Click on Place order button
				conOrder.uClickonPlaceorderbutton();
				Thread.sleep(5000);
				
				driver.close();

				// GOTO Main Table Page

				driver.switchTo().window(oldTab);
				Thread.sleep(5000);

				// Click on Menu
				conOrder.uClickonmenu();

				// Click on Order Summary Option
				conOrder.uClickonOrderSummary();

				
				// Click on Cancel button
				conOrder.uClickonContactlessIcon();

				// Click on Decline button in Contactless Page
				conOrder.uClickonDeclinebuttoninContactlessPage();

				// Click on Back button
				conOrder.uClickonBackButton();

				// Click on Menu
				conOrder.uClickonmenuinOrderSummary();

				// Click on Dine In Option
				conOrder.uDineIn();

				break;
			} else {
				driver.switchTo().window(currentWindow);
			}
			
			System.out.println("TestCase 10 = Test case for decline order from Contactess order page");
		}

	}

	@Test(priority = 11, enabled = false )
	public void ContactlessPayNow() throws Exception {

		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

		String oldTab = driver.getWindowHandle();
		
		jsExecutor.executeScript("alert('159 :- Test case for check with take a new order item from item group  !')");
		Thread.sleep(5000);

		driver.switchTo().alert().accept();	
		Thread.sleep(5000);

		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(5000);

		// below code will navigate you to your desirable Url 
		driver.get("https://app.ipos247.com/contactless/#/5dbad63074787958dc4ae75cc86f8556869dd3f7f1c76e3d219c5fd9c3c520a6");
		Thread.sleep(10000);

		// Click on Start button

		driver.findElement(By.xpath("/html/body/ion-app/ng-component/ion-nav/page-welcome/ion-footer/button")).click();
		Thread.sleep(5000);

		// Click on Add button in item

		driver.findElement(By.xpath("/html/body/ion-app/ng-component/ion-nav/page-menu/ion-content/div[2]/ion-row[2]/ion-col[2]/div/ion-list[1]/div/div/order-item/ion-item[1]/div[1]/div/ion-label/ion-card/ion-card-content/div/div[2]/div/button")).click();
		Thread.sleep(5000);

		// Select Course

		driver.findElement(By.xpath("/html/body/ion-app/ion-modal/div/course-selection/ion-content/div[2]/ion-list/ion-item[1]")).click();
		Thread.sleep(5000);

		// Click on Cart button

		driver.findElement(By.xpath("/html/body/ion-app/ng-component/ion-nav/page-menu/ion-fab[1]")).click();
		Thread.sleep(5000);

		// Click on Confirm button

		driver.findElement(By.xpath("/html/body/ion-app/ion-modal/div/page-order-cart/ion-footer/button")).click();
		Thread.sleep(5000);

		// Click on Continue button

		driver.findElement(By.xpath("/html/body/ion-app/ion-modal[2]/div/page-finalize-bill/ion-footer/ion-buttons/button")).click();
		Thread.sleep(5000);

		// ================ Personal Info =========================

		// Click on Guest name

		driver.findElement(By.xpath("/html/body/ion-app/ion-modal[3]/div/order-information/ion-content/div[2]/ion-item[1]/div[1]/div/ion-input/input")).sendKeys("Automation User");
		Thread.sleep(5000);

		// Click on Phone

		driver.findElement(By.xpath("/html/body/ion-app/ion-modal[3]/div/order-information/ion-content/div[2]/ion-item[2]/div[1]/div/ion-input/input")).sendKeys("87878788787");
		Thread.sleep(5000);

		// Click on Pay Now button

		driver.findElement(By.xpath("/html/body/ion-app/ion-modal[3]/div/order-information/ion-footer/button[1]")).click();
		Thread.sleep(5000);
		
		// Click on Done button

		driver.findElement(By.xpath("/html/body/ion-app/ion-modal[4]/div/tip-modal/ion-footer/ion-row/ion-col[1]/button")).click();
		Thread.sleep(5000);
		
		// Select "ipayafrica" payment 

		driver.findElement(By.xpath("/html/body/ion-app/ion-modal[4]/div/payment-select/ion-content/div[2]/ion-list/ion-item[1]")).click();
		Thread.sleep(5000);
		
		// Click on Pay  

		driver.findElement(By.xpath("/html/body/ion-app/ion-modal[4]/div/payment-select/ion-footer/button")).click();
		Thread.sleep(15000);
		
		// Click on Payment 
		
		String winHandleBefore = driver.getWindowHandle();
		
		// Switch to new window opened
		
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		    Thread.sleep(5000);
		}
		
		// Close the new window, if that window no more required
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/div/div/div/div/form/div/div[3]/div/div[2]/div/div[2]")).click();
		Thread.sleep(15000);
		
		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore); 
		
		// Click on Done button in payment
		
		driver.findElement(By.xpath("/html/body/ion-app/ion-modal/div/payment-status/ion-footer/button")).click();
		Thread.sleep(5000);
		
		driver.close();

		// GOTO Main Table Page

		driver.switchTo().window(oldTab);
		Thread.sleep(5000);

		// Click on Accept button

		driver.findElement(By.xpath("//*[@id=\"nucleusNotification\"]/div/div[2]/button")).click();
		Thread.sleep(5000);
		
		System.out.println("TestCase 11 = Create a new GRN with Single Item");
	}

	@Test(priority = 12 )
	public void ContactlessItemGroupOrder() throws Exception {

		ContactlessXPath conOrder = new ContactlessXPath(driver);

		String oldTab = driver.getWindowHandle();

		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(5000);

		// QR CODE URL
		conOrder.QRCODEURL();

		// Click on Start button
		conOrder.uclickOnStartButton();

		// Click on Sub Menu
		conOrder.uClickonSubMenu();

		// Click on Item Group
		conOrder.uClickonItemGroup();

//		// Click on Add button in Item Group
//		conOrder.uclickOnAddButton();

		// Click on Add button in Item
		conOrder.uClickonAddIteminItemGroup();

		// Select Course
		conOrder.uSelectCourse();

		// Click on cancel button in Item Group
		conOrder.uClickoncancelbuttoninItemGroup();

		// Click on Cart button
		conOrder.uClickonCartbutton();

		// Click on Confirm button
		conOrder.uClickonConfirmbutton();

		// Click on Continue button
		conOrder.uClickonContinuebutton();

		// Click on Guest name
		conOrder.uClickonGuestname();

		// Click on Phone
		conOrder.uClickonPhone();
		
		// Click on Place order button
		conOrder.uClickonPlaceorderbutton();

		driver.close();

		// GOTO Main Table Page

		driver.switchTo().window(oldTab);
		Thread.sleep(5000);

		// Click on Accept button
		conOrder.uClickonAcceptbutton();
		
		System.out.println("TestCase 12 = Test case for check with take a new order item from item group");
	}

	@Test(priority = 13 )
	public void ContactlessModifier() throws Exception {

		ContactlessXPath conOrder = new ContactlessXPath(driver);

		String oldTab = driver.getWindowHandle();

		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(5000);

		// QR CODE URL
		conOrder.QRCODEURL();

		// Click on Start button
		conOrder.uclickOnStartButton();

		// Add Item For Modifier
		conOrder.uAddItemForModifier();

		// Click on Add Item button in Modifiers popup
		conOrder.uClickonAddItemForModifier();

		// Select Course
		conOrder.uSelectCourse();

//		// Click on cancel button in Item Group
//		conOrder.uClickoncancelbuttoninItemGroup();

		// Click on Cart button
		conOrder.uClickonCartbutton();

		// Click on Confirm button
		conOrder.uClickonConfirmbutton();

		// Click on Continue button
		conOrder.uClickonContinuebutton();

		// Click on Guest name
		conOrder.uClickonGuestname();

		// Click on Phone
		conOrder.uClickonPhone();

		// Click on Place order button
		conOrder.uClickonPlaceorderbutton();

		// GOTO Main Table Page

		driver.switchTo().window(oldTab);
		Thread.sleep(5000);

		// Click on Accept button
		conOrder.uClickonAcceptbutton();
		
		System.out.println("TestCase 13 = Test case for check with create a new order with modifer item");
	}

	@Test(priority = 14 )
	public void ContactLessRepeatItem() throws Exception {

		ContactlessXPath conOrder = new ContactlessXPath(driver);

		String oldTab = driver.getWindowHandle();

		String your_title = "Contactless Dining";

		String currentWindow = driver.getWindowHandle(); // will keep current window to switch back

		for (String winHandle : driver.getWindowHandles()) {

			if (driver.switchTo().window(winHandle).getTitle().equals(your_title)) {

				// Click on Continue button In OrderInfo
				conOrder.uClickonGoToMenubutton();

				// Click on Cart button
				conOrder.uClickonCartbutton();

				// Click on Cart Icon
				conOrder.uClickonCarticon();

				// Click on Order Detail
				conOrder.uClickonOrderDetail();

				// Click on Repeat Icon
				conOrder.uClickonRepeatIcon();

				// Click on Repeat Button
				conOrder.uClickonRepeatButton();

				// Click on Cancel icon
				conOrder.uClickonCancelicon();

				// Click on Back icon
				conOrder.uClickonBackicon();

				// Click on Confirm button
				conOrder.uClickonConfirmbutton();

				// Click on Continue button
				conOrder.uClickonContinuebutton();

//				// Click on Guest name
//				conOrder.uClickonGuestname(); 
//				
//				// Click on Phone
//				conOrder.uClickonPhone(); 

				// Click on Place order button
				conOrder.uClickonPlaceorderbutton();

				// GOTO Main Table Page

				driver.switchTo().window(oldTab);
				Thread.sleep(5000);

				// Click on Accept button
				conOrder.uClickonAcceptbutton();

				break;
			} else {
				driver.switchTo().window(currentWindow);
			}
			
			System.out.println("TestCase 14 = Test case for add product from repeat in order detail ");
		}

	}

	@Test(priority = 15 )
	public void voidItemfromCart() throws Exception {

		ContactlessXPath conOrder = new ContactlessXPath(driver);

		String oldTab = driver.getWindowHandle();

		String your_title = "Contactless Dining";

		String currentWindow = driver.getWindowHandle(); // will keep current window to switch back

		for (String winHandle : driver.getWindowHandles()) {

			if (driver.switchTo().window(winHandle).getTitle().equals(your_title)) {

				// Click on Continue button In OrderInfo
				conOrder.uClickonConitinuebuttonInOrderInfo();

				// Click on Add button in Item
				conOrder.uclickOnAddButton();

				// Select Course
				conOrder.uSelectCourse();

				// Click on Cart button
				conOrder.uClickonCartbutton();

				// Click on Void button
				conOrder.uClickonvoidbutton();
				
				// Click on Remove button
				conOrder.uClickonRemovebutton();

				// Click on Back Icon in Cart page
				conOrder.uClickonBackIconinCartpage();
				
				System.out.println("TestCase 15 = Remove Item from cart");
				
				
				// Click on Add button in Item
				conOrder.uclickOnAddButton();

				// Select Course
				conOrder.uSelectCourse();

				// Click on Cart button
				conOrder.uClickonCartbutton();

				// Click on Plus Button in QTY
				conOrder.uClickonPlusButtoninQTY();

				// Click on Plus Button in QTY
				conOrder.uClickonPlusButtoninQTY();
				
				// Click on Back Icon in Cart page
				conOrder.uClickonBackIconinCartpage();
				
				System.out.println("TestCase 16 = Test case for check with Increase the QTY of items from cart");

				
				// Click on Cart button
				conOrder.uClickonCartbutton();

				// Click on Instruction
				conOrder.uClickonInstruction();

				// Enter Instruction
				conOrder.uEnterinstruction();
				
				// Click on Save Button
				conOrder.uClickonSavebutton();

				// Click on Back Icon in Cart page
				conOrder.uClickonBackIconinCartpage();
				
				System.out.println("TestCase 17 = Test case for add instruction");
				
				// Click on Cart button
				conOrder.uClickonCartbutton();

				// Click on Remove button in Instruction
				conOrder.uClickonRemovebuttoninInstruction();
				
				System.out.println("TestCase 18 = Test case for Delete Instructionon order");

				// Click on Confirm button
				conOrder.uClickonConfirmbutton();

				// Click on Checkout button
				conOrder.uClickonCheckoutbutton();

				// Click on Place order button
				conOrder.uClickonPlaceorderbutton();
				
				// Click on Continue button In OrderInfo
				conOrder.uClickonConitinuebuttonInOrderInfo();
				
				driver.close();

				// GOTO Main Table Page

				driver.switchTo().window(oldTab);
				Thread.sleep(5000);

				// Click on Accept button
				conOrder.uClickonAcceptbutton();
				
				
				

				break;
			} else {
				driver.switchTo().window(currentWindow);
			}
			
			
		}

	}
	

}
