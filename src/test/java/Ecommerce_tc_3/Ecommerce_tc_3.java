package Ecommerce_tc_3;

import base.Base;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class Ecommerce_tc_3 extends Base
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

        int count = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).size();
        double sum = 0;
        for (int i=0;i<count;i++)
        {
            AndroidElement price = (AndroidElement) driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(i);
            String amount1 = price.getText();
            double amount = getAmount(amount1);
            sum = (int) (sum+amount);

        }

        System.out.println(sum+"sum of products");

        String total = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
        total = total.substring(1);
        double totalValue = Double.parseDouble(total);
        System.out.println(totalValue+"Total value");
        Assert.assertEquals(sum,totalValue);
//Gesture
        TouchAction t = new TouchAction(driver);
        WebElement checkbox = driver.findElementByClassName("android.widget.CheckBox");
        t.tap(tapOptions().withElement(element(checkbox))).perform();

        WebElement pn = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView");
        t.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(pn)).withDuration(Duration.ofSeconds(2))).release().perform();
        driver.findElementById("android:id/button1").click();
    }
    public static double getAmount(String value)
    {
        value = value.substring(1);
        double amount2value = Double.parseDouble(value);
        return amount2value;
    }
}


