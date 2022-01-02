import java.util.Scanner;
import java.lang.Math;
public class Basic_Q14_Sol {
    public static void main(String[] args) {
        //Q14. Volume Of Cone
        System.out.println("Enter the Radius and Height of the Cone");
        Scanner x = new Scanner(System.in);
        float r = x.nextFloat(), h=x.nextFloat();
        float v = (float) (3.14*(r*r)*(h/3));
        System.out.println("The Volume of the Cone is : "+v);
    }
}
