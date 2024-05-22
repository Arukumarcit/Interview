package runner;

import Steps.BaseClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features",
glue = {"Steps" , "Hooks"},
monochrome=true,
publish=true)
public class Runner extends BaseClass {

}
