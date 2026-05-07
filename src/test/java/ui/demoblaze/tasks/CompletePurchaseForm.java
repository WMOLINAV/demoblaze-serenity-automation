package ui.demoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import ui.demoblaze.userinterfaces.OrderForm;

public class CompletePurchaseForm implements Task {

    public static CompletePurchaseForm withValidData() {
        return instrumented(CompletePurchaseForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(OrderForm.NAME_FIELD, isVisible())
                        .forNoMoreThan(10).seconds(),

                Enter.theValue("Wil  Molina").into(OrderForm.NAME_FIELD),
                Enter.theValue("Ecuador").into(OrderForm.COUNTRY_FIELD),
                Enter.theValue("Quito").into(OrderForm.CITY_FIELD),
                Enter.theValue("4111111111111111").into(OrderForm.CREDIT_CARD_FIELD),
                Enter.theValue("12").into(OrderForm.MONTH_FIELD),
                Enter.theValue("2026").into(OrderForm.YEAR_FIELD)
        );
    }
}
