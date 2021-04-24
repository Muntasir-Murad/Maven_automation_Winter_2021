package Action_Item;



import ReusableLibrary.AbstractClass;
import ReusableLibrary.ReusableMethods;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WriteException;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;

public class Action_item_04_11 extends AbstractClass {
    @Test
    public void express() throws InterruptedException, IOException, BiffException, WriteException {
        // locate the path for readable  file that we created in excel (From Abstract Class)
        readableBook = Workbook.getWorkbook(new File("src/main/resources/express.xls"));
        //create writeable workbook that will mimic the data from readable (From Abstract Class)
        writeableWorkbook = Workbook.createWorkbook(new File("src/main/resources/ExpressResult.xls"), readableBook);
        //read everything  from writeable sheet (From Abstract Class)
        writableSheet = writeableWorkbook.getSheet(0);
        //get the row count - (From Abstract Class)
        rowCount = writableSheet.getRows();
        // Loop will start to iterate through excel data
        for (int i = 1; i < rowCount; i++) {

            // Columns are hard coded and row is dynamic (i)
            String size = writableSheet.getCell(0, i).getContents();
            String quantity = writableSheet.getCell(1, i).getContents();
            String firstName = writableSheet.getCell(2, i).getContents();
            String lastName = writableSheet.getCell(3, i).getContents();
            String email = writableSheet.getCell(4, i).getContents();
            String phone = writableSheet.getCell(5, i).getContents();
            String streetAddress = writableSheet.getCell(6, i).getContents();
            String zipcode = writableSheet.getCell(7, i).getContents();
            String city = writableSheet.getCell(8, i).getContents();
            String state = writableSheet.getCell(9, i).getContents();
            String ccNumber = writableSheet.getCell(10, i).getContents();
            String expMonth = writableSheet.getCell(11, i).getContents();
            String expYear = writableSheet.getCell(12, i).getContents();
            String cvvCode = writableSheet.getCell(13, i).getContents();


            //1. Navigate to express website
            driver.navigate().to("https://www.express.com");

            if (i == 1) {
                //Handle popup window
                ReusableMethods.clickOnElement(driver, "//button[@id='closeModal']", logger, "popup");
                continue;
            }
            // Delete all the cookies
            driver.manage().deleteAllCookies();
            //2. Hover over to Men Tab
            ReusableMethods.hoverElement(driver, "//a[text()='Men']", logger, "Men Tab");
            //3. Clothing section click on sweaters
            ReusableMethods.clickOnElement(driver, "//a[text()='Sweatshirts & Hoodies']", logger, "Sweaters");
            //4. Click on First sweater
            ReusableMethods.clickOnElement(driver, "(//div[@class='_3TJgM'])[1]", logger, "First Sweaters");
            //5. Click on size
            ReusableMethods.clickOnElement(driver, "//button[@value='" + size + "']", logger, size);
            //6. Click on add to Bag
            ReusableMethods.clickOnElement(driver, "//button[text()='Add to Bag']", logger, "Size M");
            //7. Click on view Bag - Hover
            ReusableMethods.hoverElement(driver, "(//button[@aria-label='shopping bag'])[2]", logger, "Shopping Bag");
            // Click on view Bag
            ReusableMethods.clickOnElement(driver, "//a[text()='View Bag & Check Out']", logger, "View Bag");
            //8. Change the quantity
            ReusableMethods.selectOptions(driver, "//select[@id='qdd-0-quantity']", quantity, logger, "Quantity");
            //9. Checkout to the right section of the page
            ReusableMethods.clickOnElement(driver, "//button[text()='Checkout']", logger, "Checkout");
            //10. Pop Up click on continue as Guest
            ReusableMethods.clickOnElement(driver, "//button[text()='Checkout as Guest']", logger, "Checkout");
            //11. Enter first name
            ReusableMethods.sendKeysMethod(driver, "//input[@name='firstname']", firstName, logger, "FirstName");
            //12. Enter last name
            ReusableMethods.sendKeysMethod(driver, "//input[@name='lastname']", lastName, logger, "LastName");
            //13. Enter email
            ReusableMethods.sendKeysMethod(driver, "(//input[@name='email'])[1]", email, logger, "email");
            //14. Re-enter email to confirm
            ReusableMethods.sendKeysMethod(driver, "(//input[@name='confirmEmail'])[1]", email, logger, "Confirm email");
            //15. Enter phone number
            ReusableMethods.sendKeysMethod(driver, "(//input[@name='phone'])[1]", phone, logger, "Phone");
            //16. Click on continue
            ReusableMethods.clickOnElement(driver, " //button[contains(@class,'btn _9yfmt')]", logger, "Continue");
            // Select country
            ReusableMethods.selectOptions(driver, "//select[@name='shipping.countryCode']", "United States", logger, "Country");
            //17. Enter street address
            ReusableMethods.sendKeysMethod(driver, "//input[@name='shipping.line1']", streetAddress, logger, "Address");
            //Enter APT#
            ReusableMethods.sendKeysMethod(driver, "//input[@name='shipping.line2']", "apt 2", logger, "Address");
            //18. Enter a valid zipcode
            ReusableMethods.sendKeysMethod(driver, "//input[@name='shipping.postalCode']", zipcode, logger, "postalCode");
            //19. Enter a city
            ReusableMethods.sendKeysMethod(driver, "//input[@name='shipping.city']", city, logger, "City");
            //20. Select a state
            ReusableMethods.selectOptions(driver, "//select[@name='shipping.state']", state, logger, "State");
            //21. Click on continue button
            ReusableMethods.clickOnElement(driver, "//button[contains(@class,'btn _9yfmt')]", logger, "Continue");
            Thread.sleep(3000);
            // Click on continue again
            ReusableMethods.clickOnElement(driver, " //button[contains(@class,'btn _9yfmt')]", logger, "Continue");
            //22.  Enter fake credit card
            ReusableMethods.sendKeysMethod(driver, "//input[@id='creditCardNumberInput']", ccNumber, logger, "Credit Card");
            //23. Select an expiration date
            ReusableMethods.selectOptions(driver, "//select[@name='expMonth']", expMonth, logger, "exp Month");
            //24. Select an expiration year
            ReusableMethods.selectOptions(driver, "//select[@name='expYear']", expYear, logger, "exp Year");
            //25. Enter CVV Code
            ReusableMethods.sendKeysMethod(driver, "//input[@name='cvv']", cvvCode, logger, "CVV");
            //26. Click on place order
            ReusableMethods.clickOnElement(driver, "//span[text()='Place Order']", logger, "Place order");
            //capture the error message
            String errorMsg = ReusableMethods.captureText(driver, "//div[contains(@class,'notification')]", 0, logger, "Error Message");
            // Write back to excel
            Label label = new Label(14, i, errorMsg);
            writableSheet.addCell(label);
        } //end of loop
        //outside of the cell write back to writable workbook
        writeableWorkbook.write();
        //close it
        writeableWorkbook.close();
    } // end of Test case method
}