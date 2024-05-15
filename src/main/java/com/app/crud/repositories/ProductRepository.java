package com.app.crud.repositories;

import com.app.crud.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
    boolean existsBySku(String sku);
}
