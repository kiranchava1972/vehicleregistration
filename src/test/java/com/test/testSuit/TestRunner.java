package com.test.testSuit;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        plugin = {"pretty" ,"html:target/cucumber.html", "json:target/cucumber-json-report.json", "junit:target/cucumber.xml"},
        features = "classpath:features",
        glue = {"com/test/steps"},
        tags = {"@Test01"})
public class TestRunner {
}
