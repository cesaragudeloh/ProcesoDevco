package co.com.cesar.travelocity.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import co.com.cesar.travelocity.models.Flight;
import co.com.cesar.travelocity.tasks.SearchFlight;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class FindFlightStepdefinitions {



    @When("^looking for a one way flight$")
    public void lookingForAOnewayFlight(List<Flight> withTheData){
        theActorInTheSpotlight().attemptsTo(
                SearchFlight.whitTheData(withTheData)
        );
    }

    @And("^I locate the cheapest return of the airline \"([^\"]*)\"$")
    public void iLocateTheCheapestReturnOfTheArolineaSomething(String airline){
        theActorInTheSpotlight().attemptsTo(

        );
    }

    @Then("^the system displays the review of the flight to be booked$")
    public void theSystemDisplaysTheReviewOfTheFlightToBeBooked(){
        theActorInTheSpotlight().should(

        );
    }
}
