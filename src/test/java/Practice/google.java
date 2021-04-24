package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Muntasir\\Desktop\\Maven_Automation_2021\\src\\main\\resources\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();

        driver.get("https://www.Google.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("car");
        driver.findElement(By.xpath("//*[@name='btnK']")).submit();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='result-stats']"));
        Thread.sleep(10000);
        String value=driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
        String[] myvalue= value.split(" ");
        System.out.println(myvalue[1]);
























    }//end of method
}//end of class
