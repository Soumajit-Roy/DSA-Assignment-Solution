import java.util.Scanner;
public class Basic_Q13_Sol {
    public static void main(String[] args) {
        //Q12. Perimeter Of Rhombus
        System.out.println("Enter the Side of the Rhombus");
        Scanner x = new Scanner(System.in);
        float s = x.nextFloat();
        float p =  4*s;
        System.out.println("The perimeter of the Rhombus is : "+p);
    }
}
