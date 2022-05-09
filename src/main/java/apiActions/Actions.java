package apiActions;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import utils.RequestBuilder;

public class Actions extends RequestBuilder {

    private static Response response;

    public static Response getRequest(String path ){
        return response = requestBuilder().get(path);
    }

    public static ValidatableResponse extractResponseBody(Response responseBody){
        return responseBody.then().log().body();
    }

}
