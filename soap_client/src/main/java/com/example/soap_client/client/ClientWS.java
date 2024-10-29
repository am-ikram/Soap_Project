package com.example.soap_client.client;

import proxy.ProductWS;
import proxy.ProductWebService;
import proxy.Product;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        ProductWebService proxy = new ProductWS().getProductWebServicePort();
        System.out.println(proxy.sellingPrice(400.00));
        System.out.println("-----------------");
        Product product = proxy.getProduct(4);
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        List<Product> products = proxy.productList();
        products.forEach(p->{
            System.out.println(p.getName());
            System.out.println(p.getPrice());
        });
    }
}
