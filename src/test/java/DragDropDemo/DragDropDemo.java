package DragDropDemo;

import base.Base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class DragDropDemo extends Base {
    public static void main(String[] arg) throws MalformedURLException{
        AndroidDriver driver = capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Views\"]").click();
        driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Drag and Drop\"]").click();

        WebElement source = (WebElement) driver.findElementsByClassName("android.view.View").get(0);
        WebElement destination = (WebElement) driver.findElementsByClassName("android.view.View").get(1);
        TouchAction t = new TouchAction(driver);
        //t.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(source))).
                //moveTo(ElementOption.element(destination)).release().perform();
        t.longPress(ElementOption.element(source)).moveTo(ElementOption.element(destination)).release().perform();
    }
}
