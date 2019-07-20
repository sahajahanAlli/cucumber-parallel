import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"C:/Users/Sahajahan/eclipse-workspace/Cucumber_Selenium/src/test/java/features/test.feature"},
        plugin = {"json:C:/Users/Sahajahan/eclipse-workspace/Cucumber_Selenium/target/cucumber-parallel/1.json", "html:C:/Users/Sahajahan/eclipse-workspace/Cucumber_Selenium/target/cucumber-parallel/1"},
        monochrome = false,
        tags = {},
        glue = {"seleniumgluecode"})
public class Parallel01IT {
}
