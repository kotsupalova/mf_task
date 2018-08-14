package steps;

import net.thucydides.core.annotations.Step;
import org.springframework.util.Assert;
import pages.SettingsPage;
import pages.WomanHomePage;


public class NavigateSteps {

    WomanHomePage womanHomePage;
    SettingsPage settingsPage;

    @Step
    public void open_women_home_page() {
        womanHomePage.open();
    }

//    @Step
//    public void open_product_detail_page() {
//        womanHomePage.open();
//        womanHomePage.clickShopLink().openProductDetailPage();
//    }

//    @Step
//    public void click_shipping_country_link() {
//        womanHomePage.clickShippingCountryLink();
//    }

    @Step
    public void should_see_settings_page() {
        settingsPage.isOpened();
        Assert.isTrue(settingsPage.isOpened(), "Settings Page wasn't opened.");
    }
}
