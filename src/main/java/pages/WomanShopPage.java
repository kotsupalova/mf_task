package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomanShopPage extends AbstractBasePage {

    private static final String FIRST_PRODUCT_LINK_LOCATOR =
            "//ul[@class='lister__wrapper']/li[1]//a[@class='productMainLink']";

    @FindBy(xpath = FIRST_PRODUCT_LINK_LOCATOR)
    WebElement firstProductLink;

    public ProductDetailPage openProductDetailPage() {
        firstProductLink.isDisplayed();
        firstProductLink.click();
        return new ProductDetailPage();
    }

}
