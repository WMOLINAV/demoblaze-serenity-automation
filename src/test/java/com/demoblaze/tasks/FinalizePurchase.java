package com.demoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.demoblaze.userinterfaces.PurchaseConfirmation.PURCHASE_BUTTON;

public class FinalizePurchase implements Task {

    public static FinalizePurchase now() {
        return instrumented(FinalizePurchase.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PURCHASE_BUTTON)
        );
    }
}
