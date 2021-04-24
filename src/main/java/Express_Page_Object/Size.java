package Express_Page_Object;

import ReusableLibrary.AbstractClass;
import ReusableLibrary.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Size extends AbstractClass {
    ExtentTest logger;
    public Size(WebDriver driver){

        PageFactory.initElements(driver,this);
        this.logger=AbstractClass.logger;

    }

    @FindBy(xpath = "//button[@value='m']")
    WebElement ChooseSize;


    public void ClickonSize(){

        Reusable_Actions_PageObject.clickOnElement(driver,ChooseSize,logger,"Size");

    }


    @FindBy(xpath = "//button[text()='Add to Bag']")
    WebElement AddtoBag;


    public void ClickonAddtoBag(){

        Reusable_Actions_PageObject.clickOnElement(driver,AddtoBag,logger,"Add to Bag");

    }



    @FindBy(xpath ="//a[text()='View Bag']")
    WebElement ViewBag;


    public void Clickon_View_Bag(){

        Reusable_Actions_PageObject.clickOnElement(driver,ViewBag,logger,"view Bag");

    }

}
