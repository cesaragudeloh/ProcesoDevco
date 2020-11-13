package co.com.cesar.travelocity.interactions;

import co.com.cesar.travelocity.models.Hotel;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.cesar.travelocity.userinterfaces.HomePage.*;

public class SearchHotel implements Interaction {

    private Hotel hotel;

    public SearchHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(GOING_TO_OPTION),
                Enter.theValue(hotel.getGoinTo()).into(GOING_TO_INPUT),
                Click.on(FIRST_RESULT),
                Click.on(CHECK_IN_OPTION),
                ChooseDate.inTheCalendar(hotel.getCheckIn()),
                Click.on(SAVE_DATE_BUTTON),
                Click.on(CHECK_OUT_OPTION),
                ChooseDate.inTheCalendar(hotel.getCheckOut()),
                Click.on(SAVE_DATE_BUTTON),
                Click.on(TRAVELERS_OPTION),
                Click.on(DECREASE_ADULTS_BUTTON),
                Click.on(SAVE_TRAVELERS_BUTTON),
                Click.on(SEARCH_HOTEL_BUTTON)
        );
    }


    public static SearchHotel withTheData(Hotel hotel) {
        return Instrumented.instanceOf(SearchHotel.class).withProperties(hotel);
    }
}
