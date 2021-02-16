package hellocucumber;

import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.restassured.response.Response;


public class BaseTest {

    protected static WebDriver driver ;
    private Response response;
    private ValidatableResponse json;
    private RequestSpecification request;

    public static void openDriver() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://www.google.com");
    }

}
