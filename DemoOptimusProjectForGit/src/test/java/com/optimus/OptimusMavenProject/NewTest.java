package com.optimus.OptimusMavenProject;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class NewTest {
	
	public static WebDriver driver;
	
  @Test
  public void f() {
	  
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		  
		// Create Order (+) button
	  
		WebDriverWait wait7 = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait7.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/ion-app/ng-component/ion-nav/page-dinein/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-row/ion-col[1]/div/ion-buttons/button")));

		driver.findElement(By.xpath("/html/body/ion-app/ng-component/ion-nav/page-dinein/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-row/ion-col[1]/div/ion-buttons/button")).click();


		// Order Information popup Guest information
		
		WebDriverWait wait8 = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait8.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/ion-app/ion-modal/div/order-information/form/ion-footer/ion-buttons[2]/button")));

		driver.findElement(By.xpath("/html/body/ion-app/ion-modal/div/order-information/form/ion-footer/ion-buttons[2]/button")).click();


		// ================================= Select Item  ==================================================== 

		WebDriverWait wait9 = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait9.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/ion-app/ng-component/ion-nav/page-orderscreen/ion-content/div[2]/ion-grid/ion-row[1]/ion-col[1]/order-area/item-image/ion-card/ion-card-content/ion-grid/ion-row/ion-col[1]")));

		driver.findElement(By.xpath("/html/body/ion-app/ng-component/ion-nav/page-orderscreen/ion-content/div[2]/ion-grid/ion-row[1]/ion-col[1]/order-area/item-image/ion-card/ion-card-content/ion-grid/ion-row/ion-col[1]")).click();


		// Course Selection
		
		WebDriverWait wait10 = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/ion-app/ion-modal/div/item-wizard/ion-content/div[2]/ion-stepper/div/div[1]/div/div/div[2]/ion-list/ion-item[1]")));

		driver.findElement(By.xpath("/html/body/ion-app/ion-modal/div/item-wizard/ion-content/div[2]/ion-stepper/div/div[1]/div/div/div[2]/ion-list/ion-item[1]")).click();


		// Click on Finish button
		
		WebDriverWait wait11 = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/ion-app/ion-modal/div/item-wizard/ion-footer/button[2]")));

		
		driver.findElement(By.xpath("/html/body/ion-app/ion-modal/div/item-wizard/ion-footer/button[2]")).click();


		// ================================= Save Button  ======================================================
		
		WebDriverWait wait12 = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait12.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/ion-app/ng-component/ion-nav/page-orderscreen/ion-content/div[2]/ion-grid/ion-row[1]/ion-col[1]/order-area/order-action-buttons/ion-buttons[2]/button[3]")));

		driver.findElement(By.xpath("/html/body/ion-app/ng-component/ion-nav/page-orderscreen/ion-content/div[2]/ion-grid/ion-row[1]/ion-col[1]/order-area/order-action-buttons/ion-buttons[2]/button[3]")).click();


  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	 
	  
	 WebDriverManager.chromedriver().setup();
		 
		 ChromeOptions options = new ChromeOptions();
		    options.setHeadless(false);
		    options.addArguments("start-maximized"); // open Browser in maximized mode
		    options.addArguments("disable-infobars"); // disabling infobars
		    options.addArguments("--disable-extensions"); // disabling extensions
		    options.addArguments("--disable-gpu"); // applicable to Windows os only
		    options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
		    options.addArguments("--no-sandbox"); // Bypass OS security model
		    options.addArguments("--disable-in-process-stack-traces");
		    options.addArguments("--disable-logging");
		    options.addArguments("--log-level=3");
		    options.addArguments("--remote-allow-origins=*");

		    driver = new ChromeDriver(options);
		    
			  driver.get("https://app.ipos247.com/app2/#/");
				
				driver.manage().window().maximize();
				
				 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
				
				// Enter User Name
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login-username\"]/input")));
				
				driver.findElement(By.name("username")).click();

			  	driver.findElement(By.xpath("//*[@id=\"login-username\"]/input")).sendKeys("makbul");
			  	
			  	// Enter Password
			  	
				WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(10));
				wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login-password\"]/input")));
				
			  	driver.findElement(By.name("password")).click();

			  	driver.findElement(By.xpath("//*[@id=\"login-password\"]/input")).sendKeys("makbul123");

			  	// Restaurant Code 
			  	
				WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(10));
				wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login-hotelcode\"]/input")));
				
			  	driver.findElement(By.name("hotelcode")).click();

			  	driver.findElement(By.xpath("//*[@id=\"login-hotelcode\"]/input")).sendKeys("14607");
			  	
			  	// Login Button
			  	
				WebDriverWait wait3 = new WebDriverWait(driver,Duration.ofSeconds(10));
				wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login-btn\"]")));
				
			  	driver.findElement(By.xpath("//*[@id=\"login-btn\"]")).click();
			  	
			  	// Click on outlet drop-down for select
			  	
				WebDriverWait wait4 = new WebDriverWait(driver,Duration.ofSeconds(10));
				wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/ion-app/ng-component/ion-nav/page-terminal-outlet/ion-content/div[2]/div/form/ion-list/ion-item[1]")));

			  	driver.findElement(By.xpath("/html/body/ion-app/ng-component/ion-nav/page-terminal-outlet/ion-content/div[2]/div/form/ion-list/ion-item[1]")).click();

			  	// Select Outlet to Login

				WebDriverWait wait5 = new WebDriverWait(driver,Duration.ofSeconds(10));
				wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/ion-app/ion-modal/div/eo-selectable/form/ion-content/div[2]/ion-list/div[2]/ion-item[5]")));

			  	driver.findElement(By.xpath("/html/body/ion-app/ion-modal/div/eo-selectable/form/ion-content/div[2]/ion-list/div[2]/ion-item[5]")).click();

//			  	// Select terminal
		//
//			  	driver.findElement(By.xpath("/html/body/ion-app/ng-component/ion-nav/page-terminal-outlet/ion-content/div[2]/div/form/ion-list/ion-item[2]")).click();
		//
//			  	Thread.sleep(2000);
		//
//			  	driver.findElement(By.xpath("/html/body/ion-app/ion-modal/div/eo-selectable/form/ion-content/div[2]/ion-list/div[2]/ion-item[2]")).click();

			  	// Get Me In button
			  	
				WebDriverWait wait6 = new WebDriverWait(driver,Duration.ofSeconds(10));
				wait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@id='login-btn']/span)[2]")));


			  	driver.findElement(By.xpath("(//button[@id='login-btn']/span)[2]")).click();
			  	
			  	Thread.sleep(5000);
  }

}
