package PageObjects;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class HomePage {

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Preference']")
    public WebElement Preferences;
    //findElementByXpath("//android.widget.TextView[@text='Preference']")
}
