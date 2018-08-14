package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import pages.HeaderMenu;
import pages.SettingsPage;
import pages.WomanHomePage;

public class NavigateSteps {

    private WomanHomePage womanHomePage;
    private SettingsPage settingsPage;
    @Steps
    private HeaderMenu headerMenu;

    @Step
    public void open_women_home_page() {
        womanHomePage.open();
    }

    @Step
    public void click_shipping_country_link() {
        womanHomePage.clickShippingCountryLink();
    }

    @Step
    public void should_see_settings_page() {
        Assert.assertTrue("Settings Page wasn't opened.", settingsPage.isOpened());
    }

    @Step
    public void verify_country_name_in_the_top_left_corner_of_the_page(String country) {
        String currentPageCountry = headerMenu.getCountryNameFromTheTopLeftCorner();
        Assert.assertEquals(country, currentPageCountry);
    }

}
