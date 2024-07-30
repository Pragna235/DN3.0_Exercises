package com.strategypatternexample;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        paymentContext.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432", "John Doe", "123", "12/23"));
        paymentContext.executePayment(250.00);

        paymentContext.setPaymentStrategy(new PayPalPayment("johndoe@example.com", "password123"));
        paymentContext.executePayment(150.00);
    }
}
