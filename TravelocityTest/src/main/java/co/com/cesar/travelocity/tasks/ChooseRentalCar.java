package co.com.cesar.travelocity.tasks;

import co.com.cesar.travelocity.interactions.Change;
import co.com.cesar.travelocity.models.RentalCar;
import co.com.cesar.travelocity.models.ReservationData;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.cesar.travelocity.userinterfaces.RentalCarResultPage.*;
import static co.com.cesar.travelocity.utils.Constants.RENTAL_CAR;
import static co.com.cesar.travelocity.utils.Constants.TOTAL_PRICE;

public class ChooseRentalCar implements Task {

    private ReservationData reservationData;

    public ChooseRentalCar(ReservationData reservationData) {
        this.reservationData = reservationData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        RentalCar rentalCar = actor.recall(RENTAL_CAR);
        if (SHOW_MORE_CAR_TYPE.resolveFor(actor).isVisible()) {
            actor.attemptsTo(
                    Click.on(SHOW_MORE_CAR_TYPE)
            );
        }
        actor.attemptsTo(
                Click.on(CHOOSE_INPUT_OPTION.of(rentalCar.getCarType())),
                Click.on(CHOOSE_INPUT_OPTION.of(rentalCar.getSpecification())),
                SelectFromOptions.byVisibleText(TOTAL_PRICE).from(SORT_BY_OPTION),
                Click.on(FIRST_RENTAL_CAR),
                Change.toNewWindow(),
                Click.on(RESERVE_BUTTON),
                Reserve.aCar(reservationData)
        );
    }

    public static ChooseRentalCar withTheInformation(List<ReservationData> reservationData) {
        return Instrumented.instanceOf(ChooseRentalCar.class).withProperties(reservationData.get(0));
    }
}
