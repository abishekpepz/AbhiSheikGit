package org.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue= {"org.step"},snippets=SnippetType.CAMELCASE,monochrome=true,tags= {"@Sanity,@Smoke"},plugin= {"rerun:src/test/resources/failed.txt"})
public class RunnerClass {

}
