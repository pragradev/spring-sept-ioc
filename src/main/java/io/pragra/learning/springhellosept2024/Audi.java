package io.pragra.learning.springhellosept2024;

public class Audi {
    String model;
    Integer year;
    IEngine engine;




    public Audi(String model, Integer year, IEngine engine) {
        this.model = model;
        this.year = year;
        this.engine = engine;
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
