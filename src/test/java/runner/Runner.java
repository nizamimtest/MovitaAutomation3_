package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"src/test/java/features/muratMovita"},
        glue = {"stepdefs"}
       // tags = "@test1"
        //plugin = { "pretty",
             //   "json:test-output/cucumber-reports/cucumber.json",
               // "html:test-output/cucumber-reports/cucumberreport.html",
                //"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

)
public class Runner extends AbstractTestNGCucumberTests {


}