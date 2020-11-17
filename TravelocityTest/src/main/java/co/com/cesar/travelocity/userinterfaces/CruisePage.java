package co.com.cesar.travelocity.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CruisePage {

    public static final Target GOING_TO_OPTION = Target.the("Destination option").located(By.id("cruise-destination"));
    public static final Target TRAVELERS_OPTION = Target.the("Travelers option").locatedBy("//button[@data-testid='travelers-field-trigger']");
    public static final Target DECREASE_ADULTS_OPTION = Target.the("Decrease adults option").locatedBy("//*[@id='adaptive-menu']/div[2]/div/section/div[1]/div[1]/div/button[1]");
    public static final Target SAVE_TRAVELERS_BUTTON = Target.the("Save Travelers").locatedBy("//button[@class='uitk-button uitk-button-large uitk-button-fullWidth uitk-button-has-text uitk-button-primary uitk-button-floating']");
    public static final Target DEPARTS_AS_EARLY_AS_OPTION = Target.the("Departs as early as option").located(By.id("d1-btn"));
    public static final Target NEXT_MONTH_OPTION = Target.the("Next month option").locatedBy("//*[@id='wizard-cruise-pwa-1']/div[2]/div[3]/div/div/div/div[1]/div/div[2]/div/div[2]/div[1]/button[2]");

    public static final Target DEPARTS_AS_LATE_AS_OPTION = Target.the("Departs as late as option").located(By.id("d2-btn"));

}
