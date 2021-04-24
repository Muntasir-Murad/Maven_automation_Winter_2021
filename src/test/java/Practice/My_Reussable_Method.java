package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class My_Reussable_Method {


    public static WebDriver driver() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        return driver;
    }
    public static void finidlocationandSendKeys(WebDriver driver, String xpath, String sendkeys, String elementName) {
        try {
            WebDriverWait explicit = new WebDriverWait(driver, 10);
            explicit.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).sendKeys(sendkeys);
        } catch (Exception E) {
            System.out.println("unble to find" + elementName);
        }
    }

    public static void submit(WebDriver river,String xpath,String elementName) {

        WebDriverWait wait = new WebDriverWait(river, 10);
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).submit();
        } catch (Exception E) {
            System.out.println("cant click on submit" + elementName);
        }
    }
       public static String CaptureText(WebDriver driver,String xpath, int index, String elementName) {

           WebDriverWait wait = new WebDriverWait(driver, 10);
           String result = null;
           try {
               WebElement element = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))).get(index);
               result = element.getText();
               

           } catch (Exception e) {

               System.out.println("Cant find the text " + elementName);
           }
           return result;
       }
    public static String captureText(WebDriver driver,String xpath,int index,String elementName){
        WebDriverWait wait = new WebDriverWait(driver,10);
        String result = "";
        try{
            WebElement element = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))).get(index);
            result = element.getText();
        } catch (Exception e) {
            System.out.println("Unable to select a value from " + elementName + " " + e);
        }
        return result;
    }//end of dropdown by text


    }







