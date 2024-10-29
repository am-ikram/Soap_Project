package com.example.soap_server.services;

import com.example.soap_server.models.Product;
import com.example.soap_server.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // Create or Update a Product
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    // Get a Product by code
    public Optional<Product> getProductByCode(Integer code) {
        return productRepository.findById(code);
    }

    // Get all Products
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Delete a Product by code
    public void deleteProductByCode(Integer code) {
        productRepository.deleteById(code);
    }
}
