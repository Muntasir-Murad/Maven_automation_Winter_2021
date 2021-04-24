package Day5_03_20_2020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findingBangladesh {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");

        //define the webdriver
        WebDriver driver=new ChromeDriver();

        String []country=new String[2];

        country [0]="Bagladesh";
        country [1]="Samsung";






        for(int i=0; i< country.length  ;i++) {
            driver.navigate().to("https://www.google.com/");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(country[i]);

            driver.findElement(By.xpath("//*[@name='btnK']")).submit();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id='result-stats']")).getText();

            String mytext = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();


            //About 674,000,000 results (0.78 seconds)


            String[] newtext = mytext.split(" ");

            //newtext[0]=About
            //newtext[1]=674,000,000

            System.out.println(country[i]);
            System.out.println(newtext[1]);
        }

    }//end of main method
}//end of class




//goal=find Bangladesh from google