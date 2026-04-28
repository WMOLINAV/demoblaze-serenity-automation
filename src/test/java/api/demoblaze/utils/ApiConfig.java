package api.demoblaze.utils;

import io.restassured.RestAssured;

public class ApiConfig {

    public static void configure() {
        RestAssured.baseURI = "https://api.demoblaze.com";
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }
}