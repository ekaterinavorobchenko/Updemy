package PageObjects;

import basic.Basics;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Basics {

    public HomePage(AppiumDriver driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Preference']")
    public WebElement Preferences;
    //findElementByXpath("//android.widget.TextView[@text='Preference']")
}
