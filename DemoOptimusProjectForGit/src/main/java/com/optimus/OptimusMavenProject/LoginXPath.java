package com.optimus.OptimusMavenProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginXPath {
	
	
	public static WebDriver driver;
	
	public LoginXPath(WebDriver driver) {
		
		this.driver=driver;
	}

	
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
	By selectOutlet = By.xpath("/html/body/ion-app/ion-modal/div/eo-selectable/form/ion-content/div[2]/ion-list/div[2]/ion-item[5]");
	
	public void selectOutlet() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(selectOutlet));
		
		driver.findElement(selectOutlet).click();
		Thread.sleep(2000);
		
	}
	
	
	//Select Outlet "Retro
	By select2Outlet = By.xpath("//*[@aria-posinset=\"2\"]");
	
	public void uselect2Outlet() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		wait.until(ExpectedConditions.visibilityOfElementLocated(select2Outlet));
		
		driver.findElement(select2Outlet).click();
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

}
