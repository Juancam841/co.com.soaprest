package co.com.soaprest.stepdefinitions;

import co.com.soaprest.exceptions.AssertionsService;
import co.com.soaprest.model.TestData;
import co.com.soaprest.questions.TheFieldsAndValuesPutServiceResponseAre;
import co.com.soaprest.questions.TheFieldsPutServiceResponseAre;
import co.com.soaprest.tasks.ConsumePut;
import co.com.soaprest.tasks.Create;
import co.com.soaprest.util.resource.WebServiceEndpoints;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class PutStepDefinitions {

    @When("I call put user API {int}")
    public void iCallputUserAPI(int id) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Create.messageBody("singleuser.json", TestData.getData()),
                ConsumePut.service(WebServiceEndpoints.URI.getUrl(), id));

    }

    @Then("I validate fields put response api")
    public void iValidateFieldsPutResponseApi() {
        OnStage.theActorInTheSpotlight()
                .should(seeThat(TheFieldsPutServiceResponseAre.expected())
                        .orComplainWith(AssertionsService.class,
                                AssertionsService.THE_FIELDS_SERVICE_IS_NOT_EXPECTED)
                );
    }

    @Then("I validate put response contain data expected")
    public void iValidatePutResponseContainDataExpected() {
        OnStage.theActorInTheSpotlight()
                .should(seeThat(TheFieldsAndValuesPutServiceResponseAre.expected())
                        .orComplainWith(AssertionsService.class,
                                AssertionsService.THE_FIELDS_AND_VALUES_POST_SERVICE_IS_NOT_EXPECTED)
                );
    }
}
