package com.product.persistence.product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "product_table")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long merchantId;
    String productName;
    Double price;
    Integer qty;
}