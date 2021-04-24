package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findingcountries {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Muntasir\\Desktop\\Maven_Automation_2021\\src\\main\\resources\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        String[] country=new String[]{"USA","Bangladesh"};


        for(int i=0;i<country.length;i++) {

            driver.navigate().to("https://www.google.com/");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(country[i]);
            driver.findElement(By.xpath("//*[@name='btnK']")).submit();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
            String myresult = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();

            String[] newresult = myresult.split(" ");
            System.out.println("The time it takes to load the website for "+country[i] +" is "+ newresult[3] + newresult[4]);


        }

            driver.close();



    }//end of main
}//end of class
