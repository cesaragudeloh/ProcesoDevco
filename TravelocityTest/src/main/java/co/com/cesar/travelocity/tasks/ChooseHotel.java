package co.com.cesar.travelocity.tasks;

import static co.com.cesar.travelocity.utils.Constants.*;
import static co.com.cesar.travelocity.userinterfaces.HotelResultsPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.cesar.travelocity.interactions.Change;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ChooseHotel implements Task {

    private String criteria;

    public ChooseHotel(String criteria) {
        this.criteria = criteria;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(PRICE).from(SHORT_BY),
                WaitUntil.the(FIRST_HOTEL, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(FIRST_HOTEL),
                Change.toNewWindow(),
                Click.on(RESERVE_A_ROOM_BUTTON),
                Click.on(RESERVE_BUTTON)
        );
        if (PAY_WHEN_YOU_STAY_BUTTON.resolveFor(actor).isVisible()) {
            actor.attemptsTo(
                    Click.on(PAY_WHEN_YOU_STAY_BUTTON)
            );
        }
        actor.attemptsTo(
                WaitUntil.the(CLOSE_MODAL_BOOKING, isVisible()).forNoMoreThan(50).seconds(),
                Click.on(CLOSE_MODAL_BOOKING)
        );
    }

    public static ChooseHotel withCriteria(String criteria) {
        return Instrumented.instanceOf(ChooseHotel.class).withProperties(criteria);
    }
}
