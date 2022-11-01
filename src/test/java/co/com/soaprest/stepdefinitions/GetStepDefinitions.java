package co.com.soaprest.stepdefinitions;

import co.com.soaprest.exceptions.AssertionsService;
import co.com.soaprest.questions.*;
import co.com.soaprest.tasks.ConsumeGet;
import co.com.soaprest.util.resource.WebServiceEndpoints;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class GetStepDefinitions {


    @When("I call get user API")
    public void iCallGetUserAPI() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ConsumeGet.service(WebServiceEndpoints.URI.getUrl()));

    }


    @Then("I validate fields get response api")
    public void iValidateFieldsGetResponseApi() {
        OnStage.theActorInTheSpotlight().should(seeThat(TheFieldsResponseAre.expected())
                .orComplainWith(AssertionsService.class, AssertionsService.FIELDS_SERVICE_RESPONSE_IS_NOT_EXPECTED)
        );
    }

    @Then("I validate get response contain data expected")
    public void iValidateGetResponseContainDataExpected() {
        OnStage.theActorInTheSpotlight().should(seeThat(TheValuesResponseAre.expected())
                .orComplainWith(AssertionsService.class, AssertionsService.CONTENT_DATA_SERVICE_RESPONSE_IS_NOT_EXPECTED)
        );
    }


}
