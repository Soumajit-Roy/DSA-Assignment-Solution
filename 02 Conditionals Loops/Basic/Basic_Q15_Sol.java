import java.util.Scanner;
public class Basic_Q15_Sol {
    public static void main(String[] args) {
        //Q15. Volume Of Prism
        System.out.println("Enter the Base and Height of the Prism");
        Scanner x = new Scanner(System.in);
        float b = x.nextFloat(), h=x.nextFloat();
        float v = b*h;
        System.out.println("The Volume of the Prism is : "+v);
    }
}
