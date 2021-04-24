package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.sql.Driver;
import java.util.ArrayList;

public class scroll {
    public static void main(String[] args) throws InterruptedException, IOException {

        Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        Thread.sleep(1000);
//set the path to the driver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
//maximize my driver
        options.addArguments("start-maximized");
//set the driver to incognito(private)
        options.addArguments("incognito");
//set it to headless
//options.addArguments("headless");
//define the webdriver
        WebDriver driver = new ChromeDriver(options);

//navigate to oxford health home page
       /* ---------------------------------------------------------------------------------------------*/

        driver.navigate().to("https://www.usps.com/");
        Thread.sleep(3000);


        //String bottom= driver.findElement(By.xpath("//h2[text()='Our Priority Is You']")).getText();
        //System.out.println(bottom);


        JavascriptExecutor scrolldown= (JavascriptExecutor) driver;
       // scrolldown.executeScript("scroll(0,5000)");

        //Thread.sleep(3000);
        //driver.findElement(By.xpath("//*[text()='FAQs']")).click();
       // driver.findElement(By.linkText("FAQs")).click();
        //System.out.println("Done");








       // JavascriptExecutor jse = (JavascriptExecutor)driver;
//store the locator as a element that I want to scroll by for a view
      WebElement signup = driver.findElement(By.xpath("//a[text()='Sign Up for Free']"));

        scrolldown.executeScript("arguments[0].scrollIntoView(true);",signup);


        Actions myaction= new Actions(driver);


        WebElement quicktool= driver.findElement(By.linkText("Quick Tools"));
        myaction.moveToElement(quicktool).perform();

        WebElement shop= driver.findElement(By.linkText("Buy Stamps"));
        myaction.moveToElement(shop).click().perform();


        WebElement search= driver.findElement(By.id("store-search"));
        myaction.moveToElement(search).click().sendKeys("US flag").perform();




        WebElement searchbutton =driver.findElement(By.id("store-search-btn"));
        myaction.moveToElement(searchbutton).click().perform();









    }

}
