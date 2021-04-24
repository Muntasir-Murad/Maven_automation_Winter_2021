package Practice;

import java.util.ArrayList;

public class DynamicArray {

    public static void main(String[] args) {

       // String [] state={"NJ","NY","FL"} ;
        int [] rank;

     String [] cities;
        cities= new String [5];
                cities[0]= "Brooklyn";
        cities[1]="Bronx";
        cities[2]="Philadelpia";
        rank= new int[5];
                rank[0]=1;
                rank[1]=2;
                rank[2]=3;
                rank[3]=4;
        System.out.println(cities);
        System.out.println("The city is "+ cities[0]+"the rank is "+ rank[0]);
        System.out.println("The city is "+ cities[1]+"the rank is "+ rank[1]);
        System.out.println("The city is "+ cities[2]+"the rank is "+ rank[2]);


        ArrayList country= new ArrayList();

        country.add("Bangladesh");
        country.add("Japan");

        System.out.println(country);
        //System.out.println(country);





          }







}
