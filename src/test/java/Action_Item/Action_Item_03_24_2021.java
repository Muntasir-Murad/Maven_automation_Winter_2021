package Action_Item;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Action_Item_03_24_2021 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muntasir\\Desktop\\Maven_Automation_2021\\src\\main\\resources\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");

        ChromeDriver driver = new ChromeDriver(options);


        String[] purchasePrice = new String[]{"10000", "20000", "30000"};
        String[] downPayment = new String[]{"5000", "10000","2000"};
        String[] mortgageTerm = new String[]{"10", "20", "30"};
        String[] interestRate = new String[]{"1", "2", "3"};
        String[] pmi = new String[]{"0.50", "0.62", "0.80"};
        String[] startMonth = new String[]{"Oct", "Nov", "Dec"};
        String[] startYear = new String[]{"2022", "2023", "2024"};


        for (int i = 0; i < purchasePrice.length; i++) {

            driver.navigate().to("https://www.mlcalc.com/");
            Thread.sleep(2000);
            WebElement pprice = driver.findElement(By.xpath("//input[@id='ma']"));
            pprice.clear();
            pprice.sendKeys(purchasePrice[i]);
            WebElement dp = driver.findElement(By.xpath("//input[@id='dp']"));
            dp.clear();
            dp.sendKeys(downPayment[i]);
            WebElement mt = driver.findElement(By.xpath("//input[@id='mt']"));
            mt.clear();
            mt.sendKeys(mortgageTerm[i]);
            WebElement ir = driver.findElement(By.xpath("//input[@id='ir']"));
            ir.clear();
            ir.sendKeys(interestRate[i]);

            WebElement pm = driver.findElement(By.xpath("//input[@id='mi']"));
            pm.clear();
            pm.sendKeys(pmi[i]);

            WebElement month = driver.findElement(By.xpath("//select[@name='sm']"));
            Select dropdown1 = new Select(month);
            dropdown1.selectByVisibleText(startMonth[i]);

            WebElement year = driver.findElement(By.xpath("//select[@name='sy']"));
            year.click();
            driver.findElement(By.xpath("//*[text()='"+startYear[i]+"']")).click();
           //               ("//select[@name='sy']"));
            //             "//*[text()='"+startyear[i]"']"


            driver.findElement(By.xpath("//input[@value='Calculate']")).click();


            String mntpayment = driver.findElement(By.xpath("(//td[@class='big'])[1]")).getText();
            


            System.out.println("For starting date and year " + startMonth[i] + "," + startYear[i] + ",");
            System.out.println("Based on purchase price $ " + purchasePrice[i] + " ,down payment $ " + downPayment[i] + " mortgage term " + mortgageTerm[i] + " years, and interest rate " + interestRate[i]
                    + " % , the monthly payment is " + mntpayment + ".");


            // String totalpmnt= driver.findElements(By.xpath("//td[@class='big']")).get(1).getText();
            //System.out.println(totalpmnt);

        }//end of loop

    }//end of method
}//end of class
