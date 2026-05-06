package ui.demoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

import ui.demoblaze.userinterfaces.OrderForm;

public class FinalizePurchase implements Task {

    public static FinalizePurchase now() {
        return instrumented(FinalizePurchase.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(OrderForm.PURCHASE_BUTTON, isClickable())
                        .forNoMoreThan(10).seconds(),
                Click.on(OrderForm.PURCHASE_BUTTON)
        );
    }
}
