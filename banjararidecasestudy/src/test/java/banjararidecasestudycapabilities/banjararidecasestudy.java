package banjararidecasestudycapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class banjararidecasestudy extends extentreport{
	public static AndroidDriver<AndroidElement> banjara() throws MalformedURLException {
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Jaya");
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	cap.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE,"C:\\Users\\jaya2\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	
	
	
	cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.forbinary.banjararide");
	cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.forbinary.banjararide.activity.SplashActivity");
	
	
	cap.setCapability(MobileCapabilityType.NO_RESET, true);
	
	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.ANDROID_UIAUTOMATOR2);
			
	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.IOS_XCUI_TEST );
			
	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.APPIUM);
	AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	return driver;
}
}


