package co.com.cesar.travelocity.tasks;

import static co.com.cesar.travelocity.userinterfaces.HomePage.*;
import static co.com.cesar.travelocity.utils.Constants.*;

import co.com.cesar.travelocity.interactions.ChooseOption;
import co.com.cesar.travelocity.interactions.SearchHotel;
import co.com.cesar.travelocity.models.Hotel;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.List;

public class Search implements Task {

    private String option;
    private Hotel hotel;

    public Search(String option, Hotel hotel) {
        this.option = option;
        this.hotel = hotel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ChooseOption.inTheMenu(option)
        );
        if (FOR_A_HOTEL.equals(option)) {
            actor.attemptsTo(
                    SearchHotel.withTheData(hotel)
            );
        }
    }

    public static Search theSystem(String option, List<Hotel> hotel) {
        return Instrumented.instanceOf(Search.class).withProperties(option, hotel.get(0));
    }

}
