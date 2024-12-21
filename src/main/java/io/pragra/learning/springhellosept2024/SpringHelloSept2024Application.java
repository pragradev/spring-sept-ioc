package io.pragra.learning.springhellosept2024;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class SpringHelloSept2024Application {

    public static void main(String[] args) {
        //SpringApplication.run(SpringHelloSept2024Application.class, args);

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Audi audi = context.getBean("a4",Audi.class);
        System.out.println(audi);
        //Audi a3 = new Audi("A3", 2016, new DieselEngine(300));

        //System.out.println(a3);
    }

}
