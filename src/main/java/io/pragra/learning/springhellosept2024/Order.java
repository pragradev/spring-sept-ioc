package io.pragra.learning.springhellosept2024;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Order {

    public boolean processOrder(Product product){
        // process order
        return true;
    }

    @Override
    public String toString() {
        return "Order{}";
    }
}
