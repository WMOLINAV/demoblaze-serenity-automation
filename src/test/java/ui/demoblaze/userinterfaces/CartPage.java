package ui.demoblaze.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {

    public static final Target PLACE_ORDER_BUTTON =
            Target.the("Botón Place Order")
                    .locatedBy("//button[text()='Place Order']");
}
