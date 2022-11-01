package co.com.soaprest.questions;

import co.com.soaprest.model.TestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.soaprest.util.constants.Constanst.VALIDATION_FIELDS_AND_VALUES;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.equalTo;

public class TheFieldsAndValuesPostResponseAre implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        actor.should(
                seeThatResponse(String.format(VALIDATION_FIELDS_AND_VALUES, "post"),
                        respose-> respose
                                .assertThat()
                                .body("name", equalTo(TestData.getData().get("name")))
                                .body("job", equalTo(TestData.getData().get("job")))
                        )
        );

        return true;
    }

    public static TheFieldsAndValuesPostResponseAre expected(){
        return new TheFieldsAndValuesPostResponseAre();
    }
}
