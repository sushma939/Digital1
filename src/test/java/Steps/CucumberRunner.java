package Steps;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/destination/cucumber.json","pretty", "html:target/cucumber/report.html"},
        features = "src/test/resources/Feature",
        tags="@Digital",
        glue = {"com.quinbay"}
)
public class CucumberRunner {
}
