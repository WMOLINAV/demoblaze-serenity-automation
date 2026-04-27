package com.demoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.demoblaze.userinterfaces.OrderForm.*;

public class CompletePurchaseForm implements Task {

    public static CompletePurchaseForm withValidData() {
        return instrumented(CompletePurchaseForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PLACE_ORDER_BUTTON),

                Enter.theValue("Wilson Molina").into(NAME_FIELD),
                Enter.theValue("Ecuador").into(COUNTRY_FIELD),
                Enter.theValue("Quito").into(CITY_FIELD),
                Enter.theValue("4111111111111111").into(CREDIT_CARD_FIELD),
                Enter.theValue("04").into(MONTH_FIELD),
                Enter.theValue("2026").into(YEAR_FIELD)
        );
    }
}
