package runners;

import io.cucumber.junit.CucumberOptions.SnippetType;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

public class RunnerTag {
    @RunWith(CucumberWithSerenity.class)
    @CucumberOptions(
            plugin ={"pretty"},
            features = "src/test/resources/features/feature.feature",
            glue = "src/test/java/stepdefinitions",
            snippets = SnippetType.CAMELCASE
    )

    public class CucumberTestSuite{

    }
}
