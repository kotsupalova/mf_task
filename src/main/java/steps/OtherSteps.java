package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.openqa.selenium.WebDriver;
import org.springframework.util.Assert;

public class OtherSteps {

    WebDriver webDriver = ThucydidesWebDriverSupport.getDriver();

    @Step
    public String get_page_title() {
        return webDriver.getTitle();
    }

    @Step
    public void verify_current_title(String expectedTitle) {
        Assert.hasText(webDriver.getTitle(), expectedTitle);
    }

}
