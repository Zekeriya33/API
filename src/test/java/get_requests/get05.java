package get_requests;

import base_url.RestfulBaseUrl;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

public class get05 extends RestfulBaseUrl {

    /*
    Given
        https://restful-booker.herokuapp.com/booking
    When
        User sends get request to the URL
    Then
        Status code is 200
And
   Among the data there should be someone whose firstname is "Johhny" and lastname is "Dear"
 */

    @Test
    public void get01() {

          // Set The URL
        spec.pathParams("first","booking").queryParams("firstname","Ali","lastname","Cengiz");

        // Expected Data (put, patch post)

        // Send the request and Get Response
        Response response = given().spec(spec).when().get("/{first}");
        response.prettyPrint();

        // Do Assertion
        assertEquals(200,response.getStatusCode());
        assertTrue(response.asString().contains("bookingid"));

    }
}
