package Ecommerce_tc_2;

import base.Base;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Ecommerce_tc_2 extends Base {
    public static void main(String[] arg) throws MalformedURLException{
        AndroidDriver driver = capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Hello");
       // driver.hideKeyboard();
        driver.findElementByXPath("//*[@text='Female']").click();
        driver.findElementById("android:id/text1").click();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
        driver.findElementByXPath("//*[@text='Argentina']").click();
        driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();

        String toastMessage = driver.findElementByXPath("//android.widget.Toast[1]").getAttribute("name");
        Assert.assertEquals("Please enter you name", toastMessage);
        System.out.println(toastMessage);
    }
}
