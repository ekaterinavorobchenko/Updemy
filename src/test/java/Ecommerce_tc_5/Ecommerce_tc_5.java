package Ecommerce_tc_5;

import base.Base;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



import java.net.MalformedURLException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class Ecommerce_tc_5 extends Base
{
    public static void main(String[] arg) throws MalformedURLException, InterruptedException
    {
        AndroidDriver driver = capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Hello");
        driver.hideKeyboard();
        driver.findElementByXPath("//*[@text='Female']").click();
        driver.findElementById("android:id/text1").click();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
        driver.findElementByXPath("//*[@text='Argentina']").click();
        driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"Nike Blazer Mid '77\").instance(0))");

        AndroidElement element_1 = (AndroidElement) driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(0);
        element_1.click();
        AndroidElement element_2 = (AndroidElement) driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(1);
        element_2.click();
        driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
        Thread.sleep(4000);
//Gesture
        TouchAction t = new TouchAction(driver);
        WebElement checkbox = driver.findElementByClassName("android.widget.CheckBox");
        t.tap(tapOptions().withElement(element(checkbox))).perform();

        driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();

        Thread.sleep(7000);

        Set<String> contexts=driver.getContextHandles();
        for(String contextName :contexts)
        {
            System.out.println(contextName);
        }
        driver.context("WEBVIEW_com.androidsample.generalstore");
        driver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys("hello");
    }
}

