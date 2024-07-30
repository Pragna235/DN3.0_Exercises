package com.adapterpatternexample;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        PayPal payPal = new PayPal();
        Stripe stripe = new Stripe();

        PaymentProcessor payPalAdapter = new PayPalAdapter(payPal);
        PaymentProcessor stripeAdapter = new StripeAdapter(stripe);

        System.out.println("Using PayPalAdapter:");
        payPalAdapter.processPayment("PayPal", 150.75);

        System.out.println("Using StripeAdapter:");
        stripeAdapter.processPayment("Stripe", 250.00);
    }
}
