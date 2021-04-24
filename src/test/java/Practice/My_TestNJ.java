package Practice;

import Day_09_04_03_2021.Reusable_Methods;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class My_TestNJ {
    WebDriver driver;
    @BeforeSuite

    public void startdriver(){

        driver= My_Reussable_Method.driver();
        driver.navigate().to("https://google.com/");

    }

    @Test

    public void sendskeys(){

        My_Reussable_Method.finidlocationandSendKeys(driver,"//*[@name='q']","cars","findlocatipn");
        My_Reussable_Method.submit(driver,"//*[@name='btnK']","submit");
        System.out.println("test 1");

        String p=My_Reussable_Method.CaptureText(driver,"//*[@id='result-stats']",0,"result");
        System.out.println(p);


    }

    @Test
    public  void clickonsubmit(){


        System.out.println("test 2");

    }







    @AfterSuite
    public void closedriver(){
        driver.close();

    }
}
