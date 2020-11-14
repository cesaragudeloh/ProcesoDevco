package co.com.cesar.travelocity.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static co.com.cesar.travelocity.utils.Constants.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import static co.com.cesar.travelocity.userinterfaces.HotelResultsPage.*;

import co.com.cesar.travelocity.models.Hotel;
import co.com.cesar.travelocity.questions.GetText;
import co.com.cesar.travelocity.tasks.ChooseHotel;
import co.com.cesar.travelocity.tasks.Go;
import co.com.cesar.travelocity.tasks.SearchHotel;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class FindHotelStepDefinitions {

    @Given("^go to the Travelocity homepage$")
    public void goToTheTravelocityHomepage() {
        theActorCalled(ACTOR_NAME).wasAbleTo(
                Go.toTravelocity()
        );
    }

    @When("^looking for a hotel$")
    public void lookingForAHotel(List<Hotel> withTheData) {
        theActorInTheSpotlight().attemptsTo(
                SearchHotel.withTheData(withTheData)
        );
    }

    @And("^locate the cheapest hotel$")
    public void locateTheCheapestHotel() {
        theActorInTheSpotlight().attemptsTo(
                ChooseHotel.withCriteria(PRICE)
        );
    }

    @Then("^the system displays the reservation details on the screen$")
    public void theSystemDisplaysTheReservationDetailsOnTheScreen() {
        theActorInTheSpotlight().should(
                seeThat(COMPLETE_BOOKING_TEXT, GetText.ofTarget(COMPLETE_BOOKING),equalTo(COMPLETE_BOOKING_TEXT))
        );
    }
}
