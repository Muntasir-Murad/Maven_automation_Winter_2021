package Day7_27_2021;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class Switching_Tabs {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muntasir\\Desktop\\Maven_Automation_2021\\src\\main\\resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");

        ChromeDriver driver= new ChromeDriver(options);



        driver.navigate().to("https://www.uhc.com/");

        driver.findElement(By.linkText("For Providers")).click();




            //storing the tabs in a array list
        ArrayList<String > tab = new ArrayList<>(driver.getWindowHandles());



        //switching the focus on new child tab 1
        driver.switchTo().window(tab.get(1));

        String title2 = driver.findElement(By.xpath("//*[@class='ticker-header']")).getText();

        System.out.println("The text from  the second page is " + title2);

            //switching the focus to parent tab
        driver.switchTo().window(tab.get(0));


        String title1 = driver.findElement(By.xpath("//h2[contains(@data-heading-component , 'Learn about COVID')]")).getText();
        System.out.println("Text from 1st tab is " + title1);


    }
}



