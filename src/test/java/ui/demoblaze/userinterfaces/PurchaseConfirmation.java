package ui.demoblaze.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PurchaseConfirmation {

    public static final Target PURCHASE_BUTTON =
            Target.the("Purchase button")
                    .locatedBy("//button[text()='Purchase']");

    public static final Target CONFIRMATION_MESSAGE =
            Target.the("Purchase confirmation message")
                    .locatedBy("//h2[text()='Thank you for your purchase!']");
}