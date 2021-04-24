package Day5_03_20_2020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.charset.StandardCharsets;

public class findelements {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://www.google.com/");

        //maximize the driver
        driver.manage().window().maximize();
        driver.findElements(By.xpath("//*[@class='MV3Tnb']")).get(1).click();











    }//end of main

}//end of java
