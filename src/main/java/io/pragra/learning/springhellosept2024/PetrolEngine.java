package io.pragra.learning.springhellosept2024;

import org.springframework.stereotype.Component;

@Component
public class PetrolEngine implements IEngine{
    Integer horsePower = 250;


    @Override
    public String toString() {
        return "PetrolEngine{" +
                "horsePower=" + horsePower +
                '}';
    }

    @Override
    public String display() {
        return "Petrol Engine Horse Power: " + horsePower;
    }
}
