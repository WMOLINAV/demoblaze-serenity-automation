package com.demoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Switch;
import org.openqa.selenium.NoAlertPresentException;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NavigateToCart implements Task {

    public static NavigateToCart page() {
        return instrumented(NavigateToCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        // Cierre técnico defensivo del alert (NO es negocio)
        try {
            actor.attemptsTo(
                    Switch.toAlert().andAccept()
            );
        } catch (NoAlertPresentException ignored) {
            // Si no hay alert, seguimos
        }

        actor.attemptsTo(
                Open.url("https://www.demoblaze.com/cart.html")
        );
    }
}
