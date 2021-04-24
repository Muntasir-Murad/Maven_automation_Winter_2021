package Action_Item;


import Day_09_04_03_2021.Reusable_Methods;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Action_Item_04_04 {
    public static void main(String[] args) throws IOException, InterruptedException, BiffException, WriteException {
        WebDriver driver = Reusable_Methods.defineTheDriver();
        //step 1: locate the path for readable  file that we created in excel
        Workbook readableBook = jxl.Workbook.getWorkbook(new File("src/main/resources/express.xls"));
        //step 2: accessing the sheet
        Sheet readableSheet = readableBook.getSheet(0);

        //step 3: create a writeable woorkbook

        WritableWorkbook writableWorkbook = Workbook.createWorkbook(new File("src/main/resources/express_result2.xls"), readableBook);
        //Ste3 : read everything from writable sheet
        WritableSheet writableSheet = writableWorkbook.getSheet(0);
        //step 4: get the rows
        int rowCount = writableSheet.getRows();
        // Loop will start to iterate through excel data
        for (int i = 1; i < rowCount; i++) {


            //columns are hard coded and row is dynamic(i)
            String size = writableSheet.getCell(0, i).getContents();
            String quantity = writableSheet.getCell(1, i).getContents();
            String firstName = writableSheet.getCell(2, i).getContents();
            String lastName = writableSheet.getCell(3, i).getContents();
            String email = writableSheet.getCell(4, i).getContents();
            String phone = writableSheet.getCell(5, i).getContents();
            String streetAddress = writableSheet.getCell(6, i).getContents();
            String zip = writableSheet.getCell(7, i).getContents();
            String city = writableSheet.getCell(8, i).getContents();
            String state = writableSheet.getCell(9, i).getContents();
            String cc = writableSheet.getCell(10, i).getContents();
            String month = writableSheet.getCell(11, i).getContents();
            String year = writableSheet.getCell(12, i).getContents();
            String cvv = writableSheet.getCell(13, i).getContents();

            //clear all the cookies

            driver.manage().deleteAllCookies();
            //1. Navigate to express website
            driver.navigate().to("https://www.express.com/");
            //Handle popup window
            Reusable_Methods.clickOnElement(driver, "//*[@id='closeModal']", "popup");
            //2. Hover over to Men Tab
            Reusable_Methods.mouseaction(driver, "//a[text()='Men']", "men");
//3. Clothing section click on Sweatshirts & Hoodies
            Reusable_Methods.findelementsbymouceaction(driver, "//a[text()='Sweatshirts & Hoodies']", 0, "sweatShirts and Hoodeis");
            //4. Click on First sweater
            Reusable_Methods.findelementsbymouceaction(driver, "//div[@class='_3TJgM']", 0, "First Sweater");

            //5. Click on size
            Reusable_Methods.clickOnElement(driver, "//button[@value='" + size + "']", "Size");
            //6. Click on add to Bag
            Reusable_Methods.clickOnElement(driver, "//button[text()='Add to Bag']", "add to bag");
            //7. Click on view Bag - Hover
            Reusable_Methods.findelementsbymouceaction(driver, "//button[@aria-label='shopping bag']", 1, "Hovering on cart");
// Click on view Bag
            Reusable_Methods.clickOnElement(driver, "//a[text()='View Bag & Check Out']", "view bag");

//8. Change the quantity
            Reusable_Methods.dropdownByText(driver, "//select[@id='qdd-0-quantity']", quantity, "Size");
            //9. Checkout to the right section of the page
            Reusable_Methods.clickOnElement(driver, "//button[@id='continue-to-checkout']", "Checkout");
            //10. Pop Up click on continue as Guest
            Reusable_Methods.clickOnElement(driver, "//button[text()='Checkout as Guest']", "checkout as Guest");
            //11. Enter first name
            Reusable_Methods.sendKeysMethod(driver, "//input[@name='firstname']", firstName, "First Name");
            //12. Enter last name
            Reusable_Methods.sendKeysMethod(driver, "//input[@name='lastname']", lastName, "Last Name");
//13. Enter email
            Reusable_Methods.sendKeysMethod(driver, " (//input[@name='email'])[1]", email, "email");

//14. Re-enter email to confirm
            Reusable_Methods.sendKeysMethod(driver, "(//input[@name='confirmEmail'])[1]", email, "Confirm email");
//15. Enter phone number
            Reusable_Methods.sendKeysMethod(driver, "(//input[@name='phone'])[1]", phone, "Phone");
            //16. Click on continue
            Reusable_Methods.clickOnElement(driver, "//button[contains(@class,'btn _9yfmt')]", "Continue");
//click on country
            Reusable_Methods.dropdownByText(driver, "//select[@name='shipping.countryCode']", "United States", "Country");

            //17. Enter street address
            Reusable_Methods.sendKeysMethod(driver, "//input[@name='shipping.line1']", streetAddress, "Street address");
//Enter APT#
            Reusable_Methods.sendKeysMethod(driver, "//input[@name='shipping.line2']", "64", "Apartment Number");
//18. Enter a valid zipcode
            Reusable_Methods.sendKeysMethod(driver, "//input[@name='shipping.postalCode']", zip, "postal Code");
            //19. Enter a city
            Reusable_Methods.sendKeysMethod(driver, "//input[@name='shipping.city']", city, "Shipping City");

            //20. Select a state
            Reusable_Methods.dropdownByText(driver, "//select[@name='shipping.state']", state, "State");
//21. Click on continue button
            Reusable_Methods.clickOnElement(driver, "//button[@type='submit']", "Last Continue");

            // Click on continue again
            Reusable_Methods.clickOnElement(driver, "//button[contains(@class,'btn _9yfmt _194FD _2tFXQ _2SogC')]", "Billing Continue");
            //22.  Enter fake credit card

            Reusable_Methods.sendKeysMethod(driver, "//input[@id='creditCardNumberInput']", cc, "Credit Card");
            //23. Select an expiration date
            Reusable_Methods.dropdownByText(driver, "//select[@name='expMonth']", month, "Month");
//24. Select an expiration year
            Reusable_Methods.dropdownByText(driver, "//select[@name='expYear']", year, "Year");
            //25. Enter CVV Code
            Reusable_Methods.sendKeysMethod(driver, "//input[@name='cvv']", cvv, "Cvv");


            //this code is added because sometimes a pop up box is coming up
            try {
                Reusable_Methods.clickOnElement(driver, "//a[@class='btn _9yfmt _194FD _2WoPG _1aV6J asfNW btnDarkSurroundingsPrimary']", "popup");
            } catch (Exception e) {
                System.out.println(e);//pop up
            }
            //26. Click on place order
            Reusable_Methods.clickOnElement(driver, "//span[text()='Place Order']", "place order");

            //capture the error message
            String error = Reusable_Methods.captureText(driver, "//div[contains(@class,'notification')]", 0, "Error Message");

// Write back to excel
            Label label = new Label(14, i, error);
            //add the label back to the sheet
            writableSheet.addCell(label);
        }//end of loop

//outside of the cell write back to writable workbook
        //  writableWorkbook.write();
//close it
        writableWorkbook.close();


    }//end of method
}//end of class
