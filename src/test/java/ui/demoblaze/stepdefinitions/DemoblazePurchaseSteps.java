package ui.demoblaze.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import ui.demoblaze.questions.PurchaseConfirmationMessage;
import ui.demoblaze.tasks.AddProductToCart;
import ui.demoblaze.tasks.CompletePurchaseForm;
import ui.demoblaze.tasks.FinalizePurchase;
import ui.demoblaze.tasks.NavigateToCart;
import ui.demoblaze.tasks.NavigateToHome;
import ui.demoblaze.tasks.OpenDemoblaze;
import ui.demoblaze.tasks.OpenProductDetail;
import ui.demoblaze.userinterfaces.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import net.serenitybdd.screenplay.actors.OnStage;

public class DemoblazePurchaseSteps {

    @Given("el usuario accede al sitio Demoblaze")
    public void elUsuarioAccedeAlSitioDemoblaze() {
        OnStage.theActorCalled("Usuario").attemptsTo(
                OpenDemoblaze.homePage()
        );
    }

    @When("realiza el flujo de compra")
    public void realizaElFlujoDeCompra() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                OpenProductDetail.of(HomePage.PRODUCT_SAMSUNG_GALAXY_S6),
                AddProductToCart.now(),
                NavigateToHome.page(),

                OpenProductDetail.of(HomePage.PRODUCT_NOKIA_LUMIA_1520),
                AddProductToCart.now(),

                NavigateToCart.page(),
                CompletePurchaseForm.withValidData(),
                FinalizePurchase.now()
        );
    }

    @Then("valida que la compra fue exitosa")
    public void validaQueLaCompraFueExitosa() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(
                        "el mensaje de confirmación",
                        PurchaseConfirmationMessage.text(),
                        equalTo("Thank you for your purchase!")
                )
        );
    }
}