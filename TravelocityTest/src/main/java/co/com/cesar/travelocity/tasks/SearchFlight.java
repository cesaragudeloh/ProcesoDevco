package co.com.cesar.travelocity.tasks;

import static co.com.cesar.travelocity.utils.Constants.*;
import static co.com.cesar.travelocity.userinterfaces.FlightPage.*;
import static co.com.cesar.travelocity.userinterfaces.HomePage.SEARCH_BUTTON;

import co.com.cesar.travelocity.interactions.ChooseDate;
import co.com.cesar.travelocity.interactions.ChooseOption;
import co.com.cesar.travelocity.models.Flight;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import java.util.List;

public class SearchFlight implements Task {

    private Flight flight;

    public SearchFlight(Flight flight) {
        this.flight = flight;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember(FLIGHT, flight);
        actor.attemptsTo(
                ChooseOption.inTheMenu(FOR_A_FLIGHT),
                Click.on(ONE_WAY_OPTION),
                Click.on(LEAVING_FROM_OPTION),
                Enter.theValue(flight.getLeavingFrom()).into(LEAVING_FROM_INPUT),
                Click.on(FIRST_RESULT_ORIGIN),
                Click.on(GOING_TO_OPTION),
                Enter.theValue(flight.getGoingTo()).into(GOING_TO_INPUT),
                Click.on(FIRST_RESULT_DESTINATION),
                Click.on(DEPARTING_OPTION),
                ChooseDate.inTheCalendar(flight.getDeparting()),
                Click.on(SEARCH_BUTTON)
        );
    }

    public static SearchFlight whitTheData(List<Flight> flight) {
        return Instrumented.instanceOf(SearchFlight.class).withProperties(flight.get(0));
    }
}
