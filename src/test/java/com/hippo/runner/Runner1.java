package com.hippo.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(monochrome=true,
features="resources/features",
glue="com.hippo.stepdef",
strict=true,
tags="@alltest")
public class Runner1 {

}

