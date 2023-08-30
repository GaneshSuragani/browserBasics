package com.hello.broo;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)


@CucumberOptions(
        features="src/test/resources/features/browser",
        glue = {"com.hello.broo.step_defs"}
)
public class TestRunner {

}
