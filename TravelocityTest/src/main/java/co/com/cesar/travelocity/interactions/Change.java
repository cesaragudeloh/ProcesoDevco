package co.com.cesar.travelocity.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Switch;

public class Change implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {
        String currentHandle = BrowseTheWeb.as(actor).getDriver().getWindowHandle();
        actor.attemptsTo(
                Switch.toWindow(getNewWindowHandle(actor, currentHandle))
        );

    }


    public static Change toNewWindow(){
        return Instrumented.instanceOf(Change.class).withProperties();
    }


    private static String getNewWindowHandle(Actor actor, String currentWindowHandle){
        for (String windowHandle : BrowseTheWeb.as(actor).getDriver().getWindowHandles()) {
            if (!windowHandle.equals(currentWindowHandle)) {
                return windowHandle;
            }
        }
        return null;
    }
}
