package Practice;

import Day_09_04_03_2021.Reusable_Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class prac {
    public static void main(String[] args) throws IOException, InterruptedException {

        WebDriver driver= Reusable_Methods.defineTheDriver();
        driver.navigate().to("https://www.express.com/");


        Reusable_Methods.clickOnElement(driver,"//*[@id='closeModal']","popup");
        Reusable_Methods.mouseaction(driver,"//a[text()='Men']","men");
        driver.findElements(By.linkText("Sweaters'")).get(0).click();
        //Reusable_method.findelementsbymouceaction(driver,"//a[text()='Sweaters']",0,"sweater");
        // Reusable_method.mouseaction(driver,"//a[text()='Sweaters']","Sweater");

        //Reusable_method.clickOnElement(driver,"//a[text()='Solid Slub Quarter Zip Sweater']","Sweater");
        //Reusable_method.clickOnElement(driver,"//a[@aria-label='Select m Size']","Sweater");







    }
}
