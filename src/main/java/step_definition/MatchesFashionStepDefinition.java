package step_definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import steps.NavigateSteps;
import steps.OtherSteps;
import steps.SettingsPageSteps;

public class MatchesFashionStepDefinition {
    //TODO
    private final String REG_EXP = "(([A-Z]\\w+\\s?)+(\\(|\\-\\s)?([A-Z]?\\w+\\s?)*(\\))*)";

    @Steps
    NavigateSteps navigateSteps;

    @Steps
    SettingsPageSteps settingsPageSteps;

    @Steps
    OtherSteps otherSteps;

    String pageTitle;

    @Given("^I am on the website|I am on the Shop page$")
    public void iAmOnTheWebsite() {
        navigateSteps.open_women_home_page();
        pageTitle = otherSteps.get_page_title();
    }

    //?
//    @Given("^I am on the product details page$")
//    public void iAmOnTheProductDetailsPage() {
//        navigateSteps.open_product_detail_page();
//        pageTitle = otherSteps.get_page_title();
//        System.out.println("!!! PAGE TITLE = " + pageTitle);
//    }

    @When("^I click the country name in the top-left corner of the page$")
    public void iClickTheCountryNameInTheTopLeftCornerOfThePage() {
//        navigateSteps.click_shipping_country_link();
    }

    @Then("^I am taken to the Settings page$")
    public void iAmTakenToTheSettingsPage() {
        navigateSteps.should_see_settings_page();
    }

    @And("^I select ([A-Z]\\w+\\s?) as my shipping destination$")
    public void iSelectAustriaAsMyShippingDestination(String country) {
        settingsPageSteps.select_shipping_country(country);
    }

    @And("^I save the settings$")
    public void iSaveTheSettings() {
        settingsPageSteps.save_the_settings();
    }

    @Then("^I returned to the same Shop page$")
    public void iReturnedToTheSameShopPage() {
        otherSteps.verify_current_title(pageTitle);
    }
}
