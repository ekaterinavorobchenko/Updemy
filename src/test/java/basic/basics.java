package basic;

import base.base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;


public class basics extends base {

    public static void main(String[] arg) throws MalformedURLException{

        AndroidDriver driver = capabilities();

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
        driver.findElementById("android:id/checkbox").click();
        driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
        driver.findElementByClassName("android.widget.EditText").sendKeys("hello");
        driver.findElementByXPath("\t\n" +
                "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[2]").click();

        driver.quit();
    }
}