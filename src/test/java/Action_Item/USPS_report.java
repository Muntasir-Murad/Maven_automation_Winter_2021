package Action_Item;

import Day_8_03_28_2021.mouseaction;
import ReusableLibrary.AbstractClass;
import ReusableLibrary.ReusableMethods;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class USPS_report extends AbstractClass {
    @Test
    public void usps_location() throws InterruptedException {


        driver.navigate().to("https://www.usps.com/");

        ReusableMethods.hoverElementbyLinktext(driver, "Send", logger, "send");
        ReusableMethods.clickOnElement(driver, "//a[text()='Find USPS Locations']", logger, "Find location");
        ReusableMethods.sendKeysMethod(driver, "//input[@id='city-state-input']", "08554", logger, "Zip");
        ReusableMethods.clickOnElement(driver, "//button[@id='post-offices-select']", logger, "Location Type");
        ReusableMethods.clickOnElement(driver, "//a[text()='Post Office']", logger, "Location Type");
        ReusableMethods.clickOnElement(driver, "//button[@id='within-select']", logger, "Location range");
        ReusableMethods.clickOnElement(driver, "//a[text()='10 Mi']", logger, "Location within 50 miles");
        ReusableMethods.clickOnElement(driver,"//a[@id='searchLocations']",logger,"search");
        Thread.sleep(3000);

        for(int i=0; i< 10;i++){
            String address=ReusableMethods.captureText(driver,"//p[@class='address']",i,logger,"store Name");
        logger.log(LogStatus.INFO,address);
            System.out.println(address);
        }
    }
    }
