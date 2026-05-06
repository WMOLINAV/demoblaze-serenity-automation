package ui.demoblaze.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.NoAlertPresentException;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AcceptAlertIfPresent implements Interaction {

    public static AcceptAlertIfPresent now() {
        return instrumented(AcceptAlertIfPresent.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        var driver = BrowseTheWeb.as(actor).getDriver();

        // Intentamos durante ~1 segundo detectar el alert
        for (int i = 0; i < 5; i++) {
            try {
                driver.switchTo().alert().accept();
                return; // ✅ alert aceptado
            } catch (NoAlertPresentException e) {
                try {
                    Thread.sleep(200); // pequeña espera real
                } catch (InterruptedException ignored) { }
            }
        }
        // ✅ si nunca apareció, seguimos sin error
    }
}
