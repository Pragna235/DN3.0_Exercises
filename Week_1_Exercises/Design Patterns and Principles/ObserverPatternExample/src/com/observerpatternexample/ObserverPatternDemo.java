package com.observerpatternexample;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp("Mobile App");
        Observer webApp = new WebApp("Web App");

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        stockMarket.setStockPrice("Stock price: $100");
        stockMarket.setStockPrice("Stock price: $105");

        stockMarket.deregisterObserver(mobileApp);
        stockMarket.setStockPrice("Stock price: $110");
    }
}
