package com.adapterpatternexample;

public class StripeAdapter implements PaymentProcessor {
    private Stripe stripe;

    public StripeAdapter(Stripe stripe) {
        this.stripe = stripe;
    }

    @Override
    public void processPayment(String paymentType, double amount) {
        if(paymentType.equalsIgnoreCase("Stripe")) {
            stripe.makePayment(amount);
        }
    }
}
