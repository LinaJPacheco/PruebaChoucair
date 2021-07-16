package tasks;

import Driver.WebDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.ChoucairForm;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class OptionsJobs implements Task {

    private WebDriver hisBrowser;
    public OptionsJobs(WebDriver hisBrowser){this.hisBrowser=hisBrowser;}

    public OptionsJobs() {

    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(WaitUntil.the(ChoucairForm.BTN_JOBS, isVisible()), Click.on(ChoucairForm.BTN_JOBS));
    }

    public static OptionsJobs JobsA() {return new OptionsJobs();}
}
