package org.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
glue = "org.definition",
plugin = {"pretty", "html:Report","junit:Report\\junitreport.xml","json :Report\\jsonreport.json"},
monochrome = true,
dryRun = true,
snippets = SnippetType.CAMELCASE,
strict = true

		)


public class RunnerClass {

}
