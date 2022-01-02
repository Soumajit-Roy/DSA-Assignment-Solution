import java.util.Scanner;
public class Basic_Q8_Sol {
    public static void main(String[] args) {
        //Q8. Perimeter Of Circle
        System.out.println("Enter the Radius of the circle");
        Scanner x = new Scanner(System.in);
        float r = x.nextFloat();
        float p = (float) (2*3.14*r);
        System.out.println("The perimeter of the circle is : "+p);
    }
}
