package swipedemo;

import base.Base;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SwipeDemo extends Base {
    public static void main(String[] arg) throws MalformedURLException{
        AndroidDriver driver = capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Views\"]").click();
        driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Date Widgets\"]").click();
        driver.findElementByXPath("//android.widget.TextView[@content-desc=\"2. Inline\"]").click();
        driver.findElementByXPath("//*[@content-desc='9']").click();

        TouchAction t = new TouchAction(driver);
        WebElement first = driver.findElementByXPath("//*[@content-desc='15']");
        WebElement second = driver.findElementByXPath("//*[@content-desc='45']");
        t.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(first)).
                withDuration(Duration.ofSeconds(2))).moveTo(ElementOption.element(second)).release().perform();
    }
}
