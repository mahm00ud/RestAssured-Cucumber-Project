package utils;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class RequestBuilder {

    private static String baseURI = "http://www.colourlovers.com/";
    private static RequestSpecification request;


    public static RequestSpecification requestBuilder(){

        // Creating request specification using given()
        return request= RestAssured.given().
                baseUri(baseURI).
                header("User-Agent", "PostmanRuntime/7.29.0");
    }

}
