package Cucumber_Selenium.Cucumber_Selenium;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/java/Features"
,glue= {"SeleniumGlueCode"}
)

public class testrunner {

}