package co.com.soaprest.stepdefinitions;

import co.com.soaprest.tasks.ConsumeDelete;
import co.com.soaprest.util.resource.WebServiceEndpoints;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class DeleteStepDefinitions {

    @When("I Call Delete user API")
    public void i_call_delete_user_api() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ConsumeDelete.service(WebServiceEndpoints.URI.getUrl())

        );
    }
}
