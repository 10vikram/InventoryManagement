package com.example.InventoryManagement.Product;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ProductConfig {

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository repository) {
        return args -> {
            product mobiles = new product
                    (1L, "Mobiles", "18-05-2022");
            product laptops = new product
                    (2L, "laptops", "18-05-2022");
            product smartwatches = new product
                    (3L, "smartwatches", "18-05-2022");
            repository.saveAll(List.of(mobiles,laptops,smartwatches));
        };
    }
}
