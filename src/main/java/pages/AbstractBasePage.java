package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * This class allows to use 'Header' and 'Button' elements from any WebPage
 */
public class AbstractBasePage extends PageObject {

//    @FindBy(id = "nav_main")
//    WebElement navigationMenu;

    @FindBy(xpath = "//*[@id='nav_main']//a[text()='Shop']")
    WebElement shopLink;

//    @FindBy(id = "shipping-country")
//    WebElement shippingCountryLink;
//
//    @FindBy(id = "currency-selector")
//    WebElement currencySelector;

//    public WomanShopPage clickShopLink() {
//        shopLink.click();
//        return new WomanShopPage();
//    }

//    public SettingsPage clickShippingCountryLink() {
//        shippingCountryLink.click();
//        return new SettingsPage();
//    }


}
