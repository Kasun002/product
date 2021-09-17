package com.dev.product.service;

import com.dev.product.dto.Product;
import com.dev.product.dto.Response;
import com.dev.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;
    private Response response;

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

    /**
     * Update existing product name
     * @param product
     * @return
     */
    public Product updateProductName(Product product){
        Product existingProduct = repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        return repository.save(existingProduct);
    }

    /**
     * Update Hall product
     * @param product
     * @return
     */
    public Product updateProduct(Product product) {
        Product existingProduct = repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setQuantity(product.getQuantity());
        return repository.save(existingProduct);
    }

    /**
     * Delete Existing product
     * @param product
     * @return
     */
    public Response deleteProductById(Product product){
        Product existingProduct = repository.findById(product.getId()).orElse(null);
        repository.deleteById(product.getId());
        Response deleteResponse = new Response(200,"Deleted product name:" + existingProduct.getName());
        return deleteResponse;
    }
}
