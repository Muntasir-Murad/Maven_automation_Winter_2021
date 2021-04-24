package ReusableLibrary;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import java.io.IOException;
import java.lang.reflect.Method;

public class AbstractClass {
    public static WebDriver driver=null;
    public static ExtentReports reports;
    public static ExtentTest logger;
    public static Workbook readableBook;
    public static WritableWorkbook writeableWorkbook;
    public static WritableSheet writableSheet;
    public static int rowCount;

    @BeforeSuite
    public void startDriver() throws IOException, InterruptedException {
        driver = ReusableMethods.startDriver();
       // reports = new ExtentReports("src/main/java/HTML_Report/Automation_Report.html");
        reports = new ExtentReports("src/main/java/HTMLReports/"+getClass().getSimpleName()+".html");
//        reports.addSystemInfo("Host Name","localhost");
//        reports.addSystemInfo("Tester","Newaz");
//        reports.addSystemInfo("Environment","QA");
    }

    @BeforeMethod
    public void captureTestName(Method method){
        logger = reports.startTest(method.getName());
    }
    @AfterMethod
    public void endLogger(){
        reports.endTest(logger);
    }
    @AfterSuite
    public void closeDriver(){
        reports.flush();
        driver.quit();
    }
}