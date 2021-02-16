package hellocucumber;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;


public class StepDefinitionsTest extends BaseTest {

    private Response response;
    private ValidatableResponse json;
    private RequestSpecification request;

    @When("^the user navigate to \"(.*?)\"$")
    public void the_user_navigate_to(String url) throws Throwable{
        BaseTest.openDriver();
        driver.get(url);
        throw new PendingException();
    }

    @Then("^user gets following \"(.*?)\"$")
    public void user_gets_following(int statusCode) {
        Assert.assertEquals(statusCode, response.then().statusCode(statusCode));
        throw new PendingException();
    }


//    @Then("^there are no console errors on loading$")
//    public void there_are_no_console_errors_on_loading_of_webpage() throws Throwable {
//
//    throw new PendingException();
//    }
}
