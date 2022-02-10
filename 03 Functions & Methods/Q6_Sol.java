import java.util.Scanner;

public class Q6_Sol {
    public static void main(String[] args) {
        //Q6. Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
        System.out.println("Enter the radius");
        Scanner scan = new Scanner(System.in);
        float r = scan.nextFloat();
        float res1 = circum(r);
        float res2 = area(r);
        System.out.println("The Circumference of the circle is : "+String.format("%.2f",res1)+" and area is : "+String.format("%.2f",res2));
    }
    private static float circum(float r){
        float c = 2f*3.15f*r;
        return c;
    }
    private static float area(float r){
        float c = 3.15f*r*r;
        return c;
    }
}

