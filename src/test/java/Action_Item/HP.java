package Action_Item;

import ReusableLibrary.AbstractClass;
import ReusableLibrary.ReusableMethods;
import org.testng.annotations.Test;

public class HP extends AbstractClass {

    @Test
    public void Catching_Error() throws InterruptedException {

        driver.navigate().to("https://www8.hp.com/us/en/home.html");
        Thread.sleep(5000);
        ReusableMethods.clickOnElement(driver,"//button[contains,@Class,'onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon']",logger,"pop up");
        ReusableMethods.hoverElement(driver,"//h5[text()='Shop']",logger,"Shop");
        ReusableMethods.clickOnElement(driver,"(//label[text()='Laptops'])[2]",logger,"Laptops");















    } //end of class
}//End of class
