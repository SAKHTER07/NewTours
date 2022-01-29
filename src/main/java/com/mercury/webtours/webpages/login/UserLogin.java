package com.mercury.webtours.webpages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * ****************************************************************************************************************
 * @author sakhter
 * Test Name: User login
 * Description: This class will store the locators and methods of the test
 * Date: 01/29/2022
 * ****************************************************************************************************************
 */
public class UserLogin {
	WebDriver driver;
	public UserLogin(WebDriver driver) {
		this.driver = driver;		
	}
	/**
	 * ************************************************************************************************************
	                           Web elements - Test Name: User login
	 * *************************************************************************************************************
	 */
	@FindBy(name="userName") WebElement usernameInput;
	@FindBy(name="password") WebElement passwordInput;
	@FindBy(name="submit") WebElement submitBtn;
	@FindBy(xpath="//tbody//tr//h3") WebElement loginConfirmationMessage;
	/**
	 * ************************************************************************************************************
	                           Methods- Test Name: User login
	 * *************************************************************************************************************
	 */
	
	@Test
	public void userLoginElementsAndmethods(String userName, String passWord) {
		try {
			System.out.println("Test Name: User login");
			usernameInput.sendKeys(userName);
			Thread.sleep(2000);
			passwordInput.sendKeys(passWord);
			Thread.sleep(2000);
			WebDriverWait waitSubmitBtn = new WebDriverWait(driver,120);
			waitSubmitBtn.until(ExpectedConditions.elementToBeClickable(submitBtn));
			submitBtn.click();
			Thread.sleep(2000);
			Assert.assertTrue(loginConfirmationMessage.isDisplayed(), "Unable to login");
			
		} catch (Exception e) {
			System.out.println("Not able to login"+e.getMessage());
		}
	}
	
	/**
	 * ************************************************************************************************************
	                           End of the File
	 * *************************************************************************************************************
	 */	
}
