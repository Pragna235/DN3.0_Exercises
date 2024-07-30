package com.observerpatternexample;

public class MobileApp implements Observer {
    private String name;

    public MobileApp(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockPrice) {
        System.out.println(name + " received stock price update: " + stockPrice);
    }
}
