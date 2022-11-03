package co.com.soaprest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.Arrays;
import java.util.List;

import static co.com.soaprest.util.GetListFrom.dataComparision;
import static co.com.soaprest.util.GetListFrom.json;
import static co.com.soaprest.util.constants.Constanst.VALIDATIONS_FIELDS;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.hasKey;
import static org.junit.Assert.assertArrayEquals;

public class TheFieldsGetListResponseAre implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        List<String> fieldsProvide = Arrays.asList("id", "email", "first_name", "last_name", "avatar");

        actor.should(
                seeThatResponse(String.format(VALIDATIONS_FIELDS, "get list"),
                        response->response.assertThat()
                                .body("$",hasKey("page"))
                                .and().body("$", hasKey("per_page"))
                                .and().body("$", hasKey("total"))
                                .and().body("$", hasKey("total_pages"))
                                .and().body("$", hasKey("data"))
                                .and().body("support", hasKey("url"))
                                .and().body("support", hasKey("text"))
                        )
        );
    assertArrayEquals(json("data").toArray(), dataComparision(fieldsProvide).toArray());
        return true;
    }
public static TheFieldsGetListResponseAre expected(){
        return new TheFieldsGetListResponseAre();
}
}
