package co.com.cesar.travelocity.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage extends PageObject {

    public static final Target MENU_OPTION = Target.the("Menu option").locatedBy("//ul[@id='uitk-tabs-button-container']/li/a/span[text()='{0}']");
    public static final Target SEARCH_BUTTON = Target.the("Search button").locatedBy("//button[@data-testid='submit-button']");
    public static final Target SAVE_DATE_BUTTON = Target.the("Save changes and close the date picker").locatedBy("//button[@data-stid='apply-date-picker']");
}
