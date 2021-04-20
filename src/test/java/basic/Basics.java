package basic;
import PageObjects.HomePage;
import PageObjects.Preferences;
import base.Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;


public class Basics extends Base {

    public static void main(String[] arg) throws MalformedURLException
    {

        AndroidDriver driver = capabilities();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        HomePage h = new HomePage(driver);
        h.Preferences.click();

        Preferences p = new Preferences(driver);
        p.Dependencies.click();

        driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
        driver.findElementById("android:id/checkbox").click();
        driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
        driver.findElementByClassName("android.widget.EditText").sendKeys("hello");

        p.buttons.get(1).click();

        driver.quit();
    }
}