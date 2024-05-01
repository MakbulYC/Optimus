package com.optimus.OptimusMavenProject;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactlessXPath {
	
	public static WebDriver driver;
	
	public ContactlessXPath(WebDriver driver) {
		
		this.driver=driver;
	}
	
	// QR CODE URL
	public void QRCODEURL() throws Exception {
		
		// below code will navigate you to your desirable Url 
		driver.get("https://app.ipos247.com/contactless/#/5dbad63074787958dc4ae75cc86f8556869dd3f7f1c76e3d219c5fd9c3c520a6");
		Thread.sleep(10000);
	}
	
	// Click on Start button
	By clickOnStartButton = By.xpath("//span[contains(text(),'Start')]");
	// /html/body/ion-app/ng-component/ion-nav/page-welcome/ion-footer/button
	
	public void uclickOnStartButton() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnStartButton));
		
		driver.findElement(clickOnStartButton).click();
		Thread.sleep(2000);
	}

	// Click on Add button in Item
	By clickOnAddButton = By.xpath("(//span[contains(text(),'Add')])[1]");
	///html/body/ion-app/ng-component/ion-nav/page-menu/ion-content/div[2]/ion-row[2]/ion-col[2]/div/ion-list[1]/div/div/order-item/ion-item[1]/div[1]/div/ion-label/ion-card/ion-card-content/div/div[2]/div/button
	
	public void uclickOnAddButton() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnAddButton));
		
		driver.findElement(clickOnAddButton).click();
		Thread.sleep(2000);
	}
	
	// Click on Add button in Second Item
	By clickOnAddItem = By.xpath("/html/body/ion-app/ng-component/ion-nav/page-menu/ion-content/div[2]/ion-row[2]/ion-col[2]/div/ion-list[1]/div/div/order-item/ion-item[2]/div[1]/div/ion-label/ion-card/ion-card-content/div/div[2]/div/button");
	// /html/body/ion-app/ng-component/ion-nav/page-menu/ion-content/div[2]/ion-row[2]/ion-col[2]/div/ion-list[1]/div/div/order-item/ion-item[2]/div[1]/div/ion-label/ion-card/ion-card-content/div/div[2]/div/button
	
	public void uclickOnAddItem() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnAddItem));
		
		driver.findElement(clickOnAddItem).click();
		Thread.sleep(2000);
	}
	
	// Select Course
	By SelectCourse = By.xpath("//*[@class=\"item item-block item-md item-radio ng-star-inserted\"]");
	// /html/body/ion-app/ion-modal/div/course-selection/ion-content/div[2]/ion-list/ion-item[1]
	
	public void uSelectCourse() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(SelectCourse));
		
		driver.findElement(SelectCourse).click();
		Thread.sleep(2000);
	}
	
	// Click on Cart button
	By ClickonCartbutton = By.xpath("(//*[@class=\"fab fab-md ng-tns-c0-0 fab-md-primary\"])[1]");
	// /html/body/ion-app/ng-component/ion-nav/page-menu/ion-fab[1]
	
	public void uClickonCartbutton() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonCartbutton));
		
		driver.findElement(ClickonCartbutton).click();
		Thread.sleep(2000);
	}
	
	// Click on Confirm button
	By ClickonConfirmbutton = By.xpath("//span[contains(text(),'Confirm Order')]");
	// /html/body/ion-app/ion-modal/div/page-order-cart/ion-footer/button
	
	public void uClickonConfirmbutton() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonConfirmbutton));
		
		driver.findElement(ClickonConfirmbutton).click();
		Thread.sleep(2000);
	}
	
	// Click on Checkout button
	By ClickonCheckoutbutton = By.xpath("//span[contains(text(),'Checkout')]");
	
	public void uClickonCheckoutbutton() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonCheckoutbutton));
		
		driver.findElement(ClickonCheckoutbutton).click();
		Thread.sleep(2000);
	}
	
	// Click on Continue button
	By ClickonContinuebutton = By.xpath("/html/body/ion-app/ion-modal[2]/div/page-finalize-bill/ion-footer/ion-buttons/button");
	
	public void uClickonContinuebutton() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonContinuebutton));
		
		driver.findElement(ClickonContinuebutton).click();
		Thread.sleep(2000);
	}
	
	// Click on Guest name
	By ClickonGuestname = By.xpath("(//*[@class=\"text-input text-input-md ng-star-inserted\"])[1]");
	// /html/body/ion-app/ion-modal[3]/div/order-information/ion-content/div[2]/ion-item[1]/div[1]/div/ion-input/input
	
	public void uClickonGuestname() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonGuestname));
		
		driver.findElement(ClickonGuestname).sendKeys("Automation User");
		Thread.sleep(2000);
	}
	
	//  Click on Phone
	By  ClickonPhone = By.xpath("(//*[@class=\"text-input text-input-md ng-star-inserted\"])[2]");
	// /html/body/ion-app/ion-modal[3]/div/order-information/ion-content/div[2]/ion-item[2]/div[1]/div/ion-input/input
	
	public void uClickonPhone() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonPhone));
		
		driver.findElement(ClickonPhone).sendKeys("87878788787");
		Thread.sleep(2000);
	}
	
	// Click on Place order button
	By ClickonPlaceorderbutton = By.xpath("//span[contains(text(),'Place Order')]");
	// /html/body/ion-app/ion-modal[3]/div/order-information/ion-footer/button[2]
	
	public void uClickonPlaceorderbutton() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonPlaceorderbutton));
		
		driver.findElement(ClickonPlaceorderbutton).click();
		Thread.sleep(2000);
	}
	
	
	// Click on Accept button
	By ClickonAcceptbutton = By.xpath("//p[contains(text(),'Accept')]");
	// //*[@id=\"nucleusNotification\"]/div/div[2]/button
	
	public void uClickonAcceptbutton() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonAcceptbutton));
		
		driver.findElement(ClickonAcceptbutton).click();
		Thread.sleep(2000);
	}
	
	// Click on Accept button in Order View
	By ClickonAcceptbuttoninOrderView = By.xpath("//span[contains(text(),'Accept')]");
	
	public void uClickonAcceptbuttoninOrderView() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonAcceptbuttoninOrderView));
		
		driver.findElement(ClickonAcceptbuttoninOrderView).click();
		Thread.sleep(2000);
	}
	
	// Click on Go to menu button in Order View
	By ClickonGoToMenubutton = By.xpath("//span[contains(text(),'Go to Menu')]");
	
	public void uClickonGoToMenubutton() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonGoToMenubutton));
		
		driver.findElement(ClickonGoToMenubutton).click();
		Thread.sleep(2000);
	}
	
	// Click on Continue button
	By ClickonConitinuebuttonInOrderInfo = By.xpath("/html/body/ion-app/ion-modal[4]/div/order-success/ion-content/div[2]/button");
	
	public void uClickonConitinuebuttonInOrderInfo() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonConitinuebuttonInOrderInfo));
		
		driver.findElement(ClickonConitinuebuttonInOrderInfo).click();
		Thread.sleep(2000);
	}

	// Click on View button
	By ClickonViewbutton = By.xpath("//p[contains(text(),'View')]");
	// //*[@id=\"nucleusNotification\"]/div/div[2]/ion-buttons/button[1]
	
	public void uClickonViewbutton() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonViewbutton));
		
		driver.findElement(ClickonViewbutton).click();
		Thread.sleep(2000);
	}
	
	// Click on Pending
	By ClickonPending = By.xpath("/html/body/ion-app/ng-component/ion-nav/page-dinein/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-row/ion-col[4]/div/ion-buttons/button[1]");
	
	public void uClickonPending() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonPending));
		
		driver.findElement(ClickonPending).click();
		Thread.sleep(2000);
	}
	
	// Click on Approve button
	By ClickonApprovebutton = By.xpath("//*[@id=\"tableRoomAction\"]/div/ion-content/div[2]/table-action/ion-footer/ion-buttons/button[1]");
	
	public void uClickonApprovebutton() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonApprovebutton));
		
		driver.findElement(ClickonApprovebutton).click();
		Thread.sleep(2000);
	}
	
	// Click on Cancel button
	By ClickonCancelbutton = By.xpath("//*[@id=\"tableRoomAction\"]/div/ion-content/div[2]/table-action/ion-toolbar/div[2]/div[1]/ion-buttons");
	
	public void uClickonCancelbutton() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonCancelbutton));
		
		driver.findElement(ClickonCancelbutton).click();
		Thread.sleep(2000);
	}
	
	// Click on menu in Dine in
	By Clickonmenu = By.xpath("/html/body/ion-app/ng-component/ion-nav/page-dinein/ion-header/header/ion-navbar/div[2]");
	
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
	
	// Click on Contactless Icon
	By ClickonContactlessIcon = By.xpath("//*[@id=\"cart-btn\"]");
	
	public void uClickonContactlessIcon() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonContactlessIcon));
		
		driver.findElement(ClickonContactlessIcon).click();
		Thread.sleep(3000);
	}
	
	// Click on Accept Button in contactless order popup
	By ClickonAcceptButton = By.xpath("//i[contains(text(),'done')]");
	// /html/body/ion-app/ng-component/ion-nav/contactless/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-card/ion-card-content/ion-list/ion-item/div[1]/div/ion-label/div[4]/div/ion-buttons/button[1]
	
	public void uClickonAcceptButton() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonAcceptButton));
		
		driver.findElement(ClickonAcceptButton).click();
		Thread.sleep(2000);
	}
	
	// Click on Back Button in contactless order popup
	By ClickonBackButton = By.xpath("/html/body/ion-app/ng-component/ion-nav/contactless/ion-header/header/ion-navbar/button");
	
	public void uClickonBackButton() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonBackButton));
		
		driver.findElement(ClickonBackButton).click();
		Thread.sleep(3000);
	}
	
	// Click on Dine In
	By DienIn = By.xpath("//p[contains(text(),'Dine In')]");
	
	public void uDineIn() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(DienIn));
		
		driver.findElement(DienIn).click();
		Thread.sleep(3000);
	}
	
	// Click on Decline button
	By ClickonDeclinebutton = By.xpath("//p[contains(text(),'Decline')]");
	// //*[@id=\"nucleusNotification\"]/div/div[2]/ion-buttons/button[2]
	
	public void uClickonDeclinebutton() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonDeclinebutton));
		
		driver.findElement(ClickonDeclinebutton).click();
		Thread.sleep(2000);
	}
	
	// Click on Decline button in Order Popup
	By ClickonDeclinebuttoninOrderPopup = By.xpath("//span[contains(text(),'Decline')]");
	// /html/body/ion-app/ion-modal/div/delivery-order-detail/ion-footer/ion-buttons/button[3]
	
	public void uClickonDeclinebuttoninOrderPopup() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonDeclinebuttoninOrderPopup));
		
		driver.findElement(ClickonDeclinebuttoninOrderPopup).click();
		Thread.sleep(2000);
	}
	
	// Click on Decline button in Table
	By ClickonDeclinebuttonininTable = By.xpath("//i[contains(text(),'close')]");
	// //*[@id=\"tableRoomAction\"]/div/ion-content/div[2]/table-action/ion-footer/ion-buttons/button[2]
	
	public void uClickonDeclinebuttonininTable() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonDeclinebuttonininTable));
		
		driver.findElement(ClickonDeclinebuttonininTable).click();
		Thread.sleep(2000);
	}
	
	// Click on Decline button in Table
	By ClickonDeclinebuttoninContactlessPage = By.xpath("//i[contains(text(),'close')]");
	// /html/body/ion-app/ng-component/ion-nav/contactless/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-card/ion-card-content/ion-list/ion-item/div[1]/div/ion-label/div[4]/div/ion-buttons/button[2]
	
	public void uClickonDeclinebuttoninContactlessPage() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonDeclinebuttoninContactlessPage));
		
		driver.findElement(ClickonDeclinebuttoninContactlessPage).click();
		Thread.sleep(2000);
	}
	
	// Click on Pay Now button
	By ClickonPayNowbutton = By.xpath("//span[contains(text(),'Pay Now ')]");
	// /html/body/ion-app/ion-modal[3]/div/order-information/ion-footer/button[1]
	
	public void uClickonPayNowbutton() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonPayNowbutton));
		
		driver.findElement(ClickonPayNowbutton).click();
		Thread.sleep(2000);
	}
	
	// Click on Done button
	By ClickonDonebutton = By.xpath("//span[contains(text(),'Done ')]");
	// /html/body/ion-app/ion-modal[4]/div/tip-modal/ion-footer/ion-row/ion-col[1]/button
	
	public void uClickonDonebutton() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonDonebutton));
		
		driver.findElement(ClickonDonebutton).click();
		Thread.sleep(2000);
	}
	
	// Select "ipayafrica" payment 
	By Selectipayafricapayment  = By.xpath("//h2[contains(text(),'ipayafrica')]");
	// /html/body/ion-app/ion-modal[4]/div/payment-select/ion-content/div[2]/ion-list/ion-item[1]
	
	public void uSelectipayafricapayment() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(Selectipayafricapayment));
		
		driver.findElement(Selectipayafricapayment).click();
		Thread.sleep(2000);
	}
	
	// Click on Pay
	By ClickonPay  = By.xpath("(//span[contains(text(),'Pay')])[2]");
	// /html/body/ion-app/ion-modal[4]/div/payment-select/ion-footer/button
	
	public void uClickonPay() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonPay));
		
		driver.findElement(ClickonPay).click();
		Thread.sleep(3000);
	}
	
	// Close the new window, if that window no more required
	By Closethenewwindow  = By.xpath("//*[@id=\"root\"]/div/section/section/div/div/div/div/form/div/div[3]/div/div[2]/div/div[2]");
	
	public void uClosethenewwindow() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(Closethenewwindow));
		
		driver.findElement(Closethenewwindow).click();
		Thread.sleep(3000);
	}
	
	// Click on Done button in payment
	By ClickonDonebuttoninpayment  = By.xpath("//span[contains(text(),'Done')]");
	// /html/body/ion-app/ion-modal/div/payment-status/ion-footer/button
	
	public void uClickonDonebuttoninpayment() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonDonebuttoninpayment));
		
		driver.findElement(ClickonDonebuttoninpayment).click();
		Thread.sleep(3000);
	}
	
	// Click on Sub Menu
	By ClickonSubMenu  = By.xpath("(//*[@class=\"item item-block item-md ng-tns-c0-0 ng-star-inserted\"])[3]");
	
	public void uClickonSubMenu() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonSubMenu));
		
		driver.findElement(ClickonSubMenu).click();
		Thread.sleep(3000);
	}
	
	// Click on Item Group
	By ClickonItemGroup  = By.xpath("(//span[contains(text(),'Add')])[40]");
	
	public void uClickonItemGroup() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonItemGroup));
		
		driver.findElement(ClickonItemGroup).click();
		Thread.sleep(3000);
	}
	
	// Click on Add Item in Item Group
	By ClickonAddIteminItemGroup  = By.xpath("(//span[contains(text(),'Add')])[45]");
	
	public void uClickonAddIteminItemGroup() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonAddIteminItemGroup));
		
		driver.findElement(ClickonAddIteminItemGroup).click();
		Thread.sleep(3000);
	}
	
	// Click on cancel button in Item Group
	By ClickoncancelbuttoninItemGroup  = By.xpath("/html/body/ion-app/ion-modal/div/item-group-items/ion-header/ion-toolbar/div[2]/button");
	
	public void uClickoncancelbuttoninItemGroup() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickoncancelbuttoninItemGroup));
		
		driver.findElement(ClickoncancelbuttoninItemGroup).click();
		Thread.sleep(3000);
	}
	
	// Click on Add Item For Modifier
	By AddItemForModifier  = By.xpath("(//span[contains(text(),'Add')])[3]");
	
	public void uAddItemForModifier() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(AddItemForModifier));
		
		driver.findElement(AddItemForModifier).click();
		Thread.sleep(3000);
	}
	
	// Click on Add Item For Modifier
	By ClickonAddItemForModifier  = By.xpath("//span[contains(text(),'Add Item')]");
	
	public void uClickonAddItemForModifier() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonAddItemForModifier));
		
		driver.findElement(ClickonAddItemForModifier).click();
		Thread.sleep(3000);
	}
	
	// Click on Cart icon
	By ClickonCarticon  = By.xpath("(//*[@class=\"close button button-md button-clear button-clear-md button-clear-md-dark\"])[1]");
	
	public void uClickonCarticon() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonCarticon));
		
		driver.findElement(ClickonCarticon).click();
		Thread.sleep(3000);
	}
	
	// Click on Order Detail
	By ClickonOrderDetail  = By.xpath("(//span[contains(text(),'Order Detail')])[1]");
	// /html/body/ion-app/ion-modal[2]/div/order-history/ion-content/div[2]/ion-card/order-history-information/ion-card-content/ion-grid/ion-row[2]/ion-col/button
	
	public void uClickonOrderDetail() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonOrderDetail));
		
		driver.findElement(ClickonOrderDetail).click();
		Thread.sleep(3000);
	}
	
	// Click on Repeat Icon
	By ClickonRepeatIcon  = By.xpath("//*[@aria-label=\"custom repeat\"]");
	// /html/body/ion-app/ion-modal[3]/div/order-detail/ion-content/div[2]/ion-row[2]/ion-col/order-list-data/ion-list/ion-item/div[1]/div/ion-label/ion-row[1]/ion-col[1]/ion-icon
	
	public void uClickonRepeatIcon() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonRepeatIcon));
		
		driver.findElement(ClickonRepeatIcon).click();
		Thread.sleep(3000);
	}
	
	// Click on Repeat Button
	By ClickonRepeatButton  = By.xpath("//span[contains(text(),'Repeat')]");
	// /html/body/ion-app/ion-alert/div/div[3]/button[2]
	
	public void uClickonRepeatButton() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonRepeatButton));
		
		driver.findElement(ClickonRepeatButton).click();
		Thread.sleep(3000);
	}
	
	// Click on Cancel icon
	By ClickonCancelicon  = By.xpath("/html/body/ion-app/ion-modal[3]/div/order-detail/ion-header/ion-toolbar/div[2]/button");
	
	public void uClickonCancelicon() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonCancelicon));
		
		driver.findElement(ClickonCancelicon).click();
		Thread.sleep(3000);
	}
	
	// Click on Back icon
	By ClickonBackicon  = By.xpath("/html/body/ion-app/ion-modal[2]/div/order-history/ion-header/ion-toolbar/div[2]/button");
	
	public void uClickonBackicon() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonBackicon));
		
		driver.findElement(ClickonBackicon).click();
		Thread.sleep(3000);
	}
	
	// Click on void button
	By Clickonvoidbutton  = By.xpath("/html/body/ion-app/ion-modal/div/page-order-cart/ion-content/div[2]/div/div/ion-list/order-item/ion-item/div[1]/div/ion-label/ion-card/ion-card-content/div/div[2]/div/span/button[1]");
	
	public void uClickonvoidbutton() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(Clickonvoidbutton));
		
		driver.findElement(Clickonvoidbutton).click();
		Thread.sleep(3000);
	}
	
	// Click on Remove button
	By ClickonRemovebutton  = By.xpath("//span[contains(text(),'Remove')]");
	
	public void uClickonRemovebutton() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonRemovebutton));
		
		driver.findElement(ClickonRemovebutton).click();
		Thread.sleep(3000);
	}
	
	// Click on Back Icon in Cart page
	By ClickonBackIconinCartpage  = By.xpath("/html/body/ion-app/ion-modal/div/page-order-cart/ion-header/ion-toolbar/div[2]/button[2]");
	
	public void uClickonBackIconinCartpage() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonBackIconinCartpage));
		
		driver.findElement(ClickonBackIconinCartpage).click();
		Thread.sleep(3000);
	}
	
	// Click on + Button in QTY
	By ClickonPlusButtoninQTY  = By.xpath("/html/body/ion-app/ion-modal/div/page-order-cart/ion-content/div[2]/div/div/ion-list/order-item/ion-item/div[1]/div/ion-label/ion-card/ion-card-content/div/div[2]/div/span/button[2]");
	
	public void uClickonPlusButtoninQTY() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonPlusButtoninQTY));
		
		driver.findElement(ClickonPlusButtoninQTY).click();
		Thread.sleep(3000);
	}
	
	// Click on -> arrow icon in contactless order notification
	By Clickonarrowicon  = By.xpath("(//i[contains(text(),'arrow_forward')])[2]");
	
	public void uClickonarrowicon() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(Clickonarrowicon));
		
		driver.findElement(Clickonarrowicon).click();
		Thread.sleep(2000);
	}
	
	// Click on instruction
	By ClickonInstruction  = By.xpath("//*[@id=\"remark\"]/span/i");
	
	public void uClickonInstruction() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonInstruction));
		
		driver.findElement(ClickonInstruction).click();
		Thread.sleep(2000);
	}
	
	// Enter instruction
	By Enterinstruction  = By.xpath("/html/body/ion-app/ion-modal[2]/div/comment/ion-content/div[2]/ion-item/div[1]/div/ion-textarea/textarea");
	
	public void uEnterinstruction() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(Enterinstruction));
		
		driver.findElement(Enterinstruction).sendKeys("Test Remarks");
		Thread.sleep(2000);
	}
	
	// Click on Save button
	By ClickonSavebutton  = By.xpath("/html/body/ion-app/ion-modal[2]/div/comment/ion-footer/button");
	
	public void uClickonSavebutton() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonSavebutton));
		
		driver.findElement(ClickonSavebutton).click();
		Thread.sleep(2000);
	}
	
	// Click on Remove button in Instruction
	By ClickonRemovebuttoninInstruction  = By.xpath("//*[@id=\"remark\"]/div[2]/ion-icon");
	
	public void uClickonRemovebuttoninInstruction() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonRemovebuttoninInstruction));
		
		driver.findElement(ClickonRemovebuttoninInstruction).click();
		Thread.sleep(2000);
	}
	
	// Click on Pay in iPayafrica Tab
	public void ClickonPayiniPayafricaTab() throws Exception {
		
		String winHandleBefore = driver.getWindowHandle();

		for (String winHandle : driver.getWindowHandles()) {
			
			driver.switchTo().window(winHandle);
			Thread.sleep(15000);
		}
		
		
		// Close the new window, if that window no more required
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/div/div/div/div/form/div/div[3]/div/div[2]/div/div[2]")).click();
		Thread.sleep(15000);

		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);
		
		// Click on Done button in payment
		
		driver.findElement(By.xpath("/html/body/ion-app/ion-modal/div/payment-status/ion-footer/button")).click();
		Thread.sleep(2000);
		
	}
	


}
