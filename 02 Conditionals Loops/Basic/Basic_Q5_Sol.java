import java.util.Scanner;
public class Basic_Q5_Sol {
    public static void main(String[] args) {
        //Q5. Area Of Parallelogram
        System.out.println("Enter the Base and Height of the Parallelogram");
        Scanner a = new Scanner(System.in);
        float b = a.nextFloat(), h=a.nextFloat();
        float area=(b*h);
        System.out.println("The Area of the Parallelogram is : "+area);
    }
}