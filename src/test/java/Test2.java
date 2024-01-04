import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Test2 {
    @Test
    public void testL2R() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "bairagi");

        String print = map.toString();
        System.out.println(print);
    }

    @Test
    public void testR2L() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "bairaig");

        String string = map.toString();
        System.out.println(string);
    }

    @Test
    public void testName() {
        ValidatableResponse validatableResponse = given().
                get("gogle.com").
                prettyPeek().
                then().statusCode(200);
    }

}
