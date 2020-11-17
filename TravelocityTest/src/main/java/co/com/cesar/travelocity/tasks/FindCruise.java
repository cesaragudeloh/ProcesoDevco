package co.com.cesar.travelocity.tasks;

import co.com.cesar.travelocity.interactions.ChooseDate;
import co.com.cesar.travelocity.interactions.ChooseOption;
import co.com.cesar.travelocity.interactions.PressButton;
import co.com.cesar.travelocity.models.Cruise;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.cesar.travelocity.userinterfaces.CruisePage.*;
import static co.com.cesar.travelocity.userinterfaces.HomePage.*;
import static co.com.cesar.travelocity.utils.Constants.*;

public class FindCruise implements Task {

    private Cruise cruise;

    public FindCruise(Cruise cruise) {
        this.cruise = cruise;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ChooseOption.inTheMenu(FOR_A_CRUISES),
                SelectFromOptions.byVisibleText(cruise.getGoingTo()).from(GOING_TO_OPTION),
                Click.on(TRAVELERS_OPTION),
                Click.on(SAVE_TRAVELERS_BUTTON),
                Click.on(DEPARTS_AS_EARLY_AS_OPTION),
                PressButton.times(NEXT_MONTH_OPTION, 7),
                ChooseDate.inTheCalendar(cruise.getDepartsAsEarlyAs()),
                Click.on(DEPARTS_AS_LATE_AS_OPTION),
                ChooseDate.inTheCalendar(cruise.getDepartsAslateAs()),
                Click.on(SEARCH_BUTTON)
        );
    }


    public static FindCruise withTheInput(List<Cruise> cruise) {
        return Instrumented.instanceOf(FindCruise.class).withProperties(cruise.get(0));
    }
}
