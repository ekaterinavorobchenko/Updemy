package base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class base {
    public static AndroidDriver<MobileElement> capabilities() throws MalformedURLException {

        AndroidDriver<MobileElement> driver;

        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"ce0516053d11143b02");
        cap.setCapability(MobileCapabilityType.UDID,"ce0516053d11143b02");
        cap.setCapability(MobileCapabilityType.APP,"/Users/ekaterinavolobchenko/Downloads/ApiDemos-debug.apk");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");

        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        return driver;
    }

}