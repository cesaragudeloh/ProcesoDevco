package co.com.cesar.travelocity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.annotations.findby.By;

public class FlightResultsPage {

    public static final Target SORT_BY = Target.the("Short by optionon").located(By.id("sortDropdown"));
    public static final Target AIRLINE_OPTION = Target.the("Airline").locatedBy("//fieldset[@id='airlines']/div/div/div/label/span[contains(text(),'{0}')]/../input");
    public static final Target FIRST_FLIGHT = Target.the("First flight").locatedBy("(//button[@data-test-id='select-button'])[1]");
    public static final Target NOT_ADD_HOTEL = Target.the("No thanks link").locatedBy("//span[@class='no-thanks-content']/a");
    public static final Target SHOW_OPTIONS = Target.the("Show options").located(By.id("flights-advanced-options-toggle"));
    public static final Target ADULT_COUNT = Target.the("Adult count option").located(By.id("adult-count"));
    public static final Target CHILD_COUNT = Target.the("Child count option").located(By.id("child-count"));
    public static final Target SEARCH_BUTTON = Target.the("Search option").located(By.id("flight-wizard-search-button"));
    public static final Target CONTINUE_BOOKING_BUTTON = Target.the("Continue booking").located(By.id("bookButton"));
    public static final Target REVIEW_TICKETS_COUNT = Target.the("Tickets count").locatedBy("//div[@class='product-description']");
    public static final Target REVIEW_AIRLINE = Target.the("Airline review").locatedBy("//div[@class='airlines-and-flight-info']");

}
