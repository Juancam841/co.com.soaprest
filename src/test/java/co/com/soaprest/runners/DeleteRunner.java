package co.com.soaprest.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        tags = "@Regression",
        features = "src/test/resources/features/delete.feature",
        glue = {"co.com.soaprest.stepdefinitions","co.com.soaprest.stepdefinitions.hook.Hook"},
        snippets = CucumberOptions.SnippetType.CAMELCASE

)

public class DeleteRunner {
}
