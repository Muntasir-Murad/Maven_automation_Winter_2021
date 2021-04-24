package Action_Item;

import java.util.SortedMap;

public class Action_Item3_A01 {
    public static void main(String[] args) {

        int grade =70;

        if (grade >= 90 && grade<= 100) {
            System.out.println("Your grade is A");
        } else if (grade >= 80 && grade<90) {
            System.out.println("Your grade is B");
        } else if (grade >= 70 &&  grade<80) {
            System.out.println("Your grade is C");
        } else if (grade >= 60 && grade<70) {
            System.out.println("Your grade is D");
        } else if (grade < 60) {
            System.out.println("Your grade is F");
        }

        /*
        int mark=70;
        String result= mark>=90 && mark<=100? "A":mark>=80 && mark <90? "B":  mark>=70 && mark <80? "C":mark>=60 && mark <70? "D":mark>=0 && mark<60?"F":"Invalid Grade";
        System.out.println("Your grades is " + result);*/

    }//end of main method
}//end of class


