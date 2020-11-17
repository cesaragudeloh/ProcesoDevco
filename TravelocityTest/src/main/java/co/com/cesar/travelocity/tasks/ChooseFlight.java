package co.com.cesar.travelocity.tasks;

import co.com.cesar.travelocity.interactions.Change;
import co.com.cesar.travelocity.models.Flight;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.cesar.travelocity.userinterfaces.FlightResultsPage.*;
import static co.com.cesar.travelocity.utils.Constants.ARRIVAL_EARLIEST;
import static co.com.cesar.travelocity.utils.Constants.FLIGHT;

public class ChooseFlight implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        Flight flight = actor.recall(FLIGHT);
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(ARRIVAL_EARLIEST).from(SORT_BY),
                Click.on(AIRLINE_OPTION.of(flight.getAirline())),
                Click.on(SHOW_OPTIONS),
                SelectFromOptions.byVisibleText(flight.getAdults()).from(ADULT_COUNT),
                SelectFromOptions.byVisibleText(flight.getChildren()).from(CHILD_COUNT),
                Click.on(SEARCH_BUTTON),
                SelectFromOptions.byVisibleText(ARRIVAL_EARLIEST).from(SORT_BY),
                Click.on(AIRLINE_OPTION.of(flight.getAirline())),
                Click.on(FIRST_FLIGHT),
                Click.on(NOT_ADD_HOTEL),
                Change.toNewWindow(),
                Click.on(CONTINUE_BOOKING_BUTTON)
        );
    }


    public static ChooseFlight withCriteria() {
        return Instrumented.instanceOf(ChooseFlight.class).withProperties();
    }
}
