package com.guru99.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/Features", glue="com.guru99.StepDefinition",tags="@tag5")

public class Runner {
	

	
	
}
