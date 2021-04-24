package Day_12;

import Day_09_04_03_2021.Reusable_Methods;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class TestNg_Assertions {

    @Test

    public void assertions() throws IOException, InterruptedException {
        WebDriver driver= Reusable_Methods.defineTheDriver();
        driver.navigate().to("https://www.google.com/");

        //hard assertion
        //Assert.assertEquals("Google",driver.getTitle());
        //if hard assertion fails,the scripts fail


        //softassert
       SoftAssert mysoftAssert=new SoftAssert();

        mysoftAssert.assertEquals("google",driver.getTitle());

     Reusable_Methods.sendKeysMethod(driver,"//*[@name='q']","casrs","searchbar");
        //assertAll should be the last step on your test
        mysoftAssert.assertAll();

    }
}
