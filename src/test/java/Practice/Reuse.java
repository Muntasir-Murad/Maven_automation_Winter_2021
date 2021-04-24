package Practice;

public class Reuse {
    public static void main(String[] args) {

       int z= mycustom(2,5);
        System.out.println(z);

 String lateststring=mystring("Sumon ","pit");
        System.out.println("The name is "+lateststring);






    }//end of main method








    public static int mycustom(int a ,int b){




        int c=a+b;



        return c;


    }//end mof custom method





//public static data type(int/char/String), nameofyour string (String a,String b)


    public static String mystring(String name1,String name2){

        String fullname=name1+name2;

        return fullname;
    }






    }//end of class
