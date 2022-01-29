package com.mercury.webtours.util;
/**
 * ****************************************************************************************************************
 * @author sakhter
 * Class Name: Base Class
 * Description: This class will store the browser for the tests
 * Date: 01/29/2022
 * ****************************************************************************************************************
 */
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class BrowserFactory {
	public static WebDriver startApplication (WebDriver driver, String browserName, String appURL) {
		if (browserName.equals("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(120,TimeUnit.SECONDS);
			driver.get(appURL);
			return driver;
		}
	public static void closeBrowser(WebDriver driver) {
		driver.quit();
	}
	/**
	 * ****************************************************************************************************************
	                >>>>>>>>>>>>>>>>>>>>>>>>>>>>> End of the File <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
	 * ****************************************************************************************************************
	 */	
	}


