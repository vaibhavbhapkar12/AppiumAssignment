package com.cucumber.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.util.BaseClass;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class MainScreen extends BaseClass {

	public MainScreen(AndroidDriver<AndroidElement> driver) {
		super(driver);

	}

	/*
	 * public MainScreen() { PageFactory.initElements(driver, this); }
	 */
	/** MobileElements **/

	@FindBy(how = How.ID, using = "title")
	public MobileElement titleNewGame;

	@FindBy(how = How.ID, using = "action_theme")
	public MobileElement imgTheme;

	@FindBy(how = How.ID, using = "dc_custom_imge_view_star")
	public MobileElement imgStar;

	@FindBy(how = How.ID, using = "action_pause_resume")
	public MobileElement btnPausePlay;

	@FindBy(how = How.ID, using = "action_more")
	public MobileElement btnMoreOption;

	@FindBy(how = How.ID, using = "game_complexity")
	public MobileElement txtComplexity;

	@FindBy(how = How.ID, using = "game_over_mistakes")
	public MobileElement txtMistakes;

	@FindBy(how = How.ID, using = "game_time")
	public MobileElement txtGameTime;

	@FindBy(how = How.ID, using = "sudoku_board")
	public MobileElement frmGameBoard;

	@FindBy(how = How.ID, using = "button_undo")
	public MobileElement btnUndo;

	@FindBy(how = How.ID, using = "button_erase")
	public MobileElement btnEarse;

	@FindBy(how = How.ID, using = "button_pencil")
	public MobileElement btnPencil;

	@FindBy(how = How.ID, using = "button_hint")
	public MobileElement btnHint;

	@FindBy(how = How.ID, using = "button_1")
	public MobileElement btn1;

	@FindBy(how = How.ID, using = "button_2")
	public MobileElement btn2;

	@FindBy(how = How.ID, using = "button_3")
	public MobileElement btn3;

	@FindBy(how = How.ID, using = "button_4")
	public MobileElement btn4;

	@FindBy(how = How.ID, using = "button_5")
	public MobileElement btn5;

	@FindBy(how = How.ID, using = "button_6")
	public MobileElement btn6;

	@FindBy(how = How.ID, using = "button_7")
	public MobileElement btn7;

	@FindBy(how = How.ID, using = "button_8")
	public MobileElement btn8;

	@FindBy(how = How.ID, using = "button_9")
	public MobileElement btn9;

	public void clickTheme() {
		if (imgTheme.isDisplayed()) {
			imgTheme.click();
			// log.info("");
		} else {
			// log.info("Theme option does not displayed");
			driver.close();
		}
	}

}
