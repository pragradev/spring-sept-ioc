package io.pragra.learning.springhellosept2024;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
@Component
public class Audi {
    @Value("#{'${model}'.substring(4)}") // substring - #{''}
    String model;
    @Value("#{'${yr}'  }") //
    String year;

    @Autowired //setter DI
    PetrolEngine engine; //engine is my dependency
    boolean lock = true;

//    public Audi(PetrolEngine engine) { // constructor based DI
//        this.engine = engine;                                 // setter DI
//    }


    public Audi() {
    }

    @Override
    public String toString() {
        return "Audi{" +
                "model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", engine=" + engine +
                ", lock=" + lock +
                '}';
    }



    //    public Audi(String model, Integer year, IEngine engine) {
//        this.model = model;
//        this.year = year;
//        this.engine = engine;
//
//    }
    @PostConstruct
    public void initialize(){
        System.out.println("Connection is established");
        int a = 10;
        AtomicReference<Integer> b = new AtomicReference<>(10);
        lock = false;
    }


    @PreDestroy
    public void destryConnection(){
        engine.display();
        java.lang.Math.random();
        System.out.println("Connection has been destroyes");
    }


}












