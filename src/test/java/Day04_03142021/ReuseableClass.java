package Day04_03142021;

public class ReuseableClass {
    public static void substractingnumbers(int num1, int num2) {

        System.out.println("The result of the subtraction is " + (num1 - num2));

    }//end of custom method


    public static void addingnumbers(int num1, int num2) {
        System.out.println("the summation of my two numbers is " + (num1 + num2));
    }
    public static int multiplyingnumbers(int num1, int num2) {
        int result=num1*num2;
        System.out.println("the multiplication of my two numbers is " + result);
        return result;
    }

}//end of class
