package get_request;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.*;

public class Get02 {
    /*
     Given
    https://restful-booker.herokuapp.com/booking/1
    When
    User send a GET Request to the url
    Then
    HTTP Status code should be 404
    And
    Status Line should be HTTP/1.1 404 Not Found
    And
    Response body contains "Not Found"
    And
    Response body does not contain "TechProEd"
    And
    Server is "Cowboy"
            */

    @Test
    public void get01() {
      //  1) Set the URL,
        String url = "https://restful-booker.herokuapp.com/booking/1";

       // 2) Set the expected Data (beklenen datanin olusturulmasi, post, put, patch)

       // 3) Type code to send request (talep gondermek icin kod yazimi

        Response response = given().when().get(url);
        response.prettyPrint();

       // 4) Do Assertion (dogrlama yapma)
        response.then().assertThat().statusCode(404).statusLine("HTTP/1.1 404 Not Found");
        // Body Not Found Testi iceriyormu
        assertTrue(response.asString().contains("Not Found"));
        // Body nin TechProed icermedigi test ediliyor
        assertFalse(response.asString().contains("TechProEd"));
        // Server in Cowboy olup olmadıgını test ediyoruz
        assertEquals("Cowboy",response.getHeader("Server"));

    }
}
