package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.openqa.selenium.WebDriver;
import userinterface.HomePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
public class NavigateHomePageChoucair implements Task {
    private HomePage homePage;
    private WebDriver hisBrowser;

    public NavigateHomePageChoucair(WebDriver hisBrowser) {this.hisBrowser =hisBrowser;}

    @Override
    public <T extends Actor> void performAs(T actor) { actor.attemptsTo(OpenTheBrowser.on(homePage)); }
    public static NavigateHomePageChoucair browser (WebDriver hisBrowser){
        return instrumented(NavigateHomePageChoucair.class, hisBrowser);
    }


}
