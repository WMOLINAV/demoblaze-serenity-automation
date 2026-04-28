package ui.demoblaze.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.Collection;

import static net.serenitybdd.screenplay.questions.Text.ofEach;
import static ui.demoblaze.userinterfaces.CartPage.PRODUCT_NAMES;

public class ProductsInCart implements Question<Collection<String>> {

    public static ProductsInCart names() {
        return new ProductsInCart();
    }

    @Override
    public Collection<String> answeredBy(Actor actor) {
        return ofEach(PRODUCT_NAMES).answeredBy(actor);
    }
}
