import java.util.Scanner;
public class Interm_Q5_Sol {
    public static void main(String[] args) {
        //Q5. Calculate Distance Between Two Points
        System.out.println("Enter the first Point");
        Scanner x = new Scanner(System.in);
        float first = x.nextFloat();
        System.out.println("Enter the end point");
        float end = x.nextFloat();
        float dis = end-first;
        System.out.println("The distance between two points is "+dis);

    }
}
