package co.com.cesar.travelocity.tasks;

import co.com.cesar.travelocity.userinterfaces.HomePage;
import co.com.cesar.travelocity.userinterfaces.HotelPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class Go implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(HomePage.class)
        );
    }


    public static Go toTravelocity() {
        return Instrumented.instanceOf(Go.class).withProperties();
    }
}
