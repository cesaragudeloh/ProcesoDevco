package co.com.cesar.travelocity.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ReservationPage {

    public static final Target NAME_INPUT = Target.the("Name input").locatedBy("//input[@placeholder='First and last name']");
    public static final Target COUNTRY_INPUT = Target.the("Country input").locatedBy("//select/option[@data-country-name='{0}']");
    public static final Target PHONE_INPUT = Target.the("Phone input").locatedBy("//input[@data-tealeaf-name='phoneNumber']");
    public static final Target EMAIL_INPUT = Target.the("Email input").locatedBy("//input[@data-tealeaf-name='email']");
    public static final Target PASSWORD_INPUT = Target.the("Password input").locatedBy("(//*[@name='password'])[2]");
    public static final Target REPEAT_PASSWORD_INPUT = Target.the("Repeat password input").located(By.name("repeat_password"));
    public static final Target CAR_PROTECTION_YES = Target.the("Car protection yes").located(By.id("yes_insurance"));
    public static final Target CAR_PROTECTION_NOT = Target.the("Car protection not").located(By.id("no_insurance"));
    public static final Target RESERVE_NOW_BUTTON = Target.the("Reserve now button").located(By.id("complete-booking"));
    public static final Target RESERVE_COMPLETED_MESSAGE = Target.the("Reserve completed message").locatedBy("//*[@id='page-header']/h1");
}
