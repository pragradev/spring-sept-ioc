package io.pragra.learning.springhellosept2024;

import io.pragra.learning.springhellosept2024.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class SpringHelloSept2024Application {

    public static void main(String[] args) {

        //ApplicationContext context = SpringApplication.run(SpringHelloSept2024Application.class, args);
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Audi audi1 = context.getBean("a3", Audi.class);
        Audi audi2 = context.getBean("a3", Audi.class);
        Audi audi3 = context.getBean("a3", Audi.class);
        Audi audi4 = context.getBean("a3", Audi.class);
        System.out.println(audi1);
        System.out.println(audi2);
        System.out.println(audi3);
        System.out.println(audi4);
        context.registerShutdownHook();

//        ApplicationContext context = new AnnotationConfigApplicationContext
//                ("io.pragra.learning.springhellosept2024.config");
        //ApplicationContext context = new AnnotationConfigApplicationContext
               // (AppConfig.class);
        //ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        Order order = context.getBean(Order.class);
//        Product thinkpad = context.getBean("thinkpad", Product.class);
//        boolean processed = order.processOrder(thinkpad);
//        System.out.println(order);
//        System.out.println(thinkpad);
//        System.out.println(processed);

//        Audi a3 = new Audi("A3", 2016, new DieselEngine(300));
//
//        System.out.println(a3);












//        Map<Student, Integer> score = new HashMap<>();
//        List<String> phNos = new ArrayList<>();
//        phNos.add("234324234234");
//        phNos.add("23423423432");
//        phNos.add("23423423423");
//        //hashcode,
//        Student s1 = new Student(1,"Pratik", "Ahuja",25,phNos);
//        Student s2 = new Student(2,"Gagan", "Tuli",26,phNos);
//        Student s3 = new Student(3,"Satvir", "Kaur",24,phNos);
//
//        score.put(s1, 85);
//        score.put(s1, 85);
//        score.put(s1, 110);
//        score.put(s2, 90);
//        score.put(s3, 100);
//
//        //score.put(new Student(1,"Pratik", "Ahuja",25), 80);
//        System.out.println(score.get(s1));



    }

}
