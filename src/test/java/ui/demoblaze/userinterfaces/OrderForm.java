package ui.demoblaze.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class OrderForm {

    public static final Target PLACE_ORDER_BUTTON =
            Target.the("Place Order button")
                    .locatedBy("//button[text()='Place Order']");

    public static final Target NAME_FIELD =
            Target.the("Name field")
                    .locatedBy("#name");

    public static final Target COUNTRY_FIELD =
            Target.the("Country field")
                    .locatedBy("#country");

    public static final Target CITY_FIELD =
            Target.the("City field")
                    .locatedBy("#city");

    public static final Target CREDIT_CARD_FIELD =
            Target.the("Credit Card field")
                    .locatedBy("#card");

    public static final Target MONTH_FIELD =
            Target.the("Month field")
                    .locatedBy("#month");

    public static final Target YEAR_FIELD =
            Target.the("Year field")
                    .locatedBy("#year");
}