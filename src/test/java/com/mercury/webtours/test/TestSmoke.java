package com.mercury.webtours.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.mercury.webtours.base.BaseClass;
import com.mercury.webtours.webpages.login.UserLogin;

/**
 * ****************************************************************************************************************
 * @author sakhter
 * Test Name: 
 * Description: 
 * Date: 01/29/2022
 * ****************************************************************************************************************
 */

public class TestSmoke extends BaseClass
{
	/**
	 * ****************************************************************************************************************
	                                            Test Name: User Login
	 * ****************************************************************************************************************
	 */
	@Test(priority=0, dataProvider="getLogin")
	public void userLoginValidation (String userID, String passwd) {
		UserLogin userLogin = PageFactory.initElements(driver, UserLogin.class);
		userLogin.userLoginElementsAndmethods(userID, passwd);
	}
	
   
}
