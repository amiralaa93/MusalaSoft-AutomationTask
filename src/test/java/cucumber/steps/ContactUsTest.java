package cucumber.steps;

import BasePackage.BaseTest;
import Pages.contactUs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactUsTest extends BaseTest {

    public static contactUs contactUsObj;

    @Given("User is on the home page")
    public void userIsOnTheHomePage() {
        contactUsObj = new contactUs();
        contactUsObj.openContactUsForm();
    }

    @When("User Scroll down and go to ‘Contact Us’")
    public void userScrollDownAndGoToContactUs() {
    }

    @Then("User Fill all required fields with invalid email {string}, {string}, {string}, {string}, {string}")
    public void userFillAllRequiredFieldsWithInvalidEmail(String name, String email, String mobile, String subject, String message) {
        contactUsObj = new contactUs();
        contactUsObj.fillAllData(name, email, mobile, subject, message);
    }

    @And("User click on Send Button")
    public void userClickOnSendButton() {
        contactUsObj = new contactUs();
        contactUsObj.clickSend();
    }

    @Then("Verify that error message appears")
    public void verifyThatErrorMessageAppears() {
        contactUsObj = new contactUs();
        contactUsObj.verifyInvalidEmailError();
    }
}