import java.util.Scanner;
public class Basic_Q01_Sol {
    public static void main(String[] args) {
        //Q1. Area Of Circle Java Program
        System.out.println("Enter Radius of the circle");
        Scanner a = new Scanner(System.in);
        int r = a.nextInt();
        float area = (float) (3.14*(r*r));
        System.out.println("The area of the circle is : "+area);
    }
}