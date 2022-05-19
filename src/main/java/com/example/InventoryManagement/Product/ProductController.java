package com.example.InventoryManagement.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/product")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<product> getProduct() {
       return productService.getProduct();
    }

    @PostMapping
    public void addNewProduct(@RequestBody product product){
        productService.addProduct(product);
    }

    @DeleteMapping(path = "{productId}")
    public void deleteProduct(@PathVariable ("productId") Long productId){
        productService.deleteProduct(productId);
    }

    @PutMapping()
    public void editProduct(@RequestBody product product){
        productService.editProduct(product);
    }
}
