package co.com.cesar.travelocity.runners;

import org.junit.runner.RunWith;
import cucumber.api.SnippetType;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/find_hotel.feature",
        glue = {"co.com.cesar.travelocity.stepdefinitions", "co.com.cesar.travelocity.utils"},
        snippets = SnippetType.CAMELCASE
)
public class FindHotel {
}
