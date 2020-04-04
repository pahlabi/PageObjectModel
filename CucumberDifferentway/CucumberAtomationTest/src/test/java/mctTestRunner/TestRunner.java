package mctTestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/"},
                  glue = {"cmtCucumberStepDefination"},
                   plugin= {"pretty","html:cucumber-option"},
                    snippets=SnippetType.CAMELCASE)
public class TestRunner {

}
