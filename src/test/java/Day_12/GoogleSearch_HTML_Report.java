package Day_12;



import ReusableLibrary.AbstractClass;
import ReusableLibrary.ReusableMethods;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class GoogleSearch_HTML_Report extends AbstractClass {
    @Test
    public void SearchForACar() throws InterruptedException {
        driver.navigate().to("https://www.google.com ");
        Thread.sleep(2500);
        //search for a car
        ReusableMethods.sendKeysMethod(driver,"//*[@name='q']","cars",logger,"Search Field");
        //submit on google search button
        ReusableMethods.submitOnElement(driver,"//*[@name='btnK']",logger,"Google Search");
        Thread.sleep(3000);
    }//end of test 1

    @Test(dependsOnMethods = "SearchForACar")
    public void getSearchNumber(){
        String result = ReusableMethods.captureText(driver,"//*[@id='result-stats']",0,logger,"Google Search Result");
        String[] arrayResult = result.split(" ");
        logger.log(LogStatus.INFO,"My search number is " + arrayResult[1]);
    }//end of test 2
}
