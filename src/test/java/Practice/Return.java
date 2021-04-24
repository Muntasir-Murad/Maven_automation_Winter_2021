package Practice;

public class Return {
    public static void main (String []arg){


    int sum=add(10,5);
        System.out.println(sum+10);


        String a= "Hey";
        String b= "Hey";
        String c= new String();
        c="Hey";

        System.out.println(a==b);
        System.out.println(a.equals(c));
        System.out.println(c);



        int a1=100;
        int a2=200;
        int a3=300;

        int mark=-60;

        String result= mark>80 && mark<=100? "A":mark>70 && mark <=80? "B":  mark>60 && mark <=70? "C":mark>50 && mark <=60? "D":mark>=0 && mark<60?"F":"Invalid Grade";
                System.out.println(result);

        String tennary=a1<a2? "a1<a2": "a1>a2";

        System.out.println(tennary);



    }//end of main method

    public static int add(int a,int b){

        int c=a+b;

        return c;



    }//end of custom method

}//end of class
