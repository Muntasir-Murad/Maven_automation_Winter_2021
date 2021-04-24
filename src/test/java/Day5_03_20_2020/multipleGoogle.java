package Day5_03_20_2020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleGoogle {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");

        //define the webdriver
        WebDriver driver=new ChromeDriver();
        String[] cities = new String[3];
        cities[0] = "Brooklyn";
        cities[1] = "Queens";
        cities[2] = "Bronx";

        for(int i = 0; i < cities.length; i++) {

            //navigate to google.com
            driver.navigate().to("https://www.google.com/");
            Thread.sleep(3000);
            //maximize the driver
            driver.manage().window().maximize();

            //enter a kewyword on google seacrhc field

            //enter a keyword on google search field
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(cities[i]);

            //hit submit on google search button
            driver.findElement(By.xpath("//*[@name='btnK']")).submit();
            Thread.sleep(3000);
            //locate the element you want to capture
            String searchresult = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();

            //store the result
            //String searchresult= driver.findElement(By.xpath("//*[@id='result-stats']")).getText();

            //Split the string to get specific valaue
            String[] theresult = searchresult.split(" ");

            //print the result
            System.out.println("The name of the city is  " + cities[i] + " and the  search result is " + theresult[1]);







        }

    }
}

    /** iterate through multiple cities on google search and print out the number each time

    //declare and define the array list
    String[] cities = new String[3];
        cities[0] = "Brooklyn";
                cities[1] = "Queens";
                cities[2] = "Bronx";


                //set the driver path
                System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");

                //define the WebDriver
                WebDriver driver = new ChromeDriver();

                //your actual use case from start to end should go inside for/while loop for multiple iterations
                for(int i = 0; i < cities.length; i++){
        //navigate to google home
        driver.navigate().to("https://www.google.com");

        //maximize the driver
        driver.manage().window().maximize();

        //sleep statement when you go to a specific url page
        Thread.sleep(3000);

        //enter a keyword on google search field
        driver.findElement(By.xpath("//*[@name='q'
     **/