package Action_Item;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Action_Item_03_22_2021 {
    public static void main(String[] args) throws InterruptedException {



        System.setProperty("webdriver.chrome.driver","C:\\Users\\Muntasir\\Desktop\\Maven_Automation_2021\\src\\main\\resources\\chromedriver.exe");

        ChromeOptions option=new ChromeOptions();

        option.addArguments("start-maximized");
        option.addArguments("incognito");

        WebDriver driver=new ChromeDriver(option);
        driver.navigate().to("https://www.mlcalc.com/");
        Thread.sleep(5000);





        String[] loanAmount=new String[]{"3000","4000","5000"};
        String[] loanTerm=new String[]{"3","4","5"};
        String [] interestRate= new String[]{"1","2","3"};
        String [] startMonth= new String[]{"Jan","Feb","Mar"};
        String[]  startYear= new String[]{"2022","2023","2024"};

        for (int i=0;i<loanAmount.length;i++) {



            WebElement LoanAmnt = driver.findElement(By.xpath("//input[@id='la']"));
            LoanAmnt.clear();
            LoanAmnt.sendKeys(loanAmount[i]);


            WebElement loanTrm = driver.findElement(By.xpath("//input[@id='lt']"));
            loanTrm.clear();
            loanTrm.sendKeys(loanTerm[i]);

            WebElement intRate= driver.findElement(By.xpath("//input[@id='lir']"));
            intRate.clear();
            intRate.sendKeys(interestRate[i]);


            WebElement month= driver.findElement(By.xpath("(//select[@id='fpdd'])[3]"));
           // WebElement month= driver.findElements(By.xpath("//select[@id='fpdd']")).g
            Select dropdown=new Select(month);
            dropdown.selectByVisibleText(startMonth[i]);

            WebElement year=driver.findElement(By.xpath("(//select[@id='fpdy'])[3]"));
            Select dropdownYear= new Select(year);
            dropdownYear.selectByVisibleText(startYear[i]);


            driver.findElement(By.xpath("(//input[@value='Calculate'])[3]")).submit();

          String monthlypayment= driver.findElement(By.xpath("(//td[@class='big'])[1]")).getText();

          //String monthlypayment2= driver.findElements(By.xpath("//td[@class='big']")).get(0).getText();

            System.out.println("The monthly payment is "+ monthlypayment+ "for year "+ startYear[i]);
            //System.out.println("The monthly payment is "+ monthlypayment2+ "for year "+ startYear[i]);
            //System.out.println("month "+ startMonth[i]);

        }//end of for loop
    }//end of main method
}//end of class
