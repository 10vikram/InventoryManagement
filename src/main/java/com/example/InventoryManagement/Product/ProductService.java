package com.example.InventoryManagement.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<product> getProduct() {
        return productRepository.findAll();
    }

    public void addProduct(product product){
        productRepository.save(product);
        System.out.println(product);
    }

    public void editProduct(product product){
        productRepository.save(product);
        System.out.println(product);
    }

    public void deleteProduct(long id){

        boolean exists = productRepository.existsById(id) ;
        if(!exists){
            throw new IllegalStateException("Product is not there in the list.");
        }
        else{
            System.out.println(id+" has been deleted from the list.");
            productRepository.deleteById(id);
        }
    }
}
