package com.myApp.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions  (
        features = "src/test/resources/features",
        glue = "com/myApp/step_definitions",
        dryRun = false
)
public class TestRunner {
}
