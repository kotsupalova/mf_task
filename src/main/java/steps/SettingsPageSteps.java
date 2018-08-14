package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import pages.SettingsPage;

public class SettingsPageSteps {

    @Steps
    private SettingsPage settingsPage;

    @Step
    public void select_shipping_country(String country){
        settingsPage.selectShippingCountry(country);
    }

    @Step
    public void save_the_settings() {
        settingsPage.clickSubmitButton();
    }

}
