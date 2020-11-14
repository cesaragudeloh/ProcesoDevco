package co.com.cesar.travelocity.questions;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.MoveMouseToTarget;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class GetText implements Question<String> {

    private Target target;

    public GetText(Target target) {
        this.target = target;
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(
                //WaitUntil.the(target, isVisible()).forNoMoreThan(20).seconds(),
                MoveMouse.to(target)
        );
        return Text.of(target).viewedBy(actor).asString();
    }

    public static GetText ofTarget(Target target) {
        return Instrumented.instanceOf(GetText.class).withProperties(target);
    }
}
