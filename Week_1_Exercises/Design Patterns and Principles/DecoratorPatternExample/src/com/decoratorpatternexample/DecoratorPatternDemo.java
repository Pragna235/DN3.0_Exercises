package com.decoratorpatternexample;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        System.out.println("Sending notifications with EmailNotifier:");
        emailNotifier.send("Hello, World!");

        System.out.println("\nSending notifications with SMSNotifierDecorator:");
        smsNotifier.send("Hello, World!");

        System.out.println("\nSending notifications with SlackNotifierDecorator:");
        slackNotifier.send("Hello, World!");
    }
}
