package Uiautomatortest;
import base.Base;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Uiautomatortest extends Base {

    public static void main(String[] arg) throws MalformedURLException {

        AndroidDriver driver = capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.findElementByAndroidUIAutomator("attribute(value)")
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        //driver.findElementByAndroidUIAutomator("new UiSelector().property(value)").click();
        System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
        driver.quit();

    }
}
