package io.pragra.learning.springhellosept2024.config;

import io.pragra.learning.springhellosept2024.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
//    @Bean
//    public Order order(){
//        return new Order();
//    }

    @Bean()
    public Product thinkpad(){
        Product product = new Product();
        product.setName("ThinkPad T14");
        product.setSku("LNV123126");
        product.setPrice(1400);
        return product;
    }
    @Bean
    public Product thinkbook(){
        Product product = new Product();
        product.setName("Thinkbook T14");
        product.setSku("LNV123126");
        product.setPrice(1400);
        return product;
    }
//    @Bean
//    public Audi a3(){
//        Audi a3 = new Audi("A3",2016,dieselEngine());
//        return a3;
//    }
    @Bean(initMethod = "initialize", destroyMethod = "destryConnection")
    public Audi a4(){
        Audi a4 = new Audi("A4",2025,dieselEngine());
        return a4;
    }

    @Bean
    public IEngine dieselEngine(){
        return new DieselEngine(350);
    }
}
