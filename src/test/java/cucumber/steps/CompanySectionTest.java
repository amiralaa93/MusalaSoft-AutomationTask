package cucumber.steps;

import BasePackage.BaseTest;
import Pages.companySection;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CompanySectionTest extends BaseTest {

    public static companySection companySectionObj;

    @Given("user on company page")
    public void userOnCompanyPage() {
        companySectionObj = new companySection();
        companySectionObj.companySectionPage();
    }

    @Then("‘Leadership’ section should be displayed")
    public void leadershipSectionShouldBeDisplayed() {
        companySectionObj = new companySection();
        companySectionObj.leaderShipSection();
    }

    @When("user click the Facebook link from the footer")
    public void userClickTheFacebookLinkFromTheFooter() {
    }

    @Then("Verify that the correct URL loads and verify if the Musala Soft profile picture appears on the new page")
    public void verifyThatTheCorrectURLLoadsAndVerifyIfTheMusalaSoftProfilePictureAppearsOnTheNewPage() {
        companySectionObj = new companySection();
        companySectionObj.facebookSection();
    }
}