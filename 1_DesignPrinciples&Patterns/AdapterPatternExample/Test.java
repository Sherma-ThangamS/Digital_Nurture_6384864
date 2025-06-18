package code.week1.AdapterPatternExample;

import code.week1.AdapterPatternExample.PaymentProcessor;

public class Test {
    public static void main(String[] args) {
        PaymentProcessor paypalProcessor = new PayPalAdapter(new PayPalGateway());
        paypalProcessor.processPayment(150.0);

        PaymentProcessor stripeProcessor = new StripeAdapter(new StripeGateway());
        stripeProcessor.processPayment(250.0);
    }
}
