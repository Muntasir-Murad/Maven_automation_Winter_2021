package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rqndom5 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        String [] singer= new String[2];
        singer[0]="Drake";
        singer[1]="Back Street Boys";



        driver.get("https://www.youtube.com/");
        driver.findElement(By.xpath("//*[@id='search']")).sendKeys("drake");
        driver.findElement(By.xpath("//*[@id='search-icon-legacy']")).click();
        driver.findElement(By.xpath("//*[@class='style-scope ytd-video-renderer']")).click();




    }//end of main method
}//end of class
