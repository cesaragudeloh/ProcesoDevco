package co.com.cesar.travelocity.stepdefinitions;

import co.com.cesar.travelocity.models.Information;
import co.com.cesar.travelocity.tasks.ChooseThingToDo;
import co.com.cesar.travelocity.tasks.SearchThingsToDo;
import co.com.cesar.travelocity.questions.GetText;
import cucumber.api.java.en.*;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static co.com.cesar.travelocity.userinterfaces.ThingsToDoResultsPage.REVIEW_LABEL;
import static co.com.cesar.travelocity.utils.Constants.ACTIVITY;
import static org.hamcrest.Matchers.containsString;

public class FindThingsToDoStepDefinitions {


    @When("^I looking for a things to do$")
    public void iLookingForAThingsToDo(List<Information> ofTheuser) {
        theActorInTheSpotlight().attemptsTo(
                SearchThingsToDo.withTheInfo(ofTheuser)
        );
    }

    @And("^search for an activity \"([^\"]*)\"$")
    public void searchForAnActivitySomething(String activity) {
        theActorInTheSpotlight().attemptsTo(
                ChooseThingToDo.withTheActivity(activity)
        );
    }

    @Then("^the system displays the review of the activity to be booked$")
    public void theSystemDisplaysTheReviewOfTheActivityToBeBooked() {
        String activity = theActorInTheSpotlight().recall(ACTIVITY);
        theActorInTheSpotlight().should(
                seeThat(ACTIVITY, GetText.ofTarget(REVIEW_LABEL), containsString(activity))
        );
    }

}
