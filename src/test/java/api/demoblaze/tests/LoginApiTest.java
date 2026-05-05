package api.demoblaze.tests;

import api.demoblaze.utils.ApiConfig;
import io.restassured.http.ContentType;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class LoginApiTest {

    @Before
    public void setup() {
        ApiConfig.configure();
    }

    /**
     * CASO 3:
     * Login con usuario y password correctos
     */
    @Test
    public void shouldLoginWithValidCredentials() {

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
                .post("/login")
                .then()
                .log().all()
                .statusCode(200)
                .body(containsString("Auth_token"));
    }

    /**
     * CASO 4:
     * Login con usuario o password incorrectos
     */
    @Test
    public void shouldNotLoginWithInvalidCredentials() {

        String requestBody = """
            {
              "username": "usuario_existente_api",
              "password": "password_incorrecto"
            }
            """;

        given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("/login")
                .then()
                .log().all()
                .statusCode(200)
                .body(containsString("Wrong password"));
    }
}