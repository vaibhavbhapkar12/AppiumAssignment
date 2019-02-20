package com.cucumber.util;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Initializer {

	public static AndroidDriver<AndroidElement> driver;

	/*
	 * public Initializer(AndroidDriver<AndroidElement> driver) {
	 * PageFactory.initElements(driver, this); }
	 */
	public static void initialization() throws MalformedURLException {

		new DesiredCapabilities();
		DesiredCapabilities capabilities = DesiredCapabilities.android();
		capabilities.setCapability("no", true);
		capabilities.setCapability("newCommandTimeout", 100);
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("appium-version", "1.10.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("deviceName", "A67PVGQCIZMBAMDQ");
		capabilities.setCapability("app", "/Users/vaibhav.bhapkar/Downloads/Sudoku.apk");
		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.findElement(By.id("btnAccept")).click();
		driver.findElement(By.id("btnAccept")).click();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.findElement(By.id("skip")).click();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

	}

}
