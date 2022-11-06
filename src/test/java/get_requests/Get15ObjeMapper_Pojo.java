package get_requests;

import base_url.JsonplaceholderBaseUrl;
import io.restassured.response.Response;
import org.junit.Test;
import pojos.JsonPlaceHolderPojo;
import utils.ObjectMapperUtils;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class Get15ObjeMapper_Pojo extends JsonplaceholderBaseUrl {

    /*
        Given
	        https://jsonplaceholder.typicode.com/todos/198
        When
	 		I send GET Request to the URL
	 	Then
	 		Status code is 200
	 		And response body is like {
									    "userId": 10,
									    "id": 198,
									    "title": "quis eius est sint explicabo",
									    "completed": true
									  }
     */
    // ObjectMapper+pojo = En iyi yontem

    @Test
    public void get15Pojo() {

        // Set the url
        spec.pathParams("first","todos","second",198);

        // Set the expected Data

        JsonPlaceHolderPojo expectedData = new JsonPlaceHolderPojo(10,"quis eius est sint explicabo",true);

        // Send the Request and Get the Response

        Response response = given().spec(spec).when().get("/{first}/{second}");

        // Do Assertion

       JsonPlaceHolderPojo actualData =ObjectMapperUtils.convertJsonToJava(response.asString(),JsonPlaceHolderPojo.class);

       assertEquals(200,response.statusCode());
       assertEquals(expectedData.getUserId(),actualData.getUserId());
       assertEquals(expectedData.getCompleted(),actualData.getCompleted());
       assertEquals(expectedData.getTitle(),actualData.getTitle());

    }
}
