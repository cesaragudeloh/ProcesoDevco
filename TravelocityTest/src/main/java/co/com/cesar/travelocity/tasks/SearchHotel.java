package co.com.cesar.travelocity.tasks;

import co.com.cesar.travelocity.interactions.ChooseDate;
import co.com.cesar.travelocity.interactions.ChooseOption;
import co.com.cesar.travelocity.models.Hotel;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import java.util.List;

import static co.com.cesar.travelocity.utils.Constants.*;
import static co.com.cesar.travelocity.userinterfaces.HotelPage.*;
import static co.com.cesar.travelocity.userinterfaces.HomePage.SEARCH_BUTTON;

public class SearchHotel implements Interaction {

    private Hotel hotel;

    public SearchHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ChooseOption.inTheMenu(FOR_A_HOTEL),
                Click.on(GOING_TO_OPTION),
                Enter.theValue(hotel.getGoinTo()).into(GOING_TO_INPUT),
                Click.on(FIRST_RESULT),
                Click.on(CHECK_IN_OPTION),
                ChooseDate.inTheCalendar(hotel.getCheckIn()),
                Click.on(CHECK_OUT_OPTION),
                ChooseDate.inTheCalendar(hotel.getCheckOut()),
                Click.on(TRAVELERS_OPTION),
                Click.on(DECREASE_ADULTS_BUTTON),
                Click.on(SAVE_TRAVELERS_BUTTON),
                Click.on(SEARCH_BUTTON)
        );
    }


    public static SearchHotel withTheData(List<Hotel> hotel) {
        return Instrumented.instanceOf(SearchHotel.class).withProperties(hotel.get(0));
    }
}
