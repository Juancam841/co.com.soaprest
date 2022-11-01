package co.com.soaprest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.soaprest.util.TimeZone.validation;
import static co.com.soaprest.util.constants.Constanst.TIME_ZONE;
import static co.com.soaprest.util.constants.Constanst.VALIDATION_FIELDS_AND_VALUES;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.*;


public class TheFieldsAndValuesPutServiceResponseAre implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.should(
                seeThatResponse(String.format(VALIDATION_FIELDS_AND_VALUES,"put"),
                        response->response.assertThat()
                                .body("name", equalTo("morpheus"))
                                .and().body("job", equalTo("leader"))
                                .and().body("updatedAt",containsString(validation(TIME_ZONE[0]))))
        );
        return true;
    }
    public static TheFieldsAndValuesPutServiceResponseAre expected(){
        return new TheFieldsAndValuesPutServiceResponseAre();
    }
}
