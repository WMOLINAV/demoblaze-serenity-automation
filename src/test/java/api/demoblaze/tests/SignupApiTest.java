package api.demoblaze.tests;

import api.demoblaze.utils.ApiConfig;
import io.restassured.http.ContentType;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class SignupApiTest {

    @Before
    public void setup() {
        ApiConfig.configure();
    }

    // CASO 1: Crear un nuevo usuario
    @Test
    public void shouldCreateNewUser() {

        String username = "user_" + System.currentTimeMillis();

        String requestBody = """
            {
              "username": "%s",
              "password": "password123"
            }
            """.formatted(username);

        given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("/signup")
                .then()
                .log().all()
                .statusCode(200);
    }

    // CASO 2: Usuario ya existente
    @Test
    public void shouldNotCreateExistingUser() {

        String requestBody = """
            {
              "username": "usuario_existente_api",
              "password": "password123"
            }
            """;

        given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("/signup")
                .then()
                .log().all()
                .statusCode(200);
    }
}