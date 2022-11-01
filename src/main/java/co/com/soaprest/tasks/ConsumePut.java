package co.com.soaprest.tasks;

import co.com.soaprest.interactions.ExecutePut;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.soaprest.util.constants.Constanst.BODY;

public class ConsumePut implements Task {
    private final String resource;
    private final int id;

    public ConsumePut(String resource, int id) {
        this.resource = resource;
        this.id =id;
    }

    public static ConsumePut service(String resource, int id) {
        return Tasks.instrumented(ConsumePut.class, resource, id);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String body = actor.recall(BODY).toString();
        actor.attemptsTo(ExecutePut.service(resource, body, id));
    }
}
