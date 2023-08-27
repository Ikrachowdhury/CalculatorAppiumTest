package Util;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.concurrent.TimeUnit;

public class SetUp {
    public WebDriver driver;
    @BeforeTest
    public void setup () throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName", "myDevice");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("uuid", "R9TTC03JFNH");
        desiredCapabilities.setCapability("appPackage", "com.google.android.calculator");
        desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
        desiredCapabilities.setCapability("app", "C:\\Users\\progoti\\Downloads\\calculator.apk");
        desiredCapabilities.setCapability("autoGrantPermissions", true);
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        URL url = new URL("http://localhost:4723/");
        driver = new AndroidDriver(url, desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @AfterTest
    public void closeDriver() {
        driver.quit();
    }
    public  void CheckResultString(String ActualResult,String Expected){
        try{
            Assert.assertEquals(ActualResult,Expected);
            Thread.sleep(1000);
        }catch(Exception ex){
            System.out.println(ex);

        }
    }
}
