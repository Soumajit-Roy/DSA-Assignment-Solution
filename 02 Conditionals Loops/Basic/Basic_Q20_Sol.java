import java.util.Scanner;

public class Basic_Q20_Sol {
    public static void main(String[] args) {
        //Q20. Total Surface Area Of Cube
        System.out.println("Enter the Side length of Cube");
        Scanner x = new Scanner(System.in);
        float s=x.nextByte();
        float a= 6f*(s*s);
        System.out.println("The total surface area of Cube is "+a);
    }
}
