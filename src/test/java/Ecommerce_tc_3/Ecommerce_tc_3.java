package Ecommerce_tc_3;

import base.Base;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Ecommerce_tc_3 extends Base {
    public static void main(String[] arg) throws MalformedURLException, InterruptedException {
        AndroidDriver driver = capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Hello");
        driver.hideKeyboard();
        driver.findElementByXPath("//*[@text='Female']").click();
        driver.findElementById("android:id/text1").click();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
        driver.findElementByXPath("//*[@text='Argentina']").click();
        driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();

        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId" +
                "(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches" +
                "(\"Jordan 6 Rings\").instance(0))"));
        driver.findElement(By.id("com.androidsample.generalstore:id/productAddCart")).click();
        driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
        Thread.sleep(5000);
        String lastpageText = driver.findElementById("com.androidsample.generalstore:id/productName").getAttribute("name");

        Assert.assertEquals("Jordan 6 Rings", lastpageText);
//Thread.sleep(1000);
    }
}
