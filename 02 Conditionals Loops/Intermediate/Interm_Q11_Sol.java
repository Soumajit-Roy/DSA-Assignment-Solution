public class Interm_Q11_Sol {
    public static void main(String[] args) {
        //Q11. Compound Interest Java Program
        double amount=0,principle=5000,rate=7,time=3,ci;
        System.out.println("principle= "+principle);
        System.out.println("rate="+rate);
        System.out.println("time="+time);
        amount  = principle* (Math.pow((1+rate/100),time));
        ci = amount-principle;
        System.out.println("C interest = "+ci);
    }
}
