package Day04_03142021;

public class executionofreusableClass {
    public static void main(String[] args) {
    ReuseableClass.substractingnumbers(100,5);
    ReuseableClass.substractingnumbers(90,5);
    ReuseableClass.substractingnumbers(80,5);
    ReuseableClass.substractingnumbers(70,5);
    ReuseableClass.addingnumbers(100,50);
    ReuseableClass.multiplyingnumbers(10,5);

    int c=ReuseableClass.multiplyingnumbers(10,5);
        System.out.println("New result "+(c+5));

    }//end of main method
}//end of class
