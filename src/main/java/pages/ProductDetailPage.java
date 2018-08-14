package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailPage extends AbstractBasePage {

    @FindBy(id = "addToCartButton")
    WebElement addToBagButton;

    public void isOpened() {
        addToBagButton.isDisplayed();
    }
}
