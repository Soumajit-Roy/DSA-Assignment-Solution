import java.util.Scanner;
public class Basic_Q17_Sol {
    public static void main(String[] args) {
        //Q17. Volume Of Sphere
        System.out.println("Enter the Radius of the Sphere");
        Scanner x = new Scanner(System.in);
        float r = x.nextFloat();
        float v = (float) ((4f/3f)*3.14*(r*r*r));
        System.out.println("The Volume of the Sphere is : "+v);
    }
}
