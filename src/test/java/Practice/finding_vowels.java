
//finding all the vowels from a word

package Practice;

public class finding_vowels {

    public static void main(String[] args) {

        String[] word= new String[10];
        word[0]="B";
        word[1]="a";
        word[2]="n";
        word[3]="g";
        word[4]="l";
        word[5]="a";
        word[6]="d";
        word[7]="e";
        word[8]="s";
        word[9]="h";

        for(int i=0;i< word.length;i++){
            if(word[i]=="a" || word[i]=="i" ||word[i]=="o" ||word[i]=="u" ||word[i]=="e"){

                System.out.println("The vowels located in Bangladesh are "+ word[i]);

        }

        }
            int count=0;
            for(int i=0;i< word.length;i++) {
                switch (word[i]) {
                    case "a":
                        System.out.println("a");
                        break;
                    case "i":
                        System.out.println("i");
                        break;
                    case "e":
                        System.out.println("e");
                        break;
                    case "o":
                        System.out.println("o");
                        break;
                    case "u":
                        System.out.println("u");
                        break;
                }
                count++;

            }
        System.out.println(count);
    }//end of main
}//end of class
