package ui.demoblaze.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.*;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

import ui.demoblaze.tasks.OpenDemoblaze;
import ui.demoblaze.tasks.OpenProductDetail;
import ui.demoblaze.tasks.AddProductToCart;
import ui.demoblaze.tasks.NavigateToCart;
import ui.demoblaze.tasks.FinalizePurchase;
import ui.demoblaze.tasks.CompletePurchaseForm;

import ui.demoblaze.questions.PurchaseConfirmationMessage;

public class DemoblazePurchaseSteps {

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("el usuario ingresa a la pagina Demoblaze")
    public void elUsuarioIngresaALaPaginaDemoblaze() {
        OnStage.theActorCalled("Usuario");
        OnStage.theActorInTheSpotlight().attemptsTo(
                OpenDemoblaze.homePage()
        );
    }

    @Cuando("agrega al carrito el producto {string}")
    public void agregaAlCarritoElProducto(String producto) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                OpenProductDetail.of(producto),
                AddProductToCart.now()
        );
    }

    @Cuando("visualiza el carrito de compras")
    public void visualizaElCarritoDeCompras() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                NavigateToCart.page()
        );
    }

    @Cuando("completa el formulario de compra con los datos del cliente")
    public void completaElFormularioDeCompraConLosDatosDelCliente() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                FinalizePurchase.now(),              // ✅ Abre el modal (Place Order)
                CompletePurchaseForm.withValidData() // ✅ Llena el formulario y compra
        );
    }

    @Entonces("la compra se realiza de forma exitosa mostrando el mensaje de confirmación")
    public void validaCompraExitosa() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(
                        "el mensaje de confirmación fue mostrado correctamente",
                        PurchaseConfirmationMessage.isDisplayed(),
                        is(true)
                )
        );
    }
}