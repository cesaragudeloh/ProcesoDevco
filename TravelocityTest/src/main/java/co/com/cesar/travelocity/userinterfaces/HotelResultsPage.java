package co.com.cesar.travelocity.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class HotelResultsPage {

    public static final Target SORT_BY = Target.the("Short by option").located(By.id("sort"));
    public static final Target SEARCHING_LABEL = Target.the("Searching label").locatedBy("//div[contains(text(),'Searching thousands of properties')]");
    public static final Target FIRST_HOTEL = Target.the("First hotel").locatedBy("//section[@class='results']/ol/li[1]/div/section/div[1]/div/div[5]");
    public static final Target RESERVE_A_ROOM_BUTTON = Target.the("Reserve a room").locatedBy("//button[@data-stid='sticky-button']");
    public static final Target RESERVE_BUTTON = Target.the("Reserve button").locatedBy("(//button[text()='Reserve'])[2]");
    public static final Target PAY_WHEN_YOU_STAY_BUTTON = Target.the("Pay way you stay button").locatedBy("//button[text()='Pay at property']");
    public static final Target COMPLETE_BOOKING = Target.the("Complete booking").located(By.id("complete-booking"));
    public static final Target CLOSE_MODAL_BOOKING = Target.the("Close modal booking").located(By.id("free-cancellation-close-btn"));
}
