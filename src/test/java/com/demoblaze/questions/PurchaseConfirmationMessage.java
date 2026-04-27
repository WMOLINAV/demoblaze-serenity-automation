package com.demoblaze.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static net.serenitybdd.screenplay.questions.Text.of;
import static com.demoblaze.userinterfaces.PurchaseConfirmation.CONFIRMATION_MESSAGE;

public class PurchaseConfirmationMessage {

    public static Question<String> text() {
        return actor -> of(CONFIRMATION_MESSAGE).answeredBy(actor);
    }
}