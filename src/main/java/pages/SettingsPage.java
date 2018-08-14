package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettingsPage extends AbstractBasePage {

    @FindBy(className = "settings__submit__button")
    WebElement submitButton;

    @FindBy(id = "command")
    WebElement form;

    @FindBy(id = "command")
    WebElement commandForm;

    public void selectShippingCountry(String country) {
        form.findElement(By.id("shippingCountry")).sendKeys(country);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public boolean isOpened() {
        return commandForm.isEnabled();
    }

}
