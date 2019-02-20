package com.cucumber.stepDefination;

import com.cucumber.pages.MainScreen;
import com.cucumber.pages.ThemeScreen;
import com.cucumber.util.BaseClass;
import com.cucumber.util.Initializer;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ChangeAppTheme extends Initializer {

	AndroidDriver<AndroidElement> driver;

	@Given("^I have sudoku app installed and open on my android device$")
	public void i_have_sudoku_app_installed_and_open_on_my_android_device() throws Throwable {

		Initializer.initialization();

	}

	@When("^I tap on the theme icon$")
	public void i_tap_on_the_theme_icon() throws Throwable {
		MainScreen mainScreen = new MainScreen(driver);
		mainScreen.clickTheme();

	}

	@Then("^I can change the theme from white to Dark$")
	public void i_can_change_the_theme_from_white_to_Dark() throws Throwable {
		ThemeScreen themeScreen = new ThemeScreen(driver);
		themeScreen.selectDarkTheme();
	}

}
