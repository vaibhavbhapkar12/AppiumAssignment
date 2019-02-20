package com.cucumber.pages;

//import org.apache.log4j.Logger;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

//import com.cucumber.framework.helper.Logger.LoggerHelper;
//import com.cucumber.framework.helper.PageObject.homepage.HomePage;
import com.cucumber.util.BaseClass;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ThemeScreen extends BaseClass {

	// private AndroidDriver<AndroidElement> driver;

	public ThemeScreen(AndroidDriver<AndroidElement> driver) {
		super(driver);
		this.driver = driver;
	}

	/*
	 * public ThemeScreen() { PageFactory.initElements(driver, this); }
	 */

	@FindBy(how = How.ID, using = "theme_white")
	public MobileElement themeWhite;

	@FindBy(how = How.ID, using = "theme_sepia")
	public MobileElement themeSepia;

	@FindBy(how = How.ID, using = "theme_dark")
	public MobileElement themeDark;

	@FindBy(how = How.ID, using = "ok")
	public MobileElement btnOk;

	public void selectWhiteTheme() {
		if (themeWhite.isDisplayed()) {
			themeWhite.click();
			btnOk.click();
			// log.info("");
		} else {
			// log.info("White theme is not displayed");
			driver.close();
		}
	}

	public void selectSepiaTheme() {
		if (themeSepia.isDisplayed()) {
			themeSepia.click();
			btnOk.click();
		} else {
			// log.info("White theme is not displayed");
			driver.close();
		}
	}

	public void selectDarkTheme() {
		if (themeDark.isDisplayed()) {
			themeDark.click();
			btnOk.click();
		} else {
			// log.info("White theme is not displayed");
			driver.close();
		}
	}

}
