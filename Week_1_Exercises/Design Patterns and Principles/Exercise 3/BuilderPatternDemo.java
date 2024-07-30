package com.builderpatternexample;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        Computer gamingComputer = new Computer.ComputerBuilder("Intel i9", "32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 3080")
                .setPowerSupply("750W")
                .setCoolingSystem("Liquid Cooling")
                .build();

        System.out.println("Gaming Computer: " + gamingComputer);

        Computer officeComputer = new Computer.ComputerBuilder("Intel i5", "16GB")
                .setStorage("512GB SSD")
                .setPowerSupply("500W")
                .build();

        System.out.println("Office Computer: " + officeComputer);
    }
}
