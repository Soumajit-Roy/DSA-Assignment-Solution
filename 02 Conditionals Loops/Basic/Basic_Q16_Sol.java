import java.util.Scanner;
public class Basic_Q16_Sol {
    public static void main(String[] args) {
        //Q16. Volume Of Cylinder
        System.out.println("Enter the Radius and Height of the Cylinder");
        Scanner x = new Scanner(System.in);
        float r = x.nextFloat(), h=x.nextFloat();
        float v = (float) (3.14*(r*r)*h);
        System.out.println("The Volume of the Cylinder is : "+v);
    }
}
