package Day_14;

import ReusableLibrary.AbstractClass;
import org.testng.annotations.Test;
import Express_Page_Object.Express_Base_class;

public class Express_Page_Object extends AbstractClass {

    @Test
    public void expressEnd2End() throws InterruptedException {

        driver.navigate().to("https://www.express.com/");

        Express_Base_class.home_page().Close_PopUp();
        Express_Base_class.home_page().Hover_Over_MensTab();
        Express_Base_class.home_page().ClickonSweatShirt_Hoodies();

        Express_Base_class.hoodies_sweaters().ClickonFirstSweater();

        Express_Base_class.size().ClickonSize();
        Thread.sleep(2500);
        Express_Base_class.size().ClickonAddtoBag();
        Thread.sleep(2500);
        Express_Base_class.size().Clickon_View_Bag();
        Thread.sleep(2500);


        Express_Base_class.bag().selectQuantity("3");
        Thread.sleep(2500);
        Express_Base_class.bag().clickonCheckout();
        Thread.sleep(2500);
        Express_Base_class.bag().clickonGuestCheckout();
        Thread.sleep(2500);


        Express_Base_class.checkOut().enterFirstName("Test");
        Express_Base_class.checkOut().enterLastName("Subject");
        Express_Base_class.checkOut().enterEmail("test@gmail.com");
        Express_Base_class.checkOut().confirmEmailAddres("test@gmail.com");
        Express_Base_class.checkOut().enterPhoneNumber("6099685856");
        Express_Base_class.checkOut().clickonContinue();
        Thread.sleep(2500);
        Express_Base_class.checkOut().selectCountry("United States");
        Express_Base_class.checkOut().enterAddress("64 Amboy Ave");
        Express_Base_class.checkOut().enterZipcode("08554");
        Express_Base_class.checkOut().enterCity("Roebling");
        Express_Base_class.checkOut().selectState("NY");
        Express_Base_class.checkOut().clickonContinue1();
        Thread.sleep(2500);
        Express_Base_class.checkOut().clickonConfirmShippingMethod();
        Express_Base_class.checkOut().enterCreditCardNumber("4445698565856980");
        Express_Base_class.checkOut().enterExpMonth("01");
        Express_Base_class.checkOut().enterExpYear("21");
        Express_Base_class.checkOut().enterCVV("448");
        Express_Base_class.checkOut().clickonPlaceOrder();


    }
}
