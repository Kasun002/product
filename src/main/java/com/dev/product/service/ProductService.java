package com.dev.product.service;

import com.dev.product.dto.Product;
import com.dev.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    /**
     * saveProduct
     * @param product
     * @return
     */
    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    /**
     * saveProducts
     * @param products
     * @return
     */
    public List<Product> saveProducts(List<Product> products){
        return repository.saveAll(products);
    }

    /**
     * getProducts
     * @return
     */
    public List<Product> getProducts() {
        return repository.findAll();
    }

    /**
     * getProductById
     * @param id
     * @return
     */
    public Product getProductById(int id) {
        return repository.findById(id).orElse(null);
    }
}
