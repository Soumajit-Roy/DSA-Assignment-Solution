import java.util.Scanner;
import java.lang.Math;
public class Basic_Q7_Sol {
    public static void main(String[] args) {
        //Q7. Area Of Equilateral Triangle
        System.out.println("Enter the side length of the Equilateral Triangle");
        Scanner a = new Scanner(System.in);
        float b = a.nextFloat();
        float area= (float) ((Math.sqrt(3)/4)*(b*b));
        System.out.println("The Area of the Equilateral Triangle is : "+area);
    }
}