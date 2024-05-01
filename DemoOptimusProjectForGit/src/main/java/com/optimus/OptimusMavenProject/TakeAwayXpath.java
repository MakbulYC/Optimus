package com.optimus.OptimusMavenProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TakeAwayXpath {
	
	public static WebDriver driver;
	
	public TakeAwayXpath(WebDriver driver) {
		
		this.driver=driver;
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
	
	// Click on menu
	By Clickonmenu = By.xpath("//*[@class=\"ico-with-text bar-buttons bar-buttons-md bar-button bar-button-md bar-button-default bar-button-default-md bar-button-menutoggle bar-button-menutoggle-md\"]");
	
	public void uClickonmenu() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(Clickonmenu));
		
		wait.until(ExpectedConditions.elementToBeClickable(Clickonmenu));
		
		driver.findElement(Clickonmenu).click();
		Thread.sleep(2000);
	}
	
	// Click on Take Away
	By ClickonTakeAway = By.xpath("//p[contains(text(),'Take Away')]");
	
	public void uClickonTakeAway() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonTakeAway));
		
		wait.until(ExpectedConditions.elementToBeClickable(ClickonTakeAway));
		
		driver.findElement(ClickonTakeAway).click();
		Thread.sleep(2000);
	}
	
	// Click on Order Summary
	By ClickonOrderSummary = By.xpath("//p[contains(text(),'Order Summary')]");
	
	public void uClickonOrderSummary() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonOrderSummary));
		
		wait.until(ExpectedConditions.elementToBeClickable(ClickonOrderSummary));
		
		driver.findElement(ClickonOrderSummary).click();
		Thread.sleep(2000);
	}
	
	// Click on menu
	By ClickonmenuButton = By.xpath("/html/body/ion-app/ng-component/ion-nav/page-ordersummary/ion-header/header/ion-navbar/div[2]");
	
	public void uClickonmenuButton() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonmenuButton));
		
		wait.until(ExpectedConditions.elementToBeClickable(ClickonmenuButton));
		
		driver.findElement(ClickonmenuButton).click();
		Thread.sleep(2000);
	}
	
	// Click on Item
	By TakeAwayAddItem = By.xpath("//*[@title=\"Double Falooda Single Glass\"]");
	
	public void uTakeAwayAddItem() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayAddItem));
		
		wait.until(ExpectedConditions.elementToBeClickable(TakeAwayAddItem));
		
		driver.findElement(TakeAwayAddItem).click();
		Thread.sleep(2000);
	}
	
	// Click on Save button on Order
	By TakeAwayclickOnSave = By.xpath("//p[contains(text(),'Save')]");
	
	public void uTakeAwayclickOnSave() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnSave));
		
		wait.until(ExpectedConditions.elementToBeClickable(TakeAwayclickOnSave));
		
		driver.findElement(TakeAwayclickOnSave).click();
		Thread.sleep(2000);
	}
	
	// Click on Cancel button on Order
	By TakeAwayclickOnCancel = By.xpath("//p[contains(text(),'Cancel')]");
	
	public void uTakeAwayclickOnCancel() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnCancel));
		
		wait.until(ExpectedConditions.elementToBeClickable(TakeAwayclickOnCancel));
		
		driver.findElement(TakeAwayclickOnCancel).click();
		Thread.sleep(2000);
	}
	
	By TakeAwayClickonmenuFromOrderSummary = By.xpath("//*[@class=\"ico-with-text bar-buttons bar-buttons-md bar-button bar-button-md bar-button-default bar-button-default-md bar-button-menutoggle bar-button-menutoggle-md ng-star-inserted\"]");
	
	public void uTakeAwayClickonmenuFromOrderSummary() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayClickonmenuFromOrderSummary));
		
		wait.until(ExpectedConditions.elementToBeClickable(TakeAwayClickonmenuFromOrderSummary));
		
		driver.findElement(TakeAwayClickonmenuFromOrderSummary).click();
		Thread.sleep(3000);
	}
	
	// Select order
	By TakeAwayselectOrder = By.xpath("(//*[@class=\"item-cover item-cover-md item-cover-default item-cover-default-md\"])[1]");
	
	public void uTakeAwayselectOrder() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayselectOrder));
		
		wait.until(ExpectedConditions.elementToBeClickable(TakeAwayselectOrder));
		
		driver.findElement(TakeAwayselectOrder).click();
		Thread.sleep(2000);
	}
	
	// Click on Recall button
	By TakeAwayclickOnRecallButton = By.xpath("//p[contains(text(),'Recall')]");
	
	public void uTakeAwayclickOnRecallButton() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnRecallButton));
		
		wait.until(ExpectedConditions.elementToBeClickable(TakeAwayclickOnRecallButton));
		
		driver.findElement(TakeAwayclickOnRecallButton).click();
		Thread.sleep(2000);
	}
	
	// Click on Save button on Order
	By TakeAwayAddNewItem = By.xpath("(//*[@class=\"menu-item img-view button button-md button-default button-default-md button-md-light\"])[2]");
	
	public void uTakeAwayAddNewItem() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayAddNewItem));
		
		wait.until(ExpectedConditions.elementToBeClickable(TakeAwayAddNewItem));
		
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
	By TakeAwayclickOnQuickPayButton = By.xpath("//*[contains(text(),'Quick Pay')]");
	
	public void uTakeAwayclickOnQucikPayButton() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnQuickPayButton));
		
		driver.findElement(TakeAwayclickOnQuickPayButton).click();
		Thread.sleep(2000);
	}
	
	// Click on Void button
	By TakeAwayclickOnVoidButton = By.xpath("/html/body/ion-app/ng-component/ion-nav/page-orderscreen/ion-content/div[2]/ion-grid/ion-row/ion-col[2]/order-detail/ion-card/ion-card-content/receipt-type-2/item-list/div[1]/div/div/div[1]/button");
	
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
		By TakeAwayclickonPayButton = By.xpath("/html/body/ion-app/ion-modal/div/settlement/form/ion-footer/ion-grid/ion-row/ion-col[2]/ion-buttons/button");
		
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
		By TakeAwayselectCreditAccount = By.xpath("/html/body/ion-app/ion-modal[2]/div/eo-selectable/form/ion-content/div[2]/ion-list/div[2]/ion-item[7]");
		
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
		By TakeAwayclickOnVoidButtonin2ExtraChargeicon = By.xpath("/html/body/ion-app/ion-modal/div/detail-viewer/form/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-list[1]/ion-item[2]/div[1]/div/div/button");
		
		public void uTakeAwayclickOnVoidButtonin2ExtraChargeicon() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnVoidButtonin2ExtraChargeicon));
			
			driver.findElement(TakeAwayclickOnVoidButtonin2ExtraChargeicon).click();
			Thread.sleep(2000);
		}
		
		// Click on Delete button in Extra charge popup
		By TakeAwayclickOnDeleteButtoninPOPUP = By.xpath("//span[contains(text(),'Delete')]");
		
		public void uTakeAwayclickOnDeleteButtoninPOPUP() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnDeleteButtoninPOPUP));
			
			driver.findElement(TakeAwayclickOnDeleteButtoninPOPUP).click();
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
		By TakeAwayclickOnCancelinOrderpopup = By.xpath("/html/body/ion-app/ion-modal/div/detail-viewer/form/ion-header/ion-toolbar/div[2]/div[3]/ion-buttons/button");
		
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
			Thread.sleep(5000);
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
		
		// Click on 2 in item open discount
		By TakeAwayClick2inOpenItemDiscount1 = By.xpath("(//span[contains(text(),'2')])[7]");
		
		public void uTakeAwayClick2inOpenItemDiscount1() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayClick2inOpenItemDiscount1));
			
			driver.findElement(TakeAwayClick2inOpenItemDiscount1).click();
			Thread.sleep(2000);
		}
		
		
		// Click on 0 in item discount
		By TakeAwayClick0inOpenItemDiscount = By.xpath("(//span[contains(text(),'0')])[2]");
		
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
		
		// Click on 3 in item open discount
		By TakeAwayClick0inOpenItemDiscount1 = By.xpath("(//span[contains(text(),'0')])[1]");
		
		public void uTakeAwayClick0inOpenItemDiscount1() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayClick0inOpenItemDiscount1));
			
			driver.findElement(TakeAwayClick0inOpenItemDiscount1).click();
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
			Thread.sleep(5000);
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
		
		// Click on OK button in Changes Duo popup
		By clickOnOKButtoninChangesDuopopup = By.xpath("//span[contains(text(),'OK')]");
		
		public void uclickOnOKButtoninChangesDuopopup() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnOKButtoninChangesDuopopup));
			
			driver.findElement(clickOnOKButtoninChangesDuopopup).click();
			Thread.sleep(2000);
		}
		
		// Add new item in order
		By TakeAwayclickOnItem = By.xpath("(//*[@class=\"item-name txt-ellipsis\"])[1]");
		
		public void uTakeAwayclickOnItem() throws Exception {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
			wait.until(ExpectedConditions.visibilityOfElementLocated(TakeAwayclickOnItem));
			
			driver.findElement(TakeAwayclickOnItem).click();
			Thread.sleep(2000);
		}

}
