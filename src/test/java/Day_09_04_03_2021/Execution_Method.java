package Day_09_04_03_2021;

import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Execution_Method {

    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = Reusable_Methods.defineTheDriver();

//navigate to google
        driver.navigate().to("https://www.google.com");
        Thread.sleep(2300);
//enter something on search field
        Reusable_Methods.sendKeysMethod(driver,"//*[@name='q']","Cars","Search Field");
       Reusable_Methods.submit(driver,"//*[@name='btyK']", "submitbutton");






    }
}
