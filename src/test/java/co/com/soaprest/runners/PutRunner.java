package co.com.soaprest.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        tags = "@Regression",
        features = "src/test/resources/features/put.feature",
        glue = {"co.com.soaprest.stepdefinitions", "co.com.soaprest.stepdefinitions.hook.Hook"},
        snippets = SnippetType.CAMELCASE
)

public class PutRunner {

}