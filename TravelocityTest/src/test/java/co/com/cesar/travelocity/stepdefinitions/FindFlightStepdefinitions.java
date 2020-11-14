package co.com.cesar.travelocity.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.*;
import static co.com.cesar.travelocity.userinterfaces.FlightResultsPage.*;
import static co.com.cesar.travelocity.utils.Constants.*;

import co.com.cesar.travelocity.models.Flight;
import co.com.cesar.travelocity.tasks.ChooseFlight;
import co.com.cesar.travelocity.tasks.SearchFlight;
import co.com.cesar.travelocity.questions.GetText;
import cucumber.api.java.en.*;
import java.util.List;

public class FindFlightStepdefinitions {


    @When("^looking for a one way flight$")
    public void lookingForAOnewayFlight(List<Flight> withTheData) {
        theActorInTheSpotlight().attemptsTo(
                SearchFlight.whitTheData(withTheData)
        );
    }

    @And("^I locate the flight of the airline$")
    public void iLocateTheFlightOfTheAirline() {
        theActorInTheSpotlight().attemptsTo(
                ChooseFlight.withCriteria()
        );
    }

    @Then("^the system displays the review of the flight to be booked$")
    public void theSystemDisplaysTheReviewOfTheFlightToBeBooked() {
        Flight flight = theActorInTheSpotlight().recall(FLIGHT);
        theActorInTheSpotlight().should(
                seeThat(ADULTS, GetText.ofTarget(REVIEW_TICKETS_COUNT), containsString(flight.getAdults())),
                seeThat(AIRLINE, GetText.ofTarget(REVIEW_AIRLINE), containsString(flight.getAirline()))
        );
    }
}
