package co.com.cesar.travelocity.tasks;

import co.com.cesar.travelocity.interactions.ChooseDate;
import co.com.cesar.travelocity.interactions.ChooseOption;
import co.com.cesar.travelocity.models.RentalCar;
import co.com.cesar.travelocity.utils.Constants;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.cesar.travelocity.utils.Constants.*;
import static co.com.cesar.travelocity.userinterfaces.RentalCarPage.*;
import static co.com.cesar.travelocity.userinterfaces.HomePage.SEARCH_BUTTON;

public class SearchRentalCar implements Task {

    private RentalCar rentalCar;

    public SearchRentalCar(RentalCar rentalCar) {
        this.rentalCar = rentalCar;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember(RENTAL_CAR, rentalCar);
        actor.attemptsTo(
                ChooseOption.inTheMenu(FOR_A_CARS),
                Click.on(RENTAL_CAR_MENU),
                Click.on(PICK_UP_OPTION),
                Enter.theValue(rentalCar.getPickUp()).into(PICK_UP_INPUT),
                Click.on(FIRST_RESULT_PICK_UP),
                Click.on(DROP_OFF_OPTION),
                Enter.theValue(rentalCar.getDropOff()).into(DROP_OFF_INPUT),
                Click.on(FIRST_RESULT_DROP_OFF),
                Click.on(PICK_UP_DATE_OPTION),
                ChooseDate.inTheCalendar(rentalCar.getPickUpDate()),
                Click.on(DROP_OFF_DATE_OPTION),
                ChooseDate.inTheCalendar(rentalCar.getDropOffDate()),
                SelectFromOptions.byVisibleText(rentalCar.getPickUpTime()).from(PICK_UP_TIME_OPTION),
                SelectFromOptions.byVisibleText(rentalCar.getDropOffTime()).from(DROP_OFF_TIME_OPTION),
                Click.on(SEARCH_BUTTON)
        );
    }

    public static SearchRentalCar withTheData(List<RentalCar> rentalCars) {
        return Instrumented.instanceOf(SearchRentalCar.class).withProperties(rentalCars.get(0));
    }
}
