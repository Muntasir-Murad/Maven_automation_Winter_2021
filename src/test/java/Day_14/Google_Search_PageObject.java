package Day_14;


import Google_Page_Object.Base_Class;
import ReusableLibrary.AbstractClass;
import org.testng.annotations.Test;

public class Google_Search_PageObject extends AbstractClass {


    @Test
    public void googleSearch(){
        driver.navigate().to("https://www.google.com/");
        Base_Class.googleHomePage().EnterKeywordOnGoogleSearch("cars");
        Base_Class.googleHomePage().SubmitOnGoogleSearchButton();

    }
}
