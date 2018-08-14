import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = {"step_definition"},
        features = "src/test/resources/features/test_feature.feature")
public class TestRunner {

}
