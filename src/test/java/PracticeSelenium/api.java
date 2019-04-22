package PracticeSelenium;

import io.restassured.http.Header;

import org.testng.annotations.Test;
import sun.security.krb5.internal.AuthorizationData;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class api {



    @Test
    public  void getUserTest() {
        given()
                .baseUri("http://khda91.fvds.ru/mantisbt/api/rest/")
                .header(new Header("Authorization", "XNd5tIXXB7U8FV4C8w0nao0WYr5S0nN7"))
                  .when()


                    .then()
                            .body("name", equalTo("api_user"));

    }

}
