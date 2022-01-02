import java.util.Scanner;
public class Basic_Q9_Sol {
    public static void main(String[] args) {
        //Q9. Perimeter Of Equilateral Triangle.
        System.out.println("Enter the Side Length of the Triangle");
        Scanner x = new Scanner(System.in);
        float l = x.nextFloat();
        float p = (float) (3*l);
        System.out.println("The perimeter of the Triangle is : "+p);
    }
}
