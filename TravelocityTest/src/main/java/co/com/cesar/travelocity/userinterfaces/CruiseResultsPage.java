package co.com.cesar.travelocity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CruiseResultsPage {

    public static final Target SORT_OPTION = Target.the("Sort option").locatedBy("//button[@data-opt-group='Price']");
    public static final Target FIRST_BUTTON_CONTINUE = Target.the("First button continue").locatedBy("(//div[contains(@class, 'sailing-pricing-container')]/div/div/a)[1]");
    public static final Target CABIN_EXPERIENCE_BUTTON = Target.the("Cabin experience button").locatedBy("(//*[contains(@id,'supercat')])[1]");
    public static final Target CABIN_TYPE_BUTTON = Target.the("Cabin type button").locatedBy("(//div[@class='select-button']/div/a)[1]");
    public static final Target SELECT_RATE_BUTTON = Target.the("Select rate button").locatedBy("(//div[contains(@class,'select-rate-button')])[1]");
    public static final Target SEARCHING = Target.the("Searching modal").locatedBy("(//*[contains(text(),'Finding available cabins')])[4]");

    public static final Target TRIP_SUMMARY_LABEL = Target.the("Trip summary").locatedBy("//div[contains(@class,'infosite-sailing-playback-container')]");
}
