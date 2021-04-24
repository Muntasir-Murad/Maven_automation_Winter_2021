package Action_Item;

import Day03_031321.Switch;

public class Action_item_03_02 {
    public static void main(String[] args) {
        char grade='C';

      switch (grade) {

          case 'A':
              System.out.println("Excellent");
            break;
          case 'B':
              System.out.println("Well Done");
              break;
          case 'C':
              System.out.println("Satisfactory");
              break;
          case 'D':
              System.out.println("Passed");
              break;
          case 'F':
              System.out.println("Fail");
              break;
          default:
              System.out.println("Invalid grade");
              break;
      }//end of switch
    }//end of main method
}//end of class
