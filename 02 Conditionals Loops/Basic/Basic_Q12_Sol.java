import java.util.Scanner;
public class Basic_Q12_Sol {
    public static void main(String[] args) {
        //Q12. Perimeter Of Square
        System.out.println("Enter the Side of the Square");
        Scanner x = new Scanner(System.in);
        float s = x.nextFloat();
        float p =  4*s;
        System.out.println("The perimeter of the Square is : "+p);
    }
}
