package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.TreeMap;

public class Extra_Option_item {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Muntasir\\Desktop\\Maven_Automation_2021\\src\\main\\resources\\chromedriver.exe");

        ChromeOptions option=new ChromeOptions();

        option.addArguments("start-maximized");
        option.addArguments("incognito");
        ChromeDriver driver= new ChromeDriver(option);
        Actions mouseaction=new Actions(driver);
        ArrayList<String> ZipCode = new ArrayList<String>();
        ZipCode.add("11218");
        ZipCode.add("11219");
        ZipCode.add("11220");

        //Miles Range
        ArrayList<Integer> milesRange = new ArrayList<Integer>();
        milesRange.add(60);
        milesRange.add(90);
        milesRange.add(20);


        for(int i=0; i<ZipCode.size();i++) {

            driver.navigate().to("https://www.aetna.com/");
            Thread.sleep(3000);
            String actualtitle = driver.getTitle();

            if (actualtitle.equals("Atena")) {
                System.out.println("The given title is wrong , the actual title is " + actualtitle);
            } else {
                System.out.println("The given title is wrong , the actual title is " + actualtitle);
            }

            Thread.sleep(4000);
            try {


                WebElement shop = driver.findElements(By.xpath("//button[text() ='Shop for a plan']")).get(0);
                // WebElement shop = driver.findElement(By.linkText("Shop for a plan"));


                mouseaction.moveToElement(shop).click().perform();
            } catch (Exception e) {
                System.out.println(e);
            }


            Thread.sleep(3000);
            WebElement medicare = driver.findElements(By.xpath("//*[text()='Medicare']")).get(0);
            mouseaction.moveToElement(medicare).click().perform();
            Thread.sleep(3000);
            driver.findElements(By.xpath("//a[text()='Find a doctor ']")).get(0).click();
            Thread.sleep(3000);


            driver.findElements(By.xpath("//*[text()='2021 Medicare plans you purchase yourself']")).get(0).click();


            WebElement mm = driver.findElement(By.id("medZip"));
            mm.click();
            mm.sendKeys(ZipCode.get(0));
            Thread.sleep(3000);
            driver.findElement(By.xpath("//li[contains(@class,'active')]")).click();

            Thread.sleep(3000);

            WebElement slider = driver.findElement(By.xpath("//span[@role='slider']"));
            mouseaction.dragAndDropBy(slider,milesRange.get(0),0).build().perform();
            Thread.sleep(3000);

            driver.findElement(By.xpath("//button[contains(@value,'skip plan selection')]")).click();

            Thread.sleep(3000);
            driver.findElement(By.linkText("Medical Doctors & Specialists")).click();
            Thread.sleep(3000);
            driver.findElement(By.linkText("Doctors (Primary Care)")).click();
            Thread.sleep(3000);
            driver.findElements(By.xpath("//h3[contains(@class,'dummyLinkLabel')]")).get(0).click();
            Thread.sleep(3000);
            System.out.println("Hi");
//        try {
//            String add = driver.findElements(By.xpath("//a[contains(@class,'providerName')]")).get(1).getText();
//            System.out.println(add);
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
//        System.out.println("Hello");
//        String addddd=driver.findElements(By.xpath("//span[contains(@class,'dataGridPadding')]")).get(1).getText();
//        System.out.println(addddd);
            Thread.sleep(3000);
            String name = driver.findElements(By.xpath("//p[contains(@class,'bold contentHeadFontSize nameFontFor')]")).get(1).getText();

            String a = driver.findElements(By.xpath("//span[contains(@style,'display: table-cell')]")).get(0).getText();
            String phone = driver.findElements(By.xpath("//span[contains(@aria-describedby,'phone555')]")).get(0).getText();


//        String doctorAddress=  driver.findElements(By.xpath("//span[contains(@class,'dataGridPadding')]")).get(0).getText();
//        Thread.sleep(3000);
//        String doctorPhone= driver.findElements(By.xpath("//span[contains(@class,'dataGridPadding')]")).get(1).getText();
            System.out.println(name);
            System.out.println(a);
            System.out.println(phone);
            //System.out.println(doctorAddress);
            //System.out.println(doctorPhone);


        }






    }
}
