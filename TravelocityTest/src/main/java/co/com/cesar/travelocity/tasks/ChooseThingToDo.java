package co.com.cesar.travelocity.tasks;

import co.com.cesar.travelocity.interactions.Change;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.cesar.travelocity.userinterfaces.ThingsToDoResultsPage.*;
import static co.com.cesar.travelocity.utils.Constants.ACTIVITY;

public class ChooseThingToDo implements Task {

    private String activity;

    public ChooseThingToDo(String activity) {
        this.activity = activity;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember(ACTIVITY, activity);
        actor.attemptsTo(
                Enter.theValue(activity).into(SEARCH_KEYWORD_INPUT).thenHit(Keys.ENTER),
                Click.on(FIRST_ACTIVITY_OPTION),
                Change.toNewWindow(),
                Click.on(BOOK_BUTTON)
        );
    }

    public static ChooseThingToDo withTheActivity(String activity) {
        return Instrumented.instanceOf(ChooseThingToDo.class).withProperties(activity);
    }
}
