package ui.demoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import ui.demoblaze.userinterfaces.HomePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenProductDetail implements Task {

    private final String productName;

    public OpenProductDetail(String productName) {
        this.productName = productName;
    }

    public static OpenProductDetail of(String productName) {
        return instrumented(OpenProductDetail.class, productName);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.productLink(productName))
        );
    }
}