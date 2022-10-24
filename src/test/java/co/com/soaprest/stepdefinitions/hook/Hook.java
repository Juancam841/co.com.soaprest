package co.com.soaprest.stepdefinitions.hook;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.core.util.EnvironmentVariables;
import io.cucumber.java.Before;

public class Hook {
    private EnvironmentVariables environmentVariables;

    @Before
    public void configureBaseUrl(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Brandon");
        String theRestApiBaseUrl = environmentVariables.optionalProperty("environments.dev.webdriver.base.url")
                .orElse("environments.qa.webdriver.base.url");
        OnStage.theActorInTheSpotlight().whoCan(CallAnApi.at(theRestApiBaseUrl));


    }
}
