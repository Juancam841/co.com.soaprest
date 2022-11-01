package co.com.soaprest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.soaprest.util.constants.Constanst.VALIDATIONS_FIELDS;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.hasKey;

public class TheFielddPostServiceResponseAre implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.should(
                seeThatResponse(String.format(VALIDATIONS_FIELDS, "post"),
                        response -> response.assertThat()
                                .body("$", hasKey("name"))
                                .and().body("$", hasKey("job"))
                                .and().body("$", hasKey("id"))
                                .and().body("$", hasKey("createdAt"))
                )
        );
        return true;
    }

    public static TheFielddPostServiceResponseAre expected(){
        return new TheFielddPostServiceResponseAre();
    }
}
