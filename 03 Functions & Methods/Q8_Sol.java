import java.util.Scanner;

public class Q8_Sol {
    public static void main(String[] args) {
        System.out.println("Enter Your Marks");
        Scanner x = new Scanner(System.in);
        int num = x.nextInt();
        System.out.println(gradec(num));
    }
    public static String gradec(int num){
        if (num>=91 && num<=100){
            return "AA";
        }else if (num>=81 && num<=90){
            return "AB";
        }else if (num>=71 && num<=80){
            return "BB";
        }else if (num>=61 && num<=70){
            return "BC";
        }else if (num>=51 && num<=60){
            return "CD";
        }else if (num>=41 && num<=50){
            return "DD";
        }else{
            return "FAIL";
        }
    }
}
