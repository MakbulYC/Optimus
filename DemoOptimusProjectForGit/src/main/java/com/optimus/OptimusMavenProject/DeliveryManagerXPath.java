package com.optimus.OptimusMavenProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeliveryManagerXPath {
	
	public static WebDriver driver;
	
	public DeliveryManagerXPath(WebDriver driver) {
		
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
	
	// Click on Delivery manager
	By DeliveryManager = By.xpath("//p[contains(text(),'Delivery Manager')]");
	
	public void uDeliveryManager() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(DeliveryManager));
		
		driver.findElement(DeliveryManager).click();
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
	
	// Click on Add Order
	By ClickonAddOrder = By.xpath("(//*[@class=\"bar-button bar-button-md bar-button-default bar-button-default-md\"])[1]");
	
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
	By EnterGuestname = By.xpath("(//*[@formcontrolname=\"fname\"])[2]");
	
	public void uEnterGuestname() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(EnterGuestname));
		
		driver.findElement(EnterGuestname).sendKeys("Makbul Khan");
		Thread.sleep(3000);
	}
	
	// Enter Email
	By EnterEmail = By.xpath("(//*[@formcontrolname=\"email\"])[2]");
	
	public void uEnterEmail() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(EnterEmail));
		
		driver.findElement(EnterEmail).sendKeys("makbul.khan@ezeetechnosys.com");
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
	By EnterAddress = By.xpath("(//*[@formcontrolname=\"address\"])[2]");
	
	public void uEnterAddress() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(EnterAddress));
		
		driver.findElement(EnterAddress).sendKeys("Test Address");
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
	
	// Add first Item
	By addFirstItem = By.xpath("//*[@title=\"Double Special Falooda\"]");
	
	public void uaddFirstItem() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(addFirstItem));

		driver.findElement(addFirstItem).click();
		Thread.sleep(5000);
	}

	// Add Second Item
	By addSecondItem = By.xpath("//*[@title=\"Special Falooda\"]");

	public void uaddSecondItem() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(addSecondItem));

		driver.findElement(addSecondItem).click();
		Thread.sleep(5000);
	}
	
	// Add Third Item
	By addThirdItem = By.xpath("//*[@title=\"Black Currant Falooda\"]");

	public void uaddThirdItem() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(addThirdItem));

		driver.findElement(addThirdItem).click();
		Thread.sleep(5000);
	}
	
	// Add Fourth Item
	By addFourthItem = By.xpath("//*[@title=\"Black Currant Falooda\"]");

	public void uaddFourthItem() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(addFourthItem));

		driver.findElement(addFourthItem).click();
		Thread.sleep(5000);
	}

	// Click on Save button on Order
	By clickOnSave = By.xpath("//p[contains(text(),'Save')]");

	public void uclickOnSave() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnSave));

		driver.findElement(clickOnSave).click();
		Thread.sleep(5000);
	}
		
	// Click on Recall button on Order	
	By clickOnRecallButton = By.xpath("//*[@aria-label=\"custom recall\"]");

	public void uclickOnRecallButton() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnRecallButton));

		driver.findElement(clickOnRecallButton).click();
		Thread.sleep(5000);
	}	
	
	// Click on Remove button on Item
	By clickOnVoidItem = By.xpath("(//*[@class=\"deleteItem button button-md button-default button-default-md ng-star-inserted\"])[1]");
	
	public void uclickOnVoidItem() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnVoidItem));
		
		driver.findElement(clickOnVoidItem).click();
		Thread.sleep(5000);
	}
	
	// Click on void Option
	By clickOnVoid = By.xpath("(//*[@class=\"row-content row\"])[2]");
	
	public void uclickOnVoid() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnVoid));
		
		driver.findElement(clickOnVoid).click();
		Thread.sleep(5000);
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
	
	// Clicks on Assign Driver button
	By ClickOnAssignDriverbutton = By.xpath("(//*[@class=\"secondary-btn save button button-md button-default button-default-md button-md-primary\"])[1]");
	
	public void uClickOnAssignDriverbutton() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickOnAssignDriverbutton));
		
		driver.findElement(ClickOnAssignDriverbutton).click();
		Thread.sleep(8000);
	}
	
	// Select Driver option
	By SelectDriveroption = By.xpath("(//*[@class=\"item item-block item-md item-radio ng-star-inserted virtual-position\"])[1]");
	
	public void uSelectDriveroption() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(SelectDriveroption));
		
		driver.findElement(SelectDriveroption).click();
		Thread.sleep(8000);
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
	
	// Click on Settle Button
	By ClickonSettleButton = By.xpath("(//*[@class=\"secondary-btn button button-md button-default button-default-md button-md-primary\"])[2]");
	
	public void uClickonSettleButton() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonSettleButton));
		
		driver.findElement(ClickonSettleButton).click();
		Thread.sleep(8000);
	}
	
	// Click on Pay button
	By clickonPayButton = By.xpath("//*[@class=\"primary-btn button button-md button-default button-default-md ng-star-inserted\"]");
	
	public void uclickonPayButton() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickonPayButton));
		
		driver.findElement(clickonPayButton).click();
		Thread.sleep(5000);
	}
	
	// Click on OK button in Changes Duo popup
	By clickOnOKButton = By.xpath("//*[@class=\"primary-btn button button-md button-default button-default-md ng-star-inserted\"]");
	
	public void uclickOnOKButton() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnOKButton));
		
		driver.findElement(clickOnOKButton).click();
		Thread.sleep(5000);
	}
	
	// Click on Complete button 
	By ClickonCompletebutton = By.xpath("(//*[@class=\"secondary-btn save button button-md button-default button-default-md button-md-primary\"])[1]");
	
	public void uClickonCompletebutton() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonCompletebutton));
		
		driver.findElement(ClickonCompletebutton).click();
		Thread.sleep(5000);
	}
	
	// Click on Completed Section
	By ClickonCompletedSection = By.xpath("//span[contains(text(),'Completed')]");
	
	public void uClickonCompletedSection() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonCompletedSection));
		
		driver.findElement(ClickonCompletedSection).click();
		Thread.sleep(5000);
	}
	
	// Click on Undo Button
	By ClickonUndoButton = By.xpath("(//i[contains(text(),'undo')])[1]");
	
	public void uClickonUndoButton() throws Exception {
		
		driver.findElement(ClickonUndoButton).click();
		Thread.sleep(5000);
	}
	
	// Click on Void Button
	By ClickonVoidButton = By.xpath("//*[@aria-label=\"custom delete\"]");
	
	public void uClickonVoidButton() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonVoidButton));
		
		driver.findElement(ClickonVoidButton).click();
		Thread.sleep(5000);
	}
	
	// Click on Prepare Section
	By ClickonPrepareSection = By.xpath("//span[contains(text(),'Preparing')]");
	
	public void uClickonPrepareSection() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonPrepareSection));
		
		driver.findElement(ClickonPrepareSection).click();
		Thread.sleep(5000);
	}
	
	// Click on Quick Pay button
	By clickOnPayButton = By.xpath("//*[contains(text(),'Quick Pay')]");
	
	public void uclickOnPayButton() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnPayButton));
		
		driver.findElement(clickOnPayButton).click();
		Thread.sleep(5000);
	}
	
	// Enter Numbers in Search field
	By EnterNumbersinSearchfield = By.xpath("(//*[@class=\"searchbar-input\"])[3]");
	
	public void uEnterNumbersinSearchfield() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(EnterNumbersinSearchfield));
		
		driver.findElement(EnterNumbersinSearchfield).sendKeys("8787");
		Thread.sleep(5000);
	}
	
	// Click on Result
	By ClickonResult = By.xpath("/html/body/ion-app/ng-component/ion-nav/page-delivery-manager/ion-content[2]/div[2]/ion-grid[2]/ion-row/ion-content/div[2]/table/tbody/tr/td/ion-item");
	
	public void uClickonResult() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonResult));
		
		driver.findElement(ClickonResult).click();
		Thread.sleep(5000);
	}

}
