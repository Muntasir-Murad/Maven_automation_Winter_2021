package Day03_031321;

public class LoopwithConditionalStatement {


    public static void main(String[] args) {

        String[] mycountry = new String[5];
        mycountry[0] = "Bangladesh";
        mycountry[1] = "USA";
        mycountry[2] = "Canada";
        mycountry[3] = "Saudi Arab";

        for (int i=0;i<mycountry.length;i++){
if (mycountry[i]=="Bangladesh"){
    System.out.println("My first country is "+mycountry[i]);

}else if(mycountry[i]=="USA")
{
    System.out.println("My second country is "+ mycountry[i]);
}




        }











for(int i=0;i<mycountry.length;i++){

    switch (mycountry[i]){
        case "Bangladesh":
            System.out.println("My first country is "+ mycountry[i]);
        break;
    }
    switch (mycountry[i]){
        case "USA":
            System.out.println("My second country is "+ mycountry[i]);
        break;
    }

}




    }
}