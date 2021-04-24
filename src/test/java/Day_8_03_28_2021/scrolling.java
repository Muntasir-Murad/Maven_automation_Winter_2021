package Day_8_03_28_2021;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class scrolling {
    public static void main(String[] args) throws InterruptedException {
        //kill all chrome instances that are opened
//Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
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
        driver.navigate().to("https://www.yahoo.com/");
        Thread.sleep(3000);



        //enter a keyword on the search field
        driver.findElement(By.xpath("//*[@name='p']")).sendKeys("Cars");
//click on search icon
        driver.findElement(By.xpath("//*[@id='ybar-search']")).click();

        try{
//scroll to the bottom of the page to capture the search result
        JavascriptExecutor jse = (JavascriptExecutor) driver;
//scroll to the bottom by pixels
        jse.executeScript("scroll(0,5000)");  }
        catch (Exception e){
            System.out.println(e);
        }


//capture entire text

       String result = driver.findElement(By.xpath("//*[@class='compPagination']")).getText();

        System.out.println(result);
            String mystring[]=result.split("\\s+");

            System.out.println(mystring[0]);





/*split by keyword Next to capture the actual result
        String[] arrayResult = result.split("Next");
//split by the keyword results to get the actual number
        String[] arrayNumber = arrayResult[1].split("results");
        System.out.println("My search number is " + arrayNumber[0]);

//go all the way to to the top and click on sign in
        jse.executeScript("scroll(0,-5000)");
//click on sign in
        driver.findElement(By.xpath("//*[@id='ysignin']")).click();
*/

    }


}
