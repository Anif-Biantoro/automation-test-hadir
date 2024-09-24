package com.juaracoding;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/main/resources/01Login.feature",
                "src/main/resources/02Lembur.feature",
                "src/main/resources/03Koreksi.feature",
                "src/main/resources/04IzinOff.feature",
                "src/main/resources/05Logout.feature",
                "src/main/resources/06LoginUser.feature"},
        glue = "com.juaracoding",  // package
        plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber.json"}
)
public class RunnerTest extends AbstractTestNGCucumberTests {
}
