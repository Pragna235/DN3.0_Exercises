package com.adapterpatternexample;

public class PayPalAdapter implements PaymentProcessor {
    private PayPal payPal;

    public PayPalAdapter(PayPal payPal) {
        this.payPal = payPal;
    }

    @Override
    public void processPayment(String paymentType, double amount) {
        if(paymentType.equalsIgnoreCase("PayPal")) {
            payPal.sendPayment(amount);
        }
    }
}
