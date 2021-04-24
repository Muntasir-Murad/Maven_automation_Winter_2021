package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class facebook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muntasir\\Desktop\\Maven_Automation_2021\\src\\main\\resources\\chromedriver.exe");


        ChromeDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.uhc.com/obm/for-members");

        driver.findElement(By.xpath("//*[@aria-label='My Dental Plan Opens a new window']")).click();


        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//switch to new tab 2
        driver.switchTo().window(tabs.get(0));



        driver.findElement(By.xpath("//*[@id='signInButton']")).click();







    }



}
