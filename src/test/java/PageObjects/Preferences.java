package PageObjects;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class Preferences {


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='3. Preference dependencies']']")
    public WebElement Dependencies;

}
