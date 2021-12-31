import java.util.Scanner;
public class Basic_Q6_Sol {
    public static void main(String[] args) {
        //Q6. Area Of Rhombus
        System.out.println("Enter the two Diagonal length of the Rhombus");
        Scanner a = new Scanner(System.in);
        float b = a.nextFloat(), h=a.nextFloat();
        float area=(b*h)/2;
        System.out.println("The Area of the Rhombus is : "+area);
    }
}