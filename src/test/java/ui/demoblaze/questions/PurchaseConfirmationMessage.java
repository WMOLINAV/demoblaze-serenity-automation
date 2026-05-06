package ui.demoblaze.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;

public class PurchaseConfirmationMessage implements Question<Boolean> {

    private static final Target CART_EMPTY_MESSAGE =
            Target.the("mensaje de carrito vacío")
                    .locatedBy("//h2[text()='Products']");

    public static PurchaseConfirmationMessage isDisplayed() {
        return new PurchaseConfirmationMessage();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        // Si el carrito volvió a su estado inicial, la compra fue exitosa
        return Visibility.of(CART_EMPTY_MESSAGE).answeredBy(actor);
    }
}
