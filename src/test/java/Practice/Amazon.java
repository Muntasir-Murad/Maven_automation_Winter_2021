package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();





        driver.navigate().to("https://demosite.executeautomation.com/Login.html");
        driver.findElement(By.xpath("//*[@Name='UserName']")).sendKeys("Muntasir");
        driver.findElement(By.xpath("//*[@Name='Password']")).sendKeys("Murad");
        driver.findElement(By.xpath("//*[@Name='Login']")).submit();



















    }//end of main
}//end of class
