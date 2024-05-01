package com.optimus.OptimusMavenProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestDemo {

	public static WebDriver driver;
	
	
	
	public void enterUsername() {
		
		WebElement clickonPlus = driver.findElement(By.xpath("//*[@id=\"login-username\"]/input"));
		
		if(clickonPlus.isDisplayed()) {
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
			
			wait.until(ExpectedConditions.visibilityOfAllElements(clickonPlus));
			
			clickonPlus.click();
			
		} else {
			
			driver.close();
		}
		
	}
	
	
	
	
}
