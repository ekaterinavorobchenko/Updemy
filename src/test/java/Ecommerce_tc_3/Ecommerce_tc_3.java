package Ecommerce_tc_3;

import base.Base;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.util.Set;
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
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"Nike Blazer Mid '77\").instance(0))");

        AndroidElement element_1 = (AndroidElement) driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(0);
        element_1.click();
        AndroidElement element_2 = (AndroidElement) driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(1);
        element_2.click();
        driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
        Thread.sleep(4000);

        AndroidElement price_1 = (AndroidElement) driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(0);
        String amount1 = price_1.getText();
        amount1 = amount1.substring(1);
        double amount1value = Double.parseDouble(amount1);

        AndroidElement price_2 = (AndroidElement) driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(1);
        String amount2 = price_2.getText();
        amount2 = amount2.substring(1);
        double amount2value = Double.parseDouble(amount2);

        double sumOfProducts = amount1value+amount2value;
        System.out.println(sumOfProducts+"sum of products");

        String total = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
        total = total.substring(1);
        double totalValue = Double.parseDouble(total);
        System.out.println(totalValue+"Total value");

        Assert.assertEquals(sumOfProducts,totalValue);
    }
}


