package com.dev.product.controller;

import com.dev.product.dto.Product;
import com.dev.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService service;

    /**
     * Save given product in data-base
     * @param product
     * @return
     */
    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return service.saveProduct(product);
    }

    /**
     * Save list of products
     * @param products
     * @return
     */
    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody  List<Product> products){
        return service.saveProducts(products);
    }

    /**
     * Get all products including in the table
     * @return
     */
    @GetMapping("/getProducts")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    /**
     * Get product by given id
     * @param id
     * @return
     */
    @GetMapping("/getProduct/{id}")
    public Product getProductById(@PathVariable int id){
        return service.getProductById(id);
    }
}
