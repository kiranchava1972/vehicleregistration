package com.vehiclereg.testSuit;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)
//@CucumberOptions(
//        features = {"src/main/resources/features/"},
//        glue = {"com.vehiclereg/stepDefs"},
//        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
//        tags = {"@Test01"})


@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        plugin = {"pretty" ,"html:target/cucumber.html", "json:target/cucumber-json-report.json", "junit:target/cucumber.xml"},
        features = "src/main/resources/features",
        glue = {"steps"},
        tags = {"@Test01"})

public class TestRunner {
}
