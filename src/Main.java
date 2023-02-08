import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double annualPayment;

        annualPayment = service.calculate(1_000_000, 9.99, 12);
        System.out.println(Math.round(annualPayment));

        annualPayment = service.calculate(1_000_000, 9.99, 24);
        System.out.println(Math.round(annualPayment));

        annualPayment = service.calculate(1_000_000, 9.99, 36);
        System.out.println(Math.round(annualPayment));

    }
}
