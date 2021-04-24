package Express_Page_Object;

import ReusableLibrary.AbstractClass;
import ReusableLibrary.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.PublicKey;

public class Home_Page extends AbstractClass {

    ExtentTest logger;

    public Home_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);

        this.logger = AbstractClass.logger;

    }//end of constructor


    @FindBy(xpath = "//button[@id='closeModal']")
    WebElement popup;

    public void Close_PopUp(){

        Reusable_Actions_PageObject.clickOnElement(driver,popup,logger,"Pop up");
    }

    @FindBy(xpath = "//a[text()='Men']")
    WebElement MensTab;

    public void Hover_Over_MensTab(){

        Reusable_Actions_PageObject.mouseHover(driver,MensTab,logger,"Men's Tab");

    }

    @FindBy(xpath = "//a[text()='Sweatshirts & Hoodies']")
    WebElement SweatShirt_Hoodies;


    public void ClickonSweatShirt_Hoodies(){
        Reusable_Actions_PageObject.clickOnElement(driver,SweatShirt_Hoodies,logger,"SweatShirt & Hoodies");

    }
}