package co.com.cesar.travelocity.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class FlightPage {

    public static final Target ONE_WAY_OPTION = Target.the("One-way option").locatedBy("//span[text()='One-way']");
    public static final Target LEAVING_FROM_OPTION= Target.the("Leaving from option").locatedBy("//button[@data-stid='location-field-leg1-origin-menu-trigger']");
    public static final Target LEAVING_FROM_INPUT = Target.the("Leaving from input").located(By.id("location-field-leg1-origin"));
    public static final Target GOING_TO_OPTION = Target.the("Going to option").locatedBy("//button[@data-stid='location-field-leg1-destination-menu-trigger']");
    public static final Target GOING_TO_INPUT = Target.the("Going to input").located(By.id("location-field-leg1-destination"));
    public static final Target FIRST_RESULT_ORIGIN = Target.the("First Result").locatedBy("//*[@id='location-field-leg1-origin-menu']/div[2]/ul/li[1]/button");
    public static final Target FIRST_RESULT_DESTINATION = Target.the("First Result").locatedBy("//*[@id='location-field-leg1-destination-menu']/div[2]/ul/li[1]/button");
    public static final Target DEPARTING_OPTION = Target.the("Departing option").located(By.id("d1-btn"));
    public static final Target SAVE_DATE_BUTTON = Target.the("Save changes and close the date picker").locatedBy("//button[@data-stid='apply-date-picker']");
}
