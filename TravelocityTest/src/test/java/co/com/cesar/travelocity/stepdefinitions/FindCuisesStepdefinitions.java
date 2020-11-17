package co.com.cesar.travelocity.stepdefinitions;

import co.com.cesar.travelocity.models.Cruise;
import co.com.cesar.travelocity.tasks.ChooseCruise;
import co.com.cesar.travelocity.tasks.FindCruise;
import cucumber.api.java.en.*;

import java.util.List;

import co.com.cesar.travelocity.questions.GetText;

import static co.com.cesar.travelocity.userinterfaces.CruiseResultsPage.TRIP_SUMMARY_LABEL;
import static co.com.cesar.travelocity.utils.Constants.SUMMARY_TRIP;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.*;


public class FindCuisesStepdefinitions {

    @When("^I looking for a cruise$")
    public void iLookingForACruise(List<Cruise> cruises) {
        theActorInTheSpotlight().attemptsTo(
                FindCruise.withTheInput(cruises)
        );
    }

    @And("^I select a cruise with all its properties$")
    public void iSelectACruiseWithAllItsProperties() {
        theActorInTheSpotlight().attemptsTo(
                ChooseCruise.withProperties()
        );
    }

    @Then("^the system displays the review of the cruise to be booked$")
    public void theSystemDisplaysTheReviewOfTheCruiseToBeBooked() {
        theActorInTheSpotlight().should(
                seeThat(SUMMARY_TRIP, GetText.ofTarget(TRIP_SUMMARY_LABEL), is(not(isEmptyString())))
        );
    }


}
