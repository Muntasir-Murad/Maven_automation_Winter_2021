package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findcountries {
    public static void main(String[] args)

    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Muntasir\\Desktop\\Maven_Automation_2021\\src\\main\\resources\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();


      String[] country=new String[2];
      country[0]="Bangladesh";
      country[1]="USA";

        for(int i=0; i<country.length;i++) {


            driver.navigate().to("https://www.google.com/");
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(country[i]);
            driver.findElement(By.xpath("//*[@name='btnK']")).submit();
            driver.findElement(By.xpath("//*[@id='result-stats']")).getText();


            String myresult = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
            //myresult=About 9,420,000,000 results (1.10 seconds)


            String[] newresult = myresult.split(" ");


            System.out.println(newresult[3]);

            //About 9,420,000,000 results (1.10 seconds)

            //* [@ atribute=value]


        }//end of for loop

        driver.close();

    }//end of main
}//end of class
