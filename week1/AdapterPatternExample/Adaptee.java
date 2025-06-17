package code.week1.AdapterPatternExample;

class PayPalGateway {
    public void makePayment(double amountInDollars) {
        System.out.println("Paid via PayPal: $" + amountInDollars);
    }
}

class StripeGateway {
    public void charge(double amount) {
        System.out.println("Charged via Stripe: $" + amount);
    }
}
