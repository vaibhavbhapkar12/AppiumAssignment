package com.cucumber.runner;

import cucumber.api.CucumberOptions;

@CucumberOptions(features = { "classpath:com.cucumber.features/ThemeOption.feature" }, glue = {
		"classpath:com.cucumber.stepDefinition" }, plugin = { "pretty", "json:target/ThemeRunner.json" })
public class ThemeOptionRunner {

}
