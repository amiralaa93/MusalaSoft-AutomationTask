package cucumber.steps;

import BasePackage.BaseTest;
import Pages.positionsList;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PositionListTest extends BaseTest {

    public static positionsList positionsListObj;

    @Given("user at career page")
    public void userAtCareerPage() {
        positionsListObj = new positionsList();
        positionsListObj.joinUsSectionPage();
    }

    @When("user click ‘Check our open positions’ button")
    public void userClickCheckOurOpenPositionsButton() {
    }

    @And("user filter the available positions by Sofia city")
    public void userFilterTheAvailablePositionsBySofiaCity() {
        positionsListObj = new positionsList();
        positionsListObj.filterBySofiaLocation();
    }

    @Then("print in the console the list with available positions in Sofia")
    public void printInTheConsoleTheListWithAvailablePositionsInSofia() {
    }

    @And("user filter the available positions by Skopje city")
    public void userFilterTheAvailablePositionsBySkopjeCity() {
        positionsListObj = new positionsList();
        positionsListObj.filterBySkopjeLocation();
    }

    @Then("print in the console the list with available positions in Skopje")
    public void printInTheConsoleTheListWithAvailablePositionsInSkopje() {
    }
}