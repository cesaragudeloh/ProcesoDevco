package co.com.cesar.travelocity.tasks;

import co.com.cesar.travelocity.models.ReservationData;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.cesar.travelocity.userinterfaces.ReservationPage.*;
import static co.com.cesar.travelocity.utils.Constants.*;

import java.util.List;

public class Reserve implements Task {

    private ReservationData reservationData;

    public Reserve(ReservationData reservationData) {
        this.reservationData = reservationData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(reservationData.getName()).into(NAME_INPUT),
                Click.on(COUNTRY_INPUT.of(reservationData.getCountry())),
                Enter.theValue(reservationData.getPhone()).into(PHONE_INPUT)
        );
        if (YES.equals(reservationData.getCarProtection())) {
            actor.attemptsTo(
                    Click.on(CAR_PROTECTION_YES)
            );
        } else {
            actor.attemptsTo(
                    Click.on(CAR_PROTECTION_NOT)
            );
        }
        actor.attemptsTo(
                Enter.theValue(reservationData.getEmail()).into(EMAIL_INPUT),
                Enter.theValue(reservationData.getPassword()).into(PASSWORD_INPUT),
                Enter.theValue(reservationData.getPassword()).into(REPEAT_PASSWORD_INPUT),
                Click.on(RESERVE_NOW_BUTTON)

        );
    }

    public static Reserve aCar(ReservationData reservationData) {
        return Instrumented.instanceOf(Reserve.class).withProperties(reservationData);
    }
}
