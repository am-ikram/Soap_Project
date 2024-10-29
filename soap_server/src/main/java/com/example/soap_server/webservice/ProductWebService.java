package com.example.soap_server.webservice;

import com.example.soap_server.models.Product;
import com.example.soap_server.services.ProductService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@WebService(serviceName = "ProductWS")
@Component
public class ProductWebService {

    @Autowired
    private ProductService productService;

    // Create or Update Product
    @WebMethod(operationName = "saveProduct")
    public Product saveProduct(
            @WebParam(name = "code") Integer code,
            @WebParam(name = "name") String name,
            @WebParam(name = "price") Double price) {
        Product product = new Product(code, name, price, new Date());
        return productService.saveProduct(product);
    }

    // Read a Product by code
    @WebMethod(operationName = "getProductByCode")
    public Product getProductByCode(@WebParam(name = "code") Integer code) {
        Optional<Product> product = productService.getProductByCode(code);
        return product.orElse(null);
    }

    // Get all Products
    @WebMethod(operationName = "getAllProducts")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    // Delete a Product by code
    @WebMethod(operationName = "deleteProductByCode")
    public String deleteProductByCode(@WebParam(name = "code") Integer code) {
        productService.deleteProductByCode(code);
        return "Product with code " + code + " deleted successfully!";
    }
}
