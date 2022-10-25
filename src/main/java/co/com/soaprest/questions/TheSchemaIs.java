package co.com.soaprest.questions;

import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.rest.questions.ResponseConsequence;


public class TheSchemaIs implements Question<Boolean> {
    private final String estructure;

    public TheSchemaIs(String estructure) {
        this.estructure = estructure;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.should(
                ResponseConsequence.seeThatResponse("Scheme Estructure Validation", response -> response.assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schemas/"+estructure+".Json")))
        );
        return true;
    }

    public static TheSchemaIs expected(String schemaResponse) {
        return new TheSchemaIs(schemaResponse);
    }


}
