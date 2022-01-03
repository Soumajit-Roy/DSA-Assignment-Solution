import java.util.Scanner;
public class Basic_Q03_Sol {
    public static void main(String[] args) {
        //Q3. Area Of Rectangle
        System.out.println("Enter the Length and Width of the Rectangle");
        Scanner a = new Scanner(System.in);
        float l = a.nextFloat(), w=a.nextFloat();
        float area=w*l;
        System.out.println("The Area of the Rectangle is : "+area);
    }
}
