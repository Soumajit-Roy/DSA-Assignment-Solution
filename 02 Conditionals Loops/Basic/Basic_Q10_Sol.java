import java.util.Scanner;
public class Basic_Q10_Sol {
    public static void main(String[] args) {
        //Q10. Perimeter Of Parallelogram
        System.out.println("Enter the Side and Base of the Parallelogram");
        Scanner x = new Scanner(System.in);
        float a = x.nextFloat(), b=x.nextFloat();
        float p =  2*(a+b);
        System.out.println("The perimeter of the Parallelogram is : "+p);
    }
}
