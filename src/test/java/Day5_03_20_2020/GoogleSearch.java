package Day5_03_20_2020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");

        //define the webdriver
        WebDriver driver=new ChromeDriver();


        //navigate to google.com
        driver.navigate().to("https://www.google.com/");
        Thread.sleep(3000);
        //maximize the driver
        driver.manage().window().maximize();

        //enter a kewyword on google seacrhc field
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("cars");

        //hit submit on google search button
        driver.findElement(By.xpath("//*[@name='btnK']")).submit();
        Thread.sleep(3000);
        //locate the element you want to capture
        String searchresult= driver.findElement(By.xpath("//*[@id='result-stats']")).getText();

        //store the result
        //String searchresult= driver.findElement(By.xpath("//*[@id='result-stats']")).getText();

        //Split the string to get specific valaue
        String[] theresult= searchresult.split(" ");

        //print the result
        System.out.println(theresult[1]);

        driver.quit();







    }
}
