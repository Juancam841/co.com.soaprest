package co.com.soaprest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.rest.questions.ResponseConsequence;
import org.hamcrest.Matchers;

public class TheQuantifyFieldService implements Question<Boolean> {
    private final int quantity;

    public TheQuantifyFieldService(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.should(
                ResponseConsequence.seeThatResponse("Quantity Fields Service", response-> response.assertThat().body("size()", Matchers.is(quantity)))
        );
                return true;
    }

    public static TheQuantifyFieldService are(int quantity) {
        return new TheQuantifyFieldService(quantity);
    }


}
