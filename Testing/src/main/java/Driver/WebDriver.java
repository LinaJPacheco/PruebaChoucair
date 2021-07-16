package Driver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriver {

    public static WebDriver driver;

    public WebDriver(ChromeOptions options) {
    }

    public WebDriver() {

    }

    public static WebDriver chromeHisBrowserWeb() {

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-infobars");

        driver = new WebDriver(options);
        return new WebDriver();
    }
}