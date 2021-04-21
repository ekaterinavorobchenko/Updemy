package basicAppium;
import PageObjects.HomePage;
import base.BaseAppium;
import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;


public class BasicsAppium extends BaseAppium {
    public static void main(String[] arg) throws MalformedURLException {

        AppiumDriver driver = capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        HomePage h = new HomePage(driver);
        h.Preferences.click();
        h.Dependencies.click();
        h.Checkbox.click();
        h.RelativeLayout.click();
        h.EditText.sendKeys("hello");
        h.buttons.get(1).click();
        driver.quit();
    }
}