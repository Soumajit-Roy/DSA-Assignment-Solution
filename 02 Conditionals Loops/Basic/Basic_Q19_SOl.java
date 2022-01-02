import java.util.Scanner;
public class Basic_Q19_SOl {
    public static void main(String[] args) {
        //Q19. Curved Surface Area Of Cylinder
        System.out.println("Enter radius and height of the Cylinder");
        Scanner x = new Scanner(System.in);
        float r=x.nextFloat(), h=x.nextFloat();
        float a= 2f*3.14f*r*h;
        System.out.println("The surface area of the Cylinder is "+a);
    }
}
