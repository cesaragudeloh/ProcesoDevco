package co.com.cesar.travelocity.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ThingsToDoResultsPage {

    public static final Target SEARCH_KEYWORD_INPUT = Target.the("Search keyword option").located(By.id("searchKeyword"));
    public static final Target FIRST_ACTIVITY_OPTION = Target.the("First activity option").locatedBy("(//div/a[@data-testid='card-link'])[1]");
    public static final Target BOOK_BUTTON = Target.the("Book button").locatedBy("//button[text()='Book']");
    public static final Target REVIEW_LABEL = Target.the("Review label").locatedBy("//div[@class='product-content']");
}
