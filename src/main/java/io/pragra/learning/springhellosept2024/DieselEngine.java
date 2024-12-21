package io.pragra.learning.springhellosept2024;

public class DieselEngine implements IEngine{
    Integer horsePower;

    public DieselEngine(Integer horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String display() {
        return "Diesel Engine Horse Power: " + horsePower;
    }
}
