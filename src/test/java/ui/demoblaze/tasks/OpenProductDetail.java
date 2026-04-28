package ui.demoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenProductDetail implements Task {

    private final Target product;

    public OpenProductDetail(Target product) {
        this.product = product;
    }

    public static OpenProductDetail of(Target product) {
        return instrumented(OpenProductDetail.class, product);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(product)
        );
    }
}
