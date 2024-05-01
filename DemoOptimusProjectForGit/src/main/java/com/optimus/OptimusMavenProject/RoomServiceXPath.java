package com.optimus.OptimusMavenProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RoomServiceXPath {

	public static WebDriver driver;

	public RoomServiceXPath(WebDriver driver) {

		this.driver=driver;
	}


	// Click on menu
	By Clickonmenu = By.xpath("//*[@class=\"ico-with-text bar-buttons bar-buttons-md bar-button bar-button-md bar-button-default bar-button-default-md bar-button-menutoggle bar-button-menutoggle-md\"]");

	public void uClickonmenu() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(Clickonmenu));

		

		driver.findElement(Clickonmenu).click();
		Thread.sleep(2000);
	}

	// Click on RoomService
	By ClickonRoomService = By.xpath("//p[contains(text(),'Room Service')]");

	public void uClickonRoomService() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonRoomService));

		driver.findElement(ClickonRoomService).click();
		Thread.sleep(3000);
	}

	// Click on Plus icon
	By RoomServiceclickonPlus = By.xpath("(//*[@title=\"Start New Order\"])[1]");

	public void uRoomServiceclickonPlus() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickonPlus));

		

		driver.findElement(RoomServiceclickonPlus).click();
		Thread.sleep(2000);
	}

	// Click on Save button
	By RoomServiceclickonSaveButton = By.xpath("//span[contains(text(),'Save')]");

	public void uRoomServiceclickonSaveButton() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickonSaveButton));

		

		driver.findElement(RoomServiceclickonSaveButton).click();
		Thread.sleep(2000);
	}

	// Click on Item
	By RoomServiceclickonItem = By.xpath("//button[@title='Double Falooda Single Glass']//img");


	public void uRoomServiceclickonItem() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickonItem));

		

		driver.findElement(RoomServiceclickonItem).click();
		Thread.sleep(2000);
	}

	// Click on Save button on Order
	By RoomServiceclickOnSave = By.xpath("//p[contains(text(),'Save')]");

	public void uRoomServiceRoomServiceclickOnSave() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnSave));

		

		driver.findElement(RoomServiceclickOnSave).click();
		Thread.sleep(2000);
	}

	// Click on Table section
	By  RoomServiceclickonTable = By.xpath("/html/body/ion-app/ng-component/ion-nav/page-room-service/ion-content/div[2]/ion-grid[2]/ion-row/ion-col[1]/ion-card/ion-card-content/div/div[1]/ion-col[1]");
	// (//*[@class=\"room-number txtline-clap1\"])[1]

	public void uRoomServiceclickonTable() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickonTable));

		

		driver.findElement(RoomServiceclickonTable).click();
		Thread.sleep(2000);
	}

	// Click on Recall button
	By RoomServiceclickOnRecall = By.xpath("//*[@id=\"tableRoomAction\"]/div/ion-content/div[2]/table-action/ion-card/ion-card-content/div[1]/order-detail-header/ion-card-header/button[3]");

	public void uRoomServiceclickOnRecall() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnRecall));

		

		driver.findElement(RoomServiceclickOnRecall).click();
		Thread.sleep(2000);
	}

	// Click on Increase QTY of Item
	By RoomServiceclickOnQTYPlus = By.xpath("(//*[@class=\"iconBtn qty-btn button button-md button-default button-default-md ng-star-inserted\"])[1]");

	public void uRoomServiceclickOnQTYPlus() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnQTYPlus));

		

		driver.findElement(RoomServiceclickOnQTYPlus).click();
		Thread.sleep(2000);
	}

	// Click on - decreased icon 
	By RoomServiceclickOnDecereasedQTY = By.xpath("(//*[@class=\"iconBtn qty-btn button button-md button-default button-default-md ng-star-inserted\"])[1]");

	public void uRoomServiceclickOnDecereasedQTY() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnDecereasedQTY));

		

		driver.findElement(RoomServiceclickOnDecereasedQTY).click();
		Thread.sleep(2000);
	}

	// Click on void Option
	By RoomServiceclickOnVoid = By.xpath("(//*[@class=\"row-content row\"])[2]");

	public void uRoomServiceclickOnVoid() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnVoid));

		

		driver.findElement(RoomServiceclickOnVoid).click();
		Thread.sleep(2000);
	}

	// Clicks on Select reason
	By RoomServiceClickOnReasons = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted virtual-position\"])[2]");

	public void uRoomServiceClickOnReasons() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceClickOnReasons));

		

		driver.findElement(RoomServiceClickOnReasons).click();
		Thread.sleep(2000);
	}

	// Add first Item
	By RoomServiceaddFirstItem = By.xpath("//*[@title=\"Double Falooda Single Glass\"]");

	public void uRoomServiceaddFirstItem() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceaddFirstItem));

		

		driver.findElement(RoomServiceaddFirstItem).click();
		Thread.sleep(2000);
	}

	// Add Second Item
	By RoomServiceaddSecondItem = By.xpath("//*[@title=\"Special Falooda\"]");

	public void uRoomServiceaddSecondItem() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceaddSecondItem));

		

		driver.findElement(RoomServiceaddSecondItem).click();
		Thread.sleep(2000);
	}

	// Add Item
	By RoomServiceaddItem = By.xpath("(//*[@class=\"food-item-block col col-5-layout ng-star-inserted\"])[3]");

	public void uRoomServiceaddItem() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceaddItem));

		

		driver.findElement(RoomServiceaddItem).click();
		Thread.sleep(2000);
	}

	// Add Modifier Item
	By RoomServiceaddModifierItem = By.xpath("(//*[@class=\"food-item-block col ng-star-inserted\"])[3]");

	public void uRoomServiceaddModifierItem() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceaddModifierItem));

		

		driver.findElement(RoomServiceaddModifierItem).click();
		Thread.sleep(2000);
	}

	// Click on Save Button On Modifier
	By RoomServiceSaveButtonOnModifier = By.xpath("//span[contains(text(),'Save')]");

	public void uRoomServiceSaveButtonOnModifier() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceSaveButtonOnModifier));

		

		driver.findElement(RoomServiceSaveButtonOnModifier).click();
		Thread.sleep(2000);
	}

	// Increase the QTY of first item
	By RoomServiceFirstItemIncrease = By.xpath("(//*[@class=\"iconBtn qty-btn button button-md button-default button-default-md ng-star-inserted\"])[2]");

	public void uRoomServiceFirstItemIncrease() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceFirstItemIncrease));

		

		driver.findElement(RoomServiceFirstItemIncrease).click();
		Thread.sleep(2000);
	}

	// Increase the QTY of Second item
	By RoomServiceSecondItemIncrease = By.xpath("(//*[@class=\"iconBtn qty-btn button button-md button-default button-default-md ng-star-inserted\"])[4]");

	public void uRoomServiceSecondItemIncrease() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceSecondItemIncrease));

		

		driver.findElement(RoomServiceSecondItemIncrease).click();
		Thread.sleep(2000);
	}

	// Increase the QTY of Third item
	By RoomServiceThirdItemIncrease = By.xpath("(//*[@class=\"iconBtn qty-btn button button-md button-default button-default-md ng-star-inserted\"])[6]");

	public void uRoomServiceThirdItemIncrease() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceThirdItemIncrease));

		

		driver.findElement(RoomServiceThirdItemIncrease).click();
		Thread.sleep(2000);
	}

	// Click on Remove button on Item
	By RoomServiceclickOnVoidItem = By.xpath("(//*[@class=\"deleteItem button button-md button-default button-default-md ng-star-inserted\"])[1]");

	public void uRoomServiceclickOnVoidItem() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnVoidItem));

		
		driver.findElement(RoomServiceclickOnVoidItem).click();
		Thread.sleep(2000);
	}


	// ========================> Test case for void modifier item in Item <======================	

	// Click on Modifier Item in order
	By RoomServiceclickOnItem = By.xpath("(//*[@title=\"Double Special Falooda+ SeperateKulfi\"])[4]");

	// Click on Modifier Section in item
	By RoomServiceclickOnModifier = By.xpath("//p[contains(text(),'Modifiers')]");

	// Click on remove icon on Modifier item
	By RoomServiceclickOnRemoveOnModifier = By.xpath("(//*[@class=\"secondary-btn no-border item-button button button-md button-default button-default-md\"])[1]");

	// Click on Cancel icon in item popup
	By RoomServiceclickOnCancelinItemPopup = By.xpath("/html/body/ion-app/ion-modal/div/ordered-item-information/ion-header/ion-toolbar/div[2]/div[3]/ion-buttons");

	public void uRoomServiceclickOnItem() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnItem));

		

		driver.findElement(RoomServiceclickOnItem).click();
		Thread.sleep(2000);
	}

	public void uRoomServiceclickOnModifier() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnModifier));

		

		driver.findElement(RoomServiceclickOnModifier).click();
		Thread.sleep(2000);
	}

	public void uRoomServiceclickOnRemoveOnModifier() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnRemoveOnModifier));

		

		driver.findElement(RoomServiceclickOnRemoveOnModifier).click();
		Thread.sleep(2000);
	}

	public void uRoomServiceclickOnCancelinItemPopup() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnCancelinItemPopup));

		

		driver.findElement(RoomServiceclickOnCancelinItemPopup).click();
		Thread.sleep(2000);
	}


	// Click on OK button in validation popup
	By RoomServiceclickonOKButton = By.xpath("/html/body/ion-app/ion-modal/div/alert-modal/ion-card/ion-footer/ion-buttons");

	public void uRoomServiceclickonOKButton() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickonOKButton));

		

		driver.findElement(RoomServiceclickonOKButton).click();
		Thread.sleep(2000);
	}

	// Click on Void/Remove button on order
	By RoomServiceclickonVoidButton = By.xpath("//ion-icon[@name='custom-delete']");

	public void uRoomServiceclickonVoidButton() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickonVoidButton));

		

		driver.findElement(RoomServiceclickonVoidButton).click();
		Thread.sleep(2000);
	}

	// Click on First item for void
	By RoomServiceclickonFirstItem = By.xpath("(//*[@class=\"deleteItem button button-md button-default button-default-md ng-star-inserted\"])[1]");

	public void uRoomServiceclickonFirstItem() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickonFirstItem));

		

		driver.findElement(RoomServiceclickonFirstItem).click();
		Thread.sleep(2000);
	}

	// ===================> Void Multiple Orders  <============================

	// Click on Plus icon in order section
	By RoomServiceclickonPlusIcon = By.xpath("(//*[@class=\"button secondary-btn vertical-btn button-md button-default button-default-md ng-star-inserted\"])[1]");

	public void uRoomServiceclickonPlusIcon() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickonPlusIcon));

		

		driver.findElement(RoomServiceclickonPlusIcon).click();
		Thread.sleep(2000);
	}

	// Click on Select All order checkbox
	By RoomServiceclickOnSelectAll = By.xpath("(//*[@class=\"checkbox checkbox-md checkbox-md-primary ng-untouched ng-pristine ng-valid\"])[1]");

	public void uRoomServiceclickOnSelectAll() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnSelectAll));

		

		driver.findElement(RoomServiceclickOnSelectAll).click();
		Thread.sleep(2000);
	}

	// Click on Select All order checkbox
	By RoomServiceclickOnSelectAll1 = By.xpath("//*[@id=\"tableRoomAction\"]/div/ion-content/div[2]/table-action/ion-row/ion-col[1]/ion-checkbox");

	public void uRoomServiceclickOnSelectAll1() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnSelectAll1));

		

		driver.findElement(RoomServiceclickOnSelectAll1).click();
		Thread.sleep(2000);
	}

	// Click on Void button
	By RoomServiceclickonDeleteButton = By.xpath("//ion-icon[@name='custom-delete']"); 

	public void uRoomServiceclickonDeleteButton() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));

		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickonDeleteButton));

		

		driver.findElement(RoomServiceclickonDeleteButton).click();
		Thread.sleep(2000);
	}

	//======================> Settle Order <====================================

	// Click on Post & Finish button
	By RoomServiceclickOnPostAndFinishButton = By.xpath("//*[contains(text(),'Post & Finish')]");

	public void uRoomServiceclickOnPostAndFinishButton() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnPostAndFinishButton));

		

		driver.findElement(RoomServiceclickOnPostAndFinishButton).click();
		Thread.sleep(2000);
	}

	// Click on Settle button
	By RoomServiceclickonSettleButton = By.xpath("//p[contains(text(),'Settle')]");

	public void uRoomServiceclickonSettleButton() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickonSettleButton));

//		wait.until(ExpectedConditions.elementToBeClickable(RoomServiceclickonSettleButton));

		driver.findElement(RoomServiceclickonSettleButton).click();
		Thread.sleep(2000);
	}

	// Click on Pay button
	By RoomServiceclickonPayButton = By.xpath("/html/body/ion-app/ion-modal/div/settlement/form/ion-footer/ion-grid/ion-row/ion-col[2]/ion-buttons/button");

	public void uRoomServiceclickonPayButton() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickonPayButton));

//		wait.until(ExpectedConditions.elementToBeClickable(RoomServiceclickonPayButton));

		driver.findElement(RoomServiceclickonPayButton).click();
		Thread.sleep(2000);
	}

	// Click on OK button in Changes Duo popup
	By RoomServiceclickOnOKButton = By.xpath("//*[@class=\"primary-btn button button-md button-default button-default-md ng-star-inserted\"]");

	public void uRoomServiceclickOnOKButton() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnOKButton));

	//	wait.until(ExpectedConditions.elementToBeClickable(RoomServiceclickOnOKButton));

		driver.findElement(RoomServiceclickOnOKButton).click();
		Thread.sleep(2000);
	}

	// Click on Bank option in settle
	By RoomServiceclickOnBank = By.xpath("//p[contains(text(),'Bank')]");

	public void uRoomServiceclickOnBank() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnBank));

	//	wait.until(ExpectedConditions.elementToBeClickable(RoomServiceclickOnBank));

		driver.findElement(RoomServiceclickOnBank).click();
		Thread.sleep(2000);
	}

	// Select bank pay option
	By RoomServiceselectBankPayoption = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted virtual-position\"])[5]");

	public void uRoomServiceselectBankPayoption() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceselectBankPayoption));

	//	wait.until(ExpectedConditions.elementToBeClickable(RoomServiceselectBankPayoption));

		driver.findElement(RoomServiceselectBankPayoption).click();
		Thread.sleep(2000);
	}

	// Click on Cash option in settle
	By RoomServiceclickOnCash = By.xpath("//p[contains(text(),'Cash')]");

	public void uRoomServiceclickOnCash() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnCash));

		driver.findElement(RoomServiceclickOnCash).click();
		Thread.sleep(2000);
	}

	// Select Cash pay option
	By RoomServiceselectCashPayoption = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted virtual-position\"])[1]");

	public void uRoomServiceselectCashPayoption() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceselectCashPayoption));

		driver.findElement(RoomServiceselectCashPayoption).click();
		Thread.sleep(2000);
	}

	// Click on Apply Button
	By RoomServiceclickOnApplyButton = By.xpath("//span[contains(text(),'Apply')]");

	public void uRoomServiceclickOnApplyButton() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnApplyButton));

		driver.findElement(RoomServiceclickOnApplyButton).click();
		Thread.sleep(2000);
	}

	// Select Bank pay option with Surcharge
	By RoomServiceselectBankPayoptionwithSurcharge = By.xpath("//*[@aria-posinset=\"1\"]");

	public void uRoomServiceselectBankPayoptionwithSurcharge() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceselectBankPayoptionwithSurcharge));

		driver.findElement(RoomServiceselectBankPayoptionwithSurcharge).click();
		Thread.sleep(2000);
	}

	// Click on Apply Button
	By RoomServiceclickCreditSection = By.xpath("//p[contains(text(),'Credit')]");

	public void uRoomServiceclickCreditSection() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickCreditSection));

		driver.findElement(RoomServiceclickCreditSection).click();
		Thread.sleep(2000);
	}

	// Select Bank pay option with Surcharge
	By RoomServiceselectCreditoption = By.xpath("/html/body/ion-app/ion-modal[2]/div/eo-selectable/form/ion-content/div[2]/ion-list/div[2]/ion-item[7]");

	public void uRoomServiceselectCreditoption() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceselectBankPayoptionwithSurcharge));

		driver.findElement(RoomServiceselectBankPayoptionwithSurcharge).click();
		Thread.sleep(2000);
	}

	// Select Bank pay option with Surcharge
	By RoomServiceCreditConfrimOption = By.xpath("(//*[@class=\"primary-button button button-md button-outline button-outline-md button-outline-md-primary\"])[1]");

	public void uRoomServiceCreditConfrimOption() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceCreditConfrimOption));

		driver.findElement(RoomServiceCreditConfrimOption).click();
		Thread.sleep(2000);
	}

	// Click on Save button in Order information popup
	By RoomServiceclickSaveButton = By.xpath("//span[contains(text(),'Save')]");

	public void uRoomServiceclickSaveButton() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickSaveButton));

		driver.findElement(RoomServiceclickSaveButton).click();
		Thread.sleep(2000);
	}

	// Click on "1" in Payment Process
	By RoomServiceclickOn1 = By.xpath("(//*[@class=\"secondary-btn button button-md button-default button-default-md\"])[8]");

	public void uRoomServiceclickOn1() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOn1));

		driver.findElement(RoomServiceclickOn1).click();
		Thread.sleep(2000);
	}

	// Click on "00" in Payment Process
	By RoomServiceclickOn00 = By.xpath("(//*[@class=\"secondary-btn button button-md button-default button-default-md\"])[11]");

	public void uRoomServiceclickOn00() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOn00));

		driver.findElement(RoomServiceclickOn00).click();
		Thread.sleep(2000);
	}

	// Click on Pay in Payment Process
	By RoomServiceclickOnPayinSettle = By.xpath("//*[@class=\"primary-btn button button-md button-default button-default-md ng-star-inserted\"]");

	public void uRoomServiceclickOnPayinSettle() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnPayinSettle));

		driver.findElement(RoomServiceclickOnPayinSettle).click();
		Thread.sleep(2000);
	}


	// Click on "Save" button in Payment Process
	By RoomServiceclickOnSaveinSettle = By.xpath("//*[@class=\"primary-btn save-btn button button-md button-default button-default-md ng-star-inserted\"]");

	public void uRoomServiceclickOnSaveinSettle() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnSaveinSettle));

		driver.findElement(RoomServiceclickOnSaveinSettle).click();
		Thread.sleep(2000);
	}

	// Click on Currecny in Payment Process
	By RoomServiceclickOnCurrecny = By.xpath("//*[@id=\"selectedCurr\"]");

	public void uRoomServiceclickOnCurrecny() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnCurrecny));

		driver.findElement(RoomServiceclickOnCurrecny).click();
		Thread.sleep(2000);
	}

	// Select Currency option in Payment Process
	By RoomServiceclickOnCurrecnyOption = By.xpath("//*[@aria-posinset=\"1\"]");

	public void uRoomServiceclickOnCurrecnyOption() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnCurrecnyOption));

		driver.findElement(RoomServiceclickOnCurrecnyOption).click();
		Thread.sleep(2000);
	}

	// ===========> Insufficient Credit popup <=====================

	// Select Credit account which has not sufficient balance
	By RoomServiceselectCreditAccount = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted virtual-position\"])[5]");

	public void uRoomServiceselectCreditAccount() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceselectCreditAccount));

		driver.findElement(RoomServiceselectCreditAccount).click();
		Thread.sleep(2000);
	}

	// Click on Continue Button
	By RoomServiceclickOnContinue = By.xpath("//span[contains(text(),'Continue')]");

	public void uRoomServiceclickOnContinue() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnContinue));

		driver.findElement(RoomServiceclickOnContinue).click();
		Thread.sleep(2000);
	}

	// Click on No Button
	By RoomServiceclickOnNoButton = By.xpath("//span[contains(text(),'NO')])[2]");

	public void uRoomServiceclickOnNoButton() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnNoButton));

		driver.findElement(RoomServiceclickOnNoButton).click();
		Thread.sleep(2000);
	}

	// ==============> Payment Summary  <==============================

	// Click on Payment Process
	By RoomServiceclickOnPaymentProcess = By.xpath("//span[contains(text(),'Payment Summary')]");

	public void uRoomServiceclickOnPaymentProcess() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnPaymentProcess));

		driver.findElement(RoomServiceclickOnPaymentProcess).click();
		Thread.sleep(2000);
	}

	// Click on Void Button
	By RoomServiceclickOnVoidButton = By.xpath("//*[@id=\"tableRoomAction\"]/div/ion-content/div[2]/table-action/ion-footer/ion-buttons/button[8]");
	//(//*[@class=\"button button-md button-clear button-clear-md\"])[1]

	public void uRoomServiceclickOnVoidButton() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnVoidButton));

		driver.findElement(RoomServiceclickOnVoidButton).click();
		Thread.sleep(2000);
	}

	// Click on Save Button
	By RoomServiceclickOnSaveButtoninPaymentProcess = By.xpath("//span[contains(text(),'Save')]");

	public void uRoomServiceclickOnSaveButtoninPaymentProcess() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnSaveButtoninPaymentProcess));

		driver.findElement(RoomServiceclickOnSaveButtoninPaymentProcess).click();
		Thread.sleep(2000);
	}

	// ================> Item QTY & Quantity popup <==============================

	// Click on QTY section on item
	By RoomServiceclickonQTY = By.xpath("(//span[contains(text(),'1')])[3]");

	public void uRoomServiceclickonQTY() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickonQTY));

		driver.findElement(RoomServiceclickonQTY).click();
		Thread.sleep(2000);
	}

	// Click on "2" number
	By RoomServiceclickon2 = By.xpath("//span[contains(text(),'2')]");

	public void uRoomServiceclickon2() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickon2));

		driver.findElement(RoomServiceclickon2).click();
		Thread.sleep(2000);
	}

	// Click on "0" number
	By RoomServiceclickon0 = By.xpath("//span[contains(text(),'0')]");

	public void uRoomServiceclickon0() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickon0));

		driver.findElement(RoomServiceclickon0).click();
		Thread.sleep(2000);
	}

	// Click on Enter
	By RoomServiceclickonEnter = By.xpath("//*[@class=\"primary-btn button button-md button-default button-default-md\"]");

	public void uRoomServiceclickonEnter() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickonEnter));

		driver.findElement(RoomServiceclickonEnter).click();
		Thread.sleep(2000);
	}

	// ================> Confirm popup on Credit Settle  <=========================

	// Click on Update Guest information with posted
	By RoomServiceUpdateGuestInformation = By.xpath("(//*[@class=\"primary-button button button-md button-outline button-outline-md button-outline-md-primary\"])[1]");

	public void uRoomServiceUpdateGuestInformation() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceUpdateGuestInformation));

		driver.findElement(RoomServiceUpdateGuestInformation).click();
		Thread.sleep(2000);
	}

	// Click on Proceed with Posting
	By RoomServiceclickOnProceedwithPosting = By.xpath("(//*[@class=\"primary-button button button-md button-outline button-outline-md button-outline-md-primary\"])[2]");

	public void uRoomServiceclickOnProceedwithPosting() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnProceedwithPosting));

		driver.findElement(RoomServiceclickOnProceedwithPosting).click();
		Thread.sleep(2000);
	}

	// Click on Cancel button
	By RoomServiceclickonCancelButton = By.xpath("//*[@class=\"secondary-act-btn button button-md button-default button-default-md ng-star-inserted\"]");

	public void uRoomServiceclickonCancelButton() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickonCancelButton));

		driver.findElement(RoomServiceclickonCancelButton).click();
		Thread.sleep(2000);
	}

	// ===================> Room Posting <==========================

	// Click on Posting Pay in settle
	By RoomServiceclickonPosting = By.xpath("//p[contains(text(),'Posting')]");

	public void uRoomServiceclickonPosting() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickonPosting));

		driver.findElement(RoomServiceclickonPosting).click();
		Thread.sleep(2000);
	}

	// Select Posting Pay method
	By RoomServiceselectPostingPay = By.xpath("(//*[@class=\"button button-md button-default button-default-md button-md-light\"])[1]");

	public void uRoomServiceselectPostingPay() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceselectPostingPay));

		driver.findElement(RoomServiceselectPostingPay).click();
		Thread.sleep(2000);
	}

	// Click on Yes button in confirm popup
	By RoomServiceclickOnYes = By.xpath("//span[contains(text(),'Yes')]");

	public void uRoomServiceclickOnYes() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnYes));

		driver.findElement(RoomServiceclickOnYes).click();
		Thread.sleep(2000);
	}

	// ====================> Extra Charge  <===================================

	// Click on Extra Charge popup
	By RoomServiceclickOnExtraCharge = By.xpath("//p[contains(text(),'Extra Charge')]");

	public void uRoomServiceclickOnExtraCharge() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnExtraCharge));

		driver.findElement(RoomServiceclickOnExtraCharge).click();
		Thread.sleep(2000);
	}

	// Select Extra Charge in extra charge popup 
	By RoomServiceselectExtraCharge = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted virtual-position\"])[1]");

	public void uRoomServiceselectExtraCharge() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceselectExtraCharge));

		driver.findElement(RoomServiceselectExtraCharge).click();
		Thread.sleep(2000);
	}


	// Click on Extra Charge icon in order amount summary
	By RoomServiceclickOnExtraChargeicon = By.xpath("/html/body/ion-app/ng-component/ion-nav/page-orderscreen/ion-content/div[2]/ion-grid/ion-row/ion-col[2]/order-detail/ion-card/ion-card-content/order-detail-footer/div[1]/div[6]/p[1]/ion-icon");

	public void uRoomServiceclickOnExtraChargeicon() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnExtraChargeicon));

		driver.findElement(RoomServiceclickOnExtraChargeicon).click();
		Thread.sleep(2000);
	}

	// Click on Void button in Extra charge popup
	By RoomServiceclickOnVoidButtoninExtraChargeicon = By.xpath("(//*[@class=\"item-button button button-md button-clear button-clear-md\"])[1]");

	public void uRoomServiceclickOnVoidButtoninExtraChargeicon() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnVoidButtoninExtraChargeicon));

		driver.findElement(RoomServiceclickOnVoidButtoninExtraChargeicon).click();
		Thread.sleep(2000);
	}

	// Click on Void button in Extra charge popup
	By RoomServiceclickOnVoidButtonin2ExtraChargeicon = By.xpath("(//*[@class=\"item-button button button-md button-clear button-clear-md\"])[2]");

	public void uRoomServiceclickOnVoidButtonin2ExtraChargeicon() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnVoidButtonin2ExtraChargeicon));

		driver.findElement(RoomServiceclickOnVoidButtonin2ExtraChargeicon).click();
		Thread.sleep(2000);
	}

	// Click on Delete button in Extra charge popup
	By RoomServiceclickOnDeleteButtoninExtraChargeicon = By.xpath("//span[contains(text(),'Delete')]");

	public void uRoomServiceclickOnDeleteButtoninExtraChargeicon() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnDeleteButtoninExtraChargeicon));

		driver.findElement(RoomServiceclickOnDeleteButtoninExtraChargeicon).click();
		Thread.sleep(2000);
	}

	// Click on Delete button in Extra charge popup
	By RoomServiceselectReasonInExtraCharge = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted virtual-position\"])[1]");

	public void uRoomServiceselectReasonInExtraCharge() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceselectReasonInExtraCharge));

		driver.findElement(RoomServiceselectReasonInExtraCharge).click();
		Thread.sleep(2000);
	}

	// Click on Delete button in Extra charge popup
	By RoomServiceclickOnCancelInExtrachargepopup = By.xpath("(//*[@class=\"bar-button bar-button-md bar-button-default bar-button-default-md\"])[5]");

	public void uRoomServiceclickOnCancelInExtrachargepopup() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnCancelInExtrachargepopup));

		driver.findElement(RoomServiceclickOnCancelInExtrachargepopup).click();
		Thread.sleep(2000);
	}

	// Click on OK button in Warning popup
	By RoomServiceclickOnOKButtoninWarningPopup = By.xpath("//span[contains(text(),'OK')]");

	public void uRoomServiceclickOnOKButtoninWarningPopup() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnOKButtoninWarningPopup));

		driver.findElement(RoomServiceclickOnOKButtoninWarningPopup).click();
		Thread.sleep(2000);
	}

	// ====================> Discounts  <===================================

	// Click on Discount button in order
	By RoomServiceclickOnDiscountButton = By.xpath("//p[contains(text(),'Discount')]");

	public void uRoomServiceclickOnDiscountButton() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnDiscountButton));

		driver.findElement(RoomServiceclickOnDiscountButton).click();
		Thread.sleep(2000);
	}

	// Select Discount in order popup
	By RoomServiceselectDiscountonBaseAmount = By.xpath("//*[@aria-posinset=\"7\"]");

	public void uRoomServiceselectDiscountonBaseAmount() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceselectDiscountonBaseAmount));

		driver.findElement(RoomServiceselectDiscountonBaseAmount).click();
		Thread.sleep(2000);
	}

	// Select Discount in order popup
	By RoomServiceselectDiscountonFinalAmount = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted virtual-position\"])[2]");

	public void uRoomServiceselectDiscountonFinalAmount() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceselectDiscountonFinalAmount));

		driver.findElement(RoomServiceselectDiscountonFinalAmount).click();
		Thread.sleep(2000);
	}

	// Click on Discount button in item
	By RoomServiceclickOnDiscountButtoninItem = By.xpath("(//p[contains(text(),'Discount')])[5]");

	public void uRoomServiceclickOnDiscountButtoninItem() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnDiscountButtoninItem));

		driver.findElement(RoomServiceclickOnDiscountButtoninItem).click();
		Thread.sleep(2000);
	}

	// Select Item Discount
	By RoomServiceselectItemDiscount = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted virtual-position\"])[10]");

	public void uRoomServiceselectItemDiscount() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceselectItemDiscount));

		driver.findElement(RoomServiceselectItemDiscount).click();
		Thread.sleep(2000);
	}

	// Cancel icon on item popup
	By RoomServicecancelonItem = By.xpath("//*[@class=\"bar-button bar-button-md bar-button-default bar-button-default-md bar-button-md-light\"]");

	public void uRoomServicecancelonItem() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServicecancelonItem));

		driver.findElement(RoomServicecancelonItem).click();
		Thread.sleep(2000);
	}

	// Cancel icon on item popup
	By RoomServiceItem = By.xpath("(//*[@class=\"item-name txt-ellipsis\"])[1]");

	public void uRoomServiceItem() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceItem));

		driver.findElement(RoomServiceItem).click();
		Thread.sleep(2000);
	}

	// Select Second Item Discount
	By RoomServiceselect2ItemDiscount = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted virtual-position\"])[3]");

	public void uRoomServiceselect2ItemDiscount() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceselect2ItemDiscount));

		driver.findElement(RoomServiceselect2ItemDiscount).click();
		Thread.sleep(2000);
	}

	// Click on Order icon in amount summary
	By RoomServiceclickOnOrderIcon = By.xpath("//p[contains(text(),'Order Discount')]");

	public void uRoomServiceclickOnOrderIcon() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnOrderIcon));

		driver.findElement(RoomServiceclickOnOrderIcon).click();
		Thread.sleep(2000);
	}

	// Click on void icon in Order discount 
	By RoomServiceclickOnVoidOrder = By.xpath("(//*[@class=\"button button-md button-clear button-clear-md\"])[2]");

	public void uRoomServiceclickOnVoidOrder() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnVoidOrder));

		driver.findElement(RoomServiceclickOnVoidOrder).click();
		Thread.sleep(2000);
	}

	// Click on void button in Order discount 
	By RoomServiceclickOnVoidOrderbutton = By.xpath("//span[contains(text(),'Void')]");

	public void uRoomServiceclickOnVoidOrderbutton() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnVoidOrderbutton));

		driver.findElement(RoomServiceclickOnVoidOrderbutton).click();
		Thread.sleep(2000);
	}

	// Click on Cancel in Order Discount in popup
	By RoomServiceclickOnCancelinOrderpopup = By.xpath("(//*[@class=\"bar-button bar-button-md bar-button-default bar-button-default-md\"])[5]");

	public void uRoomServiceclickOnCancelinOrderpopup() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnCancelinOrderpopup));

		driver.findElement(RoomServiceclickOnCancelinOrderpopup).click();
		Thread.sleep(2000);
	}

	// Click on Void icon in Item popup
	By RoomServiceclickOnVoidinItempopup = By.xpath("(//i[contains(text(),'delete')])[3]");

	public void uRoomServiceclickOnVoidinItempopup() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnVoidinItempopup));

		driver.findElement(RoomServiceclickOnVoidinItempopup).click();
		Thread.sleep(2000);
	}

	// Click on Void button in Item popup
	By RoomServiceclickOnVoidButtoninItempopup = By.xpath("//span[contains(text(),'Void')]");

	public void uRoomServiceclickOnVoidButtoninItempopup() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnVoidButtoninItempopup));

		driver.findElement(RoomServiceclickOnVoidButtoninItempopup).click();
		Thread.sleep(2000);
	}

	// Click on Add open discount
	By RoomServiceAddOpenOrderDiscount = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted virtual-position\"])[6]");

	public void uRoomServiceAddOpenOrderDiscount() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceAddOpenOrderDiscount));

		driver.findElement(RoomServiceAddOpenOrderDiscount).click();
		Thread.sleep(2000);
	}

	// Click on 2 button in Open discount popup
	By RoomServiceClick2inOpenOrderDiscount = By.xpath("(//*[@class=\"secondary-btn button button-md button-default button-default-md\"])[10]");

	public void uRoomServiceClick2inOpenOrderDiscount() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceClick2inOpenOrderDiscount));

		driver.findElement(RoomServiceClick2inOpenOrderDiscount).click();
		Thread.sleep(2000);
	}

	// Click on 0 button in open discount popup
	By RoomServiceClick0inOpenOrderDiscount = By.xpath("(//*[@class=\"secondary-btn button button-md button-default button-default-md\"])[14]");

	public void uRoomServiceClick0inOpenOrderDiscount() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceClick0inOpenOrderDiscount));

		driver.findElement(RoomServiceClick0inOpenOrderDiscount).click();
		Thread.sleep(2000);
	}

	// Click on Add open item discount
	By RoomServiceAddOpenItemDiscount = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted virtual-position\"])[7]");

	public void uRoomServiceAddOpenItemDiscount() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceAddOpenItemDiscount));

		driver.findElement(RoomServiceAddOpenItemDiscount).click();
		Thread.sleep(2000);
	}

	// Click on 2 in item open discount
	By RoomServiceClick2inOpenItemDiscount = By.xpath("(//*[@class=\"secondary-btn button button-md button-default button-default-md\"])[10]");

	public void uRoomServiceClick2inOpenItemDiscount() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceClick2inOpenItemDiscount));

		driver.findElement(RoomServiceClick2inOpenItemDiscount).click();
		Thread.sleep(2000);
	}

	// Click on 0 in item discount
	By RoomServiceClick0inOpenItemDiscount = By.xpath("(//*[@class=\"secondary-btn button button-md button-default button-default-md\"])[14]");

	public void uRoomServiceClick0inOpenItemDiscount() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceClick0inOpenItemDiscount));

		driver.findElement(RoomServiceClick0inOpenItemDiscount).click();
		Thread.sleep(2000);
	}

	// Click on Enter in open order discount
	By RoomServiceClickEnterinOpenOrderDiscount = By.xpath("(//*[@class=\"primary-btn button button-md button-default button-default-md\"])[1]");

	public void RoomServiceClickEnterinOpenOrderDiscount() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceClickEnterinOpenOrderDiscount));

		driver.findElement(RoomServiceClickEnterinOpenOrderDiscount).click();
		Thread.sleep(2000);
	}

	// Apply 100 % Item discount
	By RoomServiceApply100ItemDiscount = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted virtual-position\"])[8]");

	public void uRoomServiceApply100ItemDiscount() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceApply100ItemDiscount));

		driver.findElement(RoomServiceApply100ItemDiscount).click();
		Thread.sleep(2000);
	}

	// Click on "1" in Open Discount
	By RoomServiceClick1ItemDiscount = By.xpath("(//*[@class=\"secondary-btn button button-md button-default button-default-md\"])[9]");

	public void uRoomServiceClick1ItemDiscount() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceClick1ItemDiscount));

		driver.findElement(RoomServiceClick1ItemDiscount).click();
		Thread.sleep(2000);
	}

	// Click on "00" in Open Discount
	By RoomServiceClick00ItemDiscount = By.xpath("(//*[@class=\"secondary-btn button button-md button-default button-default-md\"])[15]");

	public void uRoomServiceClick00ItemDiscount() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceClick00ItemDiscount));

		driver.findElement(RoomServiceClick00ItemDiscount).click();
		Thread.sleep(2000);
	}

	// Apply 100 % Order discount
	By RoomServiceApply100OrderDiscount = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted virtual-position\"])[6]");

	public void uRoomServiceApply100OrderDiscount() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceApply100OrderDiscount));

		driver.findElement(RoomServiceApply100OrderDiscount).click();
		Thread.sleep(2000);
	}

	// Click on "1" in Open Discount
	By RoomServiceClick1OrderDiscount = By.xpath("(//*[@class=\"secondary-btn button button-md button-default button-default-md\"])[9]");

	public void uRoomServiceClick1OrderDiscount() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceClick1OrderDiscount));

		driver.findElement(RoomServiceClick1OrderDiscount).click();
		Thread.sleep(2000);
	}

	// Click on "00" in Open Discount
	By RoomServiceClick00OrderDiscount = By.xpath("(//*[@class=\"secondary-btn button button-md button-default button-default-md\"])[15]");

	public void uRoomServiceClick00OrderDiscount() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceClick00OrderDiscount));

		driver.findElement(RoomServiceClick00OrderDiscount).click();
		Thread.sleep(2000);
	}

	// Click on "Yes" button in confirm popup after apply 100% item discount on item and save it
	By RoomServiceClickYesButtoninConfirmPopup = By.xpath("(//*[@class=\"primary-btn button button-md button-default button-default-md ng-star-inserted\"])[1]");

	public void uRoomServiceClickYesButtoninConfirmPopup() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceClickYesButtoninConfirmPopup));

		driver.findElement(RoomServiceClickYesButtoninConfirmPopup).click();
		Thread.sleep(2000);
	}

	// Click on "Overwrite" button in Discount Summary popup 
	By RoomServiceClickOverwriteButton = By.xpath("//span[contains(text(),'Overwrite')]");

	public void uRoomServiceClickOverwriteButton() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceClickOverwriteButton));

		driver.findElement(RoomServiceClickOverwriteButton).click();
		Thread.sleep(2000);
	}

	// Click on item which has modifier
	By RoomServiceClickitemWithMOd = By.xpath("(//*[@class=\"item-name txt-ellipsis\"])[3]");

	public void uRoomServiceClickitemWithMOd() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceClickitemWithMOd));

		driver.findElement(RoomServiceClickitemWithMOd).click();
		Thread.sleep(2000);
	}

	// Add modifier item
	By RoomServiceAddModifierItems = By.xpath("(//*[@class=\"food-item-block col col-5-layout ng-star-inserted\"])[3]");

	public void uRoomServiceAddModifierItems() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceAddModifierItems));

		driver.findElement(RoomServiceAddModifierItems).click();
		Thread.sleep(2000);
	}

	// Click on modifier item for add discount
	By RoomServiceClickonModifierItem = By.xpath("(//*[@class=\"item-name txt-ellipsis\"])[5]");

	public void uRoomServiceClickonModifierItem() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceClickonModifierItem));

		driver.findElement(RoomServiceClickonModifierItem).click();
		Thread.sleep(2000);
	}

	// Click on discount section in modifier item for add discount
	By RoomServiceClickonDiscountSection = By.xpath("(//*[@class=\"button secondary-btn vertical-btn button-md button-default button-default-md button-md-light ng-star-inserted\"])[3]");

	public void uRoomServiceClickonDiscountSection() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceClickonDiscountSection));

		driver.findElement(RoomServiceClickonDiscountSection).click();
		Thread.sleep(2000);
	}

	//==================> SPLIT THE ORDER  <=============================================

	// Click on split section
	By RoomServiceClickonSplitSection = By.xpath("//*[@id=\"tableRoomAction\"]/div/ion-content/div[2]/table-action/ion-footer/ion-buttons/button[5]");

	public void uRoomServiceClickonSplitSection() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceClickonSplitSection));

		driver.findElement(RoomServiceClickonSplitSection).click();
		Thread.sleep(2000);
	}

	// Click on split button
	By RoomServiceClickonSplitButton = By.xpath("(//*[@class=\"primary-btn button button-md button-default button-default-md ng-star-inserted\"])[1]");

	public void uRoomServiceClickonSplitButton() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceClickonSplitButton));


		driver.findElement(RoomServiceClickonSplitButton).click();
		Thread.sleep(2000);
	}

	// Select Split type
	By RoomServiceClickonSplitByEqually = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted virtual-position\"])[3]");

	public void uRoomServiceClickonSplitByEqually() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceClickonSplitByEqually));

		driver.findElement(RoomServiceClickonSplitByEqually).click();
		Thread.sleep(2000);
	}

	// Select Split by 2
	By RoomServiceClickonSplitBy2 = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted virtual-position\"])[4]");

	public void uRoomServiceClickonSplitBy2() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceClickonSplitBy2));


		driver.findElement(RoomServiceClickonSplitBy2).click();
		Thread.sleep(2000);
	}

	// Select Split by 3
	By RoomServiceClickonSplitBy3 = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted virtual-position\"])[3]");

	public void uRoomServiceClickonSplitBy3() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceClickonSplitBy3));

		driver.findElement(RoomServiceClickonSplitBy3).click();
		Thread.sleep(2000);
	}

	// Select Split by 4
	By RoomServiceClickonSplitBy4 = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted virtual-position\"])[2]");

	public void uRoomServiceClickonSplitBy4() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceClickonSplitBy4));


		driver.findElement(RoomServiceClickonSplitBy4).click();
		Thread.sleep(2000);
	}

	// Select Split by 5
	By RoomServiceClickonSplitBy5 = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted virtual-position\"])[1]");

	public void uRoomServiceClickonSplitBy5() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceClickonSplitBy5));



		driver.findElement(RoomServiceClickonSplitBy5).click();
		Thread.sleep(2000);
	}

	// Select Split By Quantity
	By RoomServiceClickonSplitByQuantity = By.xpath("//*[@aria-posinset=\"2\"]");

	public void uRoomServiceClickonSplitByQuantity() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceClickonSplitByQuantity));

		driver.findElement(RoomServiceClickonSplitByQuantity).click();
		Thread.sleep(2000);
	}

	// Select Item
	By RoomServiceselectIteminSplit = By.xpath("(//*[@class=\"checkbox checkbox-md checkbox-md-primary ng-untouched ng-pristine ng-valid\"])[4]");

	public void uRoomServiceselectIteminSplit() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceselectIteminSplit));



		driver.findElement(RoomServiceselectIteminSplit).click();
		Thread.sleep(2000);
	}

	// Click on QTY
	By RoomServiceclickOnQTY = By.xpath("(//*[@class=\"eo-input-field eo-select-field item item-block item-md ng-star-inserted\"])[1]");

	public void uRoomServiceclickOnQTY() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnQTY));



		driver.findElement(RoomServiceclickOnQTY).click();
		Thread.sleep(2000);
	}

	// Select QTY
	By RoomServiceselectQTY = By.xpath("(//*[@class=\"item item-block item-md ng-star-inserted\"])[1]");

	public void uRoomServiceselectQTY() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceselectQTY));

		driver.findElement(RoomServiceselectQTY).click();
		Thread.sleep(2000);
	}

	// Click on Move To Right
	By RoomServiceclickOnMoveToRightButton = By.xpath("(//*[@class=\"icon-action button button-md button-default button-default-md\"])[1]");

	public void uRoomServiceclickOnMoveToRightButton() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnMoveToRightButton));

//		wait.until(ExpectedConditions.elementToBeClickable(RoomServiceclickOnMoveToRightButton));

		driver.findElement(RoomServiceclickOnMoveToRightButton).click();
		Thread.sleep(2000);
	}

	// Click on Save button
	By RoomServiceclickOnSaveButton = By.xpath("(//*[@class=\"primary-btn button button-md button-default button-default-md\"])");

	public void uRoomServiceclickOnSaveButton() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnSaveButton));

//		wait.until(ExpectedConditions.elementToBeClickable(RoomServiceclickOnSaveButton));

		driver.findElement(RoomServiceclickOnSaveButton).click();
		Thread.sleep(2000);
	}

	//======================> MERGE ORDER  <=============================================

	// Select Second Order
	By RoomServiceselectSecondOrder = By.xpath("(//*[@class=\"checkbox checkbox-md checkbox-md-primary ng-untouched ng-pristine ng-valid\"])[3]");

	public void uRoomServiceselectSecondOrder() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceselectSecondOrder));

//		wait.until(ExpectedConditions.elementToBeClickable(RoomServiceselectSecondOrder));

		driver.findElement(RoomServiceselectSecondOrder).click();
		Thread.sleep(2000);
	}

	// Click on Merge Orders
	By RoomServiceclickonMergeOrder = By.xpath("//i[contains(text(),'merge_type')]");

	public void uRoomServiceclickonMergeOrder() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickonMergeOrder));

	//	wait.until(ExpectedConditions.elementToBeClickable(RoomServiceclickonMergeOrder));

		driver.findElement(RoomServiceclickonMergeOrder).click();
		Thread.sleep(2000);
	}

	// Click on Merge button
	By RoomServiceclickonMergeButton = By.xpath("(//*[@class=\"primary-btn button button-md button-default button-default-md ng-star-inserted\"])[1]");

	public void uRoomServiceclickonMergeButton() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickonMergeButton));

//		wait.until(ExpectedConditions.elementToBeClickable(RoomServiceclickonMergeButton));

		driver.findElement(RoomServiceclickonMergeButton).click();
		Thread.sleep(2000);
	}

	// Click on Parent Orders
	By RoomServiceselectParentOrders = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted virtual-position\"])[2]");

	public void uRoomServiceselectParentOrders() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceselectParentOrders));

//		wait.until(ExpectedConditions.elementToBeClickable(RoomServiceselectParentOrders));

		driver.findElement(RoomServiceselectParentOrders).click();
		Thread.sleep(2000);
	}

	// Click on Merge & Settle Order
	By RoomServiceclickOnMergeAndSettleOrder = By.xpath("//*[@aria-label=\"custom merge-settle\"]");

	public void uRoomServiceclickOnMergeAndSettleOrder() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnMergeAndSettleOrder));

//		wait.until(ExpectedConditions.elementToBeClickable(RoomServiceclickOnMergeAndSettleOrder));

		driver.findElement(RoomServiceclickOnMergeAndSettleOrder).click();
		Thread.sleep(2000);
	}

	// Click on "Icecream" Submenu
	By RoomServiceclickOnSubmenu = By.xpath("(//*[@class=\"chip secondary-btn button button-md button-default button-default-md ng-star-inserted\"])[1]");

	public void uRoomServiceclickOnSubmenu() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnSubmenu));

	//	wait.until(ExpectedConditions.elementToBeClickable(RoomServiceclickOnSubmenu));

		driver.findElement(RoomServiceclickOnSubmenu).click();
		Thread.sleep(2000);
	}

	// Select Item in "Icecream" Submenu
	By RoomServiceselectItemOnSubmenu = By.xpath("(//*[@class=\"menu-item img-view button button-md button-default button-default-md button-md-light\"])[1]");

	public void uRoomServiceselectItemOnSubmenu() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceselectItemOnSubmenu));

//		wait.until(ExpectedConditions.elementToBeClickable(RoomServiceselectItemOnSubmenu));

		driver.findElement(RoomServiceselectItemOnSubmenu).click();
		Thread.sleep(2000);
	}

	// Select split by Category
	By RoomServiceClickonSplitByCategory = By.xpath("//*[@aria-posinset=\"3\"]");

	public void uRoomServiceClickonSplitByCategory() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceClickonSplitByCategory));

//		wait.until(ExpectedConditions.elementToBeClickable(RoomServiceClickonSplitByCategory));

		driver.findElement(RoomServiceClickonSplitByCategory).click();
		Thread.sleep(2000);
	}

	// Update QTY of item
	By RoomServiceUpdateQTYOfItem = By.xpath("(//*[@class=\"iconBtn qty-btn button button-md button-default button-default-md ng-star-inserted\"])[3]");

	public void uRoomServiceUpdateQTYOfItem() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceUpdateQTYOfItem));

//		wait.until(ExpectedConditions.elementToBeClickable(RoomServiceUpdateQTYOfItem));

		driver.findElement(RoomServiceUpdateQTYOfItem).click();
		Thread.sleep(2000);
	}

	// Update QTY of item
	By RoomServiceselectSecondIteminSplit = By.xpath("/html/body/ion-app/ng-component/ion-nav/split-by-quantity/ion-content/div[2]/ion-grid/ion-row/ion-grid[1]/ion-row/ion-col[3]/ion-card/ion-card-content/ion-list/ion-item[2]/div[1]/div/ion-label/table[2]/tbody[1]/tr/td[2]/ion-item/ion-checkbox");

	public void uRoomServiceselectSecondIteminSplit() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceselectSecondIteminSplit));

	//	wait.until(ExpectedConditions.elementToBeClickable(RoomServiceselectSecondIteminSplit));

		driver.findElement(RoomServiceselectSecondIteminSplit).click();
		Thread.sleep(2000);
	}

	// Click on QTY
	By RoomServiceclickOn2QTY = By.xpath("//*[@class=\"eo-input-field eo-select-field item item-block item-md ng-star-inserted\"]");

	public void uRoomServiceclickOn2QTY() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOn2QTY));

//		wait.until(ExpectedConditions.elementToBeClickable(RoomServiceclickOn2QTY));

		driver.findElement(RoomServiceclickOn2QTY).click();
		Thread.sleep(2000);
	}

	// Select QTY
	By RoomServiceselect2QTY = By.xpath("(//*[@class=\"item item-block item-md ng-star-inserted\"])[1]");

	public void uRoomServiceselect2QTY() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceselect2QTY));

//		wait.until(ExpectedConditions.elementToBeClickable(RoomServiceselect2QTY));

		driver.findElement(RoomServiceselect2QTY).click();
		Thread.sleep(2000);
	}

	// Click on Move To Left button
	By RoomServiceclickOnMoveToLeftButton = By.xpath("(//*[@class=\"icon-action button button-md button-default button-default-md\"])[2]");

	public void uRoomServiceclickOnMoveToLeftButton() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnMoveToLeftButton));

//		wait.until(ExpectedConditions.elementToBeClickable(RoomServiceclickOnMoveToLeftButton));

		driver.findElement(RoomServiceclickOnMoveToLeftButton).click();
		Thread.sleep(2000);
	}

	// Click on Merge & Print button
	By RoomServiceclickOnMergeAndPrintOrder = By.xpath("(//*[@class=\"button secondary-btn vertical-btn button-md button-default button-default-md ng-star-inserted\"])[5]");

	public void uRoomServiceclickOnMergeAndPrintOrder() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnMergeAndPrintOrder));

//		wait.until(ExpectedConditions.elementToBeClickable(RoomServiceclickOnMergeAndPrintOrder));

		driver.findElement(RoomServiceclickOnMergeAndPrintOrder).click();
		Thread.sleep(2000);
	}

	// Click on + For increase the QTY
	By RoomServiceclickOnPlusonQTY = By.xpath("(//*[@class=\"iconBtn qty-btn button button-md button-default button-default-md ng-star-inserted\"])[1]");

	public void uRoomServiceclickOnPlusonQTY() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceclickOnPlusonQTY));

//		wait.until(ExpectedConditions.elementToBeClickable(RoomServiceclickOnPlusonQTY));

		driver.findElement(RoomServiceclickOnPlusonQTY).click();
		Thread.sleep(2000);
	}

	// Enter Seat number
	By RoomServiceenterSeatNumber = By.xpath("(//*[@class=\"secondary-btn button button-md button-default button-default-md\"])[10]");

	public void uRoomServiceenterSeatNumber() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceenterSeatNumber));

//		wait.until(ExpectedConditions.elementToBeClickable(RoomServiceenterSeatNumber));

		driver.findElement(RoomServiceenterSeatNumber).click();
		Thread.sleep(2000);
	}

	// Select Split By Seat
	By RoomServiceSelectSplitBySeat = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted virtual-position\"])[1]");

	public void uRoomServiceSelectSplitBySeat() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RoomServiceSelectSplitBySeat));

//		wait.until(ExpectedConditions.elementToBeClickable(RoomServiceSelectSplitBySeat));

		driver.findElement(RoomServiceSelectSplitBySeat).click();
		Thread.sleep(2000);
	}

	// Select QTY
	By selectQTY = By.xpath("(//*[@class=\"item item-block item-md ng-star-inserted\"])[1]");

	public void uselectQTY() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(selectQTY));

//		wait.until(ExpectedConditions.elementToBeClickable(selectQTY));

		driver.findElement(selectQTY).click();
		Thread.sleep(2000);
	}


	// Click on Cancel Icon in Settle popup 
	By ClickonCancelIconinSettlepopup = By.xpath("/html/body/ion-app/ion-modal/div/settlement/form/ion-header/ion-toolbar/div[2]/div[3]/ion-buttons/button");

	public void uClickonCancelIconinSettlepopup() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonCancelIconinSettlepopup));

	//	wait.until(ExpectedConditions.elementToBeClickable(ClickonCancelIconinSettlepopup));

		driver.findElement(ClickonCancelIconinSettlepopup).click();
		Thread.sleep(2000);
	}

	// Select cash option in Payment Process
	By SelectcashoptioninPaymentProcess = By.xpath("//*[@aria-posinset=\"1\"]");

	public void uSelectcashoptioninPaymentProcess() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(SelectcashoptioninPaymentProcess));

//		wait.until(ExpectedConditions.elementToBeClickable(SelectcashoptioninPaymentProcess));

		driver.findElement(SelectcashoptioninPaymentProcess).click();
		Thread.sleep(5000);
	}


	// Click on Pay button
	By clickonPayButton1 = By.xpath("(//span[contains(text(),'Pay')])[3]");

	public void uclickonPayButton1() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickonPayButton1));

//		wait.until(ExpectedConditions.elementToBeClickable(clickonPayButton1));

		driver.findElement(clickonPayButton1).click();
		Thread.sleep(5000);
	}

	// Click on OK button in Changes Duo popup
	By clickOnOKButtoninChangesDuoPopup = By.xpath("//span[contains(text(),'OK')]");

	public void uclickOnOKButtoninChangesDuoPopup() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnOKButtoninChangesDuoPopup));

//		wait.until(ExpectedConditions.elementToBeClickable(clickOnOKButtoninChangesDuoPopup));

		driver.findElement(clickOnOKButtoninChangesDuoPopup).click();
		Thread.sleep(5000);
	}

	// Click on Save button on Order
	By clickOnSave = By.xpath("//p[contains(text(),'Save')]");

	public void uclickOnSave() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnSave));

	//	wait.until(ExpectedConditions.elementToBeClickable(clickOnSave));

		driver.findElement(clickOnSave).click();
		Thread.sleep(5000);
	}

	// Click on Post To Room button
	By ClickonPostToRoomButton = By.xpath("(//*[@aria-label=\"custom roomservice\"])[2]");

	public void uClickonPostToRoomButton() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonPostToRoomButton));

	//	wait.until(ExpectedConditions.elementToBeClickable(ClickonPostToRoomButton));

		driver.findElement(ClickonPostToRoomButton).click();
		Thread.sleep(5000);
	}

	// Click on Post To Room button in confirm Popup
	By ClickonPostToRoomButtonInConfirmPopup = By.xpath("(//span[contains(text(),'Post')])[2]");

	public void uClickonPostToRoomButtonInConfirmPopup() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonPostToRoomButtonInConfirmPopup));

	//	wait.until(ExpectedConditions.elementToBeClickable(ClickonPostToRoomButtonInConfirmPopup));

		driver.findElement(ClickonPostToRoomButtonInConfirmPopup).click();
		Thread.sleep(5000);
	}
	
	// Click on Post To Room button in confirm Popup
	By ClickonPostToRoomButtonInConfirmPopup1 = By.xpath("(//span[contains(text(),'Post')])[1]");

	public void uClickonPostToRoomButtonInConfirmPopup1() throws Exception {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonPostToRoomButtonInConfirmPopup1));

	//	wait.until(ExpectedConditions.elementToBeClickable(ClickonPostToRoomButtonInConfirmPopup));

		driver.findElement(ClickonPostToRoomButtonInConfirmPopup1).click();
		Thread.sleep(5000);
	}
}
