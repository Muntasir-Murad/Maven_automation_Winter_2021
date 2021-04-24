package Practice;

public class Split {
    public static void main(String[] args) {

        String mystring="Hi I   am    from              USA";




        String newstring[]=mystring.split("\\s+");
        System.out.println(newstring[3] );




    }//end of main

}//end of class


// for one space  String [] a = mystring.split(" "); or  String [] a = mystring.split("\\s");
// for unkown spacing String [] a = mystring.split("\\s+");
//for system.out.println shotcut type sout