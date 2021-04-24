package Express_Page_Object;


import ReusableLibrary.AbstractClass;
import ReusableLibrary.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hoodies_Sweaters extends AbstractClass {

    ExtentTest logger;
    public  Hoodies_Sweaters (WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger=AbstractClass.logger;

    }//end of constractor


    @FindBy(xpath = "(//div[@class='_3TJgM'])[1]")
    WebElement FirstSweater;

  public void ClickonFirstSweater(){

      Reusable_Actions_PageObject.clickOnElement(driver,FirstSweater,logger,"Sweater");

  }
}
