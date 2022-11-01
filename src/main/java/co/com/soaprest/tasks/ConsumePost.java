package co.com.soaprest.tasks;

import co.com.soaprest.interactions.ExecutePost;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.soaprest.util.constants.Constanst.BODY;

public class ConsumePost implements Task {
    private final String resource;

    public ConsumePost(String resource) {
        this.resource = resource;
    }


    public static ConsumePost service(String resource) {
        return Tasks.instrumented(ConsumePost.class, resource);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String body = actor.recall(BODY).toString();
        actor.attemptsTo(ExecutePost.service(resource, body));
    }
}
