package co.com.cesar.travelocity.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ThingsToDoPage {

    public static final Target ORIGIN_OPTION = Target.the("Origin option").locatedBy("//button[@data-stid='location-field-location-menu-trigger']");
    public static final Target ORIGIN_INPUT = Target.the("Origin input").located(By.id("location-field-location"));
    public static final Target FIRST_RESULT = Target.the("First result option").locatedBy("//*[@id='location-field-location-menu']/div[2]/ul/li[1]/button");
    public static final Target FROM_OPTION = Target.the("From option").located(By.id("d1-btn"));
    public static final Target TO_OPTION = Target.the("To option").located(By.id("d2-btn"));

}
