package com.dev.product.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Data // To getters setters
@AllArgsConstructor // To Constructor(a,b,c,d)
@NoArgsConstructor // To Constructor ()
@ToString // To string method
@Entity // Specify the entety
@Table(name = "bsr_product") // Map with DB table
public class Product {
    @Id // Primary key
    @GeneratedValue // Auto generating
    private int id;
    private String name;
    private int quantity;
    private double price;
}
