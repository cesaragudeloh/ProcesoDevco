package co.com.cesar.travelocity.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage extends PageObject {

    public static final Target MENU_OPTION = Target.the("Menu option").locatedBy("//ul[@id='uitk-tabs-button-container']/li/a/span[text()='{0}']");

}
