package com.optimus.OptimusMavenProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Pages {
	
	public static WebDriver driver;
	
	public Pages(WebDriver driver) {
		
		this.driver=driver;
	}
	
// ====================================> Log In Module Xpath <===================================================
	
	// User name filed
	
	By uName = By.xpath("//*[@id=\"login-username\"]/input");
	
	public void enterUsername(String user) throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(uName));
		
		driver.findElement(uName).click();
		driver.findElement(uName).sendKeys(user);
		Thread.sleep(2000);

	}
	
	// Password field
	By uPassword = By.xpath("//*[@id=\"login-password\"]/input");
	
	public void enterPassword(String password) throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(uPassword));
		
		driver.findElement(uPassword).click();
		driver.findElement(uPassword).sendKeys(password);
		Thread.sleep(2000);
		
	}
	
	// Hotel Code field
	
	By uHotelCode = By.xpath("//*[@id=\"login-hotelcode\"]/input");
	
	public void enterHotelCode(String HotelCode) throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));	
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(uHotelCode));
		
		driver.findElement(uHotelCode).click();
		driver.findElement(uHotelCode).sendKeys(HotelCode);
		Thread.sleep(2000);
	}
	
	// Login button
	
	By uLogin = By.xpath("//*[@id=\"login-btn\"]");
	
	public void LoginButton() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(uLogin));
		
		driver.findElement(uLogin).click();
		Thread.sleep(2000);
	}
	
	// Click on Outlet
	By clickonOutlet = By.xpath("/html/body/ion-app/ng-component/ion-nav/page-terminal-outlet/ion-content/div[2]/div/form/ion-list/ion-item[1]");
	
	public void clickonOutlet() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickonOutlet));
		
		driver.findElement(clickonOutlet).click();
		Thread.sleep(2000);
	
	}
	
	//Select Outlet
	By selectOutlet = By.xpath("/html/body/ion-app/ion-modal/div/eo-selectable/form/ion-content/div[2]/ion-list/div[2]/ion-item[4]");
	
	public void selectOutlet() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(selectOutlet));
		
		driver.findElement(selectOutlet).click();
		Thread.sleep(2000);
		
	}
	
	// Get me In button
	By getmeinbutton = By.xpath("(//button[@id='login-btn']/span)[2]");
	
	public void ugetmeinbutton() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(getmeinbutton));
		
		driver.findElement(getmeinbutton).click();
		Thread.sleep(2000);
		
	}
	
	// Click on 1
	By clickonOne = By.xpath("//span[normalize-space()='1']");
	
	public void uclickonOne() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickonOne));
		
		driver.findElement(clickonOne).click();
		Thread.sleep(2000);
		
	}
	
	// Click on 2
	By clickonTwo = By.xpath("//span[normalize-space()='2']");
	
	public void uclickonTwo() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickonTwo));
		
		driver.findElement(clickonTwo).click();
		Thread.sleep(2000);
		
	}
	
	// Click on 4
	By clickonFour = By.xpath("//span[normalize-space()='4']");
	
	public void uclickonFour() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickonFour));
		
		driver.findElement(clickonFour).click();
		Thread.sleep(2000);
		
	}
	
	// Click on 5
	By clickonFive = By.xpath("//span[normalize-space()='5']");
	
	public void uclickonFive() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickonFive));
		
		driver.findElement(clickonFive).click();
		Thread.sleep(2000);
	}
	
	// Click on Lock icon in login form
	By	clickonLock = By.xpath("/html/body/ion-app/ng-component/ion-nav/page-login/ion-content/div[2]/div/div[1]/button[1]");
	
	public void uclickonLock() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickonLock));
		
		driver.findElement(clickonLock).click();
		Thread.sleep(2000);
	}
	
	// Click on OK button in Error message when user enter wrong credential
	By clickonOKButtoninErrormessage = By.xpath("/html/body/ion-app/ion-modal/div/alert-modal/ion-card/ion-footer/ion-buttons");
	
	public void uclickonOKButtoninErrormessage() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickonOKButtoninErrormessage));
		
		driver.findElement(clickonOKButtoninErrormessage).click();
		Thread.sleep(2000);
	}
	
	// Click on Get me In button after PIN login
	By clickGetmeIn = By.xpath("//button[@id=\"login-btn\"]");
	
	public void uclickGetmeIn() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickGetmeIn));
		
		driver.findElement(clickGetmeIn).click();
		Thread.sleep(2000);
	}
	
	// Click on OK button in Error Popup
	By OKButtononErrorPopup = By.xpath("//span[contains(text(),'OK')]");
	
	public void uOKButtononErrorPopup() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(OKButtononErrorPopup));
		
		driver.findElement(OKButtononErrorPopup).click();
		Thread.sleep(2000);
	}
	
// ===============================================================> Dine In Xpath <==========================================================================	
	
	// Click on User
	By clickonUser = By.xpath("(//*[@class=\"bar-buttons bar-buttons-md\"])[3]"); 
	
	public void clickonUser() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickonUser));
		
		driver.findElement(clickonUser).click();
		Thread.sleep(2000);
		
	}
	
	// Click on Logout
	By clickonLogout = By.xpath("(//*[@class=\"item item-block item-md\"])[3]"); 
	
	public void clickonLogout() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickonLogout));
		
		driver.findElement(clickonLogout).click();
		Thread.sleep(2000);
		
	}
	
	// Click on Logout Button
	By clickonLogoutButton = By.xpath("//span[normalize-space()='Log Out']"); 

	public void clickonLogoutButton() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickonLogoutButton));
		
		driver.findElement(clickonLogoutButton).click();
		Thread.sleep(2000);
	}
	
	// ======= Take order with Single Item
	
	// Click on Plus icon
	By clickonPlus = By.xpath("//ion-col[@class='dine-tables col']//ion-col[1]//div[1]//ion-buttons[1]//button[1]//span[1]");
	
	public void uclickonPlus() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickonPlus));
		
		driver.findElement(clickonPlus).click();
		Thread.sleep(2000);
	}
	
	// Add Order
	By AddOrder = By.xpath("/html/body/ion-app/ng-component/ion-nav/page-dinein/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-row/ion-col[1]/div/button");
	
	public void uAddOrder() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(AddOrder));
		
		driver.findElement(AddOrder).click();
		Thread.sleep(2000);
	}
	
	// Click on Save button
	By clickonSaveButton = By.xpath("//span[contains(text(),'Save')]");
	
	public void uclickonSaveButton() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickonSaveButton));
		
		driver.findElement(clickonSaveButton).click();
		Thread.sleep(2000);
	}
	
	// Click on Item
	By clickonItem = By.xpath("//button[@title='Double Falooda Single Glass']//img");
	
	public void uclickonItem() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickonItem));
		
		driver.findElement(clickonItem).click();
		Thread.sleep(2000);
	}
	
	// Click on Course
	By selectCourse = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted\"])[1]");
	
	public void uselectCourse() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(selectCourse));
		
		driver.findElement(selectCourse).click();
		Thread.sleep(2000);
	}
	
	// Click on Finish Button
	By clickonFinishButton = By.xpath("//span[normalize-space()='Finish']");
	
	public void uclickonFinishButton() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickonFinishButton));
		
		driver.findElement(clickonFinishButton).click();
		Thread.sleep(2000);
	}
	
	// Click on Save button on Order
	By clickOnSaveButtoninOrder = By.xpath("//p[contains(text(),'Save')]");
	
	public void uclickOnSaveButtoninOrder() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnSaveButtoninOrder));
		
		driver.findElement(clickOnSaveButtoninOrder).click();	
		Thread.sleep(2000);
	}
	
	// Add Third Item
	By addThirdItem = By.xpath("/html/body/ion-app/ng-component/ion-nav/page-orderscreen/ion-content/div[2]/ion-grid/ion-row[1]/ion-col[1]/order-area/item-image/ion-card/ion-card-content/ion-grid/ion-row/ion-col[6]");
	
	public void uaddThirdItem() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(addThirdItem));
		
		driver.findElement(addThirdItem).click();
		Thread.sleep(2000);
	}
	
	// ======== Recall Order 
	
	// Click on Table section
	By  clickonTable = By.xpath("(//*[@class=\"button button-md button-default button-default-md button-md-light running\"])[1]");
	
	public void uclickonTable() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickonTable));
		
		driver.findElement(clickonTable).click();
		Thread.sleep(2000);
	}
	
	// Click on Recall button
	By clickOnRecall = By.xpath("//*[@id=\"tableRoomAction\"]/div/ion-content/div[2]/table-action/ion-card/ion-card-content/div[1]/order-detail-header/ion-card-header/button[3]");
	
	public void uclickOnRecall() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnRecall));
		
		driver.findElement(clickOnRecall).click();
		Thread.sleep(2000);
	}
	
	// Click on Increase QTY of Item
	By clickOnQTYPlus = By.xpath("//*[@class=\"iconBtn qty-btn button button-md button-default button-default-md ng-star-inserted\"]");

	public void uclickOnQTYPlus() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnQTYPlus));
		
		driver.findElement(clickOnQTYPlus).click();
		Thread.sleep(2000);
	}
	

	// Click on - decreased icon 
	By clickOnDecereasedQTY = By.xpath("(//*[@class=\"iconBtn qty-btn button button-md button-default button-default-md ng-star-inserted\"])[1]");

	public void uclickOnDecereasedQTY() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnDecereasedQTY));

		driver.findElement(clickOnDecereasedQTY).click();
		Thread.sleep(2000);
	}
	
	// Click on Increase QTY of Item
	By clickOnPlusinItem = By.xpath("(//*[@name=\"custom-add\"])[1]");

	public void uclickOnPlusinItem() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnPlusinItem));
		
		driver.findElement(clickOnPlusinItem).click();
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

	// ======== Test case for add multiple items on order through recall
		
		
		// Add first Item
		By addFirstItem = By.xpath("//*[@title=\"Double Special Falooda\"]");
		
		public void uaddFirstItem() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(addFirstItem));
			
			driver.findElement(addFirstItem).click();
			Thread.sleep(2000);
		}
		
		// Add Second Item
		By addSecondItem = By.xpath("//*[@title=\"Special Falooda\"]");
		
		public void uaddSecondItem() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(addSecondItem));
			
			driver.findElement(addSecondItem).click();
			Thread.sleep(2000);
		}
		
	// ========== Test case for add multiple items on order through recall
		
		// Add Item
		By addItem = By.xpath("(//*[@class=\"food-item-block col col-5-layout ng-star-inserted\"])[3]");
		
		public void uaddItem() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(addItem));
			
			driver.findElement(addItem).click();
			Thread.sleep(2000);
		}
		
		// Add Modifier Item
		By addModifierItem = By.xpath("(//*[@class=\"food-item-block col ng-star-inserted\"])[3]");
		
		public void uaddModifierItem() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(addModifierItem));
			
			driver.findElement(addModifierItem).click();
			Thread.sleep(2000);
		}
		
		// Click on Save Button On Modifier
		By SaveButtonOnModifier = By.xpath("//span[contains(text(),'Save')]");
		
		public void uSaveButtonOnModifier() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(SaveButtonOnModifier));
			
			driver.findElement(SaveButtonOnModifier).click();
			Thread.sleep(2000);
		}
		
	// ========= Increase the QTY of multiple Items and save it 
		
		// Increase the QTY of first item
		By FirstItemIncrease = By.xpath("(//*[@class=\"iconBtn qty-btn button button-md button-default button-default-md ng-star-inserted\"])[1]");
		
		public void uFirstItemIncrease() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(FirstItemIncrease));
			
			driver.findElement(FirstItemIncrease).click();
			Thread.sleep(2000);
		}
		
		// Increase the QTY of Second item
		By SecondItemIncrease = By.xpath("(//*[@class=\"iconBtn qty-btn button button-md button-default button-default-md ng-star-inserted\"])[3]");
		
		public void uSecondItemIncrease() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(SecondItemIncrease));
			
			driver.findElement(SecondItemIncrease).click();
			Thread.sleep(2000);
		}
		
		// Increase the QTY of Third item
		By ThirdItemIncrease = By.xpath("(//*[@class=\"iconBtn qty-btn button button-md button-default button-default-md ng-star-inserted\"])[5]");
	
		public void uThirdItemIncrease() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(ThirdItemIncrease));
			
			driver.findElement(ThirdItemIncrease).click();
			Thread.sleep(2000);
		}
		
	// ======== Test case for void Single item on order through recall
		
		// Click on Remove button on Item
		By clickOnVoidItem = By.xpath("(//*[@class=\"deleteItem button button-md button-default button-default-md ng-star-inserted\"])[1]");
		
		public void uclickOnVoidItem() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnVoidItem));
			
			driver.findElement(clickOnVoidItem).click();
			Thread.sleep(2000);
		}
		
		
	// ======= Test case for void modifier item in Item 
		
		// Click on Modifier Item in order
		By AddModifierItem = By.xpath("//*[@title=\"Royal Malai Falooda+Seperate Kulfi\"]");
		
		public void uAddModifierItem() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(AddModifierItem));
			
			driver.findElement(AddModifierItem).click();
			Thread.sleep(2000);
		}
		
		// Click on Modifier Item in order
		By clickOnModifierItem = By.xpath("(//*[@class=\"item-name txt-ellipsis\"])[1]");
		
		public void uclickOnModifierItem() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnModifierItem));
			
			driver.findElement(clickOnModifierItem).click();
			Thread.sleep(2000);
		}
		
		// Click on Modifier Section in item
		By clickOnModifier = By.xpath("//p[contains(text(),'Modifiers')]");
		
		public void uclickOnModifier() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnModifier));
			
			driver.findElement(clickOnModifier).click();
			Thread.sleep(2000);
		}
		
		// Click on remove icon on Modifier item
		By clickOnRemoveOnModifier = By.xpath("(//*[@class=\"secondary-btn no-border item-button button button-md button-default button-default-md\"])[1]");
		
		public void uclickOnRemoveOnModifier() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnRemoveOnModifier));
			
			driver.findElement(clickOnRemoveOnModifier).click();
			Thread.sleep(2000);
		}

		// Click on Cancel icon in item popup
		By clickOnCancelinItemPopup = By.xpath("/html/body/ion-app/ion-modal/div/ordered-item-information/ion-header/ion-toolbar/div[2]/div[3]/ion-buttons");

		public void uclickOnCancelinItemPopup() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnCancelinItemPopup));
			
			driver.findElement(clickOnCancelinItemPopup).click();
			Thread.sleep(2000);
		}
		

		// Click on OK button in validation popup
		By clickonOKButton = By.xpath("/html/body/ion-app/ion-modal/div/alert-modal/ion-card/ion-footer/ion-buttons");
		
		public void uclickonOKButton() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickonOKButton));
			
			driver.findElement(clickonOKButton).click();
			Thread.sleep(2000);
		}
		
		// Click on Void/Remove button on order
		By clickonVoidButton = By.xpath("//ion-icon[@name='custom-delete']");
		
		public void uclickonVoidButton() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickonVoidButton));
			
			driver.findElement(clickonVoidButton).click();
			Thread.sleep(2000);
		}
		
		// Click on First item for void
		By clickonFirstItem = By.xpath("(//*[@class=\"deleteItem button button-md button-default button-default-md ng-star-inserted\"])[1]");
		
		public void uclickonFirstItem() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickonFirstItem));
			
			driver.findElement(clickonFirstItem).click();
			Thread.sleep(2000);
		}
		
	// ======== Void Multiple Orders
		
		// Click on Plus icon in order section
		By clickonPlusIcon = By.xpath("(//*[@class=\"button secondary-btn vertical-btn button-md button-default button-default-md ng-star-inserted\"])[1]");
		
		public void uclickonPlusIcon() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickonPlusIcon));
			
			driver.findElement(clickonPlusIcon).click();
			Thread.sleep(2000);
		}
		
		// Click on Select All order checkbox
		By clickOnSelectAll = By.xpath("//*[@id=\"tableRoomAction\"]/div/ion-content/div[2]/table-action/ion-row/ion-col[1]/ion-checkbox");
		
		public void uclickOnSelectAll() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnSelectAll));
			
			driver.findElement(clickOnSelectAll).click();
			Thread.sleep(2000);
		}
		
		// Click on Void button
		By clickonDeleteButton = By.xpath("//ion-icon[@name='custom-delete']"); 
		
		public void uclickonDeleteButton() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickonDeleteButton));
			
			driver.findElement(clickonDeleteButton).click();
			Thread.sleep(2000);
		}
		
	//======= Settle Order 
		
		// Click on Quick Pay button
		By clickOnPayButton = By.xpath("//*[contains(text(),'Quick Pay')]");
		
		public void uclickOnPayButton() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnPayButton));
			
			driver.findElement(clickOnPayButton).click();
			Thread.sleep(2000);
		}
		
		// Click on Settle button
		By clickonSettleButton = By.xpath("//p[contains(text(),'Settle')]");
		
		public void uclickonSettleButton() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickonSettleButton));
			
			driver.findElement(clickonSettleButton).click();
			Thread.sleep(2000);
		}
		
		// Click on Pay button
		By clickonPayButton = By.xpath("//*[@class=\"primary-btn button button-md button-default button-default-md ng-star-inserted\"]");
		
		public void uclickonPayButton() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickonPayButton));
			
			driver.findElement(clickonPayButton).click();
			Thread.sleep(2000);
		}
		
		// Click on OK button in Changes Duo popup
		By clickOnOKButtoninChangesDuopopup = By.xpath("//*[@class=\"primary-btn button button-md button-default button-default-md ng-star-inserted\"]");
		
		public void uclickOnOKButtoninChangesDuopopup() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnOKButtoninChangesDuopopup));
			
			driver.findElement(clickOnOKButtoninChangesDuopopup).click();
			Thread.sleep(2000);
		}
		
		// Click on Bank option in settle
		By clickOnBank = By.xpath("//p[contains(text(),'Bank')]");
		
		public void uclickOnBank() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnBank));
			
			driver.findElement(clickOnBank).click();
			Thread.sleep(2000);
		}
		
		// Select bank pay option
		By selectBankPayoption = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted virtual-position\"])[5]");
		
		public void uselectBankPayoption() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(selectBankPayoption));
			
			driver.findElement(selectBankPayoption).click();
			Thread.sleep(2000);
		}
		
		// Click on Cash option in settle
		By clickOnCash = By.xpath("//p[contains(text(),'Cash')]");
		
		public void uclickOnCash() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnCash));
			
			driver.findElement(clickOnCash).click();
			Thread.sleep(2000);
		}
		
		// Select Cash pay option
		By selectCashPayoption = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted virtual-position\"])[1]");
		
		public void uselectCashPayoption() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(selectCashPayoption));
			
			driver.findElement(selectCashPayoption).click();
			Thread.sleep(2000);
		}
		
		// Click on Apply Button
		By clickOnApplyButton = By.xpath("//span[contains(text(),'Apply')]");
		
		public void uclickOnApplyButton() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnApplyButton));
			
			driver.findElement(clickOnApplyButton).click();
			Thread.sleep(2000);
		}
		
		// Select Bank pay option with Surcharge
		By selectBankPayoptionwithSurcharge = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted virtual-position\"])[3]");
		
		public void uselectBankPayoptionwithSurcharge() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(selectBankPayoptionwithSurcharge));
			
			driver.findElement(selectBankPayoptionwithSurcharge).click();
			Thread.sleep(2000);
		}
		
		// Click on Apply Button
		By clickCreditSection = By.xpath("//p[contains(text(),'Credit')]");
		
		public void uclickCreditSection() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickCreditSection));
			
			driver.findElement(clickCreditSection).click();
			Thread.sleep(2000);
		}
		
		// Select Bank pay option with Surcharge
		By selectCreditoption = By.xpath("/html/body/ion-app/ion-modal[2]/div/eo-selectable/form/ion-content/div[2]/ion-list/div[2]/ion-item[7]");
		
		public void uselectCreditoption() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(selectBankPayoptionwithSurcharge));
			
			driver.findElement(selectBankPayoptionwithSurcharge).click();
			Thread.sleep(2000);
		}
		
		// Select Bank pay option with Surcharge
		By CreditConfrimOption = By.xpath("(//*[@class=\"primary-button button button-md button-outline button-outline-md button-outline-md-primary\"])[1]");
		
		public void uCreditConfrimOption() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(CreditConfrimOption));
			
			driver.findElement(CreditConfrimOption).click();
			Thread.sleep(2000);
		}
		
		// Click on Save button in Order information popup
		By clickSaveButton = By.xpath("//span[contains(text(),'Save')]");
		
		public void uclickSaveButton() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickSaveButton));
			
			driver.findElement(clickSaveButton).click();
			Thread.sleep(2000);
		}
		
		// Click on "1" in Payment Process
		By clickOn1 = By.xpath("(//*[@class=\"secondary-btn button button-md button-default button-default-md\"])[8]");
		
		public void uclickOn1() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOn1));
			
			driver.findElement(clickOn1).click();
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
		
		// Click on Pay in Payment Process
		By clickOnPayinSettle = By.xpath("//*[@class=\"primary-btn button button-md button-default button-default-md ng-star-inserted\"]");
		
		public void uclickOnPayinSettle() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnPayinSettle));
			
			driver.findElement(clickOnPayinSettle).click();
			Thread.sleep(2000);
		}
		
		
		// Click on "Save" button in Payment Process
		By clickOnSaveinSettle = By.xpath("//*[@class=\"primary-btn save-btn button button-md button-default button-default-md ng-star-inserted\"]");
		
		public void uclickOnSaveinSettle() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnSaveinSettle));
			
			driver.findElement(clickOnSaveinSettle).click();
			Thread.sleep(2000);
		}
		
		// Click on Currecny in Payment Process
		By clickOnCurrecny = By.xpath("//*[@id=\"selectedCurr\"]");
		
		public void uclickOnCurrecny() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnCurrecny));
			
			driver.findElement(clickOnCurrecny).click();
			Thread.sleep(2000);
		}
		
		// Click on Currecny in Payment Process
		By clickOnCurrecnyOption = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted virtual-position\"])[1]");
		
		public void uclickOnCurrecnyOption() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnCurrecnyOption));	
			
			driver.findElement(clickOnCurrecnyOption).click();
			Thread.sleep(2000);
		}
		
	// ===========> Insufficient Credit popup <=====================
		
		// Select Credit account which has not sufficient balance
		By selectCreditAccount = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted virtual-position\"])[5]");
		
		public void uselectCreditAccount() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(selectCreditAccount));
			
			driver.findElement(selectCreditAccount).click();
			Thread.sleep(2000);
		}
		
		// Click on Continue Button
		By clickOnContinue = By.xpath("//span[contains(text(),'Continue')]");
		
		public void uclickOnContinue() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnContinue));
			
			driver.findElement(clickOnContinue).click();
			Thread.sleep(2000);
		}
		
		// Click on No Button
		By clickOnNoButton = By.xpath("//span[contains(text(),'NO')])[2]");
		
		public void uclickOnNoButton() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnNoButton));
			
			driver.findElement(clickOnNoButton).click();
			Thread.sleep(2000);
		}
		
	// ======= Payment Summary  
		
		// Click on Payment Process
		By clickOnPaymentProcess = By.xpath("//span[contains(text(),'Payment Summary')]");
		
		public void uclickOnPaymentProcess() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnPaymentProcess));
			
			driver.findElement(clickOnPaymentProcess).click();
			Thread.sleep(2000);
		}
		
		// Click on Void Button
		By clickOnVoidButton = By.xpath("(//*[@class=\"button button-md button-clear button-clear-md\"])[1]");
		
		public void uclickOnVoidButton() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnVoidButton));
			
			driver.findElement(clickOnVoidButton).click();
			Thread.sleep(2000);
		}
		
		// Click on Save Button
		By clickOnSaveButtoninPaymentProcess = By.xpath("//span[contains(text(),'Save')]");
		
		public void uclickOnSaveButtoninPaymentProcess() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnSaveButtoninPaymentProcess));
			
			driver.findElement(clickOnSaveButtoninPaymentProcess).click();
			Thread.sleep(2000);
		}
		
	// ================> Item QTY & Quantity popup <==============================
		
		// Click on QTY section on item
		By clickonQTY = By.xpath("(//span[contains(text(),'1')])[3]");
		
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
		
	// ================> Confirm popup on Credit Settle  <=========================
		
		// Click on Update Guest information with posted
		By UpdateGuestInformation = By.xpath("(//*[@class=\"primary-button button button-md button-outline button-outline-md button-outline-md-primary\"])[1]");
		
		public void uUpdateGuestInformation() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(UpdateGuestInformation));
			
			driver.findElement(UpdateGuestInformation).click();
			Thread.sleep(2000);
		}
		
		// Click on Proceed with Posting
		By clickOnProceedwithPosting = By.xpath("(//*[@class=\"primary-button button button-md button-outline button-outline-md button-outline-md-primary\"])[2]");
		
		public void uclickOnProceedwithPosting() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnProceedwithPosting));
			
			driver.findElement(clickOnProceedwithPosting).click();
			Thread.sleep(2000);
		}
		
		// Click on Cancel button
		By clickonCancelButton = By.xpath("//*[@class=\"secondary-act-btn button button-md button-default button-default-md ng-star-inserted\"]");
		
		public void uclickonCancelButton() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickonCancelButton));
			
			driver.findElement(clickonCancelButton).click();
			Thread.sleep(2000);
		}
		
	// ===================> Room Posting <==========================
		
		// Click on Posting Pay in settle
		By clickonPosting = By.xpath("(//*[@class=\"secondary-btn button button-md button-default button-default-md button-md-light ng-star-inserted\"])[3]");
		
		public void uclickonPosting() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickonPosting));
			
			driver.findElement(clickonPosting).click();
			Thread.sleep(2000);
		}
		
		// Select Posting Pay method
		By selectPostingPay = By.xpath("(//*[@class=\"button button-md button-default button-default-md button-md-light\"])[1]");
		
		public void uselectPostingPay() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(selectPostingPay));
			
			driver.findElement(selectPostingPay).click();
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
		
	// ====================> Extra Charge  <===================================
		
		// Click on Extra Charge popup
		By clickOnExtraCharge = By.xpath("//p[contains(text(),'Extra Charge')]");
		
		public void uclickOnExtraCharge() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnExtraCharge));
			
			driver.findElement(clickOnExtraCharge).click();
			Thread.sleep(2000);
		}
		
		// Select Extra Charge in extra charge popup 
		By selectExtraCharge = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted virtual-position\"])[1]");
		
		public void uselectExtraCharge() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(selectExtraCharge));
			
			driver.findElement(selectExtraCharge).click();
			Thread.sleep(2000);
		}
		
		
		// Click on Extra Charge icon in order amount summary
		By clickOnExtraChargeicon = By.xpath("/html/body/ion-app/ng-component/ion-nav/page-orderscreen/ion-content/div[2]/ion-grid/ion-row/ion-col[2]/order-detail/ion-card/ion-card-content/order-detail-footer/div[1]/div[6]/p[1]/ion-icon");
		
		public void uclickOnExtraChargeicon() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnExtraChargeicon));
			
			driver.findElement(clickOnExtraChargeicon).click();
			Thread.sleep(2000);
		}
		
		// Click on Void button in Extra charge popup
		By clickOnVoidButtoninExtraChargeicon = By.xpath("(//*[@class=\"item-button button button-md button-clear button-clear-md\"])[1]");
		
		public void uclickOnVoidButtoninExtraChargeicon() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnVoidButtoninExtraChargeicon));
			
			driver.findElement(clickOnVoidButtoninExtraChargeicon).click();
			Thread.sleep(2000);
		}
		
		// Click on Void button in Extra charge popup
		By clickOnVoidButtonin2ExtraChargeicon = By.xpath("(//*[@class=\"item-button button button-md button-clear button-clear-md\"])[2]");
		
		public void uclickOnVoidButtonin2ExtraChargeicon() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnVoidButtonin2ExtraChargeicon));
			
			driver.findElement(clickOnVoidButtonin2ExtraChargeicon).click();
			Thread.sleep(2000);
		}
		
		// Click on Delete button in Extra charge popup
		By clickOnDeleteButtoninExtraChargeicon = By.xpath("//span[contains(text(),'Delete')]");
		
		public void uclickOnDeleteButtoninExtraChargeicon() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnDeleteButtoninExtraChargeicon));
			
			driver.findElement(clickOnDeleteButtoninExtraChargeicon).click();
			Thread.sleep(2000);
		}
		
		// Click on Delete button in Extra charge popup
		By selectReasonInExtraCharge = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted virtual-position\"])[1]");
		
		public void uselectReasonInExtraCharge() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(selectReasonInExtraCharge));
			
			driver.findElement(selectReasonInExtraCharge).click();
			Thread.sleep(2000);
		}
		
		// Click on Delete button in Extra charge popup
		By clickOnCancelInExtrachargepopup = By.xpath("(//*[@class=\"bar-button bar-button-md bar-button-default bar-button-default-md\"])[5]");
		
		public void uclickOnCancelInExtrachargepopup() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnCancelInExtrachargepopup));
			
			driver.findElement(clickOnCancelInExtrachargepopup).click();
			Thread.sleep(2000);
		}
		
		// Click on OK button in Warning popup
		By clickOnOKButtoninWarningPopup = By.xpath("//span[contains(text(),'OK')]");
		
		public void uclickOnOKButtoninWarningPopup() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnOKButtoninWarningPopup));
			
			driver.findElement(clickOnOKButtoninWarningPopup).click();
			Thread.sleep(2000);
		}
		
	// ======== Discounts  
		
		// Click on Discount button in order
		By clickOnDiscountButton = By.xpath("//p[contains(text(),'Discount')]");
		
		public void uclickOnDiscountButton() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnDiscountButton));
			
			driver.findElement(clickOnDiscountButton).click();
			Thread.sleep(2000);
		}
		
		// Select Discount in order popup
		By selectDiscountonBaseAmount = By.xpath("//*[@aria-posinset=\"5\"]");  // //*[@aria-posinset=\"5\"]
		
		public void uselectDiscountonBaseAmount() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(selectDiscountonBaseAmount));
			
			driver.findElement(selectDiscountonBaseAmount).click();
			Thread.sleep(2000);
		}
		
		// Select Discount in order popup
		By selectDiscountonFinalAmount = By.xpath("//*[@aria-posinset=\"7\"]");  //  //*[@aria-posinset=\"7\"]
		
		public void uselectDiscountonFinalAmount() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(selectDiscountonFinalAmount));
			
			driver.findElement(selectDiscountonFinalAmount).click();
			Thread.sleep(2000);
		}
		
		// Click on Discount button in item
		By clickOnDiscountButtoninItem = By.xpath("(//p[contains(text(),'Discount')])[5]");
		
		public void uclickOnDiscountButtoninItem() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnDiscountButtoninItem));
			
			driver.findElement(clickOnDiscountButtoninItem).click();
			Thread.sleep(2000);
		}
		
		// Select Item Discount
		By selectItemDiscount = By.xpath("//*[@aria-posinset=\"11\"]");
		
		public void uselectItemDiscount() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(selectItemDiscount));
			
			driver.findElement(selectItemDiscount).click();
			Thread.sleep(2000);
		}
		
		// Cancel icon on item popup
		By cancelonItem = By.xpath("//*[@class=\"bar-button bar-button-md bar-button-default bar-button-default-md bar-button-md-light\"]");
		
		public void ucancelonItem() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(cancelonItem));
			
			driver.findElement(cancelonItem).click();
			Thread.sleep(2000);
		}
		
		// Add new item in order
		By Item = By.xpath("(//*[@class=\"item-name txt-ellipsis\"])[1]");
		
		public void uItem() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(Item));
			
			driver.findElement(Item).click();
			Thread.sleep(2000);
		}
		
		// Select Second Item Discount
		By select2ItemDiscount = By.xpath("//*[@aria-posinset=\"18\"]");
		
		public void uselect2ItemDiscount() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(select2ItemDiscount));
			
			driver.findElement(select2ItemDiscount).click();
			Thread.sleep(2000);
		}
		
		// Click on Order icon in amount summary
		By clickOnOrderIcon = By.xpath("//p[contains(text(),'Order Discount')]");
		
		public void uclickOnOrderIcon() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnOrderIcon));
			
			driver.findElement(clickOnOrderIcon).click();
			Thread.sleep(2000);
		}
		
		// Click on void icon in Order discount 
		By clickOnVoidOrder = By.xpath("(//*[@class=\"button button-md button-clear button-clear-md\"])[2]");
		
		public void uclickOnVoidOrder() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnVoidOrder));
			
			driver.findElement(clickOnVoidOrder).click();
			Thread.sleep(2000);
		}
		
		// Click on void button in Order discount 
		By clickOnVoidOrderbutton = By.xpath("//span[contains(text(),'Void')]");
		
		public void uclickOnVoidOrderbutton() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnVoidOrderbutton));
			
			driver.findElement(clickOnVoidOrderbutton).click();
			Thread.sleep(2000);
		}
		
		// Click on Cancel in Order Discount in popup
		By clickOnCancelinOrderpopup = By.xpath("(//*[@class=\"bar-button bar-button-md bar-button-default bar-button-default-md\"])[5]");
		
		public void uclickOnCancelinOrderpopup() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnCancelinOrderpopup));
			
			driver.findElement(clickOnCancelinOrderpopup).click();
			Thread.sleep(2000);
		}
		
		// Click on Void icon in Item popup
		By clickOnVoidinItempopup = By.xpath("(//i[contains(text(),'delete')])[3]");
		
		public void uclickOnVoidinItempopup() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnVoidinItempopup));
			
			driver.findElement(clickOnVoidinItempopup).click();
			Thread.sleep(2000);
		}
		
		// Click on Void button in Item popup
		By clickOnVoidButtoninItempopup = By.xpath("//span[contains(text(),'Void')]");
		
		public void uclickOnVoidButtoninItempopup() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnVoidButtoninItempopup));
			
			driver.findElement(clickOnVoidButtoninItempopup).click();
			Thread.sleep(2000);
		}
		
		// Click on Add open discount
		By AddOpenOrderDiscount = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted virtual-position\"])[6]");
		
		public void uAddOpenOrderDiscount() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(AddOpenOrderDiscount));
			
			driver.findElement(AddOpenOrderDiscount).click();
			Thread.sleep(2000);
		}
		
		// Click on 2 button in Open discount popup
		By Click2inOpenOrderDiscount = By.xpath("(//*[@class=\"secondary-btn button button-md button-default button-default-md\"])[10]");
		
		public void uClick2inOpenOrderDiscount() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(Click2inOpenOrderDiscount));
			
			driver.findElement(Click2inOpenOrderDiscount).click();
			Thread.sleep(2000);
		}
		
		// Click on 0 button in open discount popup
		By Click0inOpenOrderDiscount = By.xpath("(//*[@class=\"secondary-btn button button-md button-default button-default-md\"])[14]");
		
		public void uClick0inOpenOrderDiscount() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(Click0inOpenOrderDiscount));
			
			driver.findElement(Click0inOpenOrderDiscount).click();
			Thread.sleep(2000);
		}
		
		// Click on Add open item discount
		By AddOpenItemDiscount = By.xpath("//*[@aria-posinset=\"14\"]");
		
		public void uAddOpenItemDiscount() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(AddOpenItemDiscount));
			
			driver.findElement(AddOpenItemDiscount).click();
			Thread.sleep(2000);
		}
		
		// Click on 2 in item open discount
		By Click2inOpenItemDiscount = By.xpath("(//*[@class=\"secondary-btn button button-md button-default button-default-md\"])[10]");
		
		public void uClick2inOpenItemDiscount() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(Click2inOpenItemDiscount));
			
			driver.findElement(Click2inOpenItemDiscount).click();
			Thread.sleep(2000);
		}
		
		// Click on 0 in item discount
		By Click0inOpenItemDiscount = By.xpath("(//*[@class=\"secondary-btn button button-md button-default button-default-md\"])[14]");
		
		public void uClick0inOpenItemDiscount() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(Click0inOpenItemDiscount));
			
			driver.findElement(Click0inOpenItemDiscount).click();
			Thread.sleep(2000);
		}
		
		// Click on Enter in open order discount
		By ClickEnterinOpenOrderDiscount = By.xpath("(//*[@class=\"primary-btn button button-md button-default button-default-md\"])[1]");
		
		public void ClickEnterinOpenOrderDiscount() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(ClickEnterinOpenOrderDiscount));
			
			driver.findElement(ClickEnterinOpenOrderDiscount).click();
			Thread.sleep(2000);
		}
		
		// Apply 100 % Item discount
		By Apply100ItemDiscount = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted virtual-position\"])[8]");
		
		public void uApply100ItemDiscount() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(Apply100ItemDiscount));
			
			driver.findElement(Apply100ItemDiscount).click();
			Thread.sleep(2000);
		}
		
		// Click on "1" in Open Discount
		By Click1ItemDiscount = By.xpath("(//*[@class=\"secondary-btn button button-md button-default button-default-md\"])[9]");
		
		public void uClick1ItemDiscount() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(Click1ItemDiscount));
			
			driver.findElement(Click1ItemDiscount).click();
			Thread.sleep(2000);
		}
		
		// Click on "00" in Open Discount
		By Click00ItemDiscount = By.xpath("(//*[@class=\"secondary-btn button button-md button-default button-default-md\"])[15]");
		
		public void uClick00ItemDiscount() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(Click00ItemDiscount));
			
			driver.findElement(Click00ItemDiscount).click();
			Thread.sleep(2000);
		}
		
		// Apply 100 % Order discount
		By Apply100OrderDiscount = By.xpath("//*[@aria-posinset=\"3\"]");
		
		public void uApply100OrderDiscount() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(Apply100OrderDiscount));
			
			driver.findElement(Apply100OrderDiscount).click();
			Thread.sleep(2000);
		}
		
		// Click on "1" in Open Discount
		By Click1OrderDiscount = By.xpath("(//*[@class=\"secondary-btn button button-md button-default button-default-md\"])[9]");
		
		public void uClick1OrderDiscount() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(Click1OrderDiscount));
			
			driver.findElement(Click1OrderDiscount).click();
			Thread.sleep(2000);
		}
		
		// Click on "00" in Open Discount
		By Click00OrderDiscount = By.xpath("(//*[@class=\"secondary-btn button button-md button-default button-default-md\"])[15]");
		
		public void uClick00OrderDiscount() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(Click00OrderDiscount));
			
			driver.findElement(Click00OrderDiscount).click();
			Thread.sleep(2000);
		}
		
		// Click on "Yes" button in confirm popup after apply 100% item discount on item and save it
		By ClickYesButtoninConfirmPopup = By.xpath("(//*[@class=\"primary-btn button button-md button-default button-default-md ng-star-inserted\"])[1]");
		
		public void uClickYesButtoninConfirmPopup() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(ClickYesButtoninConfirmPopup));
			
			driver.findElement(ClickYesButtoninConfirmPopup).click();
			Thread.sleep(2000);
		}
		
		// Click on "Overwrite" button in Discount Summary popup 
		By ClickOverwriteButton = By.xpath("//span[contains(text(),'Overwrite')]");
		
		public void uClickOverwriteButton() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(ClickOverwriteButton));
			
			driver.findElement(ClickOverwriteButton).click();
			Thread.sleep(2000);
		}
		
		// Click on item which has modifier
		By ClickitemWithMOd = By.xpath("(//*[@class=\"item-name txt-ellipsis\"])[3]");
		
		public void uClickitemWithMOd() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(ClickitemWithMOd));
			
			driver.findElement(ClickitemWithMOd).click();
			Thread.sleep(2000);
		}
		
		// Add modifier item
		By AddModifierItems = By.xpath("(//*[@class=\"food-item-block col col-5-layout ng-star-inserted\"])[3]");
		
		public void uAddModifierItems() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(AddModifierItems));
			
			driver.findElement(AddModifierItems).click();
			Thread.sleep(2000);
		}
		
		// Click on modifier item for add discount
		By ClickonModifierItem = By.xpath("(//*[@class=\"item-name txt-ellipsis\"])[5]");
		
		public void uClickonModifierItem() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonModifierItem));
			
			driver.findElement(ClickonModifierItem).click();
			Thread.sleep(2000);
		}
		
		// Click on discount section in modifier item for add discount
		By ClickonDiscountSection = By.xpath("(//*[@class=\"button secondary-btn vertical-btn button-md button-default button-default-md button-md-light ng-star-inserted\"])[3]");
		
		public void uClickonDiscountSection() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonDiscountSection));
			
			driver.findElement(ClickonDiscountSection).click();
			Thread.sleep(2000);
		}

	//======= SPLIT THE ORDER 
		
		// Click on split section
		By ClickonSplitSection = By.xpath("//*[@id=\"tableRoomAction\"]/div/ion-content/div[2]/table-action/ion-footer/ion-buttons/button[5]");
		
		public void uClickonSplitSection() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonSplitSection));
			
			driver.findElement(ClickonSplitSection).click();
			Thread.sleep(2000);
		}
		
		// Click on split button
		By ClickonSplitButton = By.xpath("(//*[@class=\"primary-btn button button-md button-default button-default-md ng-star-inserted\"])[1]");
		
		public void uClickonSplitButton() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonSplitButton));
			
			driver.findElement(ClickonSplitButton).click();
			Thread.sleep(2000);
		}
		
		// Select Split type
		By ClickonSplitByEqually = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted virtual-position\"])[4]");
		
		public void uClickonSplitByEqually() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonSplitByEqually));
			
			driver.findElement(ClickonSplitByEqually).click();
			Thread.sleep(2000);
		}
		
		// Select Split by 2
		By ClickonSplitBy2 = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted virtual-position\"])[4]");
		
		public void uClickonSplitBy2() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonSplitBy2));
			
			driver.findElement(ClickonSplitBy2).click();
			Thread.sleep(2000);
		}
		
		// Select Split By Quantity
		By ClickonSplitByQuantity = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted virtual-position\"])[3]");
		
		public void uClickonSplitByQuantity() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonSplitByQuantity));
			
			driver.findElement(ClickonSplitByQuantity).click();
			Thread.sleep(2000);
		}
		
		// Select Item
		By selectIteminSplit = By.xpath("(//*[@class=\"checkbox checkbox-md checkbox-md-primary ng-untouched ng-pristine ng-valid\"])[4]");
		
		public void uselectIteminSplit() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(selectIteminSplit));
			
			driver.findElement(selectIteminSplit).click();
			Thread.sleep(2000);
		}
		
		// Click on QTY
		By clickOnQTY = By.xpath("(//*[@class=\"eo-input-field eo-select-field item item-block item-md ng-star-inserted\"])[1]");
		
		public void uclickOnQTY() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnQTY));
			
			driver.findElement(clickOnQTY).click();
			Thread.sleep(2000);
		}
		
		// Select QTY
		By selectQTY = By.xpath("(//*[@class=\"item item-block item-md ng-star-inserted\"])[1]");
		
		public void uselectQTY() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(selectQTY));
			
			driver.findElement(selectQTY).click();
			Thread.sleep(2000);
		}
		
		// Click on Move To Right
		By clickOnMoveToRightButton = By.xpath("(//*[@class=\"icon-action button button-md button-default button-default-md\"])[1]");
		
		public void uclickOnMoveToRightButton() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnMoveToRightButton));
			
			driver.findElement(clickOnMoveToRightButton).click();
			Thread.sleep(2000);
		}
		
		// Click on Save button
		By clickOnSaveButton = By.xpath("(//*[@class=\"primary-btn button button-md button-default button-default-md\"])");
		
		public void uclickOnSaveButton() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnSaveButton));
			
			driver.findElement(clickOnSaveButton).click();
			Thread.sleep(2000);
		}
		
	//========= MERGE ORDER  
		
		// Select Second Order
		By selectSecondOrder = By.xpath("(//*[@class=\"checkbox checkbox-md checkbox-md-primary ng-untouched ng-pristine ng-valid\"])[3]");
		
		public void uselectSecondOrder() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(selectSecondOrder));
			
			driver.findElement(selectSecondOrder).click();
			Thread.sleep(2000);
		}
		
		// Click on Merge Orders
		By clickonMergeOrder = By.xpath("(//*[@class=\"button secondary-btn vertical-btn button-md button-default button-default-md ng-star-inserted\"])[3]");
		
		public void uclickonMergeOrder() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickonMergeOrder));
			
			driver.findElement(clickonMergeOrder).click();
			Thread.sleep(2000);
		}
		
		// Click on Merge button
		By clickonMergeButton = By.xpath("(//*[@class=\"primary-btn button button-md button-default button-default-md ng-star-inserted\"])[1]");
		
		public void uclickonMergeButton() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickonMergeButton));
			
			driver.findElement(clickonMergeButton).click();
			Thread.sleep(2000);
		}
		
		// Click on Parent Orders
		By selectParentOrders = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted virtual-position\"])[2]");
		
		public void uselectParentOrders() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(selectParentOrders));
			
			driver.findElement(selectParentOrders).click();
			Thread.sleep(2000);
		}
		
		// Click on Merge & Settle Order
		By clickOnMergeAndSettleOrder = By.xpath("//*[@id=\"tableRoomAction\"]/div/ion-content/div[2]/table-action/ion-footer/ion-buttons/button[4]");
		
		public void uclickOnMergeAndSettleOrder() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnMergeAndSettleOrder));
			
			driver.findElement(clickOnMergeAndSettleOrder).click();
			Thread.sleep(2000);
		}
		
		// Click on "Icecream" Submenu
		By clickOnSubmenu = By.xpath("(//*[@class=\"chip secondary-btn button button-md button-default button-default-md ng-star-inserted\"])[1]");
		
		public void uclickOnSubmenu() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnSubmenu));
			
			driver.findElement(clickOnSubmenu).click();
			Thread.sleep(2000);
		}
		
		// Select Item in "Icecream" Submenu
		By selectItemOnSubmenu = By.xpath("(//*[@class=\"menu-item img-view button button-md button-default button-default-md button-md-light\"])[1]");
		
		public void uselectItemOnSubmenu() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(selectItemOnSubmenu));
			
			driver.findElement(selectItemOnSubmenu).click();
			Thread.sleep(2000);
		}
		
		// Select split by Category
		By ClickonSplitByCategory = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted virtual-position\"])[2]");
		
		public void uClickonSplitByCategory() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonSplitByCategory));
			
			driver.findElement(ClickonSplitByCategory).click();
			Thread.sleep(2000);
		}
		
		// Update QTY of item
		By UpdateQTYOfItem = By.xpath("(//*[@class=\"iconBtn qty-btn button button-md button-default button-default-md ng-star-inserted\"])[3]");
		
		public void uUpdateQTYOfItem() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(UpdateQTYOfItem));
			
			driver.findElement(UpdateQTYOfItem).click();
			Thread.sleep(2000);
		}
		
		// Update QTY of item
		By selectSecondIteminSplit = By.xpath("/html/body/ion-app/ng-component/ion-nav/split-by-quantity/ion-content/div[2]/ion-grid/ion-row/ion-grid[1]/ion-row/ion-col[3]/ion-card/ion-card-content/ion-list/ion-item[2]/div[1]/div/ion-label/table[2]/tbody[1]/tr/td[2]/ion-item/ion-checkbox");
		
		public void uselectSecondIteminSplit() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(selectSecondIteminSplit));
			
			driver.findElement(selectSecondIteminSplit).click();
			Thread.sleep(2000);
		}
		
		// Click on QTY
		By clickOn2QTY = By.xpath("//*[@class=\"eo-input-field eo-select-field item item-block item-md ng-star-inserted\"]");
		
		public void uclickOn2QTY() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOn2QTY));
			
			driver.findElement(clickOn2QTY).click();
			Thread.sleep(2000);
		}
		
		// Select QTY
		By uselect2QTY = By.xpath("(//*[@class=\"item item-block item-md ng-star-inserted\"])[1]");
		
		public void uselect2QTY() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(uselect2QTY));
			
			driver.findElement(uselect2QTY).click();
			Thread.sleep(2000);
		}
		
		// Click on Move To Left button
		By clickOnMoveToLeftButton = By.xpath("(//*[@class=\"icon-action button button-md button-default button-default-md\"])[2]");
		
		public void uclickOnMoveToLeftButton() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnMoveToLeftButton));
			
			driver.findElement(clickOnMoveToLeftButton).click();
			Thread.sleep(2000);
		}
		
		// Click on Merge & Print button
		By clickOnMergeAndPrintOrder = By.xpath("(//*[@class=\"button secondary-btn vertical-btn button-md button-default button-default-md ng-star-inserted\"])[5]");
		
		public void uclickOnMergeAndPrintOrder() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnMergeAndPrintOrder));
			
			driver.findElement(clickOnMergeAndPrintOrder).click();
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
		
		// Enter Seat number
		By enterSeatNumber = By.xpath("(//*[@class=\"secondary-btn button button-md button-default button-default-md\"])[10]");
		
		public void uenterSeatNumber() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(enterSeatNumber));
			
			driver.findElement(enterSeatNumber).click();
			Thread.sleep(2000);
		}
		
		// Select Split By Seat
		By SelectSplitBySeat = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted virtual-position\"])[1]");
		
		public void uSelectSplitBySeat() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(SelectSplitBySeat));
			
			driver.findElement(SelectSplitBySeat).click();
			Thread.sleep(2000);
		}
		
	// ======= Transfer Order 
		
		// Click on Transfer icon
		By clickTransferIcon = By.xpath("//*[@id=\"tableRoomAction\"]/div/ion-content/div[2]/table-action/ion-footer/ion-buttons/button[4]");
		
		public void uclickTransferIcon() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickTransferIcon));
			
			driver.findElement(clickTransferIcon).click();
			Thread.sleep(2000);
		}
		
		// Select Transfer order
		By selectTransferOrder = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted virtual-position\"])[2]");
		
		public void uselectTransferOrder() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(selectTransferOrder));
			
			driver.findElement(selectTransferOrder).click();
			Thread.sleep(2000);
		}
		
		// Select floor type
		By selectfloor = By.xpath("(//*[@class=\"item item-block item-md ng-star-inserted\"])[1]");
		
		public void uselectfloor() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(selectfloor));
			
			driver.findElement(selectfloor).click();
			Thread.sleep(2000);
		}
		
		// Select table
		By selectTableNumber = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted\"])[1]");
		
		public void uselectTableNumber() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(selectTableNumber));
			
			driver.findElement(selectTableNumber).click();
			Thread.sleep(2000);
		}
		
		// Select table
		By selectTable = By.xpath("/html/body/ion-app/ion-modal/div/eo-navigate-selectable/form/ion-content/div[2]/ion-list/button[2]");
		
		public void uselectTable() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(selectTable));
			
			driver.findElement(selectTable).click();
			Thread.sleep(2000);
		}
		
		// Select Transfer Quality
		By TransferOrderByQTY = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted virtual-position\"])[1]");
		
		public void uTransferOrderByQTY() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(TransferOrderByQTY));
			
			driver.findElement(TransferOrderByQTY).click();
			Thread.sleep(2000);
		}
		
		// Select Item
		By selectItem = By.xpath("(//*[@class=\"checkbox-field item item-block item-md item-checkbox\"])[6]");
		
		public void uselectItem() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(selectItem));
			
			driver.findElement(selectItem).click();
			Thread.sleep(2000);
		}
		
		// Click on Continue button
		By clickonContinuebutton = By.xpath("//p[contains(text(),'Continue')]");
		
		public void uclickonContinuebutton() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickonContinuebutton));
			
			driver.findElement(clickonContinuebutton).click();
			Thread.sleep(2000);
		}
		
		// Select New Order
		By selectNeworder = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted\"])[1]");
		
		public void uselectNeworder() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(selectNeworder));

			driver.findElement(selectNeworder).click();
			Thread.sleep(2000);
		}
		
		// Select Order
		By SelectOrder = By.xpath("(//*[@class=\"item item-block item-md ng-star-inserted\"])[2]");
		
		public void uSelectOrder() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(SelectOrder));
			
			driver.findElement(SelectOrder).click();
			Thread.sleep(2000);
		}
		
		// Click on OK button in Warning popup
		By clickOKButtoninWarningPopup = By.xpath("//*[@class=\"primary-btn button button-md button-default button-default-md ng-star-inserted\"]");
		
		public void uclickOKButtoninWarningPopup() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOKButtoninWarningPopup));
			
			driver.findElement(clickOKButtoninWarningPopup).click();
			Thread.sleep(2000);
		}
		
		// Select OLD order
		By SelectOLDorder = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted\"])[2]");
		
		public void uSelectOLDorder() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(SelectOLDorder));
			
			driver.findElement(SelectOLDorder).click();
			Thread.sleep(2000);
		}
		
		// Click On Item For Transfer QTY
		By ClickOnItemForTransferQTY = By.xpath("(//*[@class=\"checkbox-field item item-block item-md item-checkbox\"])[5]");
		
		public void uClickOnItemForTransferQTY() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(ClickOnItemForTransferQTY));
			
			driver.findElement(ClickOnItemForTransferQTY).click();
			Thread.sleep(2000);
		}
		
		// Select All Order and transfer into another table
		By clickOnTransferorders = By.xpath("//*[@id=\"tableRoomAction\"]/div/ion-content/div[2]/table-action/ion-footer/ion-buttons/button[2]");
		
		public void uclickOnTransferorders() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnTransferorders));
			
			driver.findElement(clickOnTransferorders).click();
			Thread.sleep(2000);
		}
		
		// Select table One
		By selectTableOne = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted\"])[1]");
		
		public void uselectTableOne() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(selectTableOne));
			
			driver.findElement(selectTableOne).click();
			Thread.sleep(2000);
		}
		
		// Select Other table
		By SelectOthertable = By.xpath("//*[@class=\"button button-md button-default button-default-md button-md-light running\"]");
		
		public void uSelectOthertable() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(SelectOthertable));
			
			driver.findElement(SelectOthertable).click();
			Thread.sleep(2000);
		}
		
		// Click on Merge Icon 
		By clickonMergeIcon = By.xpath("//*[@id=\"tableRoomAction\"]/div/ion-content/div[2]/table-action/ion-footer/ion-buttons/button[3]");
		
		public void uclickonMergeIcon() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickonMergeIcon));
			
			driver.findElement(clickonMergeIcon).click();
			Thread.sleep(2000);
		}
		
		// Click on Order Notification
		By clickOnOrderNotification = By.xpath("(//i[contains(text(),'arrow_forward')])[2]");
		
		public void uclickOnOrderNotification() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnOrderNotification));
			
			driver.findElement(clickOnOrderNotification).click();
			Thread.sleep(8000);
		}
		
//  ==================================================================================================================================================		
//	==================================================> Take Away XPath <=============================================================================
		
		
		// Click on menu
		By Clickonmenu = By.xpath("//*[@class=\"ico-with-text bar-buttons bar-buttons-md bar-button bar-button-md bar-button-default bar-button-default-md bar-button-menutoggle bar-button-menutoggle-md\"]");
		
		public void uClickonmenu() throws Exception {
			
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(Clickonmenu));
			
			driver.findElement(Clickonmenu).click();
			Thread.sleep(2000);
		}
		
		// Click on Take Away
		By ClickonTakeAway = By.xpath("//p[contains(text(),'Take Away')]");
		
		public void uClickonTakeAway() throws Exception {
			
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonTakeAway));
			
			driver.findElement(ClickonTakeAway).click();
			Thread.sleep(2000);
		}
		
		// Click on Order Summary
		By ClickonOrderSummary = By.xpath("//p[contains(text(),'Order Summary')]");
		
		public void uClickonOrderSummary() throws Exception {
			
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonOrderSummary));
			
			driver.findElement(ClickonOrderSummary).click();
			Thread.sleep(2000);
		}
		
		// Click on Item
		By TakeAwayclickonItem = By.xpath("//*[@title=\"Double Falooda Single Glass\"]");
		
		public void uTakeAwayclickonItem() throws Exception {
			
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickonItem));
			
			driver.findElement(TakeAwayclickonItem).click();
			Thread.sleep(2000);
		}
		
		// Click on Save button on Order
		By TakeAwayclickOnSave = By.xpath("//p[contains(text(),'Save')]");
		
		public void uTakeAwayclickOnSave() throws Exception {
			
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnSave));
			
			driver.findElement(TakeAwayclickOnSave).click();
			Thread.sleep(2000);
		}
		
		// Click on Cancel button on Order
		By TakeAwayclickOnCancel = By.xpath("//p[contains(text(),'Cancel')]");
		
		public void uTakeAwayclickOnCancel() throws Exception {
			
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnCancel));
			
			driver.findElement(TakeAwayclickOnCancel).click();
			Thread.sleep(2000);
		}
		
		By TakeAwayClickonmenuFromOrderSummary = By.xpath("//*[@class=\"ico-with-text bar-buttons bar-buttons-md bar-button bar-button-md bar-button-default bar-button-default-md bar-button-menutoggle bar-button-menutoggle-md ng-star-inserted\"]");
		
		public void uTakeAwayClickonmenuFromOrderSummary() throws Exception {
			
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayClickonmenuFromOrderSummary));
			
			driver.findElement(TakeAwayClickonmenuFromOrderSummary).click();
			Thread.sleep(3000);
		}
		
		// Select order
		By TakeAwayselectOrder = By.xpath("(//*[@class=\"item-cover item-cover-md item-cover-default item-cover-default-md\"])[1]");
		
		public void uTakeAwayselectOrder() throws Exception {
			
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayselectOrder));
			
			driver.findElement(TakeAwayselectOrder).click();
			Thread.sleep(2000);
		}
		
		// Click on Recall button
		By TakeAwayclickOnRecallButton = By.xpath("//p[contains(text(),'Recall')]");
		
		public void uTakeAwayclickOnRecallButton() throws Exception {
			
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnRecallButton));
			
			driver.findElement(TakeAwayclickOnRecallButton).click();
			Thread.sleep(8000);
		}
		
		// Click on Save button on Order
		By TakeAwayAddNewItem = By.xpath("(//*[@class=\"menu-item img-view button button-md button-default button-default-md button-md-light\"])[2]");
		
		public void uTakeAwayAddNewItem() throws Exception {
			
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayAddNewItem));
			
			driver.findElement(TakeAwayAddNewItem).click();
			Thread.sleep(2000);
		}
		
		// Increase the QTY of first item
		By TakeAwayFirstItemIncrease = By.xpath("/html/body/ion-app/ng-component/ion-nav/page-orderscreen/ion-content/div[2]/ion-grid/ion-row/ion-col[2]/order-detail/ion-card/ion-card-content/receipt-type-2/item-list/div[1]/div/div/div[1]/div/button[2]");
		
		public void uTakeAwayFirstItemIncrease() throws Exception {
			
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayFirstItemIncrease));
			
			driver.findElement(TakeAwayFirstItemIncrease).click();
			Thread.sleep(2000);
		}
		
		// Increase the QTY of Second item
		By TakeAwaySecondItemIncrease = By.xpath("/html/body/ion-app/ng-component/ion-nav/page-orderscreen/ion-content/div[2]/ion-grid/ion-row/ion-col[2]/order-detail/ion-card/ion-card-content/receipt-type-2/item-list/div[2]/div/div/div[1]/div/button[2]");
		
		public void uTakeAwaySecondItemIncrease() throws Exception {
			
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwaySecondItemIncrease));
			
			driver.findElement(TakeAwaySecondItemIncrease).click();
			Thread.sleep(2000);
		}
		
		// Click on - decreased icon 
		By TakeAwayclickOnDecereasedQTYonFirstItem = By.xpath("(//*[@class=\"iconBtn qty-btn button button-md button-default button-default-md ng-star-inserted\"])[1]");
		
		public void uTakeAwayclickOnDecereasedQTYonFirstItem() throws Exception {
			
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnDecereasedQTYonFirstItem));
			
			driver.findElement(TakeAwayclickOnDecereasedQTYonFirstItem).click();
			Thread.sleep(2000);
		}
		
		// Click on - decreased icon 
		By TakeAwayclickOnDecereasedQTYonSecondItme = By.xpath("(//*[@class=\"iconBtn qty-btn button button-md button-default button-default-md ng-star-inserted\"])[3]");
		
		public void uTakeAwayclickOnDecereasedQTYonSecondItme() throws Exception {
			
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnDecereasedQTYonSecondItme));
			
			driver.findElement(TakeAwayclickOnDecereasedQTYonSecondItme).click();
			Thread.sleep(2000);
		}
		
		// Increase the QTY of first item
		By TakeAwayFirstItemDecrease = By.xpath("/html/body/ion-app/ng-component/ion-nav/page-orderscreen/ion-content/div[2]/ion-grid/ion-row/ion-col[2]/order-detail/ion-card/ion-card-content/receipt-type-2/item-list/div[1]/div/div/div[1]/div/button[1]");
		
		public void uTakeAwayFirstItemDecrease() throws Exception {
			
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayFirstItemDecrease));
			
			driver.findElement(TakeAwayFirstItemDecrease).click();
			Thread.sleep(2000);
		}
		
		// Increase the QTY of Second item
		By TakeAwaySecondItemDecrease = By.xpath("/html/body/ion-app/ng-component/ion-nav/page-orderscreen/ion-content/div[2]/ion-grid/ion-row/ion-col[2]/order-detail/ion-card/ion-card-content/receipt-type-2/item-list/div[2]/div/div/div[1]/div/button[1]");
		
		public void uTakeAwaySecondItemDecrease() throws Exception {
			
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwaySecondItemDecrease));
			
			driver.findElement(TakeAwaySecondItemDecrease).click();
			Thread.sleep(2000);
		}
		
		// Click on - decreased icon 
		By TakeAwayclickOnDecereasedQTY = By.xpath("(//*[@class=\"iconBtn qty-btn button button-md button-default button-default-md ng-star-inserted\"])[1]");
		
		public void uTakeAwayclickOnDecereasedQTY() throws Exception {
			
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnDecereasedQTY));
			
			driver.findElement(TakeAwayclickOnDecereasedQTY).click();
			Thread.sleep(2000);
		}
		
		// Click on void Option
		By TakeAwayclickOnVoid = By.xpath("(//*[@class=\"row-content row\"])[2]");
		
		public void uTakeAwayclickOnVoid() throws Exception {
			
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnVoid));
			
			driver.findElement(TakeAwayclickOnVoid).click();
			Thread.sleep(2000);
		}
		
		// Clicks on Select reason
		By TakeAwayClickOnReasons = By.xpath("/html/body/ion-app/ion-modal/div/eo-selectable/form/ion-content/div[2]/ion-list/div[2]/ion-item[2]");
		
		public void uTakeAwayClickOnReasons() throws Exception {
			
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayClickOnReasons));
			
			driver.findElement(TakeAwayClickOnReasons).click();
			Thread.sleep(2000);
		}
		
		// Click on Quick Pay button
		By TakeAwayclickOnPayButton = By.xpath("//*[contains(text(),'Quick Pay')]");
		
		public void uTakeAwayclickOnPayButton() throws Exception {
			
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnPayButton));
			
			driver.findElement(TakeAwayclickOnPayButton).click();
			Thread.sleep(2000);
		}
		
		// Click on Void button
		By TakeAwayclickOnVoidButton = By.xpath("//i[contains(text(),'delete')]");
		
		public void uTakeAwayclickOnVoidButton() throws Exception {
			
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnVoidButton));
			
			driver.findElement(TakeAwayclickOnVoidButton).click();
			Thread.sleep(2000);
		}
		
	// ======================================> Items  <==========================================
		
		// Click on Save button on Order
		By TakeAwayAddThirdItem = By.xpath("(//*[@class=\"menu-item img-view button button-md button-default button-default-md button-md-light\"])[3]");
		
		public void uTakeAwayAddThirdItem() throws Exception {
			
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayAddThirdItem));
			
			driver.findElement(TakeAwayAddThirdItem).click();
			Thread.sleep(2000);
		}
		
		// Click on Save button on Order
		By TakeAwayAddFourthItem = By.xpath("(//*[@class=\"menu-item img-view button button-md button-default button-default-md button-md-light\"])[4]");
		
		public void uTakeAwayAddFourthItem() throws Exception {
			
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayAddFourthItem));
			
			driver.findElement(TakeAwayAddFourthItem).click();
			Thread.sleep(2000);
		}
		
		// Click on Save button on Order
		By TakeAwayAddFifthItem = By.xpath("(//*[@class=\"menu-item img-view button button-md button-default button-default-md button-md-light\"])[5]");
		
		public void uTakeAwayAddFifthItem() throws Exception {
			
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayAddFifthItem));
			
			driver.findElement(TakeAwayAddFifthItem).click();
			Thread.sleep(2000);
		}
		
		// Click on Save button on Order
		By TakeAwayAddSixthItem = By.xpath("(//*[@class=\"menu-item img-view button button-md button-default button-default-md button-md-light\"])[6]");
		
		public void uTakeAwayAddSixthItem() throws Exception {
			
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayAddSixthItem));
			
			driver.findElement(TakeAwayAddSixthItem).click();
			Thread.sleep(2000);
		}
		
		// Click on Save button on Order
		By TakeAwayAddSeventhItem = By.xpath("(//*[@class=\"menu-item img-view button button-md button-default button-default-md button-md-light\"])[7]");
		
		public void uTakeAwayAddSeventhItem() throws Exception {
			
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayAddSeventhItem));
			
			driver.findElement(TakeAwayAddSeventhItem).click();
			Thread.sleep(2000);
		}
		
		// Click on Save button on Order
		By TakeAwayAddEightItem = By.xpath("(//*[@class=\"menu-item img-view button button-md button-default button-default-md button-md-light\"])[8]");

		public void uTakeAwayAddEightItem() throws Exception {
			
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayAddEightItem));

			driver.findElement(TakeAwayAddEightItem).click();
			Thread.sleep(2000);
		}

		//======================> Settle Order <====================================

		// Click on Settle button
		By TakeAwayclickonSettleButton = By.xpath("//p[contains(text(),'Settle')]");

		public void uTakeAwayclickonSettleButton() throws Exception {
			
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickonSettleButton));

			driver.findElement(TakeAwayclickonSettleButton).click();
			Thread.sleep(2000);
		}
			
			// Click on Pay button
			By TakeAwayclickonPayButton = By.xpath("(//*[@class=\"footer-button bar-buttons bar-buttons-md\"])[1]");
			
			public void uTakeAwayclickonPayButton() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickonPayButton));
				
				driver.findElement(TakeAwayclickonPayButton).click();
				Thread.sleep(2000);
			}
			
			// Click on OK button in Changes Duo popup
			By TakeAwayclickOnOKButton = By.xpath("//span[contains(text(),'OK')]");
			
			public void uTakeAwayclickOnOKButton() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnOKButton));
				
				driver.findElement(TakeAwayclickOnOKButton).click();
				Thread.sleep(2000);
			}
			
			// Click on Bank option in settle
			By TakeAwayclickOnBank = By.xpath("//p[contains(text(),'Bank')]");
			
			public void uTakeAwayclickOnBank() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnBank));
				
				driver.findElement(TakeAwayclickOnBank).click();
				Thread.sleep(2000);
			}
			
			// Select bank pay option
			By TakeAwayselectBankPayoption = By.xpath("//*[@aria-posinset=\"1\"]");
			
			public void uTakeAwayselectBankPayoption() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayselectBankPayoption));
				
				driver.findElement(TakeAwayselectBankPayoption).click();
				Thread.sleep(2000);
			}
			
			// Click on Cash option in settle
			By TakeAwayclickOnCash = By.xpath("//p[contains(text(),'Cash')]");
			
			public void uTakeAwayclickOnCash() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnCash));
				
				driver.findElement(TakeAwayclickOnCash).click();
				Thread.sleep(2000);
			}
			
			// Select Cash pay option
			By TakeAwayselectCashPayoption = By.xpath("//*[@aria-posinset=\"1\"]");
			
			public void uTakeAwayselectCashPayoption() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayselectCashPayoption));
				
				driver.findElement(TakeAwayselectCashPayoption).click();
				Thread.sleep(2000);
			}
			
			// Click on Apply Button
			By TakeAwayclickOnApplyButton = By.xpath("//span[contains(text(),'Apply')]");
			
			public void uTakeAwayclickOnApplyButton() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnApplyButton));
				
				driver.findElement(TakeAwayclickOnApplyButton).click();
				Thread.sleep(2000);
			}
			
			// Select Bank pay option with Surcharge
			By TakeAwayselectBankPayoptionwithSurcharge = By.xpath("//*[@aria-posinset=\"3\"]");
			
			public void uTakeAwayselectBankPayoptionwithSurcharge() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayselectBankPayoptionwithSurcharge));
				
				driver.findElement(TakeAwayselectBankPayoptionwithSurcharge).click();
				Thread.sleep(2000);
			}
			
			// Click on Apply Button
			By TakeAwayclickCreditSection = By.xpath("//p[contains(text(),'Credit')]");
			
			public void uTakeAwayclickCreditSection() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickCreditSection));
				
				driver.findElement(TakeAwayclickCreditSection).click();
				Thread.sleep(2000);
			}
			
			// Select Bank pay option with Surcharge
			By TakeAwayselectCreditoption = By.xpath("/html/body/ion-app/ion-modal[2]/div/eo-selectable/form/ion-content/div[2]/ion-list/div[2]/ion-item[7]");
			
			public void uTakeAwayselectCreditoption() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayselectCreditoption));
				
				driver.findElement(TakeAwayselectCreditoption).click();
				Thread.sleep(2000);
			}
			
			// Select Bank pay option with Surcharge
			By TakeAwayCreditConfrimOption = By.xpath("(//*[@class=\"primary-button button button-md button-outline button-outline-md button-outline-md-primary\"])[1]");
			
			public void uTakeAwayCreditConfrimOption() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayCreditConfrimOption));
				
				driver.findElement(TakeAwayCreditConfrimOption).click();
				Thread.sleep(2000);
			}
			
			// Click on Save button in Order information popup
			By TakeAwayclickSaveButton = By.xpath("//span[contains(text(),'Save')]");
			
			public void uTakeAwayclickSaveButton() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickSaveButton));
				
				driver.findElement(TakeAwayclickSaveButton).click();
				Thread.sleep(2000);
			}
			
			// Click on "1" in Payment Process
			By TakeAwayclickOn1 = By.xpath("(//span[contains(text(),'1')])[6]");
			
			public void uTakeAwayclickOn1() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOn1));
				
				driver.findElement(TakeAwayclickOn1).click();
				Thread.sleep(2000);
			}
			
			// Click on "00" in Payment Process
			By TakeAwayclickOn00 = By.xpath("(//span[contains(text(),'00')])[1]");
			
			public void uTakeAwayclickOn00() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOn00));
				
				driver.findElement(TakeAwayclickOn00).click();
				Thread.sleep(2000);
			}
			
			// Click on Pay in Payment Process
			By TakeAwayclickOnPayinSettle = By.xpath("//*[@class=\"footer-button bar-buttons bar-buttons-md\"]");
			
			public void uTakeAwayclickOnPayinSettle() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnPayinSettle));
				
				driver.findElement(TakeAwayclickOnPayinSettle).click();
				Thread.sleep(2000);
			}
			
			
			// Click on "Save" button in Payment Process
			By TakeAwayclickOnSaveinSettle = By.xpath("//span[contains(text(),'Save')]");
			
			public void uTakeAwayclickOnSaveinSettle() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnSaveinSettle));
				
				driver.findElement(TakeAwayclickOnSaveinSettle).click();
				Thread.sleep(2000);
			}
			
			// Click on Currecny in Payment Process
			By TakeAwayclickOnCurrecny = By.xpath("//*[@id=\"selectedCurr\"]");
			
			public void uTakeAwayclickOnCurrecny() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnCurrecny));
				
				driver.findElement(TakeAwayclickOnCurrecny).click();
				Thread.sleep(2000);
			}
			
			// Click on Currecny in Payment Process
			By TakeAwayclickOnCurrecnyOption = By.xpath("//*[@aria-posinset=\"1\"]");
			
			public void uTakeAwayclickOnCurrecnyOption() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnCurrecnyOption));
				
				driver.findElement(TakeAwayclickOnCurrecnyOption).click();
				Thread.sleep(2000);
			}
			
			// ===========> Insufficient Credit popup <=====================
			
			// Select Credit account which has not sufficient balance
			By TakeAwayselectCreditAccount = By.xpath("(//*[@class=\"item item-block item-md item-radio virtual-position\"])[5]");
			
			public void uTakeAwayselectCreditAccount() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayselectCreditAccount));
				
				driver.findElement(TakeAwayselectCreditAccount).click();
				Thread.sleep(2000);
			}
			
			// Click on Continue Button
			By TakeAwayclickOnContinue = By.xpath("//span[contains(text(),'Continue')]");
			
			public void uTakeAwayclickOnContinue() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnContinue));
				
				driver.findElement(TakeAwayclickOnContinue).click();
				Thread.sleep(2000);
			}
			
			// Click on No Button
			By TakeAwayclickOnNoButton = By.xpath("//span[contains(text(),'NO')])[2]");
			
			public void uTakeAwayclickOnNoButton() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnNoButton));
				
				driver.findElement(TakeAwayclickOnNoButton).click();
				Thread.sleep(2000);
			}
			
		// ==============> Payment Summary  <==============================
			
			// Click on Payment Process
			By TakeAwayclickOnPaymentProcess = By.xpath("//span[contains(text(),'Payment Summary')]");
			
			public void uTakeAwayclickOnPaymentProcess() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnPaymentProcess));
				
				driver.findElement(TakeAwayclickOnPaymentProcess).click();
				Thread.sleep(2000);
			}
			
			// Click on Save Button
			By TakeAwayclickOnSaveButtoninPaymentProcess = By.xpath("//span[contains(text(),'Save')]");
			
			public void uTakeAwayclickOnSaveButtoninPaymentProcess() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnSaveButtoninPaymentProcess));
				
				driver.findElement(TakeAwayclickOnSaveButtoninPaymentProcess).click();
				Thread.sleep(2000);
			}
			
			// ================> Item QTY & Quantity popup <==============================
			
			// Click on QTY section on item
			By TakeAwayclickonQTY = By.xpath("(//span[contains(text(),'1')])[2]");
			
			public void uTakeAwayclickonQTY() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickonQTY));
				
				driver.findElement(TakeAwayclickonQTY).click();
				Thread.sleep(2000);
			}
			
			// Click on "2" number
			By TakeAwayclickon2 = By.xpath("//span[contains(text(),'2')]");
			
			public void uTakeAwayclickon2() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickon2));
				
				driver.findElement(TakeAwayclickon2).click();
				Thread.sleep(2000);
			}
			
			// Click on "0" number
			By TakeAwayclickon0 = By.xpath("//span[contains(text(),'0')]");
			
			public void uTakeAwayclickon0() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickon0));
				
				driver.findElement(TakeAwayclickon0).click();
				Thread.sleep(2000);
			}
			
			// Click on Enter
			By TakeAwayclickonEnter = By.xpath("//*[@class=\"primary-btn button button-md button-default button-default-md\"]");
			
			public void uTakeAwayclickonEnter() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickonEnter));
				
				driver.findElement(TakeAwayclickonEnter).click();
				Thread.sleep(2000);
			}
			
		// ================> Confirm popup on Credit Settle  <=========================
			
			// Click on Update Guest information with posted
			By TakeAwayUpdateGuestInformation = By.xpath("(//*[@class=\"primary-button button button-md button-outline button-outline-md button-outline-md-primary\"])[1]");
			
			public void uTakeAwayUpdateGuestInformation() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayUpdateGuestInformation));
				
				driver.findElement(TakeAwayUpdateGuestInformation).click();
				Thread.sleep(2000);
			}
			
			// Click on Proceed with Posting
			By TakeAwayclickOnProceedwithPosting = By.xpath("(//*[@class=\"primary-button button button-md button-outline button-outline-md button-outline-md-primary\"])[2]");
			
			public void uTakeAwayclickOnProceedwithPosting() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnProceedwithPosting));
				
				driver.findElement(TakeAwayclickOnProceedwithPosting).click();
				Thread.sleep(2000);
			}
			
			// Click on Cancel button
			By TakeAwayclickonCancelButton = By.xpath("//*[@class=\"secondary-act-btn button button-md button-default button-default-md ng-star-inserted\"]");
			
			public void uTakeAwayclickonCancelButton() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickonCancelButton));
				
				driver.findElement(TakeAwayclickonCancelButton).click();
				Thread.sleep(2000);
			}
			
		// ===================> Room Posting <==========================
			
			// Click on Posting Pay in settle
			By TakeAwayclickonPosting = By.xpath("//p[contains(text(),'Posting')]");
			
			public void uTakeAwayclickonPosting() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickonPosting));
				
				driver.findElement(TakeAwayclickonPosting).click();
				Thread.sleep(2000);
			}
			
			// Select Posting Pay method
			By TakeAwayselectPostingPay = By.xpath("//*[@title=\"Mr.Check For Room Posting\"]");
			
			public void uTakeAwayselectPostingPay() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayselectPostingPay));
				
				driver.findElement(TakeAwayselectPostingPay).click();
				Thread.sleep(2000);
			}
			
			// Click on Yes button in confirm popup
			By TakeAwayclickOnYes = By.xpath("//span[contains(text(),'Yes')]");
			
			public void uTakeAwayclickOnYes() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnYes));
				
				driver.findElement(TakeAwayclickOnYes).click();
				Thread.sleep(2000);
			}
			
		// ====================> Extra Charge  <===================================
			
			// Click on Extra Charge popup
			By TakeAwayclickOnExtraCharge = By.xpath("//p[contains(text(),'Extra Charge')]");
			
			public void uTakeAwayclickOnExtraCharge() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnExtraCharge));
				
				driver.findElement(TakeAwayclickOnExtraCharge).click();
				Thread.sleep(2000);
			}
			
			// Select Extra Charge in extra charge popup 
			By TakeAwayselectExtraCharge = By.xpath("//*[@aria-posinset=\"1\"]");
			
			public void uTakeAwayselectExtraCharge() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayselectExtraCharge));
				
				driver.findElement(TakeAwayselectExtraCharge).click();
				Thread.sleep(2000);
			}
			
			
			// Click on Extra Charge icon in order amount summary
			By TakeAwayclickOnExtraChargeicon = By.xpath("/html/body/ion-app/ng-component/ion-nav/page-orderscreen/ion-content/div[2]/ion-grid/ion-row/ion-col[2]/order-detail/ion-card/ion-card-content/order-detail-footer/div[1]/div[6]/p[1]/ion-icon");
			
			public void uTakeAwayclickOnExtraChargeicon() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnExtraChargeicon));
				
				driver.findElement(TakeAwayclickOnExtraChargeicon).click();
				Thread.sleep(2000);
			}
			
			// Click on Void button in Extra charge popup
			By TakeAwayclickOnVoidButtoninExtraChargeicon = By.xpath("(//*[@class=\"item-button button button-md button-clear button-clear-md\"])[1]");
			
			public void uTakeAwayclickOnVoidButtoninExtraChargeicon() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnVoidButtoninExtraChargeicon));
				
				driver.findElement(TakeAwayclickOnVoidButtoninExtraChargeicon).click();
				Thread.sleep(2000);
			}
			
			// Click on Void button in Extra charge popup
			By TakeAwayclickOnVoidButtonin2ExtraChargeicon = By.xpath("(//*[@class=\"item-button button button-md button-clear button-clear-md\"])[2]");
			
			public void uTakeAwayclickOnVoidButtonin2ExtraChargeicon() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnVoidButtonin2ExtraChargeicon));
				
				driver.findElement(TakeAwayclickOnVoidButtonin2ExtraChargeicon).click();
				Thread.sleep(2000);
			}
			
			// Click on Delete button in Extra charge popup
			By TakeAwayclickOnDeleteButtoninExtraChargeicon = By.xpath("//span[contains(text(),'Delete')]");
			
			public void uTakeAwayclickOnDeleteButtoninExtraChargeicon() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnDeleteButtoninExtraChargeicon));
				
				driver.findElement(TakeAwayclickOnDeleteButtoninExtraChargeicon).click();
				Thread.sleep(2000);
			}
			
			// Click on Delete button in Extra charge popup
			By TakeAwayselectReasonInExtraCharge = By.xpath("//*[@aria-posinset=\"1\"]");
			
			public void uTakeAwayselectReasonInExtraCharge() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayselectReasonInExtraCharge));
				
				driver.findElement(TakeAwayselectReasonInExtraCharge).click();
				Thread.sleep(2000);
			}
			
			// Click on Delete button in Extra charge popup
			By TakeAwayclickOnCancelInExtrachargepopup = By.xpath("/html/body/ion-app/ion-modal/div/detail-viewer/form/ion-header/ion-toolbar/div[2]/div[3]/ion-buttons/button");
			
			public void uTakeAwayclickOnCancelInExtrachargepopup() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnCancelInExtrachargepopup));
				
				driver.findElement(TakeAwayclickOnCancelInExtrachargepopup).click();
				Thread.sleep(2000);
			}
			
			// Click on OK button in Warning popup
			By TakeAwayclickOnOKButtoninWarningPopup = By.xpath("//span[contains(text(),'OK')]");
			
			public void uTakeAwayclickOnOKButtoninWarningPopup() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnOKButtoninWarningPopup));
				
				driver.findElement(TakeAwayclickOnOKButtoninWarningPopup).click();
				Thread.sleep(2000);
			}
			
		// ====================> Discounts  <===================================
			
			// Click on Discount button in order
			By TakeAwayclickOnDiscountButton = By.xpath("//p[contains(text(),'Discount')]");
			
			public void uTakeAwayclickOnDiscountButton() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnDiscountButton));
				
				driver.findElement(TakeAwayclickOnDiscountButton).click();
				Thread.sleep(2000);
			}
			
			// Select Discount in order popup
			By TakeAwayselectDiscountonBaseAmount = By.xpath("//*[@aria-posinset=\"5\"]");
			
			public void uTakeAwayselectDiscountonBaseAmount() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayselectDiscountonBaseAmount));
				
				driver.findElement(TakeAwayselectDiscountonBaseAmount).click();
				Thread.sleep(2000);
			}
			
			// Select Discount in order popup
			By TakeAwayselectDiscountonFinalAmount = By.xpath("//*[@aria-posinset=\"6\"]");
			
			public void uTakeAwayselectDiscountonFinalAmount() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayselectDiscountonFinalAmount));
				
				driver.findElement(TakeAwayselectDiscountonFinalAmount).click();
				Thread.sleep(2000);
			}
			
			// Select Discount in order popup "ORDER FINAL IN AMOUNT 100"
			By selectOrderDiscount = By.xpath("//*[@aria-posinset=\"6\"]");
			
			public void uselectOrderDiscount() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(selectOrderDiscount));
				
				driver.findElement(selectOrderDiscount).click();
				Thread.sleep(2000);
			}
			
			// Click on Discount button in item
			By TakeAwayclickOnDiscountButtoninItem = By.xpath("(//p[contains(text(),'Discount')])[5]");
			
			public void uTakeAwayclickOnDiscountButtoninItem() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnDiscountButtoninItem));
				
				driver.findElement(TakeAwayclickOnDiscountButtoninItem).click();
				Thread.sleep(2000);
			}
			
			// Select Item Discount "10 % ITEM (NTE)"
			By TakeAwayselectItemDiscount = By.xpath("//*[@aria-posinset=\"11\"]");
			
			public void uTakeAwayselectItemDiscount() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayselectItemDiscount));
				
				driver.findElement(TakeAwayselectItemDiscount).click();
				Thread.sleep(2000);
			}
			
			// Cancel icon on item popup
			By TakeAwaycancelonItem = By.xpath("//*[@class=\"bar-button bar-button-md bar-button-default bar-button-default-md bar-button-md-light\"]");
			
			public void uTakeAwaycancelonItem() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwaycancelonItem));
				
				driver.findElement(TakeAwaycancelonItem).click();
				Thread.sleep(2000);
			}
			
			// Cancel icon on item popup
			By TakeAwayItem = By.xpath("(//*[@class=\"item-name txt-ellipsis\"])[1]");
			
			public void uTakeAwayItem() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayItem));
				
				driver.findElement(TakeAwayItem).click();
				Thread.sleep(2000);
			}
			
			// Select Second Item Discount "20 AMOUNT (NTE)"
			By TakeAwayselect2ItemDiscount = By.xpath("//*[@aria-posinset=\"18\"]");
			
			public void uTakeAwayselect2ItemDiscount() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayselect2ItemDiscount));
				
				driver.findElement(TakeAwayselect2ItemDiscount).click();
				Thread.sleep(2000);
			}
			
			// Select Second Item Discount "10 % PROMO (CTE)"
			By TakeAwayselect3ItemDiscount = By.xpath("//*[@aria-posinset=\"19\"]");
			
			public void uTakeAwayselect3ItemDiscount() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayselect3ItemDiscount));
				
				driver.findElement(TakeAwayselect3ItemDiscount).click();
				Thread.sleep(2000);
			}
			
			// Click on Order icon in amount summary
			By TakeAwayclickOnOrderIcon = By.xpath("//p[contains(text(),'Order Discount')]");
			
			public void uTakeAwayclickOnOrderIcon() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnOrderIcon));
				
				driver.findElement(TakeAwayclickOnOrderIcon).click();
				Thread.sleep(2000);
			}
			
			// Click on void icon in Order discount 
			By TakeAwayclickOnVoidOrder = By.xpath("(//*[@class=\"button button-md button-clear button-clear-md\"])[2]");
			
			public void uTakeAwayclickOnVoidOrder() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnVoidOrder));
				
				driver.findElement(TakeAwayclickOnVoidOrder).click();
				Thread.sleep(2000);
			}
			
			// Click on void button in Order discount 
			By TakeAwayclickOnVoidOrderbutton = By.xpath("//span[contains(text(),'Void')]");
			
			public void uTakeAwayclickOnVoidOrderbutton() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnVoidOrderbutton));
				
				driver.findElement(TakeAwayclickOnVoidOrderbutton).click();
				Thread.sleep(2000);
			}
			
			// Click on Cancel in Order Discount in popup
			By TakeAwayclickOnCancelinOrderpopup = By.xpath("(//*[@class=\"bar-buttons bar-buttons-md\"])[7]");
			
			public void uTakeAwayclickOnCancelinOrderpopup() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnCancelinOrderpopup));
				
				driver.findElement(TakeAwayclickOnCancelinOrderpopup).click();
				Thread.sleep(2000);
			}
			
			// Click on Void icon in Item popup
			By TakeAwayclickOnVoidinItempopup = By.xpath("(//i[contains(text(),'delete')])[3]");
			
			public void uTakeAwayclickOnVoidinItempopup() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnVoidinItempopup));
				
				driver.findElement(TakeAwayclickOnVoidinItempopup).click();
				Thread.sleep(2000);
			}
			
			// Click on Void button in Item popup
			By TakeAwayclickOnVoidButtoninItempopup = By.xpath("//span[contains(text(),'Void')]");
			
			public void uTakeAwayclickOnVoidButtoninItempopup() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnVoidButtoninItempopup));
				
				driver.findElement(TakeAwayclickOnVoidButtoninItempopup).click();
				Thread.sleep(2000);
			}
			
			// Click on Add open discount " OPEN ITEM IN %(NTE) "
			By TakeAwayAddOpenOrderDiscount = By.xpath("//*[@aria-posinset=\"3\"]");
			
			public void uTakeAwayAddOpenOrderDiscount() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayAddOpenOrderDiscount));
				
				driver.findElement(TakeAwayAddOpenOrderDiscount).click();
				Thread.sleep(2000);
			}
			
			// Click on 2 button in Open discount popup
			By TakeAwayClick2inOpenOrderDiscount = By.xpath("(//span[contains(text(),'2')])[2]");
			
			public void uTakeAwayClick2inOpenOrderDiscount() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayClick2inOpenOrderDiscount));
				
				driver.findElement(TakeAwayClick2inOpenOrderDiscount).click();
				Thread.sleep(2000);
			}
			
			// Click on 0 button in open discount popup
			By TakeAwayClick0inOpenOrderDiscount = By.xpath("(//span[contains(text(),'0')])[1]");
			
			public void uTakeAwayClick0inOpenOrderDiscount() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayClick0inOpenOrderDiscount));
				
				driver.findElement(TakeAwayClick0inOpenOrderDiscount).click();
				Thread.sleep(2000);
			}
			
			// Click on Add open item discount
			By TakeAwayAddOpenItemDiscount = By.xpath("(//*[@aria-posinset=\"14\"])");
			
			public void uTakeAwayAddOpenItemDiscount() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayAddOpenItemDiscount));
				
				driver.findElement(TakeAwayAddOpenItemDiscount).click();
				Thread.sleep(2000);
			}
			
			// Click on 2 in item open discount
			By TakeAwayClick2inOpenItemDiscount = By.xpath("(//*[@class=\"secondary-btn button button-md button-default button-default-md\"])[10]");
			
			public void uTakeAwayClick2inOpenItemDiscount() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayClick2inOpenItemDiscount));
				
				driver.findElement(TakeAwayClick2inOpenItemDiscount).click();
				Thread.sleep(2000);
			}
			
			// Click on 0 in item discount
			By TakeAwayClick0inOpenItemDiscount = By.xpath("(//span[contains(text(),'0')])[1]");
			
			public void uTakeAwayClick0inOpenItemDiscount() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayClick0inOpenItemDiscount));
				
				driver.findElement(TakeAwayClick0inOpenItemDiscount).click();
				Thread.sleep(2000);
			}
			
			// Click on 3 in item open discount
			By TakeAwayClick3inOpenItemDiscount = By.xpath("//span[contains(text(),'3')]");
			
			public void uTakeAwayClick3inOpenItemDiscount() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayClick3inOpenItemDiscount));
				
				driver.findElement(TakeAwayClick3inOpenItemDiscount).click();
				Thread.sleep(2000);
			}
			
			// Click on Enter in open order discount
			By TakeAwayClickEnterinOpenOrderDiscount = By.xpath("(//*[@class=\"primary-btn button button-md button-default button-default-md\"])[1]");
			
			public void TakeAwayClickEnterinOpenOrderDiscount() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayClickEnterinOpenOrderDiscount));
				
				driver.findElement(TakeAwayClickEnterinOpenOrderDiscount).click();
				Thread.sleep(2000);
			}
			
			// Apply 100 % Item discount
			By TakeAwayApply100ItemDiscount = By.xpath("(//*[@class=\"item item-block item-md item-radio virtual-position\"])[1]");
			
			public void uTakeAwayApply100ItemDiscount() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayApply100ItemDiscount));
				
				driver.findElement(TakeAwayApply100ItemDiscount).click();
				Thread.sleep(2000);
			}
			
			// Click on "1" in Open Discount
			By TakeAwayClick1ItemDiscount = By.xpath("(//span[contains(text(),'1')])[6]");
			
			public void uTakeAwayClick1ItemDiscount() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayClick1ItemDiscount));
				
				driver.findElement(TakeAwayClick1ItemDiscount).click();
				Thread.sleep(2000);
			}
				
			// Click on "00" in Open Discount
			By TakeAwayClick00ItemDiscount = By.xpath("(//span[contains(text(),'00')])[1]");
			
			public void uTakeAwayClick00ItemDiscount() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayClick00ItemDiscount));
				
				driver.findElement(TakeAwayClick00ItemDiscount).click();
				Thread.sleep(2000);
			}
			
			// Apply 100 % Order discount
			By TakeAwayApply100OrderDiscount = By.xpath("//*[@aria-posinset=\"3\"]");
			
			public void uTakeAwayApply100OrderDiscount() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayApply100OrderDiscount));
				
				driver.findElement(TakeAwayApply100OrderDiscount).click();
				Thread.sleep(2000);
			}
			
			// Click on "1" in Open Discount
			By TakeAwayClick1OrderDiscount = By.xpath("(//span[contains(text(),'1')])[5]");
			
			public void uTakeAwayClick1OrderDiscount() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayClick1OrderDiscount));
				
				driver.findElement(TakeAwayClick1OrderDiscount).click();
				Thread.sleep(2000);
			}
			
			// Click on "00" in Open Discount
			By TakeAwayClick00OrderDiscount = By.xpath("(//span[contains(text(),'00')])[1]");
			
			public void uTakeAwayClick00OrderDiscount() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayClick00OrderDiscount));
				
				driver.findElement(TakeAwayClick00OrderDiscount).click();
				Thread.sleep(2000);
			}
			
			// Click on "Yes" button in confirm popup after apply 100% item discount on item and save it
			By TakeAwayClickYesButtoninConfirmPopup = By.xpath("(//span[contains(text(),'Yes')])[1]");
			
			public void uTakeAwayClickYesButtoninConfirmPopup() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayClickYesButtoninConfirmPopup));
				
				driver.findElement(TakeAwayClickYesButtoninConfirmPopup).click();
				Thread.sleep(2000);
			}
			
			// Click on "Overwrite" button in Discount Summary popup 
			By TakeAwayClickOverwriteButton = By.xpath("//span[contains(text(),'Overwrite')]");
			
			public void uTakeAwayClickOverwriteButton() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayClickOverwriteButton));
				
				driver.findElement(TakeAwayClickOverwriteButton).click();
				Thread.sleep(2000);
			}
			
			// Click on item which has modifier
			By TakeAwayClickitemWithMOd = By.xpath("(//*[@class=\"item-name txt-ellipsis\"])[3]");
			
			public void uTakeAwayClickitemWithMOd() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayClickitemWithMOd));
				
				driver.findElement(TakeAwayClickitemWithMOd).click();
				Thread.sleep(2000);
			}
			
			// Add modifier item
			By TakeAwayAddModifierItems = By.xpath("//*[@title=\"Double Special Falooda+ SeperateKulfi\"]");
			
			public void uTakeAwayAddModifierItems() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayAddModifierItems));
				
				driver.findElement(TakeAwayAddModifierItems).click();
				Thread.sleep(2000);
			}
			
			// Click on modifier item for add discount
			By TakeAwayClickonModifierItem = By.xpath("(//*[@class=\"item-name txt-ellipsis\"])[5]");
			
			public void uTakeAwayClickonModifierItem() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayClickonModifierItem));
				
				driver.findElement(TakeAwayClickonModifierItem).click();
				Thread.sleep(2000);
			}
			
			// Click on discount section in item which has modifier item for add discount
			By TakeAwayClickonDiscountSection = By.xpath("(//*[@class=\"button secondary-btn vertical-btn button-md button-default button-default-md button-md-light ng-star-inserted\"])[3]");
			
			public void uTakeAwayClickonDiscountSection() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayClickonDiscountSection));
				
				driver.findElement(TakeAwayClickonDiscountSection).click();
				Thread.sleep(2000);
			}
			
			// Click on discount section in modifier item for add discount
			By TakeAwayClickonVoidButtoninPaymentSummary = By.xpath("/html/body/ion-app/ion-modal/div/settlement/form/ion-content/div[2]/ion-grid/ion-row[2]/div/div/ion-row/ion-col[3]/button");
			
			public void uTakeAwayClickonVoidButtoninPaymentSummary() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayClickonVoidButtoninPaymentSummary));
				
				driver.findElement(TakeAwayClickonVoidButtoninPaymentSummary).click();
				Thread.sleep(2000);
			}
			
			// Click on discount section in modifier item for add discount
			By TakeAwayClickonSaveButtoninModifier = By.xpath("//span[contains(text(),'Save')]");
			
			public void uTakeAwayClickonSaveButtoninModifier() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayClickonSaveButtoninModifier));
				
				driver.findElement(TakeAwayClickonSaveButtoninModifier).click();
				Thread.sleep(2000);
			}
			
			// Click on discount section in modifier item for add discount
			By TakeAwayClickonDiscountinModifier = By.xpath("(//p[contains(text(),'Discount')])[5]");
			
			public void uTakeAwayClickonDiscountinModifier() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayClickonDiscountinModifier));
				
				driver.findElement(TakeAwayClickonDiscountinModifier).click();
				Thread.sleep(2000);
			}
			
			// Click on More options
			By TakeAwayClickonMoreoptions = By.xpath("/html/body/ion-app/ng-component/ion-nav/page-orderscreen/ion-content/div[2]/ion-grid/ion-row/ion-col[2]/order-detail/ion-card/ion-card-content/order-detail-header/ion-card-header/button[3]");
			
			public void uTakeAwayClickonMoreoptions() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayClickonMoreoptions));
				
				driver.findElement(TakeAwayClickonMoreoptions).click();
				Thread.sleep(2000);
			}
			
			// Click on Select All order
			By TakeAwayClickonSelectAll = By.xpath("(//*[@class=\"checkbox checkbox-md checkbox-md-primary ng-untouched ng-pristine ng-valid\"])[1]");
			
			public void uTakeAwayClickonSelectAll() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayClickonSelectAll));
				
				driver.findElement(TakeAwayClickonSelectAll).click();
				Thread.sleep(2000);
			}
			
			// Click on Discount in Bulk Items
			By TakeAwayClickonDiscountinBulkItems = By.xpath("(//p[contains(text(),'Discount')])[5]");
			
			public void uTakeAwayClickonDiscountinBulkItems() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayClickonDiscountinBulkItems));
				
				driver.findElement(TakeAwayClickonDiscountinBulkItems).click();
				Thread.sleep(2000);
			}
			
			// Click on Discount in Bulk Items
			By TakeAwayselectBulkDiscount = By.xpath("(//*[@aria-posinset=\"1\"])[1]");
			
			public void uTakeAwayselectBulkDiscount() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayselectBulkDiscount));
				
				driver.findElement(TakeAwayselectBulkDiscount).click();
				Thread.sleep(2000);
			}
			
			// Click on Close icon
			By TakeAwayClickonCloseicon = By.xpath("(//*[@positionv=\"bottom\"])[4]");
			
			public void uTakeAwayClickonCloseicon() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayClickonCloseicon));
				
				driver.findElement(TakeAwayClickonCloseicon).click();
				Thread.sleep(2000);
			}
			
			// Click on Void Discount
			By TakeAwayClickonVoidDiscount = By.xpath("//p[contains(text(),'Void Discount')]");
			
			public void uTakeAwayClickonVoidDiscount() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayClickonVoidDiscount));
				
				driver.findElement(TakeAwayClickonVoidDiscount).click();
				Thread.sleep(2000);
			}
			
			// Select Discount for void
			By TakeAwayselectDiscountonBulkDiscount = By.xpath("(//*[@class=\"checkbox checkbox-md ng-untouched ng-pristine ng-valid\"])[1]");
			
			public void uTakeAwayselectDiscountonBulkDiscount() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayselectDiscountonBulkDiscount));
				
				driver.findElement(TakeAwayselectDiscountonBulkDiscount).click();
				Thread.sleep(2000);
			}
			
			// Click on Void Button
			By TakeAwayClickonVoidButton = By.xpath("//span[contains(text(),'Void')]");
			
			public void uTakeAwayClickonVoidButton() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayClickonVoidButton));
				
				driver.findElement(TakeAwayClickonVoidButton).click();
				Thread.sleep(2000);
			}
			
			// Click on Void Button in Void item discount popup
			By TakeAwayVoiditemdiscountpopup = By.xpath("//span[contains(text(),'Void')]");
			
			public void uTakeAwayVoiditemdiscountpopup() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayVoiditemdiscountpopup));
				
				driver.findElement(TakeAwayVoiditemdiscountpopup).click();
				Thread.sleep(2000);
			}
			
			// Click on Hold Button 
			By TakeAwayClickonHoldButton = By.xpath("//p[contains(text(),'Hold')]");
			
			public void uTakeAwayClickonHoldButton() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayClickonHoldButton));
				
				driver.findElement(TakeAwayClickonHoldButton).click();
				Thread.sleep(2000);
			}
			
			// Click on Hold Button in Hold Item popup 
			By TakeAwayClickonHoldButtoninHoldItemPopup = By.xpath("//span[contains(text(),'Hold')]");
			
			public void uTakeAwayClickonHoldButtoninHoldItemPopup() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayClickonHoldButtoninHoldItemPopup));
				
				driver.findElement(TakeAwayClickonHoldButtoninHoldItemPopup).click();
				Thread.sleep(2000);
			}
			
			// Click on Fire Button 
			By TakeAwayClickonFireButton = By.xpath("//p[contains(text(),'Fire')]");
			
			public void uTakeAwayClickonFireButton() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayClickonFireButton));
				
				driver.findElement(TakeAwayClickonFireButton).click();
				Thread.sleep(2000);
			}
			
			// Click on Fire Button in Hold Item popup 
			By TakeAwayClickonFireButtoninHoldItemPopup = By.xpath("//span[contains(text(),'Fire')]");
			
			public void uTakeAwayClickonFireButtoninHoldItemPopup() throws Exception {
				
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
				wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayClickonFireButtoninHoldItemPopup));
				
				driver.findElement(TakeAwayClickonFireButtoninHoldItemPopup).click();
				Thread.sleep(2000);
			}
		
//  =================================================================================================================================================		
//	==================================================> Room Posting XPath <=========================================================================
			


			
}
