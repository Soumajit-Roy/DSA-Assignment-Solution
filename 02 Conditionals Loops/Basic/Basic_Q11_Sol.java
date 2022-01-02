import java.util.Scanner;
public class Basic_Q11_Sol {
    public static void main(String[] args) {
        //Q11. Perimeter Of Rectangle
        System.out.println("Enter the Length and Width of the Rectangle");
        Scanner x = new Scanner(System.in);
        float l = x.nextFloat(), w=x.nextFloat();
        float p =  2*(l+w);
        System.out.println("The perimeter of the Rectangle is : "+p);
    }
}
