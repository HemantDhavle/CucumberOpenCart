package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features", glue="stepDefination")
public class testNG_Runner extends AbstractTestNGCucumberTests{

}
