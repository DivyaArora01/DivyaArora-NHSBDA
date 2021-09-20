package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features/CostChecker.feature"},
        glue = {"Steps"},
        plugin = { "pretty", "json:target/report/Cucumber.json",
                "junit:target/report/Cucumber.xml",
                "html:target/report/report.html"},
        monochrome = true
        //tags = "@regression"




)
public class TestRunner {

}

