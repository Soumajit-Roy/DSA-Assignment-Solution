import java.util.Scanner;
public class Basic_Q04_Sol {
    public static void main(String[] args) {
        //Q4. Area Of Isosceles Triangle
        System.out.println("Enter the Base and Height of the Isosceles Triangle");
        Scanner a = new Scanner(System.in);
        float b = a.nextFloat(), h=a.nextFloat();
        float area=(b*h)/2;
        System.out.println("The Area of the Isosceles Triangle is : "+area);
    }
}
