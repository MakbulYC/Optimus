package com.optimus.OptimusMavenProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderSummaryXPath {
	
	public static WebDriver driver;
	
	public OrderSummaryXPath(WebDriver driver) {
		
		this.driver=driver;
	}
	
	
	// Click on Order Notification
	By clickOnOrderNotification = By.xpath("(//i[contains(text(),'arrow_forward')])[2]");
	
	public void uclickOnOrderNotification() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnOrderNotification));
		
		driver.findElement(clickOnOrderNotification).click();
		Thread.sleep(2000);
	}
	
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
	
	// Click on menu in Order Summary
	By ClickonmenuinOrderSummary = By.xpath("/html/body/ion-app/ng-component/ion-nav/page-ordersummary/ion-header/header/ion-navbar/div[2]");
	
	public void uClickonmenuinOrderSummary() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonmenuinOrderSummary));
		
		driver.findElement(ClickonmenuinOrderSummary).click();
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
	By clickonItem = By.xpath("//*[@title=\"Double Falooda Single Glass\"]");
	
	public void uclickonItem() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickonItem));
		
		driver.findElement(clickonItem).click();
		Thread.sleep(2000);
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
	
	// Click on Cancel button on Order
	By clickOnCancel = By.xpath("//p[contains(text(),'Cancel')]");
	
	public void uclickOnCancel() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnCancel));
		
		driver.findElement(clickOnCancel).click();
		Thread.sleep(2000);
	}
	
	// Select order
	By selectOrder = By.xpath("((//*[@class=\"item-cover item-cover-md item-cover-default item-cover-default-md\"]))[2]");
	
	public void uselectOrder() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(selectOrder));
		
		driver.findElement(selectOrder).click();
		Thread.sleep(2000);
	}
	
	// Click on Recall button
	By clickOnRecallButton = By.xpath("//p[contains(text(),'Recall')]");
	
	public void uclickOnRecallButton() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnRecallButton));
		
		driver.findElement(clickOnRecallButton).click();
		Thread.sleep(2000);
	}
	// Increase the QTY of first item
	By FirstItemIncrease = By.xpath("/html/body/ion-app/ng-component/ion-nav/page-orderscreen/ion-content/div[2]/ion-grid/ion-row/ion-col[2]/order-detail/ion-card/ion-card-content/receipt-type-2/item-list/div[1]/div/div/div[1]/div/button[2]");
	
	public void uFirstItemIncrease() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(FirstItemIncrease));
		
		driver.findElement(FirstItemIncrease).click();
		Thread.sleep(2000);
	}

// ======================= Split Order ====================================
	
	
	// Click on Split button in Order Summary
	By clickOnSplitButtoninOrderSummary = By.xpath("//p[contains(text(),'Split')]");
	
	public void uclickOnSplitButtoninOrderSummary() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnSplitButtoninOrderSummary));
		
		driver.findElement(clickOnSplitButtoninOrderSummary).click();
		Thread.sleep(2000);
	}
	
	// Click on split button
	By ClickonSplitButton = By.xpath("//span[contains(text(),'Split')]");
	
	public void uClickonSplitButton() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonSplitButton));
		
		driver.findElement(ClickonSplitButton).click();
		Thread.sleep(2000);
	}
	
	// Select Split type
	By ClickonSplitByEqually = By.xpath("//*[@aria-posinset=\"1\"]");
	
	public void uClickonSplitByEqually() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonSplitByEqually));
		
		driver.findElement(ClickonSplitByEqually).click();
		Thread.sleep(2000);
	}
	
	// Select Split by 2
	By ClickonSplitBy2 = By.xpath("//*[@aria-posinset=\"1\"]");
	
	public void uClickonSplitBy2() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonSplitBy2));
		
		driver.findElement(ClickonSplitBy2).click();
		Thread.sleep(2000);
	}
	
	// Select Split By Quantity
	By ClickonSplitByQuantity = By.xpath("//*[@aria-posinset=\"2\"]");
	
	public void uClickonSplitByQuantity() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonSplitByQuantity));
		
		driver.findElement(ClickonSplitByQuantity).click();
		Thread.sleep(2000);
	}
	
	// Select Item
	By selectIteminSplit = By.xpath("(//*[@class=\"item-cover item-cover-md item-cover-default item-cover-default-md\"])[4]");
	
	public void uselectIteminSplit() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(selectIteminSplit));
		
		driver.findElement(selectIteminSplit).click();
		Thread.sleep(2000);
	}
	
	// Click on QTY
	By clickOnQTY = By.xpath("//p[contains(text(),'2x')]");
	
	public void uclickOnQTY() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnQTY));
		
		driver.findElement(clickOnQTY).click();
		Thread.sleep(2000);
	}
	
	// Select QTY
	By selectQTY = By.xpath("//*[@title=\"1\"]");
	
	public void uselectQTY() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(selectQTY));
		
		driver.findElement(selectQTY).click();
		Thread.sleep(2000);
	}
	
	// Click on Move To Right
	By clickOnMoveToRightButton = By.xpath("(//*[@title=\"Move Right\"])[2]");
	
	public void uclickOnMoveToRightButton() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnMoveToRightButton));
		
		driver.findElement(clickOnMoveToRightButton).click();
		Thread.sleep(2000);
	}
	
	// Click on Save button
	By clickOnSaveButton = By.xpath("//p[contains(text(),'Save')]");
	
	public void uclickOnSaveButton() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnSaveButton));
		
		driver.findElement(clickOnSaveButton).click();
		Thread.sleep(2000);
	}
	
	// Click on "Icecream" Submenu
	By clickOnSubmenu = By.xpath("//*[@id=\"btn-menugroup1146070000000002active0\"]");
	
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
	By ClickonSplitByCategory = By.xpath("//*[@aria-posinset=\"3\"]");
	
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
	
	// Select Second Item in Split
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
	
// ===================== Merge Order ===================================
	
	
	// Click on Merge button in Order Summary
	By clickOnMergeButtoninOrderSummary = By.xpath("//p[contains(text(),'Merge')]");
	
	public void uclickOnMergeButtoninOrderSummary() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnMergeButtoninOrderSummary));
		
		driver.findElement(clickOnMergeButtoninOrderSummary).click();
		Thread.sleep(2000);
	}
	
	// Select Second Order
	By selectSecondOrder = By.xpath("/html/body/ion-app/ng-component/ion-nav/page-ordersummary/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/ion-card/ion-card-content/ion-content/div[2]/table/tbody/tr[2]/td[1]/ion-item/ion-checkbox");
	
	public void uselectSecondOrder() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(selectSecondOrder));
		
		driver.findElement(selectSecondOrder).click();
		Thread.sleep(2000);
	}
	
	// Click on Merge button
	By clickonMergeButton = By.xpath("//span[contains(text(),'Merge')]");
	
	public void uclickonMergeButton() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickonMergeButton));
		
		driver.findElement(clickonMergeButton).click();
		Thread.sleep(2000);
	}
	
	// Click on Parent Orders
	By selectParentOrders = By.xpath("//*[@aria-posinset=\"1\"]");
	
	public void uselectParentOrders() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(selectParentOrders));
		
		driver.findElement(selectParentOrders).click();
		Thread.sleep(2000);
	}
	
	// Click on Parent Orders
	By CancelOrders = By.xpath("//p[contains(text(),'Cancel')]");
	
	public void uCancelOrders() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(CancelOrders));
		
		driver.findElement(CancelOrders).click();
		Thread.sleep(2000);
	}

// =================  Void Order =======================================	
	
	// Click on Void button on Order summary
	By clickOnVoidButtoninOrderSummary = By.xpath("//p[contains(text(),'Void')]");
	
	public void uclickOnVoidButtoninOrderSummary() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnVoidButtoninOrderSummary));
		
		driver.findElement(clickOnVoidButtoninOrderSummary).click();
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
	By ClickOnReasons = By.xpath("//*[@aria-posinset=\"1\"]");
	
	public void uClickOnReasons() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickOnReasons));
		
		driver.findElement(ClickOnReasons).click();
		Thread.sleep(2000);
	}
	
	// Click on Select All order check box in order summary
	By clickOnSelectAll = By.xpath("(//*[@class=\"checkbox checkbox-md checkbox-md-primary ng-untouched ng-pristine ng-valid\"])[1]");
	
	public void uclickOnSelectAll() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnSelectAll));
		
		driver.findElement(clickOnSelectAll).click();
		Thread.sleep(2000);
	}
	
// ================================== Settle Order ================================
	
	// Click on Recall button
	By clickOnSettleButton = By.xpath("//p[contains(text(),'Settle')]");
	
	public void uclickOnSettleButton() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnSettleButton));
		
		driver.findElement(clickOnSettleButton).click();
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
	
	// Click on Pay button
	By clickonPayButton = By.xpath("//*[@class=\"primary-btn button button-md button-default button-default-md ng-star-inserted\"]");
									
	public void uclickonPayButton() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickonPayButton));
		
		driver.findElement(clickonPayButton).click();
		Thread.sleep(2000);
	}
	
	// Click on Pay button
	By clickonPayButton1 = By.xpath("//*[@class=\"footer-button bar-buttons bar-buttons-md\"]");
									
	public void uclickonPayButton1() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickonPayButton1));
		
		driver.findElement(clickonPayButton1).click();
		Thread.sleep(2000);
	}
	
	// Click on OK button in Changes Duo popup
	By clickOnOKButton1 = By.xpath("//span[contains(text(),'OK')]");
	
	public void uclickOnOKButton1() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnOKButton1));
		
		driver.findElement(clickOnOKButton1).click();
		Thread.sleep(2000);
	}
	
	// Click on OK button in Changes Duo popup
	By clickOnOKButton = By.xpath("//*[@class=\"primary-btn button button-md button-default button-default-md ng-star-inserted\"]");
	
	public void uclickOnOKButton() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnOKButton));
		
		driver.findElement(clickOnOKButton).click();
		Thread.sleep(2000);
	}
	
	// Click on Pay button in Bulk settle popup
	By clickOnPaybuttoninBulksettlepopup = By.xpath("(//*[@class=\"footer-button bar-buttons bar-buttons-md\"])[1]");
	
	public void uclickOnPaybuttoninBulksettlepopup() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnPaybuttoninBulksettlepopup));
		
		driver.findElement(clickOnPaybuttoninBulksettlepopup).click();
		Thread.sleep(2000);
	}

}
