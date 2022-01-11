public class Interm_Q8_Sol {
    public static void main(String[] args) {
        //Q8. Calculate Depreciation of Value
        int cost = 50000, Deppercent = 9, years = 5;
        int value = cost;
        for (int i=1;i<=5;i++){
            value= ((100-Deppercent)*value)/100;
        }
        System.out.println("Cost Before "+cost);
        System.out.println("After Depreciation "+value);
    }
}