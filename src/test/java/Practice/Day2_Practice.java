package Practice;

public class Day2_Practice {
    public static void main(String[] args) {


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
        streetNumber[0] = 1111;
        streetNumber[1] = 11;
        streetNumber[2] = 2;
        streetNumber[3] = 3;

        int i=0;
        while (i< Area.length){

            System.out.println("The name of my area is " + Area[i] + " , and the zip code is " + zipCode[i] + " and the streetNumber is " + streetNumber[i] + ".");
            i++;
        }// end of while loop

    }// end of main
}//end of class
