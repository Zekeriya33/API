package post_requests;

import base_url.JsonplaceholderBaseUrl;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import test_data.JsonPlaceHolederTestData;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class post01 extends JsonplaceholderBaseUrl {

     /*
    Given
      1) https://jsonplaceholder.typicode.com/todos
      2)
   When
       I send POST Request to the Url
   Then
       Status code is 201 {
            "userId": 55,
            "title": "Tidy your room",
            "completed": false
                         }
   And
       response body is like {
                               "userId": 55,
                               "title": "Tidy your room",
                               "completed": false,
                               "id": 201
                               }
*/

    @Test
    public void post01() {

        // Set the url

        spec.pathParam("first","todos");

        // 2. Set The Expected Data ( put, post, patch)
        JsonPlaceHolederTestData obj = new JsonPlaceHolederTestData();
       Map<String , Object> expectedData = obj.expectedDataMapMethod(55,"Tidy your room",false);

        // 3. Send The Request And Get The Response
        Response response = given().spec(spec).
                contentType(ContentType.JSON).body(expectedData).
                when().post("/{first}");

        response.prettyPrint();

        // 4. Do Assertion

        Map<String , Object> actualData = response.as(HashMap.class);

        assertEquals(expectedData.get("completed"),actualData.get("completed"));
        assertEquals(expectedData.get("title"),actualData.get("title"));
        assertEquals(expectedData.get("userId"),actualData.get("userId"));
    }
}
