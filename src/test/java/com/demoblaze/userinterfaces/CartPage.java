package com.demoblaze.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {

    public static final Target PRODUCT_NAMES =
            Target.the("product names in the cart")
                    .locatedBy("//tbody[@id='tbodyid']/tr/td[2]");
}