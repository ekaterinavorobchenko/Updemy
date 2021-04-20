package PageObjects;

import basic.Basics;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Preferences extends Basics {
    public Preferences(AppiumDriver driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this );
    }
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Preference\"]")
    public WebElement Dependencies;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/\" +\n" +
            "                \"android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[2] ")
    public List<WebElement> buttons;
}
