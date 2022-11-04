package get_requests;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class Get01 {
    /*
    1) Postman, manuel API testleri icin kullandik
    2) Otomasyon testleri icin de Rest Assured Library kullanacagiz
    3) Otomasyon testlerimiz yaparken asagidaki adimlari izliyoruz
        a) Gereksinimleri anlamak,
        b) Test Case yaziyoruz
           1) Test case yaziminda "Gherkin" dilini kullanacagiz. Bizler yazilim diline hakim olsak takarsimizdaki
           kisiler hakim olmayabilir ama "Gherkin" dili ile yazilan testleri anlamakta zorluk cekmezler
           Gherkin dilinde kullanacagimiz keywordler:

           -Given : On kosullar,
           -When  : Yapilacak aksiyonlar icin (get(),pul(),post(),patch(),ve delete())
           -Then  : Istek yaptıktan sonra (request gonderdikten sonra ) dogrulama
           -And   : Coklu islemlerde kullanacagiz

        c) Test kodlarimizi yazmaya baslayacagiz

           i)  Set the URL,
           ii) Set the expected Data (beklenen datanin olusturulmasi, post, put, patch)
           iii) Type code to send request (talep gondermek icin kod yazimi)
           iv) Do Assertion (dogrlama yapma)
     */

    /*
Given
        https://restful-booker.herokuapp.com/booking/101
    When
        User sends a GET Request to the url
    Then
        HTTP Status Code should be 200
    And
        Content Type should be JSON
    And
        Status Line should be HTTP/1.1 200 OK
 */
    @Test
    public void get01(){
        // i)  Set the URL,
        String url= "https://restful-booker.herokuapp.com/booking/101";
        // ii) Set the expected Data (beklenen datanin olusturulmasi, post, put, patch)
        // Bizden put yada patch istemedigi icin kullanmayacagız

        // iii) Type code to send request (talep gondermek icin kod yazimi)
        Response response = given().when().get(url);
        response.prettyPrint();

        //iv) Do Assertion (dogrlama yapma)

        response.then().assertThat().statusCode(200).contentType("application/json").statusLine("HTTP/1.1 200 OK");

        // Status Code konsola yazdıralım
        System.out.println(" Status Code = " + response.getStatusCode() );

        // Content Type konsola yazdıralım
        System.out.println("Content Type :" + response.getContentType());

        // Status Line konsola yazdıralım
        System.out.println("Status Line : "+ response.getStatusLine());

        // Header konsola yazdıralım
        System.out.println("Header : " + response.getHeader("Server"));

        // Headers konsola yazdıralım
        System.out.println("Headers : "+ response.getHeaders());

        // Time konsola yazdıralım
        System.out.println("Tıme : "+ response.getTime());





    }

}
