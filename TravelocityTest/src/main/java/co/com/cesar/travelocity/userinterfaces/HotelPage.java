package co.com.cesar.travelocity.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HotelPage extends PageObject {


    public static final Target GOING_TO_OPTION = Target.the("Goin to Option").locatedBy("//button[@aria-label='Going to']");
    public static final Target GOING_TO_INPUT = Target.the("Goin to Option").located(By.id("location-field-destination"));
    public static final Target FIRST_RESULT = Target.the("First Result").locatedBy("//*[@id='location-field-destination-menu']/div[2]/ul/li[1]/button");
    public static final Target CHECK_IN_OPTION = Target.the("Check in option").located(By.id("d1-btn"));
    public static final Target SAVE_DATE_BUTTON = Target.the("Save changes and close the date picker").locatedBy("//button[@data-stid='apply-date-picker']");
    public static final Target CHECK_OUT_OPTION = Target.the("Check out option").located(By.id("d2-btn"));
    public static final Target TRAVELERS_OPTION = Target.the("Travelers").locatedBy("//button[@data-testid='travelers-field-trigger']");
    public static final Target DECREASE_ADULTS_BUTTON = Target.the("Decrease adults button").locatedBy("//*[@id='adaptive-menu']/div[2]/div/section/div[1]/div[1]/div/button[1]");
    public static final Target INCREASE_ADULTS_BUTTON = Target.the("Increase adults button").locatedBy("//*[@id='adaptive-menu']/div[2]/div/section/div[1]/div[1]/div/button[2]");
    public static final Target DECREASE_CHILDREN_BUTTON = Target.the("Decrease children button").locatedBy("//*[@id='adaptive-menu']/div[2]/div/section/div[1]/div[2]/div/button[1]");
    public static final Target INCREASE_CHILDREN_BUTTON = Target.the("Increase children button").locatedBy("//*[@id='adaptive-menu']/div[2]/div/section/div[1]/div[2]/div/button[2]");
    public static final Target SAVE_TRAVELERS_BUTTON = Target.the("Save Travelers").locatedBy("//button[@class='uitk-button uitk-button-large uitk-button-fullWidth uitk-button-has-text uitk-button-primary uitk-button-floating']");
    public static final Target SEARCH_HOTEL_BUTTON = Target.the("Search hotel").locatedBy("//button[@data-testid='submit-button']");

}
