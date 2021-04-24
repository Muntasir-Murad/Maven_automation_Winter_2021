package Express_Page_Object;

import ReusableLibrary.AbstractClass;
import ReusableLibrary.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


    public class Bag extends AbstractClass {
        ExtentTest logger;
        public Bag(WebDriver driver){

            PageFactory.initElements(driver,this);
            this.logger=AbstractClass.logger;

        }

        //define all the elements
        @FindBy(xpath = "//*[@id='qdd-0-quantity']")
        WebElement quantity;
        @FindBy(xpath = "//button[text()='Checkout']")
        WebElement checkout;
        @FindBy(xpath = "//*[text()='Checkout as Guest']")
        WebElement guestcheckout;


        //create a method to add quantity
        public void selectQuantity(String userValue){
            Reusable_Actions_PageObject.selectOptionsfromdropdpwn(driver,quantity,userValue,logger,"Quanity");
        }//end of selecting quantity

        //create a method to click on checkout
        public void clickonCheckout(){
            Reusable_Actions_PageObject.clickOnElement(driver,checkout,logger,"Checkout");
        }//end of selecting quantity

        //create a method to click on checkout as guest
        public void clickonGuestCheckout(){
            Reusable_Actions_PageObject.clickOnElement(driver,guestcheckout,logger,"Guest Checkout");
        }//end of guest checkout
    }//end of java class






