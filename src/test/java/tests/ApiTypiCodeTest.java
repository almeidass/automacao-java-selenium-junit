package tests;

import org.junit.Test;
import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class ApiTypiCodeTest {

    public String setUp(){
        String baseHost = "https://jsonplaceholder.typicode.com";
        return baseHost;
    }

    @Test
    public void getApiTypiCodeTestTodos() {
        String baseUri = "/todos/1";
        String endPoint = setUp() + baseUri;

        given().when().get(endPoint).then()
                .statusCode(200)
                .body("userId",equalTo(1))
                .body("id",equalTo(1))
                .body("title",equalTo("delectus aut autem"))
                .body("completed",equalTo(false));
    }

}
