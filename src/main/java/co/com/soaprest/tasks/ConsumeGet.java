package co.com.soaprest.tasks;

import co.com.soaprest.interactions.ExecuteGet;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actors.OnStage;

public class ConsumeGet implements Task {
    private final String resource;

    public ConsumeGet(String resource) {
        this.resource = resource;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ExecuteGet.service(resource)
        );
    }

    public static ConsumeGet service(String resource){
        return Tasks.instrumented(ConsumeGet.class, resource);
    }
}
