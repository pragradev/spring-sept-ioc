package io.pragra.learning.springhellosept2024;

public class PetrolEngine implements IEngine{
    Integer horsePower;

    public PetrolEngine(Integer horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String display() {
        return "Petrol Engine Horse Power: " + horsePower;
    }
}
