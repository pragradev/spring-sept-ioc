package io.pragra.learning.springhellosept2024;

import java.util.List;
import java.util.Map;

public class Audi {
    String model;
    Integer year;
    IEngine engine;

    List<String> ownerNames;
    Map<String, String> features;


    public Audi(String model, Integer year, IEngine engine, List<String> ownerNames, Map<String, String> features) {
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.ownerNames = ownerNames;
        this.features = features;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                '}';
    }
}
