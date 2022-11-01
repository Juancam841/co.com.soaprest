package co.com.soaprest.stepdefinitions;

import co.com.soaprest.exceptions.AssertionsService;
import co.com.soaprest.questions.StatusCode;
import co.com.soaprest.questions.TheQuantifyFieldService;
import co.com.soaprest.questions.TheSchemaIs;
import co.com.soaprest.tasks.ConsumeGet;
import co.com.soaprest.tasks.ConsumePut;
import co.com.soaprest.tasks.Load;
import co.com.soaprest.util.resource.WebServiceEndpoints;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class CommonStepDefinitions {



    @Given("I load costumer information")
    public void iLoadCostumerInformation(List<Map<String, String>> data) {
        OnStage.theActorInTheSpotlight().wasAbleTo(Load.testData(data.get(0)));

    }

    @Then("I should see the status code {int}")
    public void iShouldSeeTheStatusCode(Integer responseCode) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(StatusCode.is(responseCode))
                        .orComplainWith(AssertionsService.class, AssertionsService.THE_STATUS_CODE_SERVICE_IS_NOT_EXPECTED)
        );
    }

    @Then("I validate quantity key is {int}")
    public void iValidateQuantityKeyIs(Integer quantity) {
        OnStage.theActorInTheSpotlight().should(seeThat(TheQuantifyFieldService.are(quantity))
                .orComplainWith(AssertionsService.class, AssertionsService.QUANTITY_SERVICE_RESPONSE_IS_NOT_EXPECTED)
        );

    }
    @Then("I validate schema response {string}")
    public void iValidateSchemaResponse(String schemaResponse) {
        OnStage.theActorInTheSpotlight().should(seeThat(TheSchemaIs.expected(schemaResponse))
                .orComplainWith(AssertionsService.class, AssertionsService.THE_SCHEMA_SERVICE_RESPONSE_IS_NOT_EXPECTED)
        );
    }
}
