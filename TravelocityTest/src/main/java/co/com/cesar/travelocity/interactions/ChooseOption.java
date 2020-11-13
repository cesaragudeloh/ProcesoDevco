package co.com.cesar.travelocity.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.cesar.travelocity.userinterfaces.HomePage.MENU_OPTION;

public class ChooseOption implements Interaction {

    private String option;

    public ChooseOption(String option) {
        this.option = option;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MENU_OPTION.of(option))
        );
    }

    public static ChooseOption inTheMenu(String option) {
        return Instrumented.instanceOf(ChooseOption.class).withProperties(option);
    }
}
