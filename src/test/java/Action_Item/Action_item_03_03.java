package Action_Item;

public class Action_item_03_03 {
    public static void main(String[] args) {

    String Cities[]= new String[4];
    Cities[0]="Brooklyn";
    Cities[1]="Queens";
    Cities[2]="Manhattan";
    Cities[3]="Staten";

    for(int i=0; i< Cities.length;i++) {
        if (Cities[i] == "Brooklyn") {

            System.out.println("The city is " + Cities[i]);

        } else if (Cities[i] == "Manhattan") {

            System.out.println("The city is " + Cities[i]);


        }
    }

        String state[]= new String[4];
        state[0]="NY";
        state[1]="NJ";
        state[2]="TX";
        state[3]="FL";

    for(int i=0;i<state.length;i++){
        if(i==0|| i==2|| i==3){
            continue;
        }
        System.out.println("The state name is "+ state[i]);
    }

    }//end of main method
}//end of class
