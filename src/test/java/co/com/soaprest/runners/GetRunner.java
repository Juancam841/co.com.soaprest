package co.com.soaprest.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions.SnippetType;

    @RunWith(CucumberWithSerenity.class)
    @CucumberOptions(
            features = "src/test/resources/features/get.feature",
            glue = {"co.com.soaprest.stepdefinitions", "co.com.soaprest.stepdefinitions.hook.Hook"},
            snippets = SnippetType.CAMELCASE
    )

    public class GetRunner {

    }
