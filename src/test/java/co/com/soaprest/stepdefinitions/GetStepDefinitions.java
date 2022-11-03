package co.com.soaprest.stepdefinitions;

import co.com.soaprest.exceptions.AssertionsService;
import co.com.soaprest.questions.*;
import co.com.soaprest.tasks.ConsumeGet;
import co.com.soaprest.tasks.Load;
import co.com.soaprest.util.resource.WebServiceEndpoints;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;


import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class GetStepDefinitions {


    @When("I call get user API")
    public void iCallGetUserAPI() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ConsumeGet.service(WebServiceEndpoints.URI.getUrl()));

    }


    @Then("I validate fields get response api")
    public void iValidateFieldsGetResponseApi() {
        OnStage.theActorInTheSpotlight()
                .should(seeThat(TheFieldsResponseAre.expected())
                .orComplainWith(AssertionsService.class, AssertionsService.FIELDS_SERVICE_RESPONSE_IS_NOT_EXPECTED)
        );
    }

    @Then("I validate fields get list response api")
    public void iValidateFieldsGetListResponseApi() {
        OnStage.theActorInTheSpotlight()
                .should(seeThat(TheFieldsGetListResponseAre.expected())
                .orComplainWith(AssertionsService.class, AssertionsService.FIELDS_SERVICE_RESPONSE_IS_NOT_EXPECTED)
        );
    }

    @Then("I validate get response contain data expected")
    public void iValidateGetResponseContainDataExpected() {
        OnStage.theActorInTheSpotlight()
                .should(seeThat(TheFieldsAndValuesGetResponseAre.expected())
                .orComplainWith(AssertionsService.class, AssertionsService.CONTENT_DATA_SERVICE_RESPONSE_IS_NOT_EXPECTED)
        );
    }

    @Then("I validate get list response contain data expected")
    public void i_validate_get_list_response_contain_data_expected(List<Map<String, String>> dataValidation) {
        OnStage.theActorInTheSpotlight()
                .wasAbleTo(
                        Load.testData(dataValidation.get(0))

                );

        OnStage.theActorInTheSpotlight()
                .should(seeThat(TheFieldsAndValuesGetListResponseAre.expected())
                        .orComplainWith(AssertionsService.class, AssertionsService.THE_FIELDS_AND_VALUES_GET_SERVICE_IS_NOT_EXPECTED)
                );


    }


}
