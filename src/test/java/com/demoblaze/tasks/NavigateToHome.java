package com.demoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Switch;
import org.openqa.selenium.NoAlertPresentException;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NavigateToHome implements Task {

    public static NavigateToHome page() {
        return instrumented(NavigateToHome.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        // Manejo técnico defensivo del alert (NO es lógica de negocio)
        try {
            actor.attemptsTo(
                    Switch.toAlert().andAccept()
            );
        } catch (NoAlertPresentException ignored) {
            // Si no hay alert, seguimos sin romper el flujo
        }

        actor.attemptsTo(
                Open.url("https://www.demoblaze.com/")
        );
    }
}