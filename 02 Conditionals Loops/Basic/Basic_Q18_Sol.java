import java.util.Scanner;
public class Basic_Q18_Sol {
    public static void main(String[] args) {
        //Q17. Volume Of Sphere
        System.out.println("Enter the Base Length,Base Width and Height of the Pyramid");
        Scanner x = new Scanner(System.in);
        float l = x.nextFloat(), w=x.nextFloat(),h=x.nextFloat();
        float v = ((l*w*h)/3f);
        System.out.println("The Volume of the Pyramid is : "+v);
    }
}
