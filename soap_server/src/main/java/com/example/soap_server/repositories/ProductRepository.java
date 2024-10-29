package com.example.soap_server.repositories;

import com.example.soap_server.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    // JpaRepository fournit déjà toutes les méthodes CRUD nécessaires
}
