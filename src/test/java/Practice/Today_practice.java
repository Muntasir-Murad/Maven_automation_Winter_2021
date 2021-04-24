package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Today_practice {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muntasir\\Desktop\\Maven_Automation_2021\\src\\main\\resources\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");

        ChromeDriver driver = new ChromeDriver(options);

        Actions mouseaction = new Actions(driver);









        driver.navigate().to("https://www.usps.com/");
        Thread.sleep(2000);

        String actualtitle = driver.getTitle();

        if(actualtitle.equals("Welcome | USPS")){
            System.out.println("The titile is verified which is "+ actualtitle+".");
        }else{
            System.out.println("The titile is not correct,the actual title is "+ actualtitle+".");
        }



        WebElement send= driver.findElement(By.xpath("//a[@id='mail-ship-width']"));
        mouseaction.moveToElement(send).perform();


        WebElement findusps = driver.findElement(By.linkText("Find USPS Locations"));
        mouseaction.moveToElement(findusps).click().perform();


        WebElement location = driver.findElement(By.id("city-state-input"));
        mouseaction.moveToElement(location).click().sendKeys("08554").perform();
       // mouseaction.moveToElement(location).clicl.sendkeys(zip.get(i));


        Thread.sleep(2000);

        WebElement locType = driver.findElement(By.id("post-offices-select"));
        mouseaction.moveToElement(locType).click().perform();

        WebElement national= driver.findElement(By.xpath("//a[text()='National Retailer']"));
        mouseaction.moveToElement(national).click().perform();



        WebElement within= driver.findElement(By.id("within-select"));
        mouseaction.moveToElement(within).click().perform();

        driver.findElement(By.xpath("//a[text()='100 Miles']")).click();

        Thread.sleep(2000);
        driver.findElement(By.id("searchLocations")).click();








    }//end of method
}//end of class
