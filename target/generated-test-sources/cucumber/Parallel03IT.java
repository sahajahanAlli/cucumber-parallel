import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"C:/Users/Sahajahan/eclipse-workspace/Cucumber_Selenium/src/test/java/features/test3.feature"},
        plugin = {"json:C:/Users/Sahajahan/eclipse-workspace/Cucumber_Selenium/target/cucumber-parallel/3.json", "html:C:/Users/Sahajahan/eclipse-workspace/Cucumber_Selenium/target/cucumber-parallel/3"},
        monochrome = false,
        tags = {},
        glue = {"seleniumgluecode"})
public class Parallel03IT {
}
