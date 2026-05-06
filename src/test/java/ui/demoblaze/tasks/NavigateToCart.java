package ui.demoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import ui.demoblaze.userinterfaces.CartPage;
import ui.demoblaze.interactions.AcceptAlertIfPresent;

public class NavigateToCart implements Task {

    public static NavigateToCart page() {
        return instrumented(NavigateToCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                AcceptAlertIfPresent.now(),                 // ✅ limpia alert residual
                Open.url("https://www.demoblaze.com/cart.html"), // ✅ navega al carrito
                WaitUntil.the(CartPage.PLACE_ORDER_BUTTON, isVisible())
                        .forNoMoreThan(10).seconds(),     // ✅ espera DOM
                Click.on(CartPage.PLACE_ORDER_BUTTON)       // ✅ abre modal
        );
    }
}