package cucumber.steps;

import BasePackage.BaseTest;
import Pages.joinUsSection;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JoinUsSectionTest extends BaseTest {

    public static joinUsSection joinUsSectionObj;


    @Given("user in career page")
    public void userInCareerPage() {
        joinUsSectionObj = new joinUsSection();
        joinUsSectionObj.joinUsSectionPage();
    }

    @When("user click on ‘Check our open positions’ button")
    public void userClickOnCheckOurOpenPositionsButton() {
    }

    @And("filter by location Anywhere")
    public void filterByLocationAnywhere() {
        joinUsSectionObj = new joinUsSection();
        joinUsSectionObj.filterByLocation();
    }

    @Then("Verify that four main sections are shown")
    public void verifyThatFourMainSectionsAreShown() {
        joinUsSectionObj = new joinUsSection();
        joinUsSectionObj.verifyFourSections();
    }

    @And("Verify that ‘Apply’ button is present at the bottom")
    public void verifyThatApplyButtonIsPresentAtTheBottom() {
    }

    @Then("user click on ‘Apply’ button")
    public void userClickOnApplyButton() {
        joinUsSectionObj = new joinUsSection();
        joinUsSectionObj.applyBtn();
    }

    @And("user upload a CV document, and click ‘Send’ button")
    public void userUploadACVDocumentAndClickSendButton() {
        joinUsSectionObj = new joinUsSection();
        joinUsSectionObj.uploadCV();
    }

    @Then("Verify required error messages")
    public void verifyRequiredErrorMessages() {
        joinUsSectionObj = new joinUsSection();
        joinUsSectionObj.verifyRequiredErrorMessages();
    }

    @And("Verify error messages for invalid scenarios")
    public void verifyErrorMessagesForInvalidScenarios() {
        joinUsSectionObj = new joinUsSection();
        joinUsSectionObj.verifyInvalidErrorMessages();
    }
}