package com.financial;

public class ForecastingTool {
    
    // Method to calculate future value using a recursive approach
    public double predictFutureValue(double currentValue, double growthRate, int periods) {
        
        if (periods <= 0) {
            return currentValue;
        }

        return predictFutureValue(currentValue * (1 + growthRate), growthRate, periods - 1);
    }

    public static void main(String[] args) {
        ForecastingTool tool = new ForecastingTool();
        
    
        double initialValue = 1000.0; 
        double growthRate = 0.05; 
        int periods = 10; 
        
        double futureValue = tool.predictFutureValue(initialValue, growthRate, periods);
        
        System.out.println("Future value after " + periods + " periods: " + futureValue);
    }
}
