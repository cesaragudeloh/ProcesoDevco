package co.com.cesar.travelocity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RentalCarResultPage {

    public static final Target SHOW_MORE_CAR_TYPE = Target.the("Show more car type").locatedBy("(//button[text()='Show more'])[1]");
    public static final Target CHOOSE_INPUT_OPTION = Target.the("Choose input option").locatedBy("//span[contains(text(),'{0}')]/../../../input");
    public static final Target SORT_BY_OPTION = Target.the("Sort by option").locatedBy("//label[text()='Sort by']/../select");
    public static final Target FIRST_RENTAL_CAR = Target.the("First rental car").locatedBy("(//button[text()='Reserve'])[1]");
    public static final Target RESERVE_BUTTON = Target.the("Reserve button").located(By.name("reserve-btn"));


}
