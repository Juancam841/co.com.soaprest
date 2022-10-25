package co.com.soaprest.stepdefinitions;

import co.com.soaprest.questions.StatusCode;
import co.com.soaprest.questions.TheFieldsResponseAre;
import co.com.soaprest.questions.TheQuantifyFieldService;
import co.com.soaprest.questions.TheSchemaIs;
import co.com.soaprest.tasks.ConsumeGet;
import co.com.soaprest.tasks.Load;
import co.com.soaprest.util.resource.WebServiceEndpoints;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class GetStepDefinitions {
    @Given("I load costumer information")
    public void iLoadCostumerInformation(List<Map<String,String>> data) {
        OnStage.theActorInTheSpotlight().wasAbleTo(
                Load.testData(data.get(0)));
    }

    @When("I call get user API")
    public void iCallGetUserAPI() {
            OnStage.theActorInTheSpotlight().attemptsTo(
                    ConsumeGet.service(
                            WebServiceEndpoints.URI.getUrl()
                    )
            );

    }
    @Then("I should see the status code {int}")
    public void iShouldSeeTheStatusCode(Integer responseCode) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(StatusCode.is(responseCode)));
    }
    @Then("I validate quantity key is {int}")
    public void iValidateQuantityKeyIs(Integer quantity) {
        OnStage.theActorInTheSpotlight()
                .should(seeThat(TheQuantifyFieldService.are(quantity)));

    }
    @Then("I validate schema response {string}")
    public void iValidateSchemaResponse(String schemaResponse) {
        OnStage.theActorInTheSpotlight()
                .should(seeThat(TheSchemaIs.expected(schemaResponse)));
    }
    @Then("I validate fields get response api")
    public void iValidateFieldsGetResponseApi() {
        OnStage.theActorInTheSpotlight()
                .should(seeThat(TheFieldsResponseAre.expected()));
    }
    @Then("I validate get response contain data expected")
    public void iValidateGetResponseContainDataExpected() {

    }


}
