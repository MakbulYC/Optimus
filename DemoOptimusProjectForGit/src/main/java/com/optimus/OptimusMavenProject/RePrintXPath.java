package com.optimus.OptimusMavenProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RePrintXPath {
	
	public static WebDriver driver;
	
	public RePrintXPath(WebDriver driver) {
		
		this.driver=driver;
	}
	
	// Click on Table section
	By  clickonTable = By.xpath("(//*[@class=\"button button-md button-default button-default-md button-md-light running\"])[1]");
	
	public void uclickonTable() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickonTable));
		
		driver.findElement(clickonTable).click();
		Thread.sleep(5000);
	}
	
	// Click on Print Button
	By  clickonPrintButton = By.xpath("//*[@name=\"custom-print\"]");
	
	public void uclickonPrintButton() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickonPrintButton));
		
		driver.findElement(clickonPrintButton).click();
		Thread.sleep(5000);
	}
	
	// Click on Re-Print Button
	By  clickonRePrintButton = By.xpath("//*[@id=\"tableRoomAction\"]/div/ion-content/div[2]/table-action/ion-footer/ion-buttons/button[7]");
	
	public void uclickonRePrintButton() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickonRePrintButton));
		
		driver.findElement(clickonRePrintButton).click();
		Thread.sleep(5000);
	}
	
	// Select Item for print
	By  SelectItemforprint = By.xpath("/html/body/ion-app/ion-modal/div/reprint/ion-content/div[2]/div/div[2]/ion-list/ion-item/ion-checkbox");
	
	public void uSelectItemforprint() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(SelectItemforprint));
		
		driver.findElement(SelectItemforprint).click();
		Thread.sleep(5000);
	}
	
	// Click on Print Button in Reprint popup 
	By  clickonPrintButtoninReprintpopup  = By.xpath("/html/body/ion-app/ion-modal/div/reprint/ion-footer/ion-buttons/button");
	
	public void uclickonPrintButtoninReprintpopup() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickonPrintButtoninReprintpopup));
		
		driver.findElement(clickonPrintButtoninReprintpopup).click();
		Thread.sleep(5000);
	}
	
	// Click on Captain Section
	By  clickonCaptainSection = By.xpath("//span[contains(text(),'Captain Print')]");
	
	public void uclickonCaptainSection() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickonCaptainSection));
		
		driver.findElement(clickonCaptainSection).click();
		Thread.sleep(5000);
	}
	
	// Click on Label Section
	By  clickonLabelSection = By.xpath("//span[contains(text(),'Label Print')]");
	
	public void uclickonLabelSection() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickonLabelSection));
		
		driver.findElement(clickonLabelSection).click();
		Thread.sleep(5000);
	}
	
	// Click on menu
	By Clickonmenu = By.xpath("/html/body/ion-app/ng-component/ion-nav/page-dinein/ion-header/header/ion-navbar/div[2]");
	
	public void uClickonmenu() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(Clickonmenu));
		
		driver.findElement(Clickonmenu).click();
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
	
	// Select order
	By selectOrder = By.xpath("((//*[@class=\"item-cover item-cover-md item-cover-default item-cover-default-md\"]))[2]");
	
	public void uselectOrder() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(selectOrder));
		
		driver.findElement(selectOrder).click();
		Thread.sleep(5000);
	}
	
	// Click on Print button in Order Summary
	By clickOnPrintButtoninOrderSummary = By.xpath("//p[contains(text(),'Reprint Receipt')]");
	
	public void uclickOnPrintButtoninOrderSummary() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnPrintButtoninOrderSummary));
		
		driver.findElement(clickOnPrintButtoninOrderSummary).click();
		Thread.sleep(8000);
	}
	
	// Click on Re-Print KOT button in Order Summary
	By clickOnRePrintKOTButtoninOrderSummary = By.xpath("//p[contains(text(),'Reprint KOT')]");
	
	public void uclickOnRePrintKOTButtoninOrderSummary() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnRePrintKOTButtoninOrderSummary));
		
		driver.findElement(clickOnRePrintKOTButtoninOrderSummary).click();
		Thread.sleep(8000);
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
	
	// Click on Item in Label
	By clickOnIteminLabel = By.xpath("/html/body/ion-app/ion-modal/div/reprint/ion-content/div[2]/div/div/ion-list/ion-item");
	
	public void uclickOnclickOnIteminLabel() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnIteminLabel));
		
		driver.findElement(clickOnIteminLabel).click();
		Thread.sleep(8000);
	}
	
	// Click on Print in Reprint popup
	By clickOnPrintinRePrintPopup = By.xpath("/html/body/ion-app/ion-modal/div/reprint/ion-footer/ion-buttons/button");
	
	public void uclickOnPrintinRePrintPopup() throws Exception {
		
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnPrintinRePrintPopup));
		
		driver.findElement(clickOnPrintinRePrintPopup).click();
		Thread.sleep(8000);
	}
	
	// ======= Take order with Single Item
	
	// Click on Plus icon
	By clickonPlus = By.xpath("//ion-col[@class='dine-tables col']//ion-col[1]//div[1]//ion-buttons[1]//button[1]//span[1]");

	public void uclickonPlus() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickonPlus));
		
		driver.findElement(clickonPlus).click();
		Thread.sleep(2000);
	}
	
	// Click on Save button
	By clickonSaveButton = By.xpath("//span[contains(text(),'Save')]");
	
	public void uclickonSaveButton() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickonSaveButton));
		
		driver.findElement(clickonSaveButton).click();
		Thread.sleep(2000);
	}
	
	// Click on Item
	By clickonItem = By.xpath("//button[@title='Double Falooda Single Glass']//img");
	
	public void uclickonItem() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickonItem));
		
		driver.findElement(clickonItem).click();
		Thread.sleep(2000);
	}
	
	// Click on Course
	By selectCourse = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted\"])[1]");
	
	public void uselectCourse() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(selectCourse));
		
		driver.findElement(selectCourse).click();
		Thread.sleep(2000);
	}
	
	// Click on Finish Button
	By clickonFinishButton = By.xpath("//span[normalize-space()='Finish']");
	
	public void uclickonFinishButton() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickonFinishButton));
		
		driver.findElement(clickonFinishButton).click();
		Thread.sleep(2000);
	}
	
	// Click on Save button on Order
	By clickOnSaveButtoninOrder = By.xpath("//p[contains(text(),'Save')]");
	
	public void uclickOnSaveButtoninOrder() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnSaveButtoninOrder));
		
		driver.findElement(clickOnSaveButtoninOrder).click();	
		Thread.sleep(2000);
	}

}
