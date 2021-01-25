package com.medikeeper.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:/target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "json:target/target/cucumber.json"
        },
        features = "src/test/resources/features",
        glue = "com/medikeeper/step_definitions",
        dryRun = false,
        tags = "",
        publish = true
)
public class CucumberRunner {
}
