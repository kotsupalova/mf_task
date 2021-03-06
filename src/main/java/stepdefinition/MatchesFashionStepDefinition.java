package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.NavigateSteps;
import steps.OtherSteps;
import steps.SettingsPageSteps;

public class MatchesFashionStepDefinition {

    @Steps
    private NavigateSteps navigateSteps;

    @Steps
    private SettingsPageSteps settingsPageSteps;

    @Steps
    private OtherSteps otherSteps;

    private String pageValue;

    @Given("^I am on the website|I am on the Shop page$")
    public void iAmOnTheWebsite() {
        navigateSteps.open_women_home_page();
        pageValue = otherSteps.get_page_value();
    }

    @When("^I click the country name in the top-left corner of the page$")
    public void iClickTheCountryNameInTheTopLeftCornerOfThePage() {
        navigateSteps.click_shipping_country_link();
    }

    @Then("^I am taken to the Settings page$")
    public void iAmTakenToTheSettingsPage() {
        navigateSteps.should_see_settings_page();
    }

    @And("^I select '(.*)' as my shipping destination$")
    public void iSelectCountryAsMyShippingDestination(String country) {
        settingsPageSteps.select_shipping_country(country);
    }

    @And("^I save the settings$")
    public void iSaveTheSettings() {
        settingsPageSteps.save_the_settings();
    }

    @Then("^I returned to the same Shop page$")
    public void iReturnedToTheSameShopPage() {
        otherSteps.verify_current_page_value(pageValue);
    }

    @And("^my country in the top-left corner of the page is '(.*)'$")
    public void myCountryInTheTopLeftCornerOfThePageIsCountry(String country) {
        navigateSteps.verify_country_name_in_the_top_left_corner_of_the_page(country);
    }

}
