import java.util.Scanner;
public class Basic_Q2_Sol {
    public static void main(String[] args) {
        //Q2. Area Of Triangle
        System.out.println("Enter the Height and Base of the Triangle");
        Scanner a = new Scanner(System.in);
        float h = a.nextFloat(), r = a.nextFloat();
        float area = (h*r)/2;
        System.out.println("The Area of The Triangle is : "+area);
    }
}