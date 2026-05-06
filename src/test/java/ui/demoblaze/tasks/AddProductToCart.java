package ui.demoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import ui.demoblaze.userinterfaces.HomePage;
import ui.demoblaze.interactions.AcceptAlertIfPresent;

public class AddProductToCart implements Task {

    public static AddProductToCart now() {
        return instrumented(AddProductToCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.ADD_TO_CART_BUTTON),
                AcceptAlertIfPresent.now()
        );
    }
}