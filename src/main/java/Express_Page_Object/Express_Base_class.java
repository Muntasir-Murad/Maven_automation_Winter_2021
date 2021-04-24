package Express_Page_Object;
import ReusableLibrary.AbstractClass;

public class Express_Base_class extends AbstractClass {


public static Home_Page home_page() {

    Home_Page home_page = new Home_Page(driver);
    return home_page;
}


public static Hoodies_Sweaters hoodies_sweaters(){

    Hoodies_Sweaters hoodies_sweaters=new Hoodies_Sweaters(driver);

    return hoodies_sweaters;
}


public static Bag bag(){

    Bag bag=new Bag(driver);
    return bag;
}


    public static  Size size(){

        Size size=new Size(driver);
        return size;

    }

public static  CheckOut checkOut(){

    CheckOut checkOut=new CheckOut(driver);
    return checkOut;

}





}
