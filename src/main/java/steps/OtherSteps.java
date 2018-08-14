package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class OtherSteps {

    private WebDriver webDriver = ThucydidesWebDriverSupport.getDriver();

    @Step
    public String get_page_value() {
        return webDriver.getWindowHandle();
    }

    @Step
    public void verify_current_page_value(String expectedTitle) {
        String actual = webDriver.getWindowHandle();
        Assert.assertEquals(expectedTitle,actual);
    }

}
