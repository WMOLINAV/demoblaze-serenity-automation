package com.demoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenDemoblaze implements Task {

    private static final String DEMOBLAZE_URL = "https://www.demoblaze.com/";

    public static OpenDemoblaze homePage() {
        return instrumented(OpenDemoblaze.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(DEMOBLAZE_URL)
        );
    }
}