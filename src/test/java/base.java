import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class base {
    public static void main(String[] arg) {

        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"ce0516053d11143b02");
        cap.setCapability(MobileCapabilityType.APP,"/Users/ekaterinavolobchenko/Downloads/demo.apk" );

    }
}
