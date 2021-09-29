package runner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src\\test\\resources\\Login\\login.feature"},
glue="StepDefinition",
dryRun = true

		)
public class Test_Runner extends AbstractTestNGCucumberTests{
	
	
 
}
