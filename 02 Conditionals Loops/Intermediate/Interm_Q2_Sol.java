import java.util.Scanner;
public class Interm_Q2_Sol {
    public static void main(String[] args) {
        //Q2. Calculate Electricity Bill
        System.out.println("Enter your monthly electricity unit");
        Scanner x = new Scanner(System.in);
        float unit = x.nextFloat(),bill;
        if (unit<100){
            bill = unit * 2;
        } else if (unit>100 && unit<200){
            bill = 100*2 + ((unit-100)*3);
        } else if (unit>200 && unit<300){
            bill = 100*2 + 100*3 + ((unit-200)*4);
        } else if (unit>300 && unit<400){
            bill = 100*2 + 100*3 + 100*4 + ((unit-300)*5);
        } else {
            bill = (float) (100*2 + 100*3 + 100*4 + 100*5 + ((unit-400)*6));
        }
        System.out.println("Here is your electricity bill : "+bill);
    }
}