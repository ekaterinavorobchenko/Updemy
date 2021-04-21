package PageObjects;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class HomePage extends PageObject
{
    public HomePage(AppiumDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='Preference']")
    public WebElement Preferences;

    @FindBy(xpath = "//android.widget.TextView[@text='3. Preference dependencies']")
    public WebElement Dependencies;

    @FindBy(id = "android:id/checkbox")
    public WebElement Checkbox;

    @FindBy(xpath = "(//android.widget.RelativeLayout)[2]")
    public WebElement RelativeLayout;

    @FindBy(className = "android.widget.EditText")
    public WebElement EditText;

    @FindBy(className = "android.widget.Button")
    public List<WebElement> buttons;
}
