package co.com.soaprest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.hamcrest.Matchers;

import static co.com.soaprest.model.TestData.getData;
import static co.com.soaprest.util.constants.Constanst.VALIDATION_FIELDS_AND_VALUES;
import static java.lang.Integer.parseInt;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;


public class TheFieldsAndValuesGetListResponseAre implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        actor.should(seeThatResponse(String.format(VALIDATION_FIELDS_AND_VALUES, "list get"),
                response -> response.assertThat()
                        .body("page", Matchers.equalTo(parseInt(getData().get("page").toString())))
                        .and().body("per_page", Matchers.equalTo(parseInt(getData().get("per_page").toString())))
                        .and().body("total", Matchers.equalTo(parseInt(getData().get("total").toString())))
                        .and().body("total_pages", Matchers.equalTo(parseInt(getData().get("total_pages").toString())))
                        .and().body("data[0].id", Matchers.equalTo(parseInt(getData().get("id").toString())))
                        .and().body("data[0].email", Matchers.equalTo(getData().get("email").toString()))
                        .and().body("data[0].first_name", Matchers.equalTo(getData().get("first_name").toString()))
                        .and().body("data[0].last_name", Matchers.equalTo(getData().get("last_name").toString()))
                        .and().body("data[0].avatar", Matchers.equalTo(getData().get("avatar").toString()))
                        .and().body("support.url", Matchers.equalTo(getData().get("support_url").toString()))
                        .and().body("support.text", Matchers.equalTo(getData().get("support_text").toString()))
        ));


        return true;
    }

    public static TheFieldsAndValuesGetListResponseAre expected() {
        return new TheFieldsAndValuesGetListResponseAre();
    }

}
