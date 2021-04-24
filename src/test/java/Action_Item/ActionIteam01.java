package Action_Item;

public class ActionIteam01 {

    public static void main(String[] args) {




        int a=10;
        int b=12;
        int c=a+b;
         System.out.println(c+10);

        String[] Area;
        String[] zipCode;
        int[] streetNumber;


        Area = new String[4];
        Area[0] = "Chittagong";
        Area[1] = "Dhaka";
        Area[2] = "Rajshahi";
        Area[3] = "Sylhet";
        zipCode = new String[4];
        zipCode[0] = "0000";
        zipCode[1] = "0111";
        zipCode[2] = "0222";
        zipCode[3] = "0333";
        streetNumber = new int[4];
        streetNumber[0] = 000000;
        streetNumber[1] = 1111;
        streetNumber[2] = 2;
        streetNumber[3] = 3;

        for (int i = 0; i < Area.length; i++) {

            System.out.println("The name of my area is " + Area[i] + " , and the zip code is " + zipCode[i] + " and the streetNumber is " + streetNumber[i] + ".");

        }//end of for loop
    }//end of main
}//end of class
