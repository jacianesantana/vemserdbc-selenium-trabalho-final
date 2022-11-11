package br.com.buscape.run;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features",
        tags = {"@wip"},
        glue = "br/com/buscape/steps",
        plugin = { "pretty", "io.qameta.allure.cucumberjvm.AllureCucumberJvm"},
        snippets = SnippetType.CAMELCASE
)
public class RunTest {
}
