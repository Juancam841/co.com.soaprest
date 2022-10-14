package co.com.proyectobase.runners;

import io.cucumber.junit.CucumberOptions.SnippetType;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


    @RunWith(CucumberWithSerenity.class)
    @CucumberOptions(
            tags = "@Scenario1",
            plugin ={"pretty"},
            features = "src/test/resources/features/feature.feature",
            glue = "src/test/java/stepdefinitions",
            snippets = SnippetType.CAMELCASE
    )

    public class RunnerTag{

    }

