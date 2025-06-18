package code.week1.StrategyPatternExample;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9876-5432", "Alice Smith");
        context.setPaymentStrategy(creditCard);
        context.payAmount(250.00);

        PaymentStrategy paypal = new PayPalPayment("alice@example.com");
        context.setPaymentStrategy(paypal);
        context.payAmount(99.99);
    }
}
