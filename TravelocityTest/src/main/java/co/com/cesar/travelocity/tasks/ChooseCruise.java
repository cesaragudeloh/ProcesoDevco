package co.com.cesar.travelocity.tasks;

import co.com.cesar.travelocity.interactions.Change;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.cesar.travelocity.userinterfaces.CruiseResultsPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;


public class ChooseCruise implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SORT_OPTION),
                Click.on(FIRST_BUTTON_CONTINUE),
                Change.toNewWindow(),
                Click.on(CABIN_EXPERIENCE_BUTTON),
                Click.on(CABIN_TYPE_BUTTON)               
        );
    }


    public static ChooseCruise withProperties() {
        return Instrumented.instanceOf(ChooseCruise.class).withProperties();
    }


}
