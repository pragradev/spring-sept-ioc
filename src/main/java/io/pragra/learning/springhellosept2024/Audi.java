package io.pragra.learning.springhellosept2024;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import java.util.List;
import java.util.Map;

public class Audi {
    String model;
    Integer year;
    IEngine engine;
    boolean lock = true;



    public Audi(String model, Integer year, IEngine engine) {
        this.model = model;
        this.year = year;
        this.engine = engine;

    }
    @PostConstruct
    public void initialize(){
        System.out.println("Connection is established");
        lock = false;
    }
    @PreDestroy
    public void destryConnection(){
        System.out.println("Connection has been destroyes");
    }


}
