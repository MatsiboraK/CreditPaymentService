import java.lang.Math; // importing java.lang package

public class Main {
    public static void main(String[] args) {
        CreditPaymentService oneYear = new CreditPaymentService();
        double monthlyPayment = oneYear.calculate(1_000_000, 36);

        System.out.println((int) monthlyPayment);


    }
}