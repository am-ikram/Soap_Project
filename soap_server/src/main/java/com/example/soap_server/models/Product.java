package com.example.soap_server.models;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;

@XmlRootElement(name = "product")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "products")  // Le nom de la table dans la base de données
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer code;

    private String name;

    private Double price;

    @XmlTransient
    private Date dateCreation;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Product(Integer code, String name, Double price, Date dateCreation) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.dateCreation = dateCreation;
    }

    public Product() {
    }

}
