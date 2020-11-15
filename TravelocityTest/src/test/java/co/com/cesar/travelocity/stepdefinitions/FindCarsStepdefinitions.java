package co.com.cesar.travelocity.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static co.com.cesar.travelocity.utils.Constants.*;
import static org.hamcrest.Matchers.equalTo;
import static co.com.cesar.travelocity.userinterfaces.ReservationPage.RESERVE_COMPLETED_MESSAGE;

import co.com.cesar.travelocity.questions.GetText;
import co.com.cesar.travelocity.models.RentalCar;
import co.com.cesar.travelocity.models.ReservationData;
import co.com.cesar.travelocity.tasks.ChooseRentalCar;
import co.com.cesar.travelocity.tasks.SearchRentalCar;
import cucumber.api.java.en.*;

import java.util.List;

public class FindCarsStepdefinitions {


    @When("^looking for a rental car$")
    public void lookingForARentalCar(List<RentalCar> rentalCars) {
        theActorInTheSpotlight().attemptsTo(
                SearchRentalCar.withTheData(rentalCars)
        );
    }

    @And("^I locate the cheapest car and enter the reservation data$")
    public void iLocateTheCheapestCarAndEnterTheReservationData(List<ReservationData> reservationData) {
        theActorInTheSpotlight().attemptsTo(
                ChooseRentalCar.withTheInformation(reservationData)
        );
    }


    @Then("^the reservation is made and the message \"([^\"]*)\" is displayed$")
    public void theReservationIsMadeAndTheMessageSomethingIsDisplayed(String message) {
        theActorInTheSpotlight().should(
                seeThat(RESERVE_COMPLETE, GetText.ofTarget(RESERVE_COMPLETED_MESSAGE), equalTo(message))
        );
    }


}
