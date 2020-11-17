package co.com.cesar.travelocity.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class PressButton implements Interaction {

    private Target target;
    private int times;


    public PressButton(Target target, int times) {
        this.target = target;
        this.times = times;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (int i = 0; i < times; i++) {
            actor.attemptsTo(
                    Click.on(target)
            );
        }
    }

    public static PressButton times(Target target, int times) {
        return Instrumented.instanceOf(PressButton.class).withProperties(target, times);
    }
}
