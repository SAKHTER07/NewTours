package com.mercury.webtours.base;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import com.mercury.webtours.datadriven.TestDataUtil;
import com.mercury.webtours.util.BrowserFactory;

/**
 * ****************************************************************************************************************
 * @author sakhter
 * Class Name: Base Class
 * Description: This class will store the pre-conditions and the post conditions of the Tests
 * Date: 01/29/2022
 * ****************************************************************************************************************
 */
public class BaseClass 
{
public WebDriver driver;
public String browser = "Chrome";
public String baseURL = "https://demo.guru99.com/test/newtours/";

    @BeforeClass
    public void startBrowser() {
    	try
    	{
    		Thread.sleep(2000);
    		driver = BrowserFactory.startApplication(driver, browser, baseURL);
    		System.out.println( "Validate that the expected url is  "+driver.getCurrentUrl());
    		Assert.assertEquals("https://demo.guru99.com/test/newtours/", driver.getCurrentUrl());
    	} catch (Exception e) {
    		System.out.println( "Test is not successful "+e.getMessage());
    	}
    }
    @AfterClass
    public void closeBrowser() {
    	try
    	{
    		Thread.sleep(2000);
    		BrowserFactory.closeBrowser(driver);
    	} catch (Exception e) {
    		System.out.println( "Test is not successful "+e.getMessage());
    	}     
    }
  @DataProvider
  public Iterator<Object[]> getLogin(){
	  ArrayList<Object[]> testdata = TestDataUtil.getLogin();
	  return testdata.iterator();
  }
  
    /**
	 * ****************************************************************************************************************
	                >>>>>>>>>>>>>>>>>>>>>>>>>>>>> End of the File <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
	 * ****************************************************************************************************************
	 */	
}
