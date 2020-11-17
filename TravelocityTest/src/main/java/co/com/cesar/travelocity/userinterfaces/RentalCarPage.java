package co.com.cesar.travelocity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RentalCarPage {

    public static final Target RENTAL_CAR_MENU = Target.the("Rental car").locatedBy("//span[text()='Rental cars']");
    public static final Target PICK_UP_OPTION = Target.the("Pick up option").locatedBy("//button[@aria-label='Pick-up']");
    public static final Target PICK_UP_INPUT = Target.the("Pick up input").located(By.id("location-field-locn"));
    public static final Target FIRST_RESULT_PICK_UP = Target.the("First result pick up").locatedBy("//*[@id='location-field-locn-menu']/div[2]/ul/li[1]");
    public static final Target DROP_OFF_OPTION = Target.the("Drop off option").locatedBy("//button[@aria-label='Same as pick-up']");
    public static final Target DROP_OFF_INPUT = Target.the("Drop off input").located(By.id("location-field-loc2"));
    public static final Target FIRST_RESULT_DROP_OFF = Target.the("First result drop off").locatedBy("//*[@id=\"location-field-loc2-menu\"]/div[2]/ul/li[1]\n");
    public static final Target PICK_UP_DATE_OPTION = Target.the("Pick up date option").located(By.id("d1-btn"));
    public static final Target DROP_OFF_DATE_OPTION = Target.the("Drop off date option").located(By.id("d2-btn"));
    public static final Target PICK_UP_TIME_OPTION = Target.the("Pick up time option").locatedBy("//select[@aria-label='Pick-up time']");
    public static final Target DROP_OFF_TIME_OPTION = Target.the("Drop off time option").locatedBy("//select[@aria-label='Drop-off time']");
}
