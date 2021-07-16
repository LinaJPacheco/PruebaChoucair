package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.WebdriverCollectionStrategy;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.NavigateHomePageChoucair;
import tasks.OptionsJobs;

public class VacantesStepDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor user = Actor.named("user");

    @Before
    public void setUp() { user.can(BrowseTheWeb.with(hisBrowser));}

    @Given("^the user is on the choucair website$")
    public void theUserIsOnTheChoucairWebsite() {user.wasAbleTo(NavigateHomePageChoucair.browser(hisBrowser));   }


    @When("^user selects the job option$")
    public void userSelectsTheJobOption(){user.attemptsTo(OptionsJobs.JobsA()); }

    @When("^click on the go to job portal button$")
    public void clickOnTheGoToJobPortalButton() {

    }

    @When("^open magnetos website$")
    public void openMagnetoSWebsite() {

    }

    @When("^click on the option know our vacancies$")
    public void clickOnTheOptionKnowOurVacancies() {

    }

    @Then("^the user will be able to view offers$")
    public void theUserWillBeAbleToViewOffers() {

    }

}
