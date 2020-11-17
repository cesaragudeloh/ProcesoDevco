package co.com.cesar.travelocity.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.cesar.travelocity.userinterfaces.HomePage.SAVE_DATE_BUTTON;

public class ChooseDate implements Interaction {

    private String day = "15";
    private String month = "December";
    private String year = "2020";

    public ChooseDate(String date) {
        String[] text = date.split("-");
        this.day = text[0];
        this.month = text[1];
        this.year = text[2];
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Target calendar = Target.the("Choose date").locatedBy("//div[@class='uitk-new-date-picker-month']/h2[text()='" + month + " " + year + "']/../table/tbody/tr/td/button[contains(@data-day, '" + day + "')]");
        actor.attemptsTo(
                Click.on(calendar),
                Click.on(SAVE_DATE_BUTTON)
        );
    }

    public static ChooseDate inTheCalendar(String date) {
        return Instrumented.instanceOf(ChooseDate.class).withProperties(date);
    }
}
