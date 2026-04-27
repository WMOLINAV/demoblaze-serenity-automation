package com.demoblaze.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target PRODUCT_SAMSUNG_GALAXY_S6 =
            Target.the("Samsung Galaxy S6")
                    .locatedBy("//a[text()='Samsung galaxy s6']");

    public static final Target PRODUCT_NOKIA_LUMIA_1520 =
            Target.the("Nokia Lumia 1520")
                    .locatedBy("//a[text()='Nokia lumia 1520']");

    public static final Target ADD_TO_CART_BUTTON =
            Target.the("Add to cart button")
                    .locatedBy("//a[text()='Add to cart']");
}
