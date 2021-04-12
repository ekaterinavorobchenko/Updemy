package Browse;

import BaseChrome.BaseChrome;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import java.net.URL;

public class Browse extends BaseChrome {
    public static void main(String[] arg) throws MalformedURLException {
        AndroidDriver driver = capabilities();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        /*driver.get("https://www.facebook.com");
        driver.findElementByXPath("//*[@id=\"m_login_email\"]").sendKeys("qwerty");
        driver.findElementByName("pass").sendKeys("12345");
        driver.findElementByXPath("//*[@id=\"u_0_5_ej\"]/button").click();*/

        driver.get("http://cricbuzz.com");
        driver.findElementByXPath("//a[@href='#menu']").click();
        driver.findElementByCssSelector("a[title='Cricbuzz Home']").click();
        System.out.println(driver.getCurrentUrl());

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,480)","");
        Assert.assertTrue(driver.findElementByXPath("//h4[text()='Top Stories']").getAttribute("class").contains("header"));

    }
}
