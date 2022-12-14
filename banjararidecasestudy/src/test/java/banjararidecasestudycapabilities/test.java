package banjararidecasestudycapabilities;

import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.MalformedURLException;
import java.util.List;

import org.aspectj.apache.bcel.classfile.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.FindsByClassName;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.TapOptions;

public class test extends banjararidecasestudy {
	
	AndroidDriver<AndroidElement>driver;
	@BeforeTest
	public void BT() throws MalformedURLException, InterruptedException
	{
		driver = banjara();
		Thread.sleep(5000);
	}
	
    @Test(priority=0,enabled=true)
    public void launchbanjararide() throws InterruptedException {
	
	
	ExtentTest test = extent.createTest("Test One","Test case one");
	test.log(Status.INFO, "Test One Started");
	
	
	AndroidElement lan = driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"BanjaraRide\")"));
	TouchAction ta= new TouchAction(driver);
	ta.tap(TapOptions.tapOptions().withElement(element(lan))).perform();
	Thread.sleep(3000);
	
	//====================tap on bookings==========================
	
	AndroidElement touch = driver.findElement(MobileBy.id("com.forbinary.banjararide:id/link_2"));
	ta.tap(TapOptions.tapOptions().withElement(element(touch))).perform();
	Thread.sleep(3000);
			
		
	AndroidElement Booknow = driver.findElement(MobileBy.id("com.forbinary.banjararide:id/infocenterlib_page_name"));
	ta.tap(TapOptions.tapOptions().withElement(element(Booknow))).perform();
	Thread.sleep(3000);
	test.log(Status.PASS,"Tap on Book Now ");
	//====================tap on hirebike===============================
	
	driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Hire Bike\")")).click();
	Thread.sleep(6000);	
	test.log(Status.PASS,"Tap on Hire Bike ");	
	//===================scroll and select CB Hornet 160R=============================
		
	 AndroidElement select = driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"CB Hornet 160R\"))");
	 ta.tap(TapOptions.tapOptions().withElement(element(select))).perform();
   	 Thread.sleep(6000);
   	 test.log(Status.PASS,"Tap on CB Hornet160R ");
	 AndroidElement book = driver.findElement(MobileBy.id("com.forbinary.banjararide:id/btnBookNow"));
	 ta.tap(TapOptions.tapOptions().withElement(element(book))).perform();
	 Thread.sleep(6000);
	 driver.findElement(MobileBy.id("com.forbinary.banjararide:id/rlDurationSpinner")).click();
	 driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
	 driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
	 driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
	 driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
	 driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
	 driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
	 driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));				
	 driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	 Thread.sleep(6000);
	 driver.findElement(MobileBy.id("com.forbinary.banjararide:id/tvDate")).click();
	 Thread.sleep(6000);
	 driver.pressKey(new KeyEvent(AndroidKey.DPAD_UP));
	 driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	 driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
	 driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	 driver.pressKey(new KeyEvent(AndroidKey.DPAD_LEFT));
	 driver.pressKey(new KeyEvent(AndroidKey.ENTER)); 
	 driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"1\")")).click();
	 Thread.sleep(6000);
	 driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"OK\")")).click();
	 driver.navigate().back();
	 driver.navigate().back();
	 driver.navigate().back();
	 
//==========	4. Tap on the menu bar on the left → tap on “Bookings” → search for “activa” in the search
//		bar (activa should be shown in the page) → exit and come back to the home page by
//		tapping on the “X” .=====================================================================
	
	 driver.findElementByClassName("android.widget.ImageButton").click();
	 Thread.sleep(6000);
	 driver.findElement(MobileBy.id("com.google.android.youtube:id/bottom_bar_container")).click();
	 Thread.sleep(6000);
	 driver.findElement(MobileBy.id("com.forbinary.banjararide:id/search_button")).click();
	 driver.findElement(MobileBy.id("com.forbinary.banjararide:id/search_src_text")).sendKeys("Activa");
	 Thread.sleep(6000);
	 driver.findElement(MobileBy.id("com.forbinary.banjararide:id/search_close_btn")).click();
	 Thread.sleep(6000);
	 
//		5. Tap on “Call Us” and Navigate back to the application home page.
  
	 driver.findElement(MobileBy.className("android.widget.ImageButton")).click();
	 Thread.sleep(6000);
	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"Call Us\"))").click();
	 Thread.sleep(6000);
	 driver.pressKey(new KeyEvent(AndroidKey.BACK));
	 Thread.sleep(2000);
	 driver.pressKey(new KeyEvent(AndroidKey.BACK));
	 Thread.sleep(2000);
	 driver.pressKey(new KeyEvent(AndroidKey.BACK));
	 Thread.sleep(2000);
	 driver.findElementByClassName("android.widget.ImageButton").click();
	 Thread.sleep(6000);
	 
//		7. Close the application.
	 
	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"Logout\"))").click();
	
	
}
}


