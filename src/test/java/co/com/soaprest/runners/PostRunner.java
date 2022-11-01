package co.com.soaprest.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        tags = "@Regression",
        features = "src/test/resources/features/post.feature",
        glue = {"co.com.soaprest.stepdefinitions", "co.com.soaprest.stepdefinitions.hook.Hook"},
        snippets = SnippetType.CAMELCASE
)

public class PostRunner {

}