package Day06_03_21_2021;

import Day03_031321.Switch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class optionsexample {
    public static void main(String[] args) throws InterruptedException {



        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");


        //define options
        ChromeOptions options=new ChromeOptions();


        //what options you want
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        //options.addArguments("headless");


        WebDriver driver=new ChromeDriver(options);

        driver.navigate().to("https://www.mortgagecalculator.org/");

        String title=driver.getTitle();


        if(title=="Mortgage Calculator"){
            System.out.println("Title matches");
        }else {
            System.out.println("Title doesnt match, and the actual title is "+ title);

        }


        WebElement homeval= driver.findElement(By.xpath("//*[@id='homeval']"));
        homeval.clear();
        homeval.sendKeys("1000000");


        WebElement dpayment= driver.findElement(By.xpath("//*[@id='downpayment']"));
        dpayment.clear();
        dpayment.sendKeys("1000000");

        WebElement loan= driver.findElement(By.xpath("//*[@id='loanamt']"));
        loan.clear();
        loan.sendKeys("100");

        WebElement interest= driver.findElement(By.xpath("//*[@id='intrstsrate']"));
        interest.clear();
        interest.sendKeys("1");

      //  driver.findElement(By.name("ratebutton")).click();






        WebElement month= driver.findElement(By.xpath("//*[@name='param[start_month]']"));
        Select dropdown=new Select(month);
        dropdown.selectByVisibleText("Apr");


        //if dropdown is not under select tag,we have to use click comand twice

        month.click();
        driver.findElement(By.xpath("//*[text()='May']")).click();


//click on Calculate button
        driver.findElement(By.xpath("//*[@value='Calculate']")).click();

        Thread.sleep(3000);

//capture the monthly payment using findElements with first index
        String mntPayment = driver.findElements(By.xpath("//div[@class='left-cell']")).get(0).getText();
        System.out.println("My monthly payment is " + mntPayment);







    }//end of main
}
