package Action_Item;

import Day03_031321.Switch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.ArrayList;

public class Action_Item_03_28 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Muntasir\\Desktop\\Maven_Automation_2021\\src\\main\\resources\\chromedriver.exe");

        //define the chromeoptions arguments
        ChromeOptions options = new ChromeOptions();
        //maximize my driver
        options.addArguments("start-maximized");
        //set the driver to incognito(private)
        options.addArguments("incognito");
        //define the webdriver
        WebDriver driver = new ChromeDriver(options);
        Actions mouseaction =new Actions(driver);


       ArrayList<String> findLocationByzip=new ArrayList<>();
       findLocationByzip.add("08554");
       findLocationByzip.add("08558");
       findLocationByzip.add("08559");

        ArrayList<String> locationType=new ArrayList<>();
        locationType.add("Collection Boxes");
        locationType.add("Self-Service Kiosks");
        locationType.add("Contract Postal Unit");


        ArrayList<String> locationMile=new ArrayList<>();
        locationMile.add("10 Miles");
        locationMile.add("20 Miles");
        locationMile.add("50 Miles");




        for (int i=0; i<findLocationByzip.size();i++) {

            driver.navigate().to("https://www.usps.com/");
            String actualtitle = driver.getTitle();

            if(actualtitle.equals("Welcome | USPS")){
                System.out.println("The titile is verified which is "+ actualtitle+".");
            }else{
                System.out.println("The titile is not correct,the actual title is "+ actualtitle+".");
            }

            try {
                WebElement send = driver.findElement(By.linkText("Send"));
                mouseaction.moveToElement(send).perform();}
            catch (Exception e){

                System.out.println("Error:"+ e);
            }

            try{
                WebElement findusps = driver.findElement(By.linkText("Find USPS Locations"));
                mouseaction.moveToElement(findusps).click().perform();}
            catch (Exception f){

                System.out.println("Error:"+ f);
            }

            try{
            WebElement location = driver.findElement(By.id("city-state-input"));
            mouseaction.moveToElement(location).click().sendKeys(findLocationByzip.get(i)).perform();}



            catch (Exception M){
                System.out.println("Error:"+ M);
            }

            try {


                WebElement locType = driver.findElement(By.id("post-offices-select"));
            mouseaction.moveToElement(locType).click().perform();}
            catch (Exception g){
                System.out.println("Error:"+ g);
            }

                try {
                WebElement localist = driver.findElement(By.xpath("//*[text()='" + locationType.get(i) + "']"));
            mouseaction.moveToElement(localist).click().perform();}
                catch (Exception g){
                    System.out.println("Error:"+ g);
                }

            try {


                WebElement miles = driver.findElement(By.id("within-select"));
            mouseaction.moveToElement(miles).click().perform();}
            catch (Exception h){
                System.out.println("Error:"+ h);
            }

            try{
                WebElement withinlist = driver.findElement(By.xpath("//*[text()='" + locationMile.get(i) + "']"));
            mouseaction.moveToElement(withinlist).click().perform();}
            catch (Exception j){
                System.out.println("Error:"+ j);
            }
            try {
                WebElement searchbutton = driver.findElement(By.id("searchLocations"));
            mouseaction.moveToElement(searchbutton).click().perform();}
            catch (Exception k){
                System.out.println("Error:"+ k);
            }



            Thread.sleep(3000);

            try {

            ArrayList<WebElement> links = new ArrayList<>(driver.findElements(By.xpath("//div[@class='list-item-location popover-trigger']")));

            if(i==0){
                links.get(0).click();

            }else if(i==1){
                links.get(1).click();}
            else if(i==2){
                links.get(2).click();}}
            catch (Exception y){
                System.out.println("Error:"+ y);
            }

            Thread.sleep(2000);

            try {
            String address= driver.findElement(By.xpath("//div[@class=' address-wrapper']")).getText();
            System.out.println("For zip code " +findLocationByzip.get(i)+ ", The address is "+ address);}

            catch (Exception z){
                System.out.println("Error:"+ z);
            }
            Thread.sleep(2000);
            try {
            String hours= driver.findElement(By.xpath("//div[@class='hours-flex-section']")).getText();
            System.out.println(hours);}
            catch (Exception zz){
                System.out.println("Error:"+ zz);
            }


            System.out.println("****************");

        }//end of for loop
        driver.quit();
    }//end of main method
}//end of class
