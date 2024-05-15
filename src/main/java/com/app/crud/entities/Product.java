package com.app.crud.entities;

import com.app.crud.validation.IsExistsDb;
import com.app.crud.validation.IsRequired;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "{NotBlank.product.name}")
    private String name;

    @Min(1)
    @Max(100)
    @NotNull(message = "{NotNull.product.price}")
    private Integer price;


    @Size(min = 5, max = 400)
    private String description;

    private Integer stock;

    @IsRequired
    private String sku;

}
