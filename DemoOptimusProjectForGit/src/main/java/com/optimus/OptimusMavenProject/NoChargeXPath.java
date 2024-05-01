package com.optimus.OptimusMavenProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NoChargeXPath {
	
	public static WebDriver driver;
	
	public NoChargeXPath(WebDriver driver) {
		
		this.driver=driver;
	}
	
	// Click on menu
	By Clickonmenu = By.xpath("//*[@class=\"ico-with-text bar-buttons bar-buttons-md bar-button bar-button-md bar-button-default bar-button-default-md bar-button-menutoggle bar-button-menutoggle-md\"]");
	
	public void uClickonmenu() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(Clickonmenu));
		
		driver.findElement(Clickonmenu).click();
		Thread.sleep(3000);
	}
	
	// Click on menu in Order Summary
	By ClickonmenuinOrderSummary = By.xpath("/html/body/ion-app/ng-component/ion-nav/page-ordersummary/ion-header/header/ion-navbar/div[2]");
	
	public void uClickonmenuinOrderSummary() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonmenuinOrderSummary));
		
		driver.findElement(ClickonmenuinOrderSummary).click();
		Thread.sleep(3000);
	}
	
	// Click on Order Summary
	By ClickonOrderSummary = By.xpath("//p[contains(text(),'Order Summary')]");
	
	public void uClickonOrderSummary() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonOrderSummary));
		
		driver.findElement(ClickonOrderSummary).click();
		Thread.sleep(3000);
	}
	
	
	
	// Click on No Charge 
	By NoCharge = By.xpath("//p[contains(text(),'No Charge')]");
	
	public void uNoCharge() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(NoCharge));
		
		driver.findElement(NoCharge).click();
		Thread.sleep(3000);
	}
	
	// Click on Dine In
	By DienIn = By.xpath("//p[contains(text(),'Dine In')]");
	
	public void uDienIn() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(DienIn));
		
		driver.findElement(DienIn).click();
		Thread.sleep(3000);
	}
	
	// Click on Take Away
	By ClickonTakeAway = By.xpath("//p[contains(text(),'Take Away')]");
	
	public void uClickonTakeAway() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonTakeAway));
		
		driver.findElement(ClickonTakeAway).click();
		Thread.sleep(3000);
	}
	
	// Click on menu in Room Service
	By ClickonmenuinRoomService = By.xpath("/html/body/ion-app/ng-component/ion-nav/page-room-service/ion-header/header/ion-navbar/div[2]");
	
	public void uClickonmenuinRoomService() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonmenuinRoomService));
		
		driver.findElement(ClickonmenuinRoomService).click();
		Thread.sleep(3000);
	}
	
	// Click on RoomService
	By ClickonRoomService = By.xpath("//p[contains(text(),'Room Service')]");
	
	public void uClickonRoomService() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonRoomService));
		
		driver.findElement(ClickonRoomService).click();
		Thread.sleep(3000);
	}
	
	// Click on Delivery manager
	By DeliveryManager = By.xpath("//p[contains(text(),'Delivery Manager')]");
	
	public void uDeliveryManager() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(DeliveryManager));
		
		driver.findElement(DeliveryManager).click();
		Thread.sleep(3000);
	}
	
	// Click on Menu in Dine In
	By ClickonMenuinDineIn = By.xpath("/html/body/ion-app/ng-component/ion-nav/page-dinein/ion-header/header/ion-navbar/div[2]");
	
	public void uClickonMenuinDineIn() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonMenuinDineIn));
		
		driver.findElement(ClickonMenuinDineIn).click();
		Thread.sleep(3000);
	}
	
	// Click on Account
	By ClickonAccount = By.xpath("(//p[contains(text(),'Account')])[2]");
	
	public void uClickonAccount() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonAccount));
		
		driver.findElement(ClickonAccount).click();
		Thread.sleep(3000);
	}
	
	// Select Account
	By SelectAccount = By.xpath("//*[@aria-posinset=\"1\"]");
	
	public void uSelectAccount() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(SelectAccount));
		
		driver.findElement(SelectAccount).click();
		Thread.sleep(3000);
	}
	
	// Click on Save button on Order
	By clickOnSave = By.xpath("//p[contains(text(),'Save')]");
	
	public void uclickOnSave() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnSave));
		
		driver.findElement(clickOnSave).click();
		Thread.sleep(2000);
	}
	
	// Add first Item
	By addFirstItem = By.xpath("//*[@title=\"Double Special Falooda\"]");
	
	// Add Second Item
	By addSecondItem = By.xpath("//*[@title=\"Special Falooda\"]");
	
	public void uaddFirstItem() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(addFirstItem));
		
		driver.findElement(addFirstItem).click();
		Thread.sleep(2000);
	}
	
	public void uaddSecondItem() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(addSecondItem));
		
		driver.findElement(addSecondItem).click();
		Thread.sleep(2000);
	}
	
	// Click on Yes button in confirm popup
	By clickOnYes = By.xpath("//span[contains(text(),'Yes')]");
	
	public void uclickOnYes() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnYes));
		
		driver.findElement(clickOnYes).click();
		Thread.sleep(2000);
	}
	
	// Enter Guest name
	By EnterGuestname = By.xpath("/html/body/ion-app/ion-modal/div/order-information/form/ion-content/div[2]/ion-grid/div[3]/ion-row[3]/ion-col[1]/ion-item/div[1]/div/ion-input/input");
	
	public void uEnterGuestname() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(EnterGuestname));
		
		driver.findElement(EnterGuestname).sendKeys("Makbul Ahmed Khan");
		Thread.sleep(2000);
	}
	
	// Enter Email
	By EnterEmail = By.xpath("/html/body/ion-app/ion-modal/div/order-information/form/ion-content/div[2]/ion-grid/div[3]/ion-row[3]/ion-col[2]/ion-item/div[1]/div/ion-input/input");
	
	public void uEnterEmail() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(EnterEmail));
		
		driver.findElement(EnterEmail).sendKeys("makbul.khan@ezeetechnosys.com");
		Thread.sleep(2000);
	}
	
	// Enter Mobile No
	By EnterMobileNo = By.xpath("/html/body/ion-app/ion-modal/div/order-information/form/ion-content/div[2]/ion-grid/div[3]/ion-row[3]/ion-col[4]/ion-item/div[1]/div/ion-input/input");
	
	public void uEnterMobileNo() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(EnterMobileNo));
		
		driver.findElement(EnterMobileNo).sendKeys("9737620661");
		Thread.sleep(2000);
	}
	
	// Enter Address
	By EnterAddress = By.xpath("/html/body/ion-app/ion-modal/div/order-information/form/ion-content/div[2]/ion-grid/div[3]/ion-row[3]/ion-col[5]/ion-item/div[1]/div/ion-input/input");
	
	public void uEnterAddress() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(EnterAddress));
		
		driver.findElement(EnterAddress).sendKeys("Majura Gate,Surat");
		Thread.sleep(2000);
	}
	
	// Click on Settled Section
	By ClickonSettledSection = By.xpath("//span[contains(text(),'Settled')]");
	
	public void uClickonSettledSection() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonSettledSection));
		
		driver.findElement(ClickonSettledSection).click();
		Thread.sleep(2000);
	}
	
	// Select Order
	By SelectOrder = By.xpath("/html/body/ion-app/ng-component/ion-nav/page-ordersummary/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/ion-card/ion-card-content/ion-content/div[2]/table/tbody/tr[1]/td[1]/ion-item/ion-checkbox");
	
	public void uSelectOrder() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(SelectOrder));
		
		driver.findElement(SelectOrder).click();
		Thread.sleep(2000);
	}
	
	// Click on Recall Button
	By ClickonRecallButton = By.xpath("//p[contains(text(),'Recall')]");
	
	public void uClickonRecallButton() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonRecallButton));
		
		driver.findElement(ClickonRecallButton).click();
		Thread.sleep(2000);
	}
	
	// Click on + For increase the QTY
	By clickOnPlusonQTY = By.xpath("(//*[@class=\"iconBtn qty-btn button button-md button-default button-default-md ng-star-inserted\"])[1]");
	
	public void uclickOnPlusonQTY() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnPlusonQTY));
		
		driver.findElement(clickOnPlusonQTY).click();
		Thread.sleep(2000);
	}
	
	// Click on Remove button on Item
	By clickOnVoidItem = By.xpath("(//*[@class=\"deleteItem button button-md button-default button-default-md ng-star-inserted\"])[1]");
	
	public void uclickOnVoidItem() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnVoidItem));
		
		driver.findElement(clickOnVoidItem).click();
		Thread.sleep(2000);
	}
	
	// Click on void Option
	By clickOnVoid = By.xpath("(//*[@class=\"row-content row\"])[2]");
	
	public void uclickOnVoid() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnVoid));
		
		driver.findElement(clickOnVoid).click();
		Thread.sleep(2000);
	}
	
	// Clicks on Select reason
	By ClickOnReasons = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted virtual-position\"])[2]");
	
	public void uClickOnReasons() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickOnReasons));
		
		driver.findElement(ClickOnReasons).click();
		Thread.sleep(8000);
	}
	
	// ================> Item QTY & Quantity popup <==============================
	
		// Click on QTY section on item
		By clickonQTY = By.xpath("(//*[@title=\"1\"])[1]");
		
		public void uclickonQTY() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickonQTY));
			
			driver.findElement(clickonQTY).click();
			Thread.sleep(2000);
		}
		
		// Click on "2" number
		By clickon2 = By.xpath("//span[contains(text(),'2')]");
		
		public void uclickon2() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickon2));
			
			driver.findElement(clickon2).click();
			Thread.sleep(2000);
		}
		
		// Click on "0" number
		By clickon0 = By.xpath("//span[contains(text(),'0')]");
		
		public void uclickon0() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickon0));
			
			driver.findElement(clickon0).click();
			Thread.sleep(2000);
		}
		
		// Click on Enter
		By clickonEnter = By.xpath("//*[@class=\"primary-btn button button-md button-default button-default-md\"]");
		
		public void uclickonEnter() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickonEnter));
			
			driver.findElement(clickonEnter).click();
			Thread.sleep(2000);
		}
		
		// Click on "00" in Payment Process
		By clickOn00 = By.xpath("(//*[@class=\"secondary-btn button button-md button-default button-default-md\"])[11]");
		
		public void uclickOn00() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOn00));
			
			driver.findElement(clickOn00).click();
			Thread.sleep(2000);
		}
		
		// Select monthly account
		By SelectMonthlyAccount = By.xpath("//*[@aria-posinset=\"4\"]");
		
		public void uSelectMonthlyAccount() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(SelectMonthlyAccount));
			
			driver.findElement(SelectMonthlyAccount).click();
			Thread.sleep(2000);
		}
		
		// Select user with Pin
		By SelectuserwithPin = By.xpath("//*[@aria-posinset=\"6\"]");
		
		public void uSelectuserwithPin() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(SelectuserwithPin));
			
			driver.findElement(SelectuserwithPin).click();
			Thread.sleep(2000);
		}
		
		// Enter Pin
		By EnterPin = By.xpath("//*[@id=\"nocharge-userpin\"]");
		
		public void uEnterPin() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(EnterPin));
			
			driver.findElement(EnterPin).sendKeys("1001");
			Thread.sleep(2000);
		}
		
		// Click on Save button
		By ClickonSavebutton = By.xpath("//span[contains(text(),'Save')]");
		
		public void uClickonSavebutton() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonSavebutton));
			
			driver.findElement(ClickonSavebutton).click();
			Thread.sleep(2000);
		}
		
		// Enter Pin
		By EnterInvalidPin = By.xpath("//*[@id=\"nocharge-userpin\"]");
		
		public void uEnterInvalidPin() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(EnterInvalidPin));
			
			driver.findElement(EnterInvalidPin).sendKeys("5874");
			Thread.sleep(2000);
		}
		
		// Click on Order Section
		By ClickonOrderSection = By.xpath("//span[contains(text(),'New Order-1')]");
		
		public void uClickonOrderSection() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonOrderSection));
			
			driver.findElement(ClickonOrderSection).click();
			Thread.sleep(2000);
		}
		
		// Click on Account for Update
		By ClickonAccountforUpdate = By.xpath("//p[contains(text(),'Ahmed(NL-WP)')]");
		
		public void uClickonAccountforUpdate() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonAccountforUpdate));
			
			driver.findElement(ClickonAccountforUpdate).click();
			Thread.sleep(2000);
		}
		
		// Select Other Account
		By SelectOtherAccount = By.xpath("//*[@aria-posinset=\"5\"]");
		
		public void uSelectOtherAccount() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(SelectOtherAccount));
			
			driver.findElement(SelectOtherAccount).click();
			Thread.sleep(2000);
		}
		
		// Click on Update Button
		By ClickonUpdateButton = By.xpath("//span[contains(text(),'Update')]");
		
		public void uClickonUpdateButton() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonUpdateButton));
			
			driver.findElement(ClickonUpdateButton).click();
			Thread.sleep(2000);
		}
		
		// Click on No Charge Button
		By ClickonNoChargeButton = By.xpath("(//p[contains(text(),'No Charge')])[2]");
		
		public void uClickonNoChargeButton() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonNoChargeButton));
			
			driver.findElement(ClickonNoChargeButton).click();
			Thread.sleep(2000);
		}
		
		// Click on Yes Button in Mark as no Charge popup
		By ClickonYesButton = By.xpath("//span[contains(text(),'Yes')]");
		
		public void uClickonYesButton() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonYesButton));
			
			driver.findElement(ClickonYesButton).click();
			Thread.sleep(2000);
		}
		
		// Select No Charge Account
		By SelectNoChargeAccount = By.xpath("//*[@aria-posinset=\"1\"]");
		
		public void uSelectNoChargeAccount() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(SelectNoChargeAccount));
			
			driver.findElement(SelectNoChargeAccount).click();
			Thread.sleep(2000);
		}
		
		// ================> Take order with Single Item  <===========================
		
		// Click on Plus icon
		By clickonPlus = By.xpath("//ion-col[@class='dine-tables col']//ion-col[1]//div[1]//ion-buttons[1]//button[1]//span[1]");
		
		// Click on Save button
		By clickonSaveButton = By.xpath("//span[contains(text(),'Save')]");
		
		// Click on Item
		By clickonItem = By.xpath("//button[@title='Double Falooda Single Glass']//img");
		
		// Click on Course
		By selectCourse = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted\"])[1]");
		
		// Click on Finish Button
		By clickonFinishButton = By.xpath("//span[normalize-space()='Finish']");
		
		
		public void uclickonPlus() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickonPlus));
			
			driver.findElement(clickonPlus).click();
			Thread.sleep(2000);
		}
		
		public void uclickonSaveButton() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickonSaveButton));
			
			driver.findElement(clickonSaveButton).click();
			Thread.sleep(2000);
		}
		
		public void uclickonItem() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickonItem));
			
			driver.findElement(clickonItem).click();
			Thread.sleep(2000);
		}
		
		public void uselectCourse() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(selectCourse));
			
			driver.findElement(selectCourse).click();
			Thread.sleep(2000);
		}
		
		public void uclickonFinishButton() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickonFinishButton));
			
			driver.findElement(clickonFinishButton).click();
			Thread.sleep(2000);
		}
		
// Delivery manager
		
		
		// Click on Add Order
		By ClickonAddOrder = By.xpath("/html/body/ion-app/ng-component/ion-nav/page-delivery-manager/ion-header/header/ion-navbar/div[3]/div/ion-buttons[1]/button");
		
		public void uClickonAddOrder() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonAddOrder));
			
			driver.findElement(ClickonAddOrder).click();
			Thread.sleep(3000);
		}
		
		// Click on Add New Guest
		By ClickonAddNewGuest = By.xpath("//i[contains(text(),'person_add')]");
		
		public void uClickonAddNewGuest() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonAddNewGuest));
			
			driver.findElement(ClickonAddNewGuest).click();
			Thread.sleep(3000);
		}
		
		// Enter Guest name
		By EnterGuestname1 = By.xpath("(//*[@formcontrolname=\"fname\"])[2]");
		
		public void uEnterGuestname1() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(EnterGuestname1));
			
			driver.findElement(EnterGuestname1).sendKeys("Makbul Khan");
			Thread.sleep(3000);
		}
		
		// Enter Email
		By EnterEmail1 = By.xpath("(//*[@formcontrolname=\"email\"])[2]");
		
		public void uEnterEmail1() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(EnterEmail1));
			
			driver.findElement(EnterEmail1).sendKeys("makbul.khan@ezeetechnosys.com");
			Thread.sleep(3000);
		}
		
		// Enter Mobile number
		By EnterMobilenumber = By.xpath("(//*[@formcontrolname=\"mobile\"])[2]");
		
		public void uEnterMobilenumber() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(EnterMobilenumber));
			
			driver.findElement(EnterMobilenumber).sendKeys("9737620661");
			Thread.sleep(3000);
		}
		
		// Enter Address
		By EnterAddress1 = By.xpath("(//*[@formcontrolname=\"address\"])[2]");
		
		public void uEnterAddress1() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(EnterAddress1));
			
			driver.findElement(EnterAddress1).click();
			Thread.sleep(3000);
		}
		
		// Click on Place Order button
		By ClickonPlaceOrderbutton = By.xpath("//span[contains(text(),'Place Order')]");
		
		public void uClickonPlaceOrderbutton() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonPlaceOrderbutton));
			
			driver.findElement(ClickonPlaceOrderbutton).click();
			Thread.sleep(3000);
		}
		
		// Click on Cancel icon in No charge popup
		By ClickonCancelIconbutton = By.xpath("/html/body/ion-app/ion-modal/div/order-information/form/ion-header/ion-toolbar/div[2]/div[3]/ion-buttons/button");
		
		public void uClickonCancelIconbutton() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonCancelIconbutton));
			
			driver.findElement(ClickonCancelIconbutton).click();
			Thread.sleep(3000);
		}
		
		// Enter Guest Name
		By EnterGuestName1 = By.xpath("(//*[@formcontrolname=\"fname\"])[2]");
		
		public void uEnterGuestName1() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(EnterGuestName1));
			
			driver.findElement(EnterGuestName1).sendKeys("Makbul Ahmed Khan");
			Thread.sleep(3000);
		}
		
		// Enter Email Name
		By EnterEmailName1 = By.xpath("(//*[@formcontrolname=\"email\"])[2]");
		
		public void uEnterEmailName1() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(EnterEmailName1));
			
			driver.findElement(EnterEmailName1).sendKeys("makbul.khan@ezeetechnosys.com");
			Thread.sleep(3000);
		}
		
		// Enter Mobile Number
		By EnterMobileNumber1 = By.xpath("(//*[@formcontrolname=\"mobile\"])[2]");
		
		public void uEnterMobileNumber1() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(EnterMobileNumber1));
			
			driver.findElement(EnterMobileNumber1).sendKeys("9797979797");
			Thread.sleep(3000);
		}
		
		// Click on Continue Button
		By ClickonContinueButton = By.xpath("//span[contains(text(),'Continue')]");
		
		public void uClickonContinueButton() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonContinueButton));
			
			driver.findElement(ClickonContinueButton).click();
			Thread.sleep(3000);
		}
		
		// Daily Limit Account
		By DailyLimitAccount = By.xpath("//*[@aria-posinset=\"2\"]");
		
		public void uDailyLimitAccount() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(DailyLimitAccount));
			
			driver.findElement(DailyLimitAccount).click();
			Thread.sleep(3000);
		}
// Room services
		
		// Click on Room
		By ClickonRoom = By.xpath("(//*[@class=\"room-number txtline-clap1\"])[1]");
		
		public void uClickonRoom() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonRoom));
			
			driver.findElement(ClickonRoom).click();
			Thread.sleep(3000);
		}
		
		// Click on Dispatched Button
		By ClickonDispatchedButton = By.xpath("(//i[contains(text(),'local_shipping')])[2]");
		
		public void uClickonDispatchedButton() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonDispatchedButton));
			
			driver.findElement(ClickonDispatchedButton).click();
			Thread.sleep(8000);
		}
		
		// Select Dispatched section
		By SelectDispatchedsection = By.xpath("/html/body/ion-app/ng-component/ion-nav/page-delivery-manager/ion-content[1]/div[2]/ion-grid/ion-row/ion-col/ion-card/ion-card-content/ion-row/ion-col[1]/div/button[3]");
		
		public void uSelectDispatchedsection() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(SelectDispatchedsection));
			
			driver.findElement(SelectDispatchedsection).click();
			Thread.sleep(8000);
		}
		
		// Click on Complete button 
		By ClickonCompletebutton = By.xpath("(//*[@class=\"secondary-btn save button button-md button-default button-default-md button-md-primary\"])[1]");
		
		public void uClickonCompletebutton() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonCompletebutton));
			
			driver.findElement(ClickonCompletebutton).click();
			Thread.sleep(2000);
		}
		
		// Click on Completed Section
		By ClickonCompletedSection = By.xpath("//span[contains(text(),'Completed')]");
		
		public void uClickonCompletedSection() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonCompletedSection));
			
			driver.findElement(ClickonCompletedSection).click();
			Thread.sleep(2000);
		}

}
