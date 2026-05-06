package ui.demoblaze.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target ADD_TO_CART_BUTTON =
            Target.the("botón agregar al carrito")
                    .locatedBy("//a[text()='Add to cart']");

    public static Target productLink(String productName) {
        return Target.the("producto " + productName)
                .locatedBy("//a[text()='" + productName + "']");
    }
}