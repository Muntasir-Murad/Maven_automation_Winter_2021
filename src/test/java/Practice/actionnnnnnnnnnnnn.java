package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class actionnnnnnnnnnnnn {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muntasir\\Desktop\\Maven_Automation_2021\\src\\main\\resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");


        ChromeDriver driver=new ChromeDriver(options);

        String[] purchasePrice = new String[]{"10000", "20000", "30000"};
        String[] downPayment = new String[]{"5000", "10000", "15000"};
        String[] mortgageTerm = new String[]{"10", "20", "30"};
        String[] interestRate = new String[]{"1", "2", "3"};
        String[] pmi = new String[]{"0.50", "0.62", "0.80"};
        String[] startMonth = new String[]{"Apr", "May", "Jun"};
        String[] startYear = new String[]{"2022", "2023", "2024"};

       for(int i=0; i< purchasePrice.length; i++){


            driver.navigate().to("https://www.mlcalc.com/");


           WebElement  pprice= driver.findElement(By.xpath("//input[@id='ma']"));
           pprice.clear();
           pprice.sendKeys(purchasePrice[i]);


           WebElement dp = driver.findElement(By.xpath("//input[@id='dp']"));
           dp.clear();
           dp.sendKeys(downPayment[i]);
           /*WebElement mt = driver.findElement(By.xpath("//input[@id='mt']"));
           mt.clear();
           mt.sendKeys(mortgageTerm[i]);
           WebElement ir = driver.findElement(By.xpath("//input[@id='ir']"));
           ir.clear();
           ir.sendKeys(interestRate[i]);
           Thread.sleep(2500);
           WebElement pm = driver.findElement(By.xpath("//input[@id='mi']"));
           pm.clear();
           pm.sendKeys(pmi[i]);
           */

           //try{
           //    driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Cars");
           //} catch (Exception e) {
           //    System.out.println("Unable to enter keyword on Search field. " + e);
           //}//





               WebElement month = driver.findElement(By.xpath("//select[@name='sm']"));

               Select dropdown1 = new Select(month);
               dropdown1.selectByVisibleText(startMonth[i]);


//                try{
//
//            WebElement year=driver.findElement(By.xpath("//select[@name='syz']"));
//             Select dropdown2= new Select(year);
//            dropdown2.selectByVisibleText(startYear[i]);}
//                catch (Exception f){
//               System.out.println(f);
//           }




            try{
            driver.findElement(By.xpath("//input[@type='submit' and @value='Calculate']")).click();}

            catch (Exception e){
                System.out.println(e);
            }



            String result= driver.findElements(By.xpath("//td[@class='big']")).get(0).getText();
           // String r= driver.findElements(By.xpath("//td[@class='big']")).toString();


           System.out.println("The monthly payment for year "+ startYear[i]);
           System.out.println(result+".");

           //System.out.println(r);

       }//end of for loop


        String  Actualtitle= driver.getTitle();

        String mytitle= "Mortgage Calculation";

        if(Actualtitle.equals(mytitle)){

            System.out.println("The title is right which is "+ Actualtitle);

        }else{
            System.out.println("The title is wrong, and the actual title is "+ Actualtitle);
        }


    }//end of main

}//end of class
