package Day03_031321;

public class Switch {
    public static void main(String[] args) {
        String milktype="camel milk";


        switch (milktype){

            case "oat milk":
                System.out.println("Milk type is oat milk");
            break;
            case "Almond milk":
                System.out.println("Milk type is almond milk");
                break;
            case "whole milk":
                System.out.println("Milk type is whole milk");
                break;
            default:
                System.out.println("Milk type is "+ milktype+" which is not recognized");
                break;}

                int day=3;
            switch(day){
                case 1:
                    System.out.println("Friday");
                    break;
                case 2:
                    System.out.println("Saturday");
                    break;
                case 3:
                    System.out.println("Sunday");
                    break;
                case 4:
                    System.out.println("Monday");
                    break;
                    case 5:
                    System.out.println("Tuesday");
                        break;
                    case 6:
                    System.out.println("Wednesday");
                        break;
                default:
                    System.out.println("Deathday");
                }








    }//end of main
}//end of class
