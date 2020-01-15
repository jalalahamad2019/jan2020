package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\moham\\eclipse-workspace\\pearson\\JenkinsTest\\src\\test\\resources",
glue="com.test",
plugin= {"html:target","json:target/jalal/cucu.json"})
public class TestRunner {

}
