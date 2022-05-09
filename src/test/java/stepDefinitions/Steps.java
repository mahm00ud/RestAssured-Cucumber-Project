package stepDefinitions;

import Modules.Patterns;
import apiActions.Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;


public class Steps{
    private static Response response;

    private static Actions restActions = new Actions();
    private static Patterns patterns = new Patterns();

    @Given("I send a request to get all Patterns using {string}")
    public void SendRequest(String endPoint){
        response = restActions.getRequest(endPoint);
    }

    @Then("I should Receive a response body of patterns")
    public void getResponseBody(){
        restActions.extractResponseBody(response);
    }

    @And("Number of views Should be greater than {int}")
    public void assertNumViewGreaterThanValue(int numViews){
        Assert.assertTrue("Not all numViews are greater than " + numViews , patterns.isNumViewsGreaterThanValue(numViews));
    }
}
