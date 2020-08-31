package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @CucumberOptions(features = {"src/test/features/homePage.feature"},
            glue = {"stepDefinitions"},
            plugin = {"pretty:target/test.html"}
            //tags = {"@ui","@regression"}
           // dryRun = true,
            //strict = true,
            //monochrome = true

    )

    @RunWith(Cucumber.class)
    public class TestRunner
    {

    }
