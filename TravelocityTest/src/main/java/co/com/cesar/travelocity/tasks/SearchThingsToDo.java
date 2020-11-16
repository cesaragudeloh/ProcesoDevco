package co.com.cesar.travelocity.tasks;

import co.com.cesar.travelocity.interactions.ChooseDate;
import co.com.cesar.travelocity.interactions.ChooseOption;
import co.com.cesar.travelocity.models.Information;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.cesar.travelocity.utils.Constants.*;
import static co.com.cesar.travelocity.userinterfaces.ThingsToDoPage.*;
import static co.com.cesar.travelocity.userinterfaces.HomePage.SEARCH_BUTTON;

public class SearchThingsToDo implements Task {

    private Information information;

    public SearchThingsToDo(Information information) {
        this.information = information;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ChooseOption.inTheMenu(FOR_A_THINGS_TO_DO),
                Click.on(ORIGIN_OPTION),
                Enter.theValue(information.getOrigin()).into(ORIGIN_INPUT),
                Click.on(FIRST_RESULT),
                Click.on(FROM_OPTION),
                ChooseDate.inTheCalendar(information.getFrom()),
                Click.on(TO_OPTION),
                ChooseDate.inTheCalendar(information.getTo()),
                Click.on(SEARCH_BUTTON)
        );
    }


    public static SearchThingsToDo withTheInfo(List<Information> information) {
        return Instrumented.instanceOf(SearchThingsToDo.class).withProperties(information.get(0));
    }
}
