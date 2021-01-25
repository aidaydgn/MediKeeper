package com.medikeeper.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={
                "rerun:target/rerun.txt",
                "html:target/cucumber-report.html",
                "json:target/target/cucumber.json"
        },
        glue = "com/medikeeper/step_definitions",
        features = "@target/rerun.txt",
        dryRun = false
)
public class FailedRunner {
}