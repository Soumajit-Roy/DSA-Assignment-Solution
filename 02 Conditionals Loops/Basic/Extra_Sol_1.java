import java.util.Scanner;
import java.lang.Math;
public class Extra_Sol_1 {
    public static void main(String[] args) {
        System.out.println("--------Area Calculator--------");
        System.out.println("Choose Which Area of You Want to Calculate \n 1 for Circle \n 2 for Triangle \n" +
                " 3 for Rectangle \n 4 for Isosceles Triangle \n 5 for Parallelogram \n 6 for Rhombus" +
                "\n 7 for Equilateral Triangle");
        Scanner x = new Scanner(System.in);
        int ch = x.nextInt();
        if (ch==1){
            System.out.println("Enter Radius of the circle");
            Scanner a = new Scanner(System.in);
            int r = a.nextInt();
            float area = (float) (3.14*(r*r));
            System.out.println("The area of the circle is : "+area);
        } else if (ch==2){
            System.out.println("Enter the Height and Base of the Triangle");
            Scanner a = new Scanner(System.in);
            float h = a.nextFloat(), r = a.nextFloat();
            float area = (h*r)/2;
            System.out.println("The Area of The Triangle is : "+area);
        } else if (ch==3){
            System.out.println("Enter the Length and Width of the Rectangle");
            Scanner a = new Scanner(System.in);
            float l = a.nextFloat(), w=a.nextFloat();
            float area=w*l;
            System.out.println("The Area of the Rectangle is : "+area);
        } else if (ch==4){
            System.out.println("Enter the Base and Height of the Isosceles Triangle");
            Scanner a = new Scanner(System.in);
            float b = a.nextFloat(), h=a.nextFloat();
            float area=(b*h)/2;
            System.out.println("The Area of the Isosceles Triangle is : "+area);
        } else if (ch==5){
            System.out.println("Enter the Base and Height of the Parallelogram");
            Scanner a = new Scanner(System.in);
            float b = a.nextFloat(), h=a.nextFloat();
            float area=(b*h);
            System.out.println("The Area of the Parallelogram is : "+area);
        } else if (ch==6){
            System.out.println("Enter the two Diagonal length of the Rhombus");
            Scanner a = new Scanner(System.in);
            float b = a.nextFloat(), h=a.nextFloat();
            float area=(b*h)/2;
            System.out.println("The Area of the Rhombus is : "+area);
        } else if (ch==7){
            System.out.println("Enter the side length of the Equilateral Triangle");
            Scanner a = new Scanner(System.in);
            float b = a.nextFloat();
            float area= (float) ((Math.sqrt(3)/4)*(b*b));
            System.out.println("The Area of the Equilateral Triangle is : "+area);
        } else {
            System.out.println("Please Enter a valid input");
        }
    }
}
