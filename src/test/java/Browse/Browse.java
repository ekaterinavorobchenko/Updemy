package Browse;

import BaseChrome.BaseChrome;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import java.net.URL;

public class Browse extends BaseChrome {
    public static void main(String[] arg) throws MalformedURLException {
        AndroidDriver driver = capabilities();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        driver.get("https://www.google.com");
    }
}
