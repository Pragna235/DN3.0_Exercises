package com.financial;

import java.util.HashMap;
import java.util.Map;

public class OptimizedForecastingTool {

    private Map<Integer, Double> memo = new HashMap<>();

    // Method to calculate future value using a recursive approach with memoization
    public double predictFutureValue(double currentValue, double growthRate, int periods) {
        
        if (periods <= 0) {
            return currentValue;
        }
        
        
        if (memo.containsKey(periods)) {
            return currentValue * memo.get(periods);
        }
        
        
        double futureValue = predictFutureValue(currentValue * (1 + growthRate), growthRate, periods - 1);
        

        memo.put(periods, futureValue / currentValue);
        
        return futureValue;
    }

    public static void main(String[] args) {
        OptimizedForecastingTool tool = new OptimizedForecastingTool();
        
       
        double initialValue = 1000.0; 
        double growthRate = 0.05; 
        int periods = 10; 
        
        double futureValue = tool.predictFutureValue(initialValue, growthRate, periods);
        
        System.out.println("Future value after " + periods + " periods: " + futureValue);
    }
}
