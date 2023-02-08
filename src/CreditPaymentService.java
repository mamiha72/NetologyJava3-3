public class CreditPaymentService {
    public double calculate(int creditSumm, double annualRate, int monthQuantity) {

        double annualPayment;
        double monthRate = annualRate / 1200;
        double q = 1 + monthRate;
        double degree = Math.pow(q, monthQuantity);
        annualPayment = creditSumm * (monthRate * degree / (degree - 1));

        return annualPayment;

    }
}
