package ReusableLibrary;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ReusableMethods {

    public static WebDriver startDriver() throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        return driver;
    }

    public static void clickOnElement(WebDriver driver, String xpathLocator, ExtentTest logger, String elementName){
        WebDriverWait wait = new WebDriverWait(driver,10);
        try{
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathLocator))).click();
            logger.log(LogStatus.PASS,"Successfully click on element " +elementName);

        }catch(Exception e) {
            System.out.println("Unable to click on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL,"Fail to click on element  "+elementName);
            getScreenShot(driver,elementName,logger);
        }
    }


    public static void submitOnElement(WebDriver driver,String xpathLocator,ExtentTest logger, String elementName){
        WebDriverWait wait = new WebDriverWait(driver,10);
        try{
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathLocator))).submit();
            logger.log(LogStatus.PASS,"Successfully submit element " +elementName);
        }catch(Exception e) {
            System.out.println("Unable to submit on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL,"Fail to submit element  "+elementName);
            getScreenShot(driver,elementName,logger);
        }
    }


    public static void sendKeysMethod(WebDriver driver,String xpathLocator,String value, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathLocator)));
            element.clear();
            Thread.sleep(2000);
            element.sendKeys(value);
            logger.log(LogStatus.PASS, "Successfully send keys " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to submit on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Fail to  send Keys  " + elementName);
            getScreenShot(driver,elementName,logger);
        }
    }
        public static void hoverElementbyLinktext(WebDriver driver, String linktext,ExtentTest logger,String elementName){
            WebDriverWait wait = new WebDriverWait(driver,10);
            Actions mouseAction = new Actions(driver);
            try{
                WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(linktext)));
                mouseAction.moveToElement(element).perform();
                Thread.sleep(2000);
                logger.log(LogStatus.PASS,"Successfully hover on element " +elementName);

            }catch(Exception e){
                System.out.println("Unable to hover on element " + elementName + " " + e);
                logger.log(LogStatus.FAIL,"Fail to hover on element "+elementName);
                getScreenShot(driver,elementName,logger);
            }
        }

    public static String captureText (WebDriver driver, String xpathLocator, int index, ExtentTest logger,String elementName){
        WebDriverWait wait = new WebDriverWait(driver,10);
        String result = "";
        try{
            WebElement element = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpathLocator))).get(index);
            result = element.getText();
            logger.log(LogStatus.PASS,"Successfully capture text " +elementName);
        }catch(Exception e) {
            System.out.println("Unable to capture text " + elementName + " " + e);
            logger.log(LogStatus.FAIL,"Fail to capture text  "+elementName);
            getScreenShot(driver,elementName,logger);
        }
        return result;
    }

    public static void selectOptions(WebDriver driver, String xpathLocator,String userValue,ExtentTest logger,String elementName){
        WebDriverWait wait = new WebDriverWait(driver,10);
        try{
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathLocator)));
            Select dropdown = new Select(element);
            dropdown.selectByVisibleText(userValue);
            logger.log(LogStatus.PASS,"Successfully select element " +elementName);

        }catch(Exception e){
            System.out.println("Unable to select element " + elementName + " " + e);
            logger.log(LogStatus.FAIL,"Fail to select element "+elementName);
            getScreenShot(driver,elementName,logger);
        }
    }

    public static void hoverElement(WebDriver driver, String xpathLocator,ExtentTest logger,String elementName){
        WebDriverWait wait = new WebDriverWait(driver,10);
        Actions mouseAction = new Actions(driver);
        try{
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathLocator)));
            mouseAction.moveToElement(element).perform();
            Thread.sleep(2000);
            logger.log(LogStatus.PASS,"Successfully hover on element " +elementName);

        }catch(Exception e){
            System.out.println("Unable to hover on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL,"Fail to hover on element "+elementName);
            getScreenShot(driver,elementName,logger);
        }
    }


    public static void slideElement(WebDriver driver, String xpathLocator,ExtentTest logger,String range,String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Actions slideAction = new Actions(driver);
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathLocator)));
            slideAction.dragAndDropBy(element, Integer.parseInt(range), 0).build().perform();
            Thread.sleep(2000);
            logger.log(LogStatus.PASS, "Successfully slide on element " + elementName);

        } catch (Exception e) {
            System.out.println("Unable to hover on element " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Fail to hover on element " + elementName);
            getScreenShot(driver,elementName,logger);

        }
    }
            public static void dropdownByText(WebDriver driver,String xpath,String userValue,ExtentTest logger,String elementName){
                WebDriverWait wait = new WebDriverWait(driver,10);
                try{
                    WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
                    Select dropDown = new Select(element);
                    dropDown.selectByVisibleText(userValue);
                    logger.log(LogStatus.PASS,"Successfully selected value " + userValue + " on " + elementName);
                } catch (Exception e) {
                    System.out.println("Unable to select a value from " + elementName + " " + e);
                    logger.log(LogStatus.FAIL,"Unable to select a value from " + elementName + " " + e);
                    getScreenShot(driver,elementName,logger);
                }
            }//end of dropdown by text




        //method to capture screenshot when logger fails
        public static void getScreenShot(WebDriver driver,String imageName, ExtentTest logger) {
            try {
                String fileName = imageName + ".png";
                String directory = null;
                String snPath = null;
                directory = "src/main/java/HTML_Report/Screenshots/";
                snPath = "Screenshots/";
                File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(sourceFile, new File(directory + fileName));
                //String imgPath = directory + fileName;
                String image = logger.addScreenCapture(snPath + fileName);
                logger.log(LogStatus.FAIL, "", image);
            } catch (Exception e) {
                logger.log(LogStatus.FAIL, "Error Occured while taking SCREENSHOT!!!");
                e.printStackTrace();
            }
        }//end of getScreenshot method
    }


