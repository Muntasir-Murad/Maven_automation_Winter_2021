package Day2_03072021;

public class DynamicArray {
    public static void main(String[] args) {



    String[] countries;
    int[] streetNumber;




        countries = new String[5];
        countries[0] = "USA";
        countries[1] ="Bangladesh";
        countries[2]="India";
        countries[3]="Pakistan";
        countries[4]="Canada";



        streetNumber = new int[4];
        streetNumber[0] = 222;
        streetNumber[1] = 333;

        int i=0;
        while(i< countries.length) {

            System.out.println("The name of our country is "+countries[i]);
        i=i+2;
        }



    }
}
