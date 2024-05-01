package com.optimus.OptimusMavenProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GRNXPath {
	
	public static WebDriver driver;
	
	public GRNXPath(WebDriver driver) {
		
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
	
	// Click on GRN
	By ClickonGRN = By.xpath("//p[contains(text(),'Goods Receipt Note')]");
	
	public void uClickonGRN() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonGRN));
		
		driver.findElement(ClickonGRN).click();
		Thread.sleep(3000);
	}
	
	// Click on + 
	By ClickonPlus = By.xpath("//*[@class=\"order-type-operation bar-buttons bar-buttons-md\"]");
	
	public void uClickonPlus() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonPlus));
		
		driver.findElement(ClickonPlus).click();
		Thread.sleep(3000);
	}
	
	// Click on Vendor
	By ClickonVendor = By.xpath("//p[contains(text(),'Select Vendor')]");
	
	public void uClickonVendor() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonVendor));
		
		driver.findElement(ClickonVendor).click();
		Thread.sleep(3000);
	}
	
	// Select Vendor
	By SelectVendor = By.xpath("//*[@title=\"Majura-10000(D-P)\"]");
	
	public void uSelectVendor() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(SelectVendor));
		
		driver.findElement(SelectVendor).click();
		Thread.sleep(3000);
	}
	
	// Enter Vendor Invoice Number
	By EnterVendorInvoice = By.xpath("/html/body/ion-app/ng-component/ion-nav/page-new-grn-form/ion-content/div[2]/ion-grid/ion-row/ion-col[1]/ion-card/ion-card-content/ion-grid/ion-row/ion-col/div[1]/ion-row/ion-col[1]/ion-row[2]/ion-col[2]/ion-item/div[1]/div/ion-input/input");
	
	public void uEnterVendorInvoice() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(EnterVendorInvoice));
		
		driver.findElement(EnterVendorInvoice).sendKeys("101");
		Thread.sleep(3000);
	}
	
	// Click On Add Item Button
	By ClickOnAddItemButton = By.xpath("(//*[@class=\"button button-md button-outline button-outline-md\"])[1]");
	
	public void uClickOnAddItemButton() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickOnAddItemButton));
		
		driver.findElement(ClickOnAddItemButton).click();
		Thread.sleep(3000);
	}
	
	// Select Item 
	By SelectItem = By.xpath("//*[@aria-posinset=\"4\"]");
	
	public void uSelectItem() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(SelectItem));
		
		driver.findElement(SelectItem).click();
		Thread.sleep(3000);
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
	
	// Click on Save button on GRN
	By clickOnSave = By.xpath("(//p[contains(text(),'Save')])[2]");
	
	public void uclickOnSave() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnSave));
		
		driver.findElement(clickOnSave).click();
		Thread.sleep(2000);
	}
	
	// Click on Yes button
	By clickonYesButton = By.xpath("//span[contains(text(),'Yes')]");
	
	public void uclickonYesButton() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickonYesButton));
		
		driver.findElement(clickonYesButton).click();
		Thread.sleep(2000);
	}
	
	//========================= Recall GRN =======================================
	
	// Select GRN
	By SelectGRN = By.xpath("//*[@class=\"checkbox checkbox-md checkbox-md-primary\"]");
	
	public void uSelectGRN() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(SelectGRN));
		
		driver.findElement(SelectGRN).click();
		Thread.sleep(2000);
	}
	
	// Click on Recall
	By ClickonRecall = By.xpath("//p[contains(text(),'Recall')]");
	
	public void uClickonRecall() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonRecall));
		
		driver.findElement(ClickonRecall).click();
		Thread.sleep(2000);
	}
	
	// Increase the QTY of item
	By IncreasetheQTYofitem = By.xpath("/html/body/ion-app/ng-component/ion-nav/page-new-grn-form/ion-content/div[2]/ion-grid/ion-row/ion-col[1]/ion-card/ion-card-content/ion-grid/ion-row/ion-col/div[2]/table/tbody/tr/td[2]/div/ion-item[1]/div[1]/div/ion-input/input");
	
	public void uIncreasetheQTYofitem() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(IncreasetheQTYofitem));
		
		driver.findElement(IncreasetheQTYofitem).clear();
		driver.findElement(IncreasetheQTYofitem).sendKeys("5");
		Thread.sleep(3000);
	}
	
	// Select 2nd Item 
	By Select2Item = By.xpath("//*[@title=\"Anzir\"]");
	
	public void uSelect2Item() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(Select2Item));
		
		driver.findElement(Select2Item).click();
		Thread.sleep(3000);
	}
	
	//=========================== Remove Item =========================
	
	// Remove item in GRN
	By RemoveiteminGRN = By.xpath("(//*[@class=\"secondary-btn no-border button button-md button-clear button-clear-md button-clear-md-light\"])[2]");
	
	public void uRemoveiteminGRN() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RemoveiteminGRN));
		
		driver.findElement(RemoveiteminGRN).click();
		Thread.sleep(3000);
	}
	
	// Clicks on Select reason
	By ClickOnReasons = By.xpath("//*[@aria-posinset=\"1\"]");
	
	public void uClickOnReasons() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickOnReasons));
		
		driver.findElement(ClickOnReasons).click();
		Thread.sleep(8000);
	}
	
	//=========================== Maximum QTY =========================
	
	// Select Inventory Item
	By SelectInventoryItem = By.xpath("//*[@aria-posinset=\"1\"]");
	
	public void uSelectInventoryItem() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(SelectInventoryItem));
		
		driver.findElement(SelectInventoryItem).click();
		Thread.sleep(8000);
	}
	
	// Increase the QTY of item
	By IncreasetheQTYofitem1 = By.xpath("//*[@title=\"1.0000\"]");
	
	public void uIncreasetheQTYofitem1() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(IncreasetheQTYofitem1));
		
		driver.findElement(IncreasetheQTYofitem1).clear();
		driver.findElement(IncreasetheQTYofitem1).sendKeys("15");
		Thread.sleep(3000);
	}
	
	//=========================== Void GRN =========================	
	
	// Delete GRN
	By DeleteGRN = By.xpath("//*[@title=\"Void\"]");

	public void uDeleteGRN() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(DeleteGRN));

		driver.findElement(DeleteGRN).click();
		
		Thread.sleep(3000);	
	}
	
	// Select All GRN
	By SelectAllGRN = By.xpath("/html/body/ion-app/ng-component/ion-nav/page-good-receipt-note/ion-content/div[2]/ion-grid[2]/ion-row/ion-col[1]/ion-card/ion-card-header/div/ion-buttons[1]/button/span/ion-checkbox");

	public void uSelectAllGRN() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(SelectAllGRN));

		driver.findElement(SelectAllGRN).click();
		
		Thread.sleep(3000);	
	}
	
	// Click on Yes button
	By clickonYESButton1 = By.xpath("//span[contains(text(),'YES')]");
	
	public void uclickonYESButton1() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickonYESButton1));
		
		driver.findElement(clickonYESButton1).click();
		Thread.sleep(2000);
	}
	
	// Click on OK button in Warning Button
	By clickonOKButtoninWarningButton = By.xpath("//span[contains(text(),'OK')]");
	
	public void uclickonOKButtoninWarningButton() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickonOKButtoninWarningButton));
		
		driver.findElement(clickonOKButtoninWarningButton).click();
		Thread.sleep(2000);
	}
}
