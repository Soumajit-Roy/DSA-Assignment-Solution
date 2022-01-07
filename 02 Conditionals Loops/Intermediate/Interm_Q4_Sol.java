import java.util.Scanner;
public class Interm_Q4_Sol {
    public static void main(String[] args) {
        //Q4. Calculate Discount Of Product
        System.out.println("Enter original price of the product");
        Scanner x = new Scanner(System.in);
        float price = x.nextFloat();
        System.out.println("Enter the discount percentage of the product");
        float perprice = x.nextFloat();
        float damt= (price*perprice)/100f;
        float dprice= price-damt;
        System.out.println("The Discounted amount is : "+damt+" Final Discounted Price is : "+dprice);
    }
}