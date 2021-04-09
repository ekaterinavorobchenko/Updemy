package Gestures;

import base.Base;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;


import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Gestures extends Base {
    public static void main(String[] arg) throws MalformedURLException{
        AndroidDriver driver = capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Views\"]").click();
        //Tap
        TouchAction t = new TouchAction(driver);
        WebElement expandList = driver.findElementByXPath("\t\n" +
                "//android.widget.TextView[@content-desc=\"Expandable Lists\"]");
        t.tap(tapOptions().withElement(element(expandList))).perform();
    }
}
