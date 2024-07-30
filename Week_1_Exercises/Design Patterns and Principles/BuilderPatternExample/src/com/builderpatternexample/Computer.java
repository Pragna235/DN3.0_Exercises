package com.builderpatternexample;

public class Computer {
    private String CPU;
    private String RAM;

    private String storage;
    private String graphicsCard;
    private String powerSupply;
    private String coolingSystem;

    private Computer(ComputerBuilder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.powerSupply = builder.powerSupply;
        this.coolingSystem = builder.coolingSystem;
    }

    public String getCPU() {
        return CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public String getStorage() {
        return storage;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public String getCoolingSystem() {
        return coolingSystem;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", storage=" + storage + ", graphicsCard=" + graphicsCard
                + ", powerSupply=" + powerSupply + ", coolingSystem=" + coolingSystem + "]";
    }

    public static class ComputerBuilder {
        private String CPU;
        private String RAM;

        private String storage;
        private String graphicsCard;
        private String powerSupply;
        private String coolingSystem;

        public ComputerBuilder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public ComputerBuilder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public ComputerBuilder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public ComputerBuilder setPowerSupply(String powerSupply) {
            this.powerSupply = powerSupply;
            return this;
        }

        public ComputerBuilder setCoolingSystem(String coolingSystem) {
            this.coolingSystem = coolingSystem;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
