package Practice;

import java.net.StandardSocketOptions;

public class StringSplit {

    public static void main(String[] args) {
        String mystring ="I love                                                    Bangladesh";
        String [] a = mystring.split("\\s+");
        for (int i = 0; i < a.length; i++) {

            System.out.println(a[i]);


        }
    }
}
// for one space  String [] a = mystring.split(" "); or  String [] a = mystring.split("\\s");
// for unkown spacing String [] a = mystring.split("\\s+");
//for system.out.println shotcut type sout