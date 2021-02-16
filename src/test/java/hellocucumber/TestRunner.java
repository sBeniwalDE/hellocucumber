package hellocucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


@CucumberOptions(
        tags = "@sanity",
        features = "src/test/resources/features",
        plugin = "pretty")
public class TestRunner extends AbstractTestNGCucumberTests {

}
