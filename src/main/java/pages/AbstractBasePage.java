package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * This class allows to use 'Header' and 'Button' elements from any WebPage
 */
public abstract class AbstractBasePage extends PageObject {

    @FindBy(id = "shipping-country")
    private WebElement shippingCountryLink;

    public SettingsPage clickShippingCountryLink() {
        shippingCountryLink.click();
        return new SettingsPage();
    }


}
