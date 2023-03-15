public class CreditPaymentService {
    public double calculate(int amountOfCredit, int creditPeriod) {
        //int amountOfCredit = 200_000; сумма кредита
        //int creditPeriod = 30; //период кредитования в месяц
        double ratePerMonth = 0.0999 / 12; // процентная ставка в месяц
        double solutionPow = Math.pow((1 + ratePerMonth), creditPeriod);

        // размер ежемесячного платежа
        double monthlyPayment = amountOfCredit * ((ratePerMonth * solutionPow) / (solutionPow - 1));
        return (monthlyPayment);

    }

}
