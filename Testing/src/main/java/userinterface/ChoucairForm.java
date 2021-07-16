package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ChoucairForm extends PageObject {
    public static final Target BTN_JOBS = Target.the("Jobs").locatedBy("a[@class='elementor-button-link elementor-button elementor-size-lg']");

}
