package bigbang.qa;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources"
        , glue = "bigbang.qa.steps"
       , tags = "@tag1"
        , plugin =
        {"ru.testit.listener.BaseCucumber7Listener",
                "progress",
                "summary"}

)
public class ExampleTestRunner {
}
