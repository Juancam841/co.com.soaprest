package co.com.soaprest.stepdefinitions;


import co.com.soaprest.exceptions.AssertionsService;
import co.com.soaprest.model.TestData;
import co.com.soaprest.questions.TheFielddPostServiceResponseAre;
import co.com.soaprest.questions.TheFieldsAndValuesPostResponseAre;
import co.com.soaprest.tasks.ConsumePost;
import co.com.soaprest.tasks.Create;
import co.com.soaprest.util.resource.WebServiceEndpoints;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class PostStepDefinitions {

    @When("I call post user API")
    public void iCallPostUserAPI() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Create.messageBody("singleuser.json", TestData.getData()),
                ConsumePost.service(WebServiceEndpoints.URI.getUrl())
        );

    }

    @Then("I validate fields post response api")
    public void iValidateFieldsPostResponseApi() {
        OnStage.theActorInTheSpotlight()
                .should(seeThat(TheFielddPostServiceResponseAre.expected())
                        .orComplainWith(AssertionsService.class,
                                AssertionsService.FIELDS_SERVICE_RESPONSE_IS_NOT_EXPECTED)
                );

    }

    @Then("I validate post response contain data initial")
    public void iValidatePostResponseContainDataInitial() {
        OnStage.theActorInTheSpotlight()
                .should(seeThat(TheFieldsAndValuesPostResponseAre.expected())
                        .orComplainWith(AssertionsService.class,
                                AssertionsService.THE_FIELDS_AND_VALUES_POST_SERVICE_IS_NOT_EXPECTED)
                );
    }

}
